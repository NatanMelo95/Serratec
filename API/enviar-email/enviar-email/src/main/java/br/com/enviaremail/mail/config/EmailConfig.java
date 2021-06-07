package br.com.enviaremail.mail.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@PropertySource("classpath:env/mail.properties")
public class EmailConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public JavaMailSender mailSender() {
		//Configuração base do smtp para envio de email encontrado em (resource/env/mail.properties) 
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(env.getProperty("mail.smtp.host"));
		mailSender.setPort(env.getProperty("mail.smtp.port", Integer.class));
		mailSender.setUsername(env.getProperty("mail.smtp.username"));
		mailSender.setPassword(env.getProperty("mail.smtp.password"));
		
		//Configuração de protocolo, autentificação, segurança e limite de tempo
		Properties propriedades = new Properties();
		propriedades.put("mail.transport.protocol", "smtp");
		propriedades.put("mail.smtp.auth", true);
		propriedades.put("mail.smtp.starttls.enable", true);
		propriedades.put("mail.smtp.connectiontimeout", 10000);
		
		//unindo configurações
		mailSender.setJavaMailProperties(propriedades);
		
		return mailSender;
	}
}
