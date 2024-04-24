package com.salesianostriana.dam.ejemploproyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TatuajesController {
	
	@Autowired
	private TatuajesService service;
	
	@GetMapping("/catalogoEstudio")
	public String listarVarios (Model model) {
		

		model.addAttribute("tatuajeList", service.getLista());		
		return "plantillaCatalogoTatuajes";
	}
	
}
