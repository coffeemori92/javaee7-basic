package hello.javaee7.bean;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
public class MailSender {
    private String mail_id = "";
    private String mail_pw = "";
    private String from = "";
    private String host = "smtp.gmail.com";
    private int port = 587;
    
    @Asynchronous
    public void send(String mail, String subject, String body) {
        try {
            send(mail, subject, body);
        } catch (Exception e) {
            
        }
    }
}
