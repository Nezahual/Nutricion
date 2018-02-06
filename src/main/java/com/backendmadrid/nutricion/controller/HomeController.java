package com.backendmadrid.nutricion.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value={"/","/Inicio"})
	public ModelAndView principal(HttpServletResponse response) throws IOException{
		return new ModelAndView("inicio");
	}
        @RequestMapping(value="/ConsultarAlimento")
	public ModelAndView consultarAlimento(HttpServletResponse response) throws IOException{
		return new ModelAndView("consultaralimento");
	}
        @RequestMapping(value="/DetalleAlimento")
	public ModelAndView detalleAlimento(HttpServletResponse response) throws IOException{
		return new ModelAndView("detallealimento");
	}
        @RequestMapping(value="/DetallesPlato")
	public ModelAndView detallesPlato(HttpServletResponse response) throws IOException{
		return new ModelAndView("detallesplato");
	}
        @RequestMapping(value="/ConsultarPlato")
	public ModelAndView consultarPlato(HttpServletResponse response) throws IOException{
		return new ModelAndView("consultarplato");
	}
        @RequestMapping(value="/AddIngredient")
	public ModelAndView addingrediente(HttpServletResponse response) throws IOException{
		return new ModelAndView("addingrediente");
	}
        @RequestMapping(value="/CrearPlato")
	public ModelAndView crearPlato(HttpServletResponse response) throws IOException{
		return new ModelAndView("crearplato");
	}
}
