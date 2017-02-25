package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Exam seat mapping</title>\r\n");
      out.write("  <meta name=\"description\" content=\"free website template\" />\r\n");
      out.write("  <meta name=\"keywords\" content=\"enter your keywords here\" />\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"minimalistic_wood/css/style.css\" />\r\n");
      out.write("  <script type=\"text/javascript\" src=\"minimalistic_wood/js/jquery.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"minimalistic_wood/js/jquery.easing.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"minimalistic_wood/js/jquery.lavalamp.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    $(function() {\r\n");
      out.write("      $(\"#lava_menu\").lavaLamp({\r\n");
      out.write("        fx: \"backout\",\r\n");
      out.write("        speed: 700\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"minimalistic_wood/js/jquery.nivo.slider.pack.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    $(window).load(function() {\r\n");
      out.write("        $('#slider').nivoSlider();\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"main\">\t\r\n");
      out.write("\t<div id=\"menubar\" >\r\n");
      out.write("      <ul class=\"lavaLampWithImage\">\r\n");
      out.write("          <li ><a href=\"admin/login.jsp\">Admin</a></li>\r\n");
      out.write("        <li><a href=\"faculty/login.jsp\">Faculty</a></li>\r\n");
      out.write("        <li  id=\"lava_menu\"><a href=\"student/login.jsp\">Student</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("\t</div><!--close menubar-->\t    \r\n");
      out.write("\t<div id=\"site_content\">        \t  \r\n");
      out.write("\t  <div id=\"header\"> \r\n");
      out.write("        <div id=\"header_name\"> \t  \r\n");
      out.write("          <h1>Exam SEAT <span>Mapping</span></h1>\r\n");
      out.write("        </div><!--close header_name-->\t\r\n");
      out.write("        <div id=\"header_slogan\"> \t\t\r\n");
      out.write("\t      <h2>Look around Think different</h2>\r\n");
      out.write("\t\t </div><!--close header_slogan-->\t\r\n");
      out.write("      </div><!--close header-->\t\r\n");
      out.write("\t  <div id=\"banner_image\">\r\n");
      out.write("\t    <div>        \r\n");
      out.write("          <div id=\"slider\" class=\"nivoSlider\">\r\n");
      out.write("              <img src=\"minimalistic_wood/images/pic8.jpg\" alt=\"\" />\r\n");
      out.write("              <img src=\"minimalistic_wood/images/pic9.jpg\" alt=\"\" />\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div><!--close slider-wrapper-->\r\n");
      out.write("\t  </div><!--close banner_image-->\t\t\t  \r\n");
      out.write("          <div id=\"content\">\r\n");
      out.write("        <div>\r\n");
      out.write("          <h1 align=\"center\">About our project</h1>\r\n");
      out.write("          <p>This project is aimed at developing an online Exam Seat Arrangement .The purpose of this project is to present the software requirement specification for seating arrangement for the examination department .This document illustrate the how this software makes easier of arranging seat for an examination....</p>\r\n");
      out.write("          <br><p></p>\r\n");
      out.write("\t\t</div><!--close content_item-->\t\t\r\n");
      out.write("       <br style=\"clear:both;\" />\r\n");
      out.write("      </div><!--close content-->\t\r\n");
      out.write("    </div><!--close site_content-->\t\r\n");
      out.write("    <div id=\"footer\">  \r\n");
      out.write("\t  <div id=\"footer_content\">\r\n");
      out.write("       Exam seat mapping | project | by | Code i3\r\n");
      out.write("      </div><!--close footer_content-->\t\r\n");
      out.write("    </div><!--close footer-->\t\r\n");
      out.write("  </div><!--close main-->\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
