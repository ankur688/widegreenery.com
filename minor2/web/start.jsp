<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%
    String s="Null";
   
session.setAttribute("user",s);
 ArrayList l1 = new ArrayList();
String driver="oracle.jdbc.OracleDriver";
                 Class.forName(driver);
                 String url="jdbc:oracle:thin:@localhost:1521:xe";
                 String user="minor"; String password="minor";     
                 Connection conn=DriverManager.getConnection(url, user, password);
                 String q1="select * from login_detail";
                 PreparedStatement ps=conn.prepareStatement(q1);
                 ResultSet rs=ps.executeQuery();
                 while(rs.next())
                 {
                     l1.add(rs.getString(1));
                 }
                 session.setAttribute("db", l1);
%>
<jsp:forward page="index.jsp"/>   
