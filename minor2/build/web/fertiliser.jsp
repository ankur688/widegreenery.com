<!DOCTYPE HTML>
<html lang="en">
<head>
<title>WideGreenary</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link rel='stylesheet' id='pphoto-css'  href="css/pphoto.css" type='text/css' media='all'>
<link href="css/fontello.css" type="text/css" rel="stylesheet">

<link href='http://fonts.googleapis.com/css?family=Quattrocento:400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Patua+One' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<style type="text/css">
body {
	padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
}
</style>
<link href="css/bootstrap-responsive.css" rel="stylesheet">

<script src="js/jquery.js"></script>
<script src="js/jquery.scrollTo-1.4.2-min.js"></script>
<script src="js/jquery.localscroll-1.2.7-min.js"></script>
<script charset="utf-8">
$(document).ready(function () {
    $("a[rel^='pphoto']").pphoto();
});
</script>
</head>

<body>
<div class="navbar-wrapper">
  <div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
      <div class="container"> <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a>
        <h1 class="brand"><a href="#top"><b>W</b>ide<B>G</B>reenary</a></h1>
        <nav class="pull-right nav-collapse collapse">
          <ul id="menu-main" class="nav">
            <li><a href="index.jsp">Home</a></li>
            
            <li><a href="plantopedia.jsp">Plantopedia</a></li>
            <li><a href="#team">Green Warrior</a></li>
            <li><a href="cancelorder.jsp">Cancel Order</a></li>
			<li><% String s=(String)session.getAttribute("user");
               if(s=="Null")
               {
                   %><a href="login.html">login </a> <%
                }else
                {%><a href="logout.jsp">logout</a> 
                <% }

           %></li>
			
            <li><a href="Cart"><i class="icon-basket"></i></a></li>
			
			
          </ul>
        </nav>
      </div>
    </div>
  </div>
</div>
	

<------->

			<!------------------------------------------------------------------------------------------->
			
			<html>
<!-- //for-mobile-apps -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href='//fonts.googleapis.com/css?family=Viga' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
</head>
<body>
	
			<div class="footer-grids">
				<div class="footer one">
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
					
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%
    String u="fertilizers";
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
    PreparedStatement ps=conn.prepareStatement("select * from PRODUCT where PRODUCTCATEGORY=?");
    ps.setString(1,u);
    
    
    ResultSet rs=ps.executeQuery();
   //String j="ankur-001";
    %>
   
        <%
    while(rs.next())
    {//for(int i=1;i<=5;i++)
        String n=rs.getString(2);
        String j=rs.getString(2);
        Integer stock=Integer.parseInt(rs.getString(7));
        if(stock>0)
        {
        
        
        
  %> 
   <table border="1">
        <thead><tr><td>PRODUCT</td><td>PRICE(Rs.)</td><td>PRODUCT DISCRIPTION</td><td>AVAILABILITY</td></tr></thead>
  <%out.print("<img src='"+j+".jpg' alt='Mountain View' style='width:304px;height:228px;'>");%> 

    <tr><td><%out.println(rs.getString(2)+" ");%></td>
    <td><%out.println(rs.getString(3)+" ");%></td>
    <td><%out.println(rs.getString(4)+" ");%></td>
    
   
    <td><%out.print("<a href='buy.jsp?proname="+n+"'>buy</a>");out.print("&nbsp");out.print("<a href='addtocart.jsp?prdname="+n+"'>add to cart</a>");%> </td>
    </tr>
    
    
    </table>      
<% } 
else
{

%> <table border="1">
    <thead><tr><td>PRODUCT</td><td>PRICE(Rs.)</td><td>PRODUCT DISCRIPTION</td><td>AVAILABILITY</td></tr></thead>
  <%out.println("<img src='"+j+".jpg' alt='Mountain View' style='width:304px;height:228px;'>");%> 
<%out.print("\n");%>
    <tr><td><%out.println(rs.getString(2)+" ");%></td>
    <td><%out.println(rs.getString(3)+" ");%></td>
    <td><%out.println(rs.getString(4)+" ");%></td>
    
    
    <td><%out.print("OUT OF STOCK");%> </td>
    </tr>
    
    
    </table>      
<%



}
}




session.setAttribute("hello",u);
%>














				</div>
				<div class="footer two">
					<h3>About Us</h3>
					<ul>
						<li><a class="fb" href="#"><i></i>About us</a></li>
						<li><a class="fb1" href="#"><i></i>Write to Us</a></li>
						<li><a class="fb2" href="#"><i></i>Contact us</a></li>
						<li><a class="fb3" href="#"><i></i>Email: wide@greenery.com</a></li>
						<li><a class="fb4" href="#"><i></i>call: +91 11222 333 456</a></li>
					</ul>
				</div>
				<div class="footer three">
					<h3>Join us</h3>
					<ul>
						<li>About us <span>Be a warrior </span>Partnership </li>
						<li>1234567890  </li>
						<li><a href="mailto:info@example.com">contact@widegreenery.com</a> </li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
			<div class="copy-right-grids">
				<div class="copy-left">
						<p class="footer-gd">copyright© 2016 widegreenery. All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">W3layouts</a></p>
				</div>
				<div class="copy-right">
					<ul>
						<li><a href="#">Company Information</a></li>
						<li><a href="#">Privacy Policy</a></li>
						<li><a href="#">Terms & Conditions</a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>		
</body>
</html>


