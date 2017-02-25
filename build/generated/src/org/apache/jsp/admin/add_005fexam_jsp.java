package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class add_005fexam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      exampack.Examclass cn = null;
      synchronized (_jspx_page_context) {
        cn = (exampack.Examclass) _jspx_page_context.getAttribute("cn", PageContext.PAGE_SCOPE);
        if (cn == null){
          cn = new exampack.Examclass();
          _jspx_page_context.setAttribute("cn", cn, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("<h3><b>\n");
      out.write("        <form action=\"addexam_action.jsp\" method=\"post\">\n");
      out.write("            <h2 align=\"center\">Add exam details</h2>\n");
      out.write("<table align=\"center\" border=\"0\" cellspacing=\"7\" cellpadding=\"10\" >\n");
      out.write("<tbody>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>Date of exam</td>\n");
      out.write("            <td><input type=\"date\" name=\"date\" value=\"\" style=\" width: 308px\" required=\"1\" /></td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>Start time</td>\n");
      out.write("            <td><input type=\"time\" name=\"start\" value=\"\" style=\"width: 308px\" required=\"1\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>End time</td>\n");
      out.write("            <td><input type=\"time\" name=\"end\" value=\"\" style=\"width: 308px\" required=\"1\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Branch name</td>\n");
      out.write("                                <td><select style=\"width: 313px\" name=\"branch\" class=\"form-control\" autofocus=\"1\" required=\"1\">\n");
      out.write("                     <option selected disabled>Select the branch </option>\n");
      out.write("                     ");

                     String select1="select DISTINCT branch from subject";
                     ResultSet rs=cn.select(select1);
                     while(rs.next())
                     {
                     
      out.write("\n");
      out.write("                       <option value=\"");
      out.print(rs.getString("branch"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("branch"));
      out.write("</option>\n");
      out.write("                                ");

                                 }
                                
      out.write(" \n");
      out.write("                        </select></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Semester</td>\n");
      out.write("             <td><select style=\"width: 313px\" name=\"semester\" class=\"form-control\" autofocus=\"1\" required=\"1\">\n");
      out.write("                     <option selected disabled>Select the semester </option>\n");
      out.write("                     ");

                     String select2="select DISTINCT semester from subject";
                     ResultSet rs1=cn.select(select2);
                     while(rs1.next())
                     {
                     
      out.write("\n");
      out.write("                       <option value=\"");
      out.print(rs1.getString("semester"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("semester"));
      out.write("</option>\n");
      out.write("                                ");

                                 }
                                
      out.write(" \n");
      out.write("                 </select></td>\n");
      out.write("                 </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td>Subject</td>\n");
      out.write("             <td><select style=\"width: 313px\" name=\"subject\" class=\"form-control\"  required=\"1\">\n");
      out.write("                     <option selected disabled>Select the subject </option>\n");
      out.write("                     ");

                     String select3="select DISTINCT subject from subject";
                     ResultSet rs2=cn.select(select3);
                     while(rs2.next())
                     {
                     
      out.write("\n");
      out.write("                       <option value=\"");
      out.print(rs2.getString("subject"));
      out.write('"');
      out.write('>');
      out.print(rs2.getString("subject"));
      out.write("</option>\n");
      out.write("                                ");

                                 }
                                
      out.write(" \n");
      out.write("                 </select></td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("             <td><input type=\"submit\" autofocus=\"1\" value=\"submit\" name=\"submit\" /></td>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("        </form>\n");
      out.write("    </b></h3>\n");

String queue = "SELECT * from exam";
                        
            ResultSet rs3 = cn.select(queue);
  
  

      out.write("                         \n");
      out.write(" <table border=\"0\" class=\"table\" align=\"center\" cellspacing=\"7\" cellpadding=\"10\">   \n");
      out.write("    <tr><th>Date of exam</th><th>Start time</th><th>End time</th><th>Branch name</th><th>Semester</th><th>Subject</th><th>Action</th></tr>\n");
      out.write(" ");

 while(rs3.next())
 {
 
      out.write("\n");
      out.write(" <tr>\n");
      out.write("     <td align=\"center\"><font color=\"black\"  required=\"1\">");
      out.print(rs3.getString("date_exam"));
      out.write("</td>\n");
      out.write("     <td align=\"center\"><font color=\"black\">");
      out.print(rs3.getString("start_time"));
      out.write("</td>\n");
      out.write("     <td align=\"center\"><font color=\"black\">");
      out.print(rs3.getString("end_time"));
      out.write("</td>\n");
      out.write("     <td align=\"center\"><font color=\"black\">");
      out.print(rs3.getString("branch"));
      out.write("</td>\n");
      out.write("     <td align=\"center\"><font color=\"black\">");
      out.print(rs3.getString("semester"));
      out.write("</td>\n");
      out.write("     <td align=\"center\"><font color=\"black\">");
      out.print(rs3.getString("subject"));
      out.write("</td>\n");
      out.write("     <td> <a href=\"deleteexam_action.jsp?id=");
      out.print(rs3.getString("id"));
      out.write("\" style=\"color:blue\" >Delete</a></td>\n");
      out.write(" </tr>\n");
      out.write(" ");

 }
 
      out.write("\n");
      out.write(" </table>   \n");
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
