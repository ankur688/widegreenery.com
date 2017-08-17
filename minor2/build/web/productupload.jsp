<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.Date"%>
<%
     
Class.forName("oracle.jdbc.OracleDriver");
String a="ankur";
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
   PreparedStatement ps=conn.prepareStatement("insert into ORDERTABLE ( ORDERUSERNAME, ORDERAMOUNT, ORDERSHIPADD, ORDEREMAIL, ORDERPLACEDATE ,MODEOFPAYMENT, PRODUCTNAME,QTY ) values ( '"+a+"', '"+qty2+"', '"+add+"', '"+mail+"','"+h+"','"+mode+"', '"+proname+"', '"+qty1+"')" );
    
    ps.executeUpdate();
    String j="ankur-001";
   
    %>
    <jsp:forward page="mail.jsp"/>
   
        <%
   
    //for(int i=1;i<=5;i++)
        
        
        
  %>  
  
