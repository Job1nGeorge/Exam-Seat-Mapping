<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h1 align="center"><b>Add hall</b></h1>
<form action="addhall_action.jsp" method="post">
    <b><h3><table border="0" align="center"  cellspacing="7" cellpadding="10">
   <tbody>
        <tr>
            <td>Hall name</td>
            <td><input type="text" name="hall" value="" size="40" placeholder="Enter the hall name" required="1" /></td>
        </tr>
        <tr>
            <td>Number of students</td>
            <td><input type="number" name="number" value="" style="width: 309px" placeholder="Enter the number of students" required="1" /></td>
        </tr>
        <tr>
            <td>Number of seats</td>
            <td><input type="number" value="30" name="seat" style="width: 309px" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input autofocus="1" type="submit" value="submit" name="submit" /></td>
        </tr>
  </tbody>

</table>
    </h3></b>  </form>
            <%
String queue = "SELECT * from hall";
                        
            ResultSet rs = cn.select(queue);
  
  
%>                         
 <table border="0" class="table" align="center" cellspacing="7" cellpadding="10">   
    <tr><th>Hall name</th><th>Number of students</th><th>Number of seats</th><th>Action</th></tr>
 <%
 while(rs.next())
 {
 %>
 <tr>
     <td align="center"><font color="black"  required="1"><%=rs.getString("hall_name")%></td>
     <td align="center"><font color="black"><%=rs.getString("students_number")%></td>
     <td align="center"><font color="black"><%=rs.getString("seats_number")%></td>
     <td> <a href="deletehall_action.jsp?id=<%=rs.getString("id")%>" style="color:blue" >Delete</a></td>
 </tr>
 <%
 }
 %>
 </table> 
<%@include file="footer.jsp" %>