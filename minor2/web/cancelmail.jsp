<html>
<head>
<title>JSP JavaMail Example </title>
</head>
<body>
<%@ page import="java.util.*" %>
<%@page import="java.lang.*"%>
<%@ page import="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>
<%@ page import="javax.activation.*" %>
<%
    String proname=(String)session.getAttribute("productname");
String host = "smtp.gmail.com";

String to = (String)session.getAttribute( "cancelemail" );
String from = "ankur.shishodia688@gmail.com";
String subject = "thankyou for shopping with us";
String messageText = "your order has been canceled for "+proname;
boolean sessionDebug = false;
// Create some properties and get the default Session.
Properties props = System.getProperties();
props.put("mail.host", host);
props.put("mail.transport.protocol", "smtp");
props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.port", "587");
    props.setProperty("mail.smtp.auth", "true"); 
//Session mailSession = Session.getDefaultInstance(props, null);
Session mailSession = Session.getInstance(props, 
    new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(
                "ankur.shishodia688@gmail.com", "sanchit688");// Specify the Username and the PassWord
        }
});

 

 
mailSession.setDebug(sessionDebug);
 

 
Message msg = new MimeMessage(mailSession);
msg.setFrom(new InternetAddress(from));
InternetAddress[] address = {new InternetAddress(to)};
msg.setRecipients(Message.RecipientType.TO, address);
msg.setSubject(subject);
msg.setSentDate(new Date());
msg.setText(messageText);
 

 
Transport.send(msg);

%>
<jsp:forward page="index.jsp"/>
</body>
</html>