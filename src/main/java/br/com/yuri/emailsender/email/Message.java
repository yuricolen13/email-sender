package br.com.yuri.emailsender.email;

import java.util.List;

/**
 *
 * @author yuri.colen
 */
public class Message {
    
    private String sender;
    private List<String> receiver;
    private String subject;
    private String body;

    // Construtor
    public Message(String sender, List<String> receiver, String subject, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public List<String> getReceiver() {
        return receiver;
    }

    public void setReceiver(List<String> receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    
    
    
}
