package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos") 
public class HelloController {
	
	@GetMapping
	public String objetivos() {
		return "Meu objetivo para semana que passou, para esta semana e para todas até me formar é: ter o melhor aproveitamento possivel de todo o conteuto técnico e soft para agregar minha carrera como desenvolvedor e como ser humano, sem me comparar com ninguém e se possivel ajudando alguém. "
				+ "\nSou grato pelas oportunidades que a vida me dá e tenho como objetivo ser sempre grato!!!";
	}

}
