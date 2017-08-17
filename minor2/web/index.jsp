<%@page import="java.sql.*"%>
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
<!-------------------->

<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href='//fonts.googleapis.com/css?family=Viga' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!----------->
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

<%@page import="java.util.ArrayList"%>
<% 
  ArrayList<String> h1 = (ArrayList<String>)session.getAttribute("db");
  String s1="";
  if(h1.isEmpty())
  {
      out.println("no data");
  }
  else
  {
      for(int i=0;i<h1.size();i++)
      {
        s1=(String)h1.get(i);
      }
  }

StringBuffer values = new StringBuffer();
for (int i = 0; i < h1.size(); ++i) {
    if (values.length() > 0) {
        values.append(',');
    }
    values.append('"').append(h1.get(i)).append('"');
}
%>

<script type="text/javascript">
    $( function() {
      var colArray = [ <%= values.toString() %> ];
    $( "#tags" ).autocomplete({
      source: colArray
    });
  } );
</script>
</head>

<body>
<% String s=(String)session.getAttribute("user");
  String driver="oracle.jdbc.OracleDriver";
     Class.forName(driver);
     String url="jdbc:oracle:thin:@localhost:1521:xe";
     String user="minor"; String password="minor";     
     Connection conn=DriverManager.getConnection(url, user, password);
      String query="select * from login_detail where email=?";
       PreparedStatement ps=conn.prepareStatement(query);
        ps.setString(1,s);
        ResultSet rs=ps.executeQuery();
        String name="";
         if(rs.next())
         {
             name=rs.getString(1);
         }

%>
<div class="navbar-wrapper">
  <div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
      <div class="container"> <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a>
        <h1 class="brand"><a href="#top"><b>W</b>ide<B>G</B>reenary</a></h1>
        <nav class="pull-right nav-collapse collapse">
          <ul id="menu-main" class="nav">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="#services">Products</a></li>	
            <li><a href="plantopedia.jsp">Plantopedia</a></li>
            <li><a href="#">Green Warrior</a></li>
            
			<li><% 
               if(s=="Null")
               {
                   %><a href="login.html">login </a> <%
                }else
                {%>
                <a href="cancelorder.jsp">Cancel Order</a></li><li>
                <a href="logout.jsp"> <% out.println("Welcome "+name+", logout"); %> </a> 
                <% }

           %></li>
			
			
            <li><a href="cartdisplay.jsp"><i class="icon-basket"></i></a></li>
          </ul>
        </nav>
      </div>
    </div>
  </div>
</div>
<div id="headerwrap">
  <header class="clearfix">
  <div class="fullscreen-bg">
    <video loop muted autoplay poster="img/videoframe.jpg" class="fullscreen-bg__video">
       
        <source src="video/Nature.mp4" type="video/mp4">
   
    </video>
</div>
    <div class="container">
	
      <div class="row">
        <div class="span12">
          <h2>A Wide Range Of Nursery Products</h2>
          <form action="search.jsp" method="post">
          <input type="text" name="product" placeholder="What Are You Looking For Today ? " class="cform-text" size="40" title="your email">
          <input type="submit" value="Search" class="cform-submit">
          </form>
        </div>
      </div>
     
    </div>
  </header>
</div>
<div class="scrollblock">
  <section id="feature">
    <div class="container">
      <div class="row">
        <div class="span12">
          <article>
            <p>We Have a strong Plantation Heritage </p>
			<p>Provide You Wide Range Of Seeds ,Pots & Nursery Products.</p>
            <p>Making earth A Greener Place To live In </p>
           
          </article>
        </div>
      </div>
    </div>
  </section>
</div>
<hr>
<section id="aboutus" class="single-page scrollblock">
  <div class="container">
    <div class="align"><i class=""></i></div>
    <h1 id="folio-headline"><b>ABOUT US</b></h1>
    <div class="row">
      <div class="span4">
        <div class="mask2"> <a href="img/p1.jpg" rel="pphoto"><img src="img/p1.jpg" alt=""></a> </div>
        <div class="inside">
          <hgroup>
            <h2><b>Who We Are</b></h2>
          </hgroup>
          <div class="entry-content">
            <p><strong><b>Here at WideGreenery we focus to make the planet Green</b></strong></p>
            <a class="more-link" href="#">Know more</a> </div>
        </div>
      </div>
      <div class="span4">
        <div class="mask2"> <a href="img/p2.jpg" rel="pphoto"><img src="img/p2.jpg" alt=""></a></div>
        <div class="inside">
          <hgroup>
            <h2><b>What we Provide</b></h2>
          </hgroup>
          <div class="entry-content">
                              <p><strong><b> we are providing an online platform where people can buy a wide range of nursery

                              products easily including pots,plants of diffrent types,fertilizers,seeds & bulbs and pebbles . This portal will simplify the whole process of buying domestic plants and other

                              nursery products which include comparing prices of the product at different sellers, delivery,

                                      payments etc.</b></strong></p>
            <a class="more-link" href="#">Know more</a></div>
        </div>
      </div>
      <div class="span4">
        <div class="mask2"> <a href="img/p3.jpg" rel="pphoto"><img src="img/p3.jpg" alt=""></a></div>
        <div class="inside">
          <hgroup>
            <h2><b>Cities We Deliver</b></h2>
          </hgroup>
          <div class="entry-content">
            <p><strong><b>Through this project we are aiming to empower the people who are engaged in the

                     production of various nursery products by helping them with a fair platform to sell their products

                     globally and joining them to the mainstream of this industry. We also trying to provide the

                     consumers with a larger market. This will also motivate people to plant more trees and make this

                     planet a better and healthy place to live</b></strong></p>
            <a class="more-link" href="#">Know more</a></div>
        </div>
      </div>
    </div>
    <!---------------------------->
