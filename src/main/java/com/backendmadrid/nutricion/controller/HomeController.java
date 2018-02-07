package com.backendmadrid.nutricion.controller;

import com.backendmadrid.nutricion.dao.IngredienteDAO;
import com.backendmadrid.nutricion.dao.PlatoDAO;
import com.backendmadrid.nutricion.dao.UsuarioDAO;
import com.backendmadrid.nutricion.modelo.Ingrediente;
import com.backendmadrid.nutricion.modelo.Plato;
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
    UsuarioDAO usuarioDAO;

    @Autowired
    PlatoDAO platoDAO;

    @Autowired
    IngredienteDAO ingredienteDAO;

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
    public ModelAndView consultarPlato(HttpServletResponse response) throws IOException {
        List<Plato> l = platoDAO.listar();

        ModelAndView mv = new ModelAndView("consultarplato");
        mv.addObject("listado", l);
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
