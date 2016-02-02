package com.easysport.email;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class SendMail {
	public boolean SendMailTest() throws Exception{
    	boolean returnValue = false; 
        
        Properties p = System.getProperties();
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.auth","true");
        p.put("mail.smtp.port", "587");
           
        Authenticator auth = new MyAuthentication();
         
        //session ���� ��  MimeMessage����
        Session session = Session.getDefaultInstance(p, auth);
        MimeMessage msg = new MimeMessage(session);
         
        try{
            //���������ð�
            msg.setSentDate(new Date());
             
            InternetAddress from = new InternetAddress() ;
             
             
            from = new InternetAddress("���<ksg412@gmail.com>");
             

            msg.setFrom(from);
             

            InternetAddress to = new InternetAddress("ksg412@gmail.com");
            msg.setRecipient(Message.RecipientType.TO, to);
             
            // �̸��� ����
            msg.setSubject("���� ���� �׽�Ʈ", "UTF-8");
             
            // �̸��� ���� 
            msg.setText("����", "UTF-8");
             
            // �̸��� ��� 
            msg.setHeader("content-Type", "text/html");
             
            //���Ϻ�����
            javax.mail.Transport.send(msg);
            returnValue = true;
        }catch (AddressException addr_e) {
            addr_e.printStackTrace();
        }catch (MessagingException msg_e) {
            msg_e.printStackTrace();
        }
        return returnValue;
    }
 
}
 
 
class MyAuthentication extends Authenticator {
      
    PasswordAuthentication pa;
    
 
    public MyAuthentication(){
         
        String id = "ksg412@gmail.com";       // ���� ID
        String pw = "dlfjs262";          // ���� ��й�ȣ
 
        // ID�� ��й�ȣ�� �Է��Ѵ�.
        pa = new PasswordAuthentication(id, pw);
      
    }
 
    // �ý��ۿ��� ����ϴ� ��������
    public PasswordAuthentication getPasswordAuthentication() {
        return pa;
    }
}