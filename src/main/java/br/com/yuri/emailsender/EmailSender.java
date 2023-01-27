package br.com.yuri.emailsender;

import br.com.yuri.emailsender.email.Mailer;
import br.com.yuri.emailsender.email.Message;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author yuri.colen
 */
@SpringBootApplication
public class EmailSender {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmailSender.class.getPackage().getName());
        Mailer mailer = applicationContext.getBean(Mailer.class);

        mailer.enviar(new Message("Jao Que Envia <jaozin_testador@gmail.com.br>",
                Arrays.asList("Jao Que Recebe <jaozin_recebedor@gmail.com>"),
                "E-mail test from Java Application", "Any shit I want to send"));

        applicationContext.close();

        SpringApplication.run(EmailSender.class, args);

    }
}
