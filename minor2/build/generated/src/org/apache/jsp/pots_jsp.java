package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.lang.*;

public final class pots_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>WideGreenary</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("<link rel='stylesheet' id='pphoto-css'  href=\"css/pphoto.css\" type='text/css' media='all'>\n");
      out.write("<link href=\"css/fontello.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Quattrocento:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Patua+One' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("\tpadding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/jquery.scrollTo-1.4.2-min.js\"></script>\n");
      out.write("<script src=\"js/jquery.localscroll-1.2.7-min.js\"></script>\n");
      out.write("<script charset=\"utf-8\">\n");
      out.write("$(document).ready(function () {\n");
      out.write("    $(\"a[rel^='pphoto']\").pphoto();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"navbar-wrapper\">\n");
      out.write("  <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("      <div class=\"container\"> <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </a>\n");
      out.write("        <h1 class=\"brand\"><a href=\"#top\"><b>W</b>ide<B>G</B>reenary</a></h1>\n");
      out.write("        <nav class=\"pull-right nav-collapse collapse\">\n");
      out.write("          <ul id=\"menu-main\" class=\"nav\">\n");
      out.write("            <li><a title=\"portfolio\" href=\"index.html\">Home</a></li>\n");
      out.write("            <li><a title=\"services\" href=\"index.html\">Products</a></li>\t\n");
      out.write("            <li><a title=\"wiki\" href=\"index.html\">Plantopedia</a></li>\n");
      out.write("            <li><a title=\"NGO\" href=\"#team\">Green Warrior</a></li>\n");
      out.write("            <li><a title=\"contact\" href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t<li><a title=\"login\" href=\"log2.html\">login</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("            <li><a href=\"Cart\"><i class=\"icon-basket\"></i></a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<------->\n");
      out.write("\n");
      out.write("\t\t\t<!------------------------------------------------------------------------------------------->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<html>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Viga' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t\t<div class=\"footer one\">\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\n");

    String u="pots";
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MINOR","minor");
    PreparedStatement ps=conn.prepareStatement("select * from PRODUCT where PRODUCTCATEGORY=?");
    ps.setString(1,u);
    
    
    ResultSet rs=ps.executeQuery();
   //String j="ankur-001";
    
      out.write("\n");
      out.write("    <table border=\"1\">\n");
      out.write("        ");

    while(rs.next())
    {//for(int i=1;i<=5;i++)
        String n=rs.getString(2);
        String j=rs.getString(2);
        Integer stock=Integer.parseInt(rs.getString(7));
               if(stock>0)
        {
        
        
        
  
      out.write(" \n");
      out.write("   <table border=\"1\">\n");
      out.write("        <thead><tr><td>PRODUCT</td><td>PRICE(Rs.)</td><td>PRODUCT DISCRIPTION</td><td>AVAILABILITY</td></tr></thead>\n");
      out.write("  ");
out.print("<img src='"+j+".jpg' alt='Mountain View' style='width:304px;height:228px;'>");
      out.write(" \n");
      out.write("\n");
      out.write("    <tr><td>");
out.println(rs.getString(2)+" ");
      out.write("</td>\n");
      out.write("    <td>");
out.println(rs.getString(3)+" ");
      out.write("</td>\n");
      out.write("    <td>");
out.println(rs.getString(4)+" ");
      out.write("</td>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <td>");
out.print("<a href='buy.jsp?proname="+n+"'>buy</a>");
      out.write(" </td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </table>      \n");
 } 
else
{


      out.write(" <table border=\"1\">\n");
      out.write("    <thead><tr><td>PRODUCT</td><td>PRICE(Rs.)</td><td>PRODUCT DISCRIPTION</td><td>AVAILABILITY</td></tr></thead>\n");
      out.write("  ");
out.println("<img src='"+j+".jpg' alt='Mountain View' style='width:304px;height:228px;'>");
      out.write(' ');
      out.write('\n');
out.print("\n");
      out.write("\n");
      out.write("    <tr><td>");
out.println(rs.getString(2)+" ");
      out.write("</td>\n");
      out.write("    <td>");
out.println(rs.getString(3)+" ");
      out.write("</td>\n");
      out.write("    <td>");
out.println(rs.getString(4)+" ");
      out.write("</td>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <td>");
out.print("OUT OF STOCK");
      out.write(" </td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </table>      \n");




}
}



session.setAttribute("hello",u);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"footer two\">\n");
      out.write("\t\t\t\t\t<h3>About Us</h3>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb\" href=\"#\"><i></i>About us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb1\" href=\"#\"><i></i>Write to Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb2\" href=\"#\"><i></i>Contact us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb3\" href=\"#\"><i></i>Email: wide@greenery.com</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"fb4\" href=\"#\"><i></i>call: +91 11222 333 456</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"footer three\">\n");
      out.write("\t\t\t\t\t<h3>Join us</h3>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>About us <span>Be a warrior </span>Partnership </li>\n");
      out.write("\t\t\t\t\t\t<li>1234567890  </li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"mailto:info@example.com\">contact@widegreenery.com</a> </li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"copy-right-grids\">\n");
      out.write("\t\t\t\t<div class=\"copy-left\">\n");
      out.write("\t\t\t\t\t\t<p class=\"footer-gd\">copyright© 2016 widegreenery. All Rights Reserved | Design by <a href=\"https://w3layouts.com/\" target=\"_blank\">W3layouts</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"copy-right\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Company Information</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
