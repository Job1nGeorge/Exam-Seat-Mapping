package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editdept_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/header.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
  }

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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Exam seat mapping</title>\n");
      out.write("  <meta name=\"description\" content=\"free website template\" />\n");
      out.write("  <meta name=\"keywords\" content=\"enter your keywords here\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"../minimalistic_wood/css/style.css\" />\n");
      out.write("  <script type=\"text/javascript\" src=\"../minimalistic_wood/js/jquery.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"../minimalistic_wood/js/jquery.easing.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"../minimalistic_wood/js/jquery.lavalamp.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(function() {\n");
      out.write("      $(\"#lava_menu\").lavaLamp({\n");
      out.write("        fx: \"backout\",\n");
      out.write("        speed: 700\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("  <script type=\"text/javascript\" src=\"../minimalistic_wood/js/jquery.nivo.slider.pack.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    $(window).load(function() {\n");
      out.write("        $('#slider').nivoSlider();\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div align=\"center\" id=\"main\">\t\n");
      out.write("\t<div id=\"menubar\">\n");
      out.write("      <ul class=\"lavaLampWithImage\" id=\"lava_menu\">\n");
      out.write("     <li class=\"\"><a href=\"home.jsp\"><span>Branch</span></a></li>\n");
      out.write("            <li><a href=\"add_subject.jsp\"><span>Subject</span></a></li>\n");
      out.write("            <li><a href=\"add_exam.jsp\"><span>Exam</span></a></li>\n");
      out.write("            <li><a href=\"add_hall.jsp\"><span>Hall</span></a></li>\n");
      out.write("            <li><a href=\"#\"><span>Approval</span></a></li>\n");
      out.write("            <li><a href=\"#\"><span>Change password</span></a></li>\n");
      out.write("            <li><a href=\"logout_action.jsp\"><span>Logout</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("\t</div><!--close menubar-->\t    \n");
      out.write("\t<div id=\"site_content\">        \t  \n");
      out.write("\t  <div id=\"header\"> \n");
      out.write("        <div id=\"header_name\"> \t  \n");
      out.write("          <h1>Exam SEAT <span>Mapping</span></h1>\n");
      out.write("        </div><!--close header_name-->\t\n");
      out.write("        <div id=\"header_slogan\"> \t\t\n");
      out.write("\t      <h2>Look around Think different</h2>\n");
      out.write("\t\t </div><!--close header_slogan-->\t\n");
      out.write("      </div><!--close header-->\t\n");
      out.write("\t  <div id=\"banner_image\">\n");
      out.write("\t    <div>        \n");
      out.write("          <div id=\"slider\" class=\"nivoSlider\">\n");
      out.write("              <img src=\"../minimalistic_wood/images/pic8.jpg\" alt=\"\" />\n");
      out.write("              <img src=\"../minimalistic_wood/images/pic9.jpg\" alt=\"\" />\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div><!--close slider-wrapper-->\n");
      out.write("\t  </div><!--close banner_image-->");
      out.write("    \n");
      out.write("<form name=\"branch\" method=\"post\" action=\"branch_action.jsp\">\n");
      out.write("    <table border=\"0\" cellspacing=\"7\" cellpadding=\"10\">\n");
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>Branch name</td>\n");
      out.write("                <td><input type=\"text\" name=\"branch\" value=\"\" size=\"30\"placeholder=\"Enter the Branch\" required=\"1\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Submit\" name=\"submit\" /></td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("     </form>\n");
      out.write(" <div id=\"footer\">  \n");
      out.write("\t  <div id=\"footer_content\">\n");
      out.write("       Exam seat mapping | project | by | Code i3\n");
      out.write("      </div><!--close footer_content-->\t\n");
      out.write("    </div><!--close footer-->\t\n");
      out.write("  </div><!--close main-->\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
