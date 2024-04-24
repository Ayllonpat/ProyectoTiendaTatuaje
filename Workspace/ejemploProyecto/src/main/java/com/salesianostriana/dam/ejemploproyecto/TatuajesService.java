package com.salesianostriana.dam.ejemploproyecto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TatuajesService {
	
	public List<Tatuaje> getLista() {
		return Arrays.asList(
				new Tatuaje("pajaro", 55.0, "imagenPajaro", "David"),
				new Tatuaje("barco", 50.0, "imagenBarco", "Maria")
				);

	}
}
          
