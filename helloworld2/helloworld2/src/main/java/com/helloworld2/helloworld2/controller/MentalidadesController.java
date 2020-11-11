package com.helloworld2.helloworld2.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")
public class MentalidadesController {
	
	@GetMapping
	public String objetivos() {
		return "Minhas mentalidades que eu uso diariamente para conseguir acompanhar este curso são: Mentalidade de crescimento, Responsabilidade pessoal, Trabalho em equipe, comunicação, proatividade, muita persistência, atenção aos detalhes. !";
	}

}