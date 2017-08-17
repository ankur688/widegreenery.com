<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
     String driver="oracle.jdbc.OracleDriver";
     Class.forName(driver);
     String url="jdbc:oracle:thin:@localhost:1521:xe";
     String user="minor"; String password="minor";     
     Connection conn=DriverManager.getConnection(url, user, password);
      String email=request.getParameter("email");
      String pass=request.getParameter("password");
      String query="select * from SELLERTABLE where selleremail=? and sellerpassword=?";
      //String query1="select * from login_detail_del where id=? and password=?";
      PreparedStatement ps=conn.prepareStatement(query);
      ps.setString(1,email);
      ps.setString(2,pass);
      ResultSet rs=ps.executeQuery();
      //PreparedStatement ps1=conn.prepareStatement(query1);
     // ps1.setString(1,email);
      //ps1.setString(2,pass);
      //ResultSet rs1=ps1.executeQuery();
      if(rs.next())
      { String n=rs.getString(1);
       session.setAttribute("user",email);  
       session.setAttribute("user_name",n);
%>     <jsp:forward page="sellerupload.jsp"/><%     
      }
     else
      {
%>      <script> alert("INVALID USER NAME OR PASSWORD");</script>
        <jsp:include page="sellerlogin.html"/><%
      }           
%>