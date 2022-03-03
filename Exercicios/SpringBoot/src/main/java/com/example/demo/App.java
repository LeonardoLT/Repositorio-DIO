package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Renascença");
		livro.setCodigo("D3HY5");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Oliver Bowden");
		
		livro.exibir();
		((AbstractApplicationContext) factory).close();

	}

}
