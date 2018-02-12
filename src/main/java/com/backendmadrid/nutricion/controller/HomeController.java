package com.backendmadrid.nutricion.controller;

import com.backendmadrid.nutricion.dao.IngredienteDAOImpl;
import com.backendmadrid.nutricion.dao.PlatoDAOImpl;
import com.backendmadrid.nutricion.dao.PlatoIngredienteDAOImpl;
import com.backendmadrid.nutricion.dao.UsuarioDAOImpl;
import com.backendmadrid.nutricion.modelo.Ingrediente;
import com.backendmadrid.nutricion.modelo.Plato;
import com.backendmadrid.nutricion.modelo.PlatoIngrediente;
import com.backendmadrid.nutricion.modelo.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    UsuarioDAOImpl usuarioDAO;

    @Autowired
    PlatoDAOImpl platoDAO;

    @Autowired
    IngredienteDAOImpl ingredienteDAO;
    
    @Autowired
    PlatoIngredienteDAOImpl platoIngredienteDAO;

    @RequestMapping(value = {"/", "/Inicio"})
    public ModelAndView principal(HttpServletResponse response) throws IOException {
        return new ModelAndView("inicio");
    }
    
    //----------------------------(ConsultarPlato)--------------------//
    
    @RequestMapping(value = "/ConsultarPlato")
    public ModelAndView consultarPlato(
            HttpServletResponse response,
            HttpServletRequest request,
            HttpSession sesion
            ) throws IOException {
        
        List<Plato> listaDePlatoAutor = platoDAO.listarPlatoPorAutor((String)sesion.getAttribute("usuario"));

        ModelAndView mv = new ModelAndView("consultarplato");
        mv.addObject("listadoPlatos", listaDePlatoAutor);
        
        return mv;    
    } 
    
    //----------------------------(EditarPlato y Lista de ingredientePlato)--------------------// 
    
    @RequestMapping(value = "/EditarPlato")
    public ModelAndView editarPlato(
            HttpServletResponse response,
            @RequestParam(value = "idPlato") int idPlato
            ) throws IOException {

        Plato p= platoDAO.buscarPorId(idPlato);
        
        List<PlatoIngrediente> listadoIngredientesEnPlato = platoIngredienteDAO.obtenerIngredientesPorPlato(idPlato);
        
        ModelAndView mv = new ModelAndView("editarplato");
        mv.addObject("listado", listadoIngredientesEnPlato);
        
        mv.addObject("p", p);

        return mv;
    }
    
    @RequestMapping(value = "/EjecutarEditarPlato")
    public ModelAndView ejecutarEditarPlato(
            HttpServletResponse response,
            HttpServletRequest request,
            HttpSession sesion,
            @RequestParam(value = "idPlato") int idPlato,
            @RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "descripcion") String descripcion,
            @RequestParam(value = "autor") String autor
    ) throws IOException {
        
        Plato p = new Plato(idPlato,nombre, descripcion, (String)sesion.getAttribute("usuario"));
        platoDAO.editarPlato(p);
        ModelAndView mv = new ModelAndView("inicio");
        
        mv.addObject("mensaje", "Editado correctamente");
        mv.addObject("p",p);
        
        return mv;
    }
    
    
    
    
    //----------------------------(Lista ingredientes)--------------------//

    @RequestMapping(value = "/AgregarIngrediente")
    public ModelAndView agregarIngrediente(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "idPlato") int idPlato
            ) throws IOException {
        

        ModelAndView mv = new ModelAndView("agregaringrediente");
        
        mv.addObject("listaIngredientes", ingredienteDAO.listarIngredientes());
        mv.addObject("idPlato", idPlato);
        
        return mv;
    }
    
    //----------------------------(Agregar ingredientes)--------------------//
    
    @RequestMapping(value = "/EjecutarAgregarIngrediente")
    public ModelAndView ejecutarAgregarIngrediente(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "idPlato") int idPlato,
            @RequestParam(value = "idIngrediente") int idIngrediente,
            @RequestParam(value = "cantidad") int cantidad,
            @RequestParam(value = "accion") String accion
            ) throws IOException {
        
        platoIngredienteDAO.agregarIngredienteAPlato(idPlato, idIngrediente, cantidad);

        ModelAndView mv = new ModelAndView("agregaringrediente");
        
        if(accion.equals("terminar")){
            mv.setViewName("inicio");
            mv.addObject("mensaje", "Agregado correctamente");
        }    
        else{
            mv.addObject("listaIngredientes", ingredienteDAO.listarIngredientes());
            mv.addObject("idPlato", idPlato);
        }
        
        return mv;
    }
    
    //-----------------------(Eliminar ingrediente)--------------//
    @RequestMapping(value = "/EliminarIngrediente")
    public ModelAndView eliminarIngrediente(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "idPlato") int idPlato,
            @RequestParam(value = "idIngrediente")int idIngrediente
            ) throws IOException {
        
        platoIngredienteDAO.borrarIngredienteDePlato(idPlato, idIngrediente);
        
        ModelAndView mv = new ModelAndView("agregaringrediente");
        
        return mv;

    }
    //---------------------------(Crear Plato)---------------//
    
    @RequestMapping(value = "/CrearPlato")
    public ModelAndView crearPlato(HttpServletResponse response) throws IOException {
        return new ModelAndView("crearplato");
    }

    @RequestMapping(value = "/EjecutarCrearPlato")
    public ModelAndView ejecutarCrearPlato(
            HttpServletResponse response,
            HttpServletRequest request,
            HttpSession sesion,
            @RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "descripcion") String descripcion
    ) throws IOException {

        ModelAndView vista = new ModelAndView("agregaringrediente");
        
        Plato p = new Plato(-1,nombre, descripcion, (String)sesion.getAttribute("usuario"));
        int idPlato = platoDAO.crearPlato(p);
        List<Ingrediente> listaIngredientes = ingredienteDAO.listarIngredientes();
        vista.addObject("listaIngredientes", listaIngredientes);
        vista.addObject("idPlato", idPlato);
        
        return vista;
    }

    //-----------------------------(Inicio Sesion)--------------------//
    @RequestMapping(value = "/Login")
    public ModelAndView login(HttpServletResponse response) throws IOException {
        return new ModelAndView("login");
    }
    
    @RequestMapping(value = "/EjecutarLogin")
    public ModelAndView ejecutarLogin(
            HttpServletResponse response,
            HttpSession sesion,
            @RequestParam(value="usuario") String usuario,
            @RequestParam(value="password") String password    
    ) throws IOException {
        
        Usuario u= new Usuario(usuario,password);
        ModelAndView mv;
        
        if(usuarioDAO.autenticar(u,password)){
            sesion.setAttribute("usuario",u.getUsername());
            mv=new ModelAndView("inicio");
            mv.addObject("mensaje", "Logado correctamente");
        }else{
            mv=new ModelAndView("login");
            mv.addObject("mensajeError", "Usuario/Contraseña incorrectos.");
        }
        
        return mv;
    }
    
    @RequestMapping(value="/Logout")
    public ModelAndView EjecutarLogout (HttpServletResponse response, HttpSession sesion){
        
        sesion.invalidate();
        return new ModelAndView("inicio");
    }
}
