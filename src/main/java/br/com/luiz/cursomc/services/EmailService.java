package br.com.luiz.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.luiz.cursomc.domain.Cliente;
import br.com.luiz.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);

}
