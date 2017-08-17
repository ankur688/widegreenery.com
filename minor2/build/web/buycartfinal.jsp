<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.Date"%>
<%
     String proname=(String)session.getAttribute( "productname" );
     //String u="pots";
    //int qty=request.getParameter("qty");
    Integer prc=Integer.parseInt((String)session.getAttribute( "price" ));
    Integer qty1=Integer.parseInt(request.getParameter("qty"));
    Integer qty2=qty1 * prc;
    String add=request.getParameter("add");
    String mode=request.getParameter("mode");
    String mail=request.getParameter("email");
    session.setAttribute("cusemail",mail);
    
    Date d=new Date();
    Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     String h = formatter.format(d);
    //String city=request.getParameter("city");
//String u=request.getParameter("proname");
Class.forName("oracle.jdbc.OracleDriver");
String a=(String)session.getAttribute( "user_name" );
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
    PreparedStatement ps1=conn.prepareStatement("select * from PRODUCT where PRODUCTNAME=?");
    ps1.setString(1,proname);
     ResultSet rs=ps1.executeQuery();
     
     rs.next();
     
     Integer oldqty=Integer.parseInt(rs.getString(7));
     String cat=rs.getString(6);
     String page1=cat+".jsp";
     if(oldqty<qty1)
     {session.setAttribute("qtyofpro",proname);
         %>
         <jsp:forward page="quantityerror.jsp"/>
         <%
             
     }
else{
     Integer newqty= oldqty-qty1;
     String newqty2=newqty+"";
     String s1=(String)session.getAttribute("user");
     PreparedStatement ps4=conn.prepareStatement("delete from cart where pname='"+proname+"'and uname='"+s1+"'" );
     PreparedStatement ps2=conn.prepareStatement("update PRODUCT set PRODUCTSTOCK = '"+newqty2+"' where PRODUCTNAME='"+proname+"' " );
      ps4.executeUpdate();
    ps2.executeUpdate();
    String s="processing";
   PreparedStatement ps=conn.prepareStatement("insert into ORDERTABLE ( ORDERUSERNAME, ORDERAMOUNT, ORDERSHIPADD, ORDEREMAIL, ORDERPLACEDATE ,MODEOFPAYMENT, PRODUCTNAME,QTY,STATUS ) values ( '"+a+"', '"+qty2+"', '"+add+"', '"+mail+"','"+h+"','"+mode+"', '"+proname+"', '"+qty1+"','"+s+"')" );
    
    ps.executeUpdate();
    String j="ankur-001";
    session.setAttribute("newquantity",newqty2);  
   
    %>
    <jsp:forward page="sellermail.jsp"/>
   
        <%
   }
    //for(int i=1;i<=5;i++)
        
        
        
  %>  
  
