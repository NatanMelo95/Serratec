package br.com.enviaremail.mail.model.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Mailler {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void enviar (MensagemEmail mensagem) {
		
		SimpleMailMessage email = new SimpleMailMessage();
		
		email.setFrom(mensagem.getRemetente());
		email.setSubject(mensagem.getAssunto());
		email.setText(mensagem.getCorpo());
		email.setTo(mensagem.getDestinatarios().toArray(new String[mensagem.getDestinatarios().size()]));
		
		javaMailSender.send(email);
	}
}
