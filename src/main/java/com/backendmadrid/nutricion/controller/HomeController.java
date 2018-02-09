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
            @RequestParam(value = "autor") String autor
            ) throws IOException {
        
        List<Plato> listaDePlatoAutor = platoDAO.listarPlatoPorAutor(autor);

        ModelAndView mv = new ModelAndView("consultarplato");
        mv.addObject("listado", listaDePlatoAutor);
        return mv;    
    } 
    
    //----------------------------(EditarPlato y Lista de ingredientePlato)--------------------// 
    
    @RequestMapping(value = "/EditarPlato")
    public ModelAndView editarPlato(
            HttpServletResponse response,
            @RequestParam(value = "id") int id
            ) throws IOException {

        Plato p= platoDAO.buscarPorId(id);
        
        List<PlatoIngrediente> listadoIngredientesEnPlato = platoIngredienteDAO.obtenerIngredientesPorPlato(id);
        ModelAndView mv1 = new ModelAndView("editarplato");
        mv1.addObject("listado", listadoIngredientesEnPlato);

        ModelAndView mv = new ModelAndView("editarplato");
        mv.addObject("p", p);

        return mv;
    }
    
    @RequestMapping(value = "/EjecutarEditarPlato")
    public ModelAndView ejecutarEditarPlato(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "descripcion") String descripcion,
            @RequestParam(value = "autor") String autor
    ) throws IOException {

        Plato p = new Plato(-1,nombre, descripcion, autor);
        platoDAO.crearPlato(p);

        return new ModelAndView("editarplato");
    }
    
    
    //----------------------------(Lista ingredientes)--------------------//

    @RequestMapping(value = "/AgregarIngrediente")
    public ModelAndView agregarIngrediente(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "idPlato") int idPlato
            ) throws IOException {
        List<Ingrediente> listaDeIngredientes = ingredienteDAO.listarIngredientes();

        ModelAndView mv = new ModelAndView("agregaringrediente");
        mv.addObject("listado", listaDeIngredientes);
        mv.addObject(idPlato);
        return mv;
    }
    
    //----------------------------(Agregar ingredientes)--------------------//
    
    @RequestMapping(value = "/EjecutarAgregarIngrediente")
    public ModelAndView ejecutarAgregarIngrediente(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "idPlato") int idPlato,
            @RequestParam(value = "idIngrediente") int idIngrediente,
            @RequestParam(value = "cantidad") int cantidad
            ) throws IOException {
        platoIngredienteDAO.agregarIngredienteAPlato(idPlato, idIngrediente, cantidad);

        ModelAndView mv = new ModelAndView("agregaringrediente");
        
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
            @RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "descripcion") String descripcion,
            @RequestParam(value = "autor") String autor
    ) throws IOException {

        Plato p = new Plato(-1,nombre, descripcion, autor);
        platoDAO.crearPlato(p);
        
        return new ModelAndView("agregaringrediente");
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
        ModelAndView m;
        
        if(usuarioDAO.autenticar(u,password)){
            sesion.setAttribute("usuario",u.getUsername());
            m=new ModelAndView("inicio");
        }else{
            m=new ModelAndView("login");
        }
        
        return m;
    }
}
