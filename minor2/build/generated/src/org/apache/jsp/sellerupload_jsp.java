package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sellerupload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1 class=\"brand\"><a href=\"#top\"><b>W</b>ide<B>G</B>Greenary</a></h1>\n");
      out.write("        <nav class=\"pull-right nav-collapse collapse\">\n");
      out.write("          <ul id=\"menu-main\" class=\"nav\">\n");
      out.write("            <li><a title=\"portfolio\" href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a title=\"wiki\" href=\"plantopedia.jsp\">Plantopedia</a></li>\n");
      out.write("            <li><a title=\"NGO\" href=\"green.jsp\">Green Warrior</a></li>\n");
      out.write("\t\t\t<li>");
 String s=(String)session.getAttribute("user");
               if(s=="Null")
               {
                   
      out.write("<a href=\"login.html\">login </a> ");

                }else
                {
      out.write("<a href=\"logout.jsp\">logout</a> \n");
      out.write("                ");
 }

           
      out.write("</li>\n");
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
      out.write("\t\t\t\t\t<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Add Photo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Add Photo</h2>\n");
      out.write("        <form id=\"form1\" enctype=\"multipart/form-data\" action=\"/minor2/addphoto\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Product Name :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"pname\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter The Product Price :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"price\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter The Product Description :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"desc\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Select Photo  </td>\n");
      out.write("                    <td><input type=\"file\"  name=\"photo\" />\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter The Product Categoty :</td>\n");
      out.write("                   <td> <select name=\"category\">\n");
      out.write("  <option value=\"plants\">PLANTS</option>\n");
      out.write("  <option value=\"seednbulbs\">SEEDS AND BULBS</option>\n");
      out.write("   <option value=\"fertilizers\">FERTILIZERS</option>\n");
      out.write("  <option value=\"pots\">POTS</option></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>STOCK AVAILABLE</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"stock\" />\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <p/>\n");
      out.write("            <input type=\"submit\" value=\"ADD PRODUCT\"/>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <p/>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
