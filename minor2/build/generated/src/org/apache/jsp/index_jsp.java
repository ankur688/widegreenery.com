package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>WideGreenary</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel='stylesheet' id='pphoto-css'  href=\"css/pphoto.css\" type='text/css' media='all'>\r\n");
      out.write("<link href=\"css/fontello.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<!-------------------->\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Viga' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!----------->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Quattrocento:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Patua+One' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.scrollTo-1.4.2-min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.localscroll-1.2.7-min.js\"></script>\r\n");
      out.write("<script charset=\"utf-8\">\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("    $(\"a[rel^='pphoto']\").pphoto();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $( function() {\r\n");
      out.write("      var colArray = [ ");
      out.print( values.toString() );
      out.write(" ];\r\n");
      out.write("    $( \"#tags\" ).autocomplete({\r\n");
      out.write("      source: colArray\r\n");
      out.write("    });\r\n");
      out.write("  } );\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
 String s=(String)session.getAttribute("user");
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


      out.write("\r\n");
      out.write("<div class=\"navbar-wrapper\">\r\n");
      out.write("  <div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("    <div class=\"navbar-inner\">\r\n");
      out.write("      <div class=\"container\"> <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </a>\r\n");
      out.write("        <h1 class=\"brand\"><a href=\"#top\"><b>W</b>ide<B>G</B>reenary</a></h1>\r\n");
      out.write("        <nav class=\"pull-right nav-collapse collapse\">\r\n");
      out.write("          <ul id=\"menu-main\" class=\"nav\">\r\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#services\">Products</a></li>\t\r\n");
      out.write("            <li><a href=\"plantopedia.jsp\">Plantopedia</a></li>\r\n");
      out.write("            <li><a href=\"#\">Green Warrior</a></li>\r\n");
      out.write("            \r\n");
      out.write("\t\t\t<li>");
 
               if(s=="Null")
               {
                   
      out.write("<a href=\"login.html\">login </a> ");

                }else
                {
      out.write("\r\n");
      out.write("                <a href=\"cancelorder.jsp\">Cancel Order</a></li><li>\r\n");
      out.write("                <a href=\"logout.jsp\"> ");
 out.println("Welcome "+name+", logout"); 
      out.write(" </a> \r\n");
      out.write("                ");
 }

           
      out.write("</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <li><a href=\"cartdisplay.jsp\"><i class=\"icon-basket\"></i></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"headerwrap\">\r\n");
      out.write("  <header class=\"clearfix\">\r\n");
      out.write("  <div class=\"fullscreen-bg\">\r\n");
      out.write("    <video loop muted autoplay poster=\"img/videoframe.jpg\" class=\"fullscreen-bg__video\">\r\n");
      out.write("       \r\n");
      out.write("        <source src=\"video/Nature.mp4\" type=\"video/mp4\">\r\n");
      out.write("   \r\n");
      out.write("    </video>\r\n");
      out.write("</div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"span12\">\r\n");
      out.write("          <h2>A Wide Range Of Nursery Products</h2>\r\n");
      out.write("          <form action=\"search.jsp\" method=\"post\">\r\n");
      out.write("          <input type=\"text\" name=\"product\" placeholder=\"What Are You Looking For Today ? \" class=\"cform-text\" size=\"40\" title=\"your email\">\r\n");
      out.write("          <input type=\"submit\" value=\"Search\" class=\"cform-submit\">\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"scrollblock\">\r\n");
      out.write("  <section id=\"feature\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"span12\">\r\n");
      out.write("          <article>\r\n");
      out.write("            <p>We Have a strong Plantation Heritage </p>\r\n");
      out.write("\t\t\t<p>Provide You Wide Range Of Seeds ,Pots & Nursery Products.</p>\r\n");
      out.write("            <p>Making earth A Greener Place To live In </p>\r\n");
      out.write("           \r\n");
      out.write("          </article>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<section id=\"aboutus\" class=\"single-page scrollblock\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"align\"><i class=\"\"></i></div>\r\n");
      out.write("    <h1 id=\"folio-headline\"><b>ABOUT US</b></h1>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"span4\">\r\n");
      out.write("        <div class=\"mask2\"> <a href=\"img/p1.jpg\" rel=\"pphoto\"><img src=\"img/p1.jpg\" alt=\"\"></a> </div>\r\n");
      out.write("        <div class=\"inside\">\r\n");
      out.write("          <hgroup>\r\n");
      out.write("            <h2><b>Who We Are</b></h2>\r\n");
      out.write("          </hgroup>\r\n");
      out.write("          <div class=\"entry-content\">\r\n");
      out.write("            <p><strong><b>Here at WideGreenery we focus to make the planet Green</b></strong></p>\r\n");
      out.write("            <a class=\"more-link\" href=\"#\">Know more</a> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"span4\">\r\n");
      out.write("        <div class=\"mask2\"> <a href=\"img/p2.jpg\" rel=\"pphoto\"><img src=\"img/p2.jpg\" alt=\"\"></a></div>\r\n");
      out.write("        <div class=\"inside\">\r\n");
      out.write("          <hgroup>\r\n");
      out.write("            <h2><b>What we Provide</b></h2>\r\n");
      out.write("          </hgroup>\r\n");
      out.write("          <div class=\"entry-content\">\r\n");
      out.write("                              <p><strong><b> we are providing an online platform where people can buy a wide range of nursery\r\n");
      out.write("\r\n");
      out.write("                              products easily including pots,plants of diffrent types,fertilizers,seeds & bulbs and pebbles . This portal will simplify the whole process of buying domestic plants and other\r\n");
      out.write("\r\n");
      out.write("                              nursery products which include comparing prices of the product at different sellers, delivery,\r\n");
      out.write("\r\n");
      out.write("                                      payments etc.</b></strong></p>\r\n");
      out.write("            <a class=\"more-link\" href=\"#\">Know more</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"span4\">\r\n");
      out.write("        <div class=\"mask2\"> <a href=\"img/p3.jpg\" rel=\"pphoto\"><img src=\"img/p3.jpg\" alt=\"\"></a></div>\r\n");
      out.write("        <div class=\"inside\">\r\n");
      out.write("          <hgroup>\r\n");
      out.write("            <h2><b>Cities We Deliver</b></h2>\r\n");
      out.write("          </hgroup>\r\n");
      out.write("          <div class=\"entry-content\">\r\n");
      out.write("            <p><strong><b>Through this project we are aiming to empower the people who are engaged in the\r\n");
      out.write("\r\n");
      out.write("                     production of various nursery products by helping them with a fair platform to sell their products\r\n");
      out.write("\r\n");
      out.write("                     globally and joining them to the mainstream of this industry. We also trying to provide the\r\n");
      out.write("\r\n");
      out.write("                     consumers with a larger market. This will also motivate people to plant more trees and make this\r\n");
      out.write("\r\n");
      out.write("                     planet a better and healthy place to live</b></strong></p>\r\n");
      out.write("            <a class=\"more-link\" href=\"#\">Know more</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!---------------------------->\r\n");
      out.write("<section id=\"services\" class=\"single-page scrollblock\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"align\"><i class=\"icon-list\"></i></div>\r\n");
      out.write("    <h1><b>PRODUCTS</b></h1>\r\n");
      out.write("\t\r\n");
      out.write("    <!--div class=\"row\"-->\r\n");
      out.write("      <div class=\"span3\">\r\n");
      out.write("\t    <div id=\"f1_container\">\r\n");
      out.write("        <div id=\"f1_card\" class=\"shadow\">\r\n");
      out.write("        <div class=\"align\"> </div>\r\n");
      out.write("\t\t<img src=\"img/tree.jpg\"></img>\r\n");
      out.write("\t\t<div class=\"back face center\">\r\n");
      out.write("    <p>Providing you a wide range of products</p>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("      <a href =\"plants.jsp\" ><h2>Plants</h2></a>\r\n");
      out.write("      </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  \r\n");
      out.write("      <div class=\"span3\">\r\n");
      out.write("\t   <div id=\"f1_container\">\r\n");
      out.write("        <div id=\"f1_card\" class=\"shadow\">\r\n");
      out.write("        <div class=\"align\"> </div>\r\n");
      out.write("        <img src=\"img/fertil.jpg\"></img>\r\n");
      out.write("\t\t<div class=\"back face center\">\r\n");
      out.write("    <p>Providing you a wide range of products</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\t\t\r\n");
      out.write("         <a href=\"fertiliser.jsp\"><h2>Fertilizers</h2></a>\r\n");
      out.write("        </DIV>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t \r\n");
      out.write("      <div class=\"span3\">\r\n");
      out.write("\t   <div id=\"f1_container\">\r\n");
      out.write("        <div id=\"f1_card\" class=\"shadow\">\r\n");
      out.write("        <div class=\"align\"> </div>\r\n");
      out.write("        <img src=\"img/seedss.jpg\"></img>\r\n");
      out.write("\t\t<div class=\"back face center\">\r\n");
      out.write("    <p>Providing you a wide range of products.</p>\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("        <a href =\"seednbulbs.jsp\"> <h2>Seeds & Bulbs</h2></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("      <div class=\"span3\">\r\n");
      out.write("\t   <div id=\"f1_container\">\r\n");
      out.write("        <div id=\"f1_card\" class=\"shadow\">\r\n");
      out.write("        <div class=\"align\"> </div>\r\n");
      out.write("        <img src=\"img/pots.jpg\"></img>\r\n");
      out.write("\t\t<div class=\"back face center\">\r\n");
      out.write("    <p>Providing you a wide range of products.</p>\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("       <a href =\"pots.jsp\" > <h2>Pots</h2></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("   ");
 if(s=="Null")
               {
      out.write("<div class=\"span3\">\r\n");
      out.write("\t    <div id=\"f1_container\">\r\n");
      out.write("        <div id=\"f1_card\" class=\"shadow\">\r\n");
      out.write("        <div class=\"align\"> </div>\r\n");
      out.write("        <img src=\"img/seller.jpg\"></img>\r\n");
      out.write("\t\t<div class=\"back face center\">\r\n");
      out.write("    <p>Providing you a chance to sell.</p>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("       <a href =\"sellerlogin.html\"> <h2>Sellers</h2></a>\r\n");
      out.write("       </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("     ");
              
                }else
                {
      out.write("\r\n");
      out.write("                <div class=\"span3\">\r\n");
      out.write("\t   <div id=\"f1_container\">\r\n");
      out.write("        <div id=\"f1_card\" class=\"shadow\">\r\n");
      out.write("        <div class=\"align\"> </div>\r\n");
      out.write("        <img src=\"img/cancel.jpg\"></img>\r\n");
      out.write("\t\t<div class=\"back face center\">\r\n");
      out.write("    <p>Providing you a wide range of products.</p>\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("       <a href =\"cancelorder.jsp\" > <h2>Cancel Order</h2></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("      ");
}

      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("<hr>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<!-----foooooooterrrrrrrrrrrrrrrrrrrrrrrrrrrr------------------->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-------------\r\n");
      out.write("\t\t\t\t<div class=\"footer-grids\"> <a href=\"img/pell.jpg\" rel=\"pphoto\">\r\n");
      out.write("\t\t\t\t<div class=\"footer one\">\r\n");
      out.write("\t\t\t\t\t<h3>More About Company</h3>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"footer two\">\r\n");
      out.write("\t\t\t\t\t<h3>Keep Connected</h3>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb\" href=\"#\"><i></i>Like us on Facebook</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb1\" href=\"#\"><i></i>Follow us on Twitter</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb2\" href=\"#\"><i></i>Add us on Google Plus</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb3\" href=\"#\"><i></i>Follow us on Dribbble</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb4\" href=\"#\"><i></i>Follow us on Pinterest</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"footer three\">\r\n");
      out.write("\t\t\t\t\t<h3>Contact Information</h3>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>The company name <span>Lorem ipsum dolor,</span>Glasglow Dr 40 Fe 72.  </li>\r\n");
      out.write("\t\t\t\t\t\t<li>1234567890  </li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"mailto:info@example.com\">contact@example.com</a> </li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"copy-right-grids\">\r\n");
      out.write("\t\t\t\t<div class=\"copy-left\">\r\n");
      out.write("\t\t\t\t\t\t<!--p class=\"footer-gd\">Â© 2016 Simple Footer Widget. All Rights Reserved | Design by <a href=\"https://w3layouts.com/\" target=\"_blank\">W3layouts</a></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"copy-right\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Company Information</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Terms & Conditions</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!------------------------------------------------------------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer-wrapper\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <footer> <small>&copy;  All rights reserved ||  <a href=\"#\">www.widegreenary.com</a></small> </footer>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.pphoto.js\"></script>\r\n");
      out.write("<script src=\"js/site.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
