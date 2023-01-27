package br.com.yuri.emailsender.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 *
 * @author yuri.colen
 */

@Component
public class Mailer {

    @Autowired
    private JavaMailSender javaMailSender;
    
    public void enviar(Message mensagem) {
        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setFrom(mensagem.getSender());
        msg.setTo(mensagem.getReceiver().toArray(new String[mensagem.getReceiver().size()]));
        msg.setSubject(mensagem.getSubject());
        msg.setText(mensagem.getBody());

        javaMailSender.send(msg);
    }

}
