package com.salesianostriana.dam.crontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTattoo {
	
	@GetMapping("/prueba")
	public String prueba() {
		return "prueba";
	}

}
