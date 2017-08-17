
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.Date"%>
<%
    // String proname=(String)session.getAttribute( "productname" );
     //String u="pots";
    //int qty=request.getParameter("qty");
    
   
    //Integer qty2=qty1 * prc;
    String product1=request.getParameter("pname1");
    Integer prc=Integer.parseInt(request.getParameter( "price1" ));
    //String price1=request.getParameter("price");
    String desc1=request.getParameter("desc1");
     Integer qty1=Integer.parseInt(request.getParameter("stock1"));
    //String desc1=request.getParameter("desc");
    session.setAttribute("inventproduct",product1);
    
   
    //String city=request.getParameter("city");
//String u=request.getParameter("proname");
Class.forName("oracle.jdbc.OracleDriver");
//String a=(String)session.getAttribute( "user_name" );
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
    PreparedStatement ps1=conn.prepareStatement("select * from PRODUCT where PRODUCTNAME=?");
    ps1.setString(1,product1);
     ResultSet rs=ps1.executeQuery();
     
    if(rs.next())
    {
     Integer oldqty=Integer.parseInt(rs.getString(7));
     Integer newqty=oldqty+qty1;
     
     //String cat=rs.getString(6);
     //String page1=cat+".jsp";
     //if(oldqty<qty1)
     //{//session.setAttribute("qtyofpro",proname);
       //  
        
         
             
     

     
     String newqty2=newqty+"";
     session.setAttribute("updatedinvent",newqty2);
     
     PreparedStatement ps2=conn.prepareStatement("update PRODUCT set PRODUCTSTOCK = '"+newqty2+"',PRODUCTPRICE = '"+prc+"',PRODUCTDESC = '"+desc1+"' where PRODUCTNAME='"+product1+"' " );
    
    ps2.executeUpdate();
    
    }
    %>
 
   
        
   <jsp:forward page="inventory.jsp"/>
    
        
        
       
   
  
