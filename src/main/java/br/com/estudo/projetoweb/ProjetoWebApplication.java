package br.com.estudo.projetoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjetoWebApplication.class, args);
		System.out.println("Teste");
		int i = 0;
		System.out.println(i);
	}

}
