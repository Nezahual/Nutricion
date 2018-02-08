package com.backendmadrid.nutricion.controller;

import com.backendmadrid.nutricion.dao.IngredienteDAOImpl;
import com.backendmadrid.nutricion.dao.PlatoDAO;
import com.backendmadrid.nutricion.dao.PlatoDAOImpl;
import com.backendmadrid.nutricion.dao.PlatoIngredienteDAOImpl;
import com.backendmadrid.nutricion.dao.UsuarioDAOImpl;
import com.backendmadrid.nutricion.modelo.Ingrediente;
import com.backendmadrid.nutricion.modelo.Plato;
import com.backendmadrid.nutricion.modelo.PlatoIngrediente;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
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
    
    //----------------------------(EditarPlato)--------------------// 
    
    
    
    
    
    //----------------------------(Listado de ingredientes del Plato)--------------------//
    @RequestMapping(value = "/ListarIngredientesPlato")
    public ModelAndView listarIngredientesPlato(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "idPlato") int idPlato
            ) throws IOException {
        
        List<PlatoIngrediente> listadoIngredientesEnPlato = platoIngredienteDAO.obtenerIngredientesPorPlato(idPlato);
        ModelAndView mv = new ModelAndView("listaringredientesplato");
        mv.addObject("listado", listadoIngredientesEnPlato);
        
        
        return mv;    
    }
    
    //----------------------------(Lista y Agregar ingredientes)--------------------//

    @RequestMapping(value = "/ConsultarIngrediente")
    public ModelAndView consultarIngrediente(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "idPlato") int idPlato
            ) throws IOException {
        List<Ingrediente> listaDeIngredientes = ingredienteDAO.listarIngredientes();

        ModelAndView mv = new ModelAndView("consultaringrediente");
        mv.addObject("listado", listaDeIngredientes);
        return mv; 
    }
    @RequestMapping(value = "/AgregarIngrediente")
    public ModelAndView agregarIngrediente(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "idPlato") int idPlato,
            @RequestParam(value = "idIngredient") int idIngredient,
            @RequestParam(value = "cantidad") int cantidad
            ) throws IOException {
        ;

        return new ModelAndView("editarPlato"); 
    }
    
    
    
    
    //---------------------------(Crear Plato)---------------//
    
    @RequestMapping(value = "/CrearPlato")
    public ModelAndView crearPlato(HttpServletResponse response) throws IOException {
        return new ModelAndView("crearplato");
    }

    @RequestMapping(value = "/EjecutarCrear")
    public ModelAndView ejecutarCrear(
            HttpServletResponse response,
            HttpServletRequest request,
            @RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "descripcion") String descripcion,
            @RequestParam(value = "autor") String autor
    ) throws IOException {

        Plato p = new Plato(-1,nombre, descripcion, autor);
        platoDAO.crearPlato(p);

        return new ModelAndView("ejecutarcrear");
    }


    //---------------------------(Detalle Plato)-----------------//
    
    @RequestMapping(value = "/DetallesPlato")
    public ModelAndView detallesPlato(HttpServletResponse response) throws IOException {
        return new ModelAndView("detallesplato");
    }
    
    //---------------------------(Detalle Ingrediente)-----------------//
    
    @RequestMapping(value = "/DetallesIngrediente")
    public ModelAndView detallesIngrediente(HttpServletResponse response) throws IOException {
        return new ModelAndView("detallesingrediente");
    }

}
