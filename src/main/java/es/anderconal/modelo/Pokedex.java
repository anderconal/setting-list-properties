package es.anderconal.modelo;

import java.util.Iterator;
import java.util.List;

public class Pokedex {
	private String nombre;
	private List<String> pokemon;
	
	public Pokedex(String nombre, List<String> pokemon) {
		this.nombre = nombre;
		this.pokemon = pokemon;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(nombre);
		sb.append(" contiene:\n");
		
		for (String pokemon : pokemon) {
			sb.append(pokemon);
			sb.append("\n");
		}
		
		return sb.toString();
	}

}
