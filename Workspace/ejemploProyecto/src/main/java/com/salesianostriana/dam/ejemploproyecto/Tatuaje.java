package com.salesianostriana.dam.ejemploproyecto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Tatuaje {
	
	private String nombre;
	private double precio;
	private String disenio;
	private String tatuador;

}

