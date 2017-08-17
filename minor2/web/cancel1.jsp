<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.Date"%>
<%
String u=request.getParameter("proname");
String a="ankur";
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
PreparedStatement ps2=conn.prepareStatement("select * from ORDERTABLE where ORDERUSERNAME=? AND PRODUCTNAME=? AND STATUS=?");
    ps2.setString(1,a);
    ps2.setString(2,u);
    ps2.setString(3,"processing");
     ResultSet rs2=ps2.executeQuery();
     rs2.next();
     String email=rs2.getString(6);
     session.setAttribute("cancelemail",email);
    PreparedStatement ps1=conn.prepareStatement("DELETE from ORDERTABLE where ORDERUSERNAME=? AND PRODUCTNAME=? AND STATUS=?");
    ps1.setString(1,a);
    ps1.setString(2,u);
    ps1.setString(3,"processing");
     ResultSet rs=ps1.executeQuery();
     rs.next();
%>
<jsp:forward page="cancelmail.jsp"/>