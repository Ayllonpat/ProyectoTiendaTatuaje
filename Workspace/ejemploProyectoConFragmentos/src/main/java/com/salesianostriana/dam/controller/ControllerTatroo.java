package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerTatroo {
	
	@GetMapping("/inicio")
	public String inicio() {
		return "inicio";
	}
	
	@GetMapping("/prueba")
	public String comprobar() {
		return "comprobar";
	}
}
