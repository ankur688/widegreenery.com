<%@ page import="java.util.*" %>
<%@page import="java.lang.*"%>
<%@page import="java.sql.*"%>
<%@ page import="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>
<%@ page import="javax.activation.*" %>
<%
    String proname=(String)session.getAttribute("productname");
String qty=(String)session.getAttribute("newquantity");
Integer qty1=Integer.parseInt(qty);
if(qty1<50)
{
    
    String u="plants";
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
    PreparedStatement ps=conn.prepareStatement("select * from SELLERTABLE");
   
    
    
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        String host = "smtp.gmail.com";

String to = rs.getString(4);
String from = "ankur.shishodia688@gmail.com";
String subject = "INVENTORY UPDATE";
String messageText = "update your inventory for "+proname;
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
//msg.setSentDate(new Date());
msg.setText(messageText);
 

 
Transport.send(msg);

        
    }
}


%>
<jsp:forward page="mail.jsp"/>