<section id="services" class="single-page scrollblock">
  <div class="container">
  
    <div class="align"><i class="icon-list"></i></div>
    <h1><b>PRODUCTS</b></h1>
	
    <!--div class="row"-->
      <div class="span3">
	    <div id="f1_container">
        <div id="f1_card" class="shadow">
        <div class="align"> </div>
		<img src="img/tree.jpg"></img>
		<div class="back face center">
    <p>Providing you a wide range of products</p>
    
  </div>
      <a href ="plants.jsp" ><h2>Plants</h2></a>
      </div>
	  </div>
	  </div>
	  
      <div class="span3">
	   <div id="f1_container">
        <div id="f1_card" class="shadow">
        <div class="align"> </div>
        <img src="img/fertil.jpg"></img>
		<div class="back face center">
    <p>Providing you a wide range of products</p>
  </div>
  
  
		
         <a href="fertiliser.jsp"><h2>Fertilizers</h2></a>
        </DIV>
	 </div>
	 </div>
	 
      <div class="span3">
	   <div id="f1_container">
        <div id="f1_card" class="shadow">
        <div class="align"> </div>
        <img src="img/seedss.jpg"></img>
		<div class="back face center">
    <p>Providing you a wide range of products.</p>
   
  </div>
  
        <a href ="seednbulbs.jsp"> <h2>Seeds & Bulbs</h2></a>
        </div>
		</div>
		</div>
      <div class="span3">
	   <div id="f1_container">
        <div id="f1_card" class="shadow">
        <div class="align"> </div>
        <img src="img/pots.jpg"></img>
		<div class="back face center">
    <p>Providing you a wide range of products.</p>
   
  </div>
  
       <a href ="pots.jsp" > <h2>Pots</h2></a>
        </div>
		</div>
		</div>
   <% if(s=="Null")
               {%><div class="span3">
	    <div id="f1_container">
        <div id="f1_card" class="shadow">
        <div class="align"> </div>
        <img src="img/seller.jpg"></img>
		<div class="back face center">
    <p>Providing you a chance to sell.</p>
    
  </div>
  
       <a href ="sellerlogin.html"> <h2>Sellers</h2></a>
       </div>
    </div>
  </div>
     <%              
                }else
                {%>
                <div class="span3">
	   <div id="f1_container">
        <div id="f1_card" class="shadow">
        <div class="align"> </div>
        <img src="img/cancel.jpg"></img>
		<div class="back face center">
    <p>Providing you a wide range of products.</p>
   
  </div>
  
       <a href ="cancelorder.jsp" > <h2>Cancel Order</h2></a>
        </div>
		</div>
		</div>
                
                

      <%}
%>
</section>
<hr>
<hr>

<!-----foooooooterrrrrrrrrrrrrrrrrrrrrrrrrrrr------------------->

			<!-------------
				<div class="footer-grids"> <a href="img/pell.jpg" rel="pphoto">
				<div class="footer one">
					<h3>More About Company</h3>
					
					<div class="clear"></div>
				</div>
				<div class="footer two">
					<h3>Keep Connected</h3>
					<ul>
						<li><a class="fb" href="#"><i></i>Like us on Facebook</a></li>
						<li><a class="fb1" href="#"><i></i>Follow us on Twitter</a></li>
						<li><a class="fb2" href="#"><i></i>Add us on Google Plus</a></li>
						<li><a class="fb3" href="#"><i></i>Follow us on Dribbble</a></li>
						<li><a class="fb4" href="#"><i></i>Follow us on Pinterest</a></li>
					</ul>
				</div>
				<div class="footer three">
					<h3>Contact Information</h3>
					<ul>
						<li>The company name <span>Lorem ipsum dolor,</span>Glasglow Dr 40 Fe 72.  </li>
						<li>1234567890  </li>
						<li><a href="mailto:info@example.com">contact@example.com</a> </li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
			<div class="copy-right-grids">
				<div class="copy-left">
						<!--p class="footer-gd">© 2016 Simple Footer Widget. All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">W3layouts</a></p>
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
			
			<!------------------------------------------------------------------------------------------------->


<div class="footer-wrapper">
  <div class="container">
    <footer> <small>&copy;  All rights reserved ||  <a href="#">www.widegreenary.com</a></small> </footer>
  </div>
</div>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.pphoto.js"></script>
<script src="js/site.js"></script>
</body>
</html>