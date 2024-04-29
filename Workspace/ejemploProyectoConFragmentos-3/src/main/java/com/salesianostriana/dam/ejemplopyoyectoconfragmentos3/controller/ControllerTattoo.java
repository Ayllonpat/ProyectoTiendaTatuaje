package com.salesianostriana.dam.ejemplopyoyectoconfragmentos3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTattoo {

	@GetMapping("/inicio")
	public String inicio() {
		return "index";
	}
		
}
