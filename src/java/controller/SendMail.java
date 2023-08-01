package controller;

import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    public static ArrayList<String> email_id = new ArrayList<String>();

    public  static  boolean sendMail(String m_from, ArrayList<String> eid, String m_subject, String m_body) {
       
        boolean istransmitted=false;
        try {
              String recp =eid.get(0); 
//            String recp = "rahulc.eiosys@gmail.com";
            InternetAddress[] recipientAddress = InternetAddress.parse(recp);
            Session m_Session;
            Message m_simpleMessage;
            InternetAddress m_fromAddress;
            InternetAddress m_toAddress;
            Properties m_properties;
            InternetAddress[] myList = new InternetAddress[2];

            m_properties = new Properties();
            m_properties.put("mail.smtp.host", "smtp.gmail.com");
            m_properties.put("mail.smtp.socketFactory.port", "465");
            m_properties.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            m_properties.put("mail.smtp.auth", "true");
            m_properties.put("mail.smtp.port", "465");

            m_Session = Session.getDefaultInstance(m_properties, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("smt.test.php@gmail.com", "smt123@@"); // username and the password
                }
            });

            m_simpleMessage = new MimeMessage(m_Session);
            m_fromAddress = new InternetAddress(m_from);
//            m_toAddress = new InternetAddress(m_to);
            m_simpleMessage.setFrom(m_fromAddress);
//            m_simpleMessage.setRecipient(RecipientType.TO, m_toAddress);
            m_simpleMessage.setRecipients(RecipientType.TO, recipientAddress);
            m_simpleMessage.setSubject(m_subject);
            m_simpleMessage.setContent(m_body, "text/html");
            //m_simpleMessage.setContent(m_body,"text/plain");

            Transport.send(m_simpleMessage);
        } catch (MessagingException ex) {
            istransmitted=true;
            ex.printStackTrace();
        }
        return istransmitted;
    }

    public static void main(String[] args) {
        email_id.add("siddharth.eiosys@gmail.com");
//        email_id.add("vijay.gharal@eiosys.com");
//        email_id.add("avinash.ghogade@eiosys.com");
//        email_id.add("dipesh.sharma@eiosys.com");
        String address = "";
        for (int i = 0; i < email_id.size(); i++) {
            address = "," + email_id.get(i);
            System.out.println("addr" + address);
        }

        System.out.println("" + address.substring(1, address.length()));
        System.out.println("------------------");

        SendMail send_mail = new SendMail();
        String empName = "Antony Raj S";
        String title = "<b>Hi !" + empName + " Welcome to DeDuplication</b>";
//      send_mail.sendMail("testproject201@gmail.com", "pranaya.jadhav@eiosys.com", "Please apply for leave for the following dates", title+"<br>by<br><b>HR<b>");
        send_mail.sendMail("siddharthraje1988@gmail.com", email_id, "Seed Block data", "filename:abc" + "key:Hulalahu!!!");
        System.out.println("mail has been send ...");
    }
}
