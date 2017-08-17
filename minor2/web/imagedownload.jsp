<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>

<%@page import="java.io.*"%>
<head>

   



</head>
<body>
	<!-- end #menu -->
	
	
	<%
            //String s=(String)session.getAttribute( "username" );
    String  productname  = (String) session.getAttribute("proname");
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
    PreparedStatement ps=conn1.prepareStatement("select * from PRODUCT where PRODUCTNAME=?");
    ps.setString(1,productname);
ResultSet rs=ps.executeQuery();
rs.next();//now on 1st row
			
Blob b=rs.getBlob(5);
byte barr[]=new byte[(int)b.length()];//an array is created but contains no data
barr=b.getBytes(1,(int)b.length());
			
FileOutputStream fout=new FileOutputStream("C:\\Users\\ankur shishodia\\Documents\\NetBeansProjects\\minor2\\build\\web\\"+productname+".jpg");
fout.write(barr);
		    
fout.close();
System.out.println("ok");
			
conn1.close();

        %>
	
<jsp:forward page="logout.jsp"/>	
  

</body>
</html>
