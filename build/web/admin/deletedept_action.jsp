<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<%

String id=request.getParameter("id");

    String delete1="delete from branch WHERE id='"+id+"'";
    cn.delete(delete1);
      response.sendRedirect("home.jsp");
%>
