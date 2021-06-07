package br.com.enviaremail.mail.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.enviaremail.mail.model.email.Mailler;
import br.com.enviaremail.mail.model.email.MensagemEmail;

@RestController
@RequestMapping("/api/email")
public class EmailController {
	@Autowired
	Mailler mailler;
	
	@PostMapping
	public String enviarEmail() {
		var email = new MensagemEmail(
				"Teste com os alunos",
				"Olá alunos!!!",
				"Turma dos feras <serratecdev@gmail.com>",
				Arrays.asList("Turma <natan.tere2012@gmail.com>"));
		try {
			mailler.enviar(email);
			return "Deu certo";
		}catch(Exception e) {
			e.printStackTrace();
			return "Deu ruim";
		}
	}
}
