package com.backendmadrid.nutricion.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value={"/","inicio"})
	public ModelAndView principal(HttpServletResponse response) throws IOException{
		return new ModelAndView("inicio");
	}
        @RequestMapping(value="/Inicio")
	public ModelAndView inicio(HttpServletResponse response) throws IOException{
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
        
	@RequestMapping(value="/")
	public ModelAndView asd(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/")
	public ModelAndView qwe(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
