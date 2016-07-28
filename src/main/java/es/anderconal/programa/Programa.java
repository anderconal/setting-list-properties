package es.anderconal.programa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.anderconal.modelo.Pokedex;

public class Programa {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("es/anderconal/bean/beans.xml");
		
		Pokedex pokedex = (Pokedex) context.getBean("pokedex");
		
		System.out.println(pokedex);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
