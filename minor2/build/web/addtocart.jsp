<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%  
    String name=request.getParameter("prdname");
    String s=(String)session.getAttribute("user");
    if(s=="Null")
    {
%> <jsp:forward page="logincart.jsp"/>
<%
    }
else{
    out.println(name+"   "+s);
    Class.forName("oracle.jdbc.OracleDriver");
      Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
    Statement st=conn.createStatement();
    PreparedStatement ps=conn.prepareStatement("select * from PRODUCT where PRODUCTNAME=?");
    PreparedStatement ps1=conn.prepareStatement("select * from cart where uname=? and pname=?");
     ps1.setString(1,s);
     ps1.setString(2,name);
    ResultSet rs1=ps1.executeQuery();
     if(rs1.next())
{
%> <jsp:forward page="productincart.jsp"/> <%
}else{
     ps.setString(1,name);
      String j,query;
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {  
       j=rs.getString(3);
       query="insert into cart(pname,uname,price,qty) values('"+name+"','"+s+"','"+j+"','1')";
        st.executeUpdate(query);
    }
%>
<jsp:forward page="addtocartmsg.jsp"/>
  <% }} %>
   