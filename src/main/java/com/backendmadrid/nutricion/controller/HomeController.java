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
    
//----------------------------(ConsultarIngrediente)--------------------//
    
    @RequestMapping(value = "/ConsultarIngrediente")
    public ModelAndView consultarIngrediente(HttpServletResponse response) throws IOException {
        List<Ingrediente> l = ingredienteDAO.listar();

        ModelAndView mv = new ModelAndView("consultaringrediente");
        mv.addObject("listado", l);
        return mv; 
    }
    
//---------------------------(Detalle Plato)-----------------//
    
    @RequestMapping(value = "/DetallesIngrediente")
    public ModelAndView detallesIngrediente(HttpServletResponse response) throws IOException {
        return new ModelAndView("detallesingrediente");
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
    
//----------------------------(Listado de ingredientes Plato)--------------------//
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
    
    
    
//---------------------------(Detalle Plato)-----------------//
    
    @RequestMapping(value = "/DetallesPlato")
    public ModelAndView detallesPlato(HttpServletResponse response) throws IOException {
        return new ModelAndView("detallesplato");
    }
    
    
    @RequestMapping(value = "/AddIngredient")
    public ModelAndView addingrediente(HttpServletResponse response) throws IOException {
        return new ModelAndView("addingrediente");
    }
}
