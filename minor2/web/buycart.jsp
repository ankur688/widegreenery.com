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
String u=request.getParameter("proname");
Class.forName("oracle.jdbc.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
    PreparedStatement ps=conn.prepareStatement("select * from PRODUCT where PRODUCTNAME=?");
    ps.setString(1,u);
    session.setAttribute("productname",u);
    ResultSet rs=ps.executeQuery();
    //String j="ankur-001";
   
    %>
   
        <%
    while(rs.next())
    {//for(int i=1;i<=5;i++)
        
        
        String j=rs.getString(2);
  %>  
  
<%out.print("<img src='"+j+".jpg' alt='Mountain View' style='width:304px;height:228px;'>");%> 
 <%   String pname=rs.getString(2);
    String price=rs.getString(3);
    String desc=rs.getString(4);
    String stockavail=rs.getString(7);
    //String pric=""+price;
    session.setAttribute("price",price);
    
    
    
    
 %>        
<% }


%>
<form action="buycartfinal.jsp" method="post">
    
   <input type="text" Placeholder="ENTER THE QTY" name="qty"><br>
   <input type="text" Placeholder="ENTER THE SHIPPING ADDRESS" name="add"><br>
   
   <input type="text" Placeholder="ENTER THE EMAIL" name="email"><br>
   <select name="mode">
  <option value="COD">CASH ON DELIVERY</option>
  <option value="DEBIT CARD">DEBIT CARD</option>
   <option value="CREDIT CARD">CREDIT CARD</option>
  <option value="NET BANKING">NET BANKING</option>
  
  
</select>
 
  <input type="submit" value="CONFIRM ORDER">
</form>


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
						<p class="footer-gd">copyrightę 2016 widegreenery. All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">W3layouts</a></p>
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


