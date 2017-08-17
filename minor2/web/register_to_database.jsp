<%@page import="java.sql.*"%>
<%
     String driver="oracle.jdbc.driver.OracleDriver";
     String url="jdbc:oracle:thin:@localhost:1521:xe";
     String user="minor"; String password="minor";  
     Class.forName(driver);
     Connection conn=DriverManager.getConnection(url, user, password);
      Statement st=conn.createStatement();
      String fname=request.getParameter("form-first-name");
      String lname=request.getParameter("form-last-name");
      String email=request.getParameter("form-email");
      String pa=request.getParameter("password");
      String mobile=request.getParameter("form-mobile");
      String address=request.getParameter("form-address");    
     try { 
      String query1="insert into login_detail values('"+fname+"','"+lname+"','"+email+"','"+pa+"','"+address+"','"+mobile+"')";
       int x= st.executeUpdate(query1);
      if(x==1)
      {
          %><jsp:forward page="registermsgifregister.jsp"/><%
      } } 
           catch(Exception e) {
      
          %><jsp:forward page="registermsgifnotregister.jsp"/> <%
      conn.close();}
%>


     
