<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h1 align="center">Welcome Admin!</h1><br>
<h2>Add Branch</h2> 
<div align="center"> <h3><b>
     <form name="branch" method="post" action="branch_action.jsp">
    <table border="0" cellspacing="7" cellpadding="10">

        <tbody>
            <tr>
                <td>Branch name</td>
                <td><input type="text" name="branch" value="" size="30"placeholder="Enter the Branch" required="1"/></td>
            </tr>
            <tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Submit" name="submit" /></td>
            </tr>
        </tbody>
    </table>

     </form>
</table>
        
         </b>  </h3> </div>
     <%
String queue = "SELECT * from branch";
                        
            ResultSet rs = cn.select(queue);
  
  
%>
 <table border="0" class="table" align="center" cellspacing="7" cellpadding="10">
   
    <tr><th>Branch name</th><th>Action</th></tr>
 <%
 while(rs.next())
 {
 %>
 <tr>
     <td align="center"><font color="black"><%=rs.getString("branch")%></td>
     <td><a href="deletedept_action.jsp?id=<%=rs.getString("id")%>" style="color:blue" >Delete</a></td>
     <td><a href="editdept.jsp?id=<%=rs.getString("id")%>" style="color:blue" >edit</a></td>
 </tr>
 <%
 }
 %>
 </table>
<%@include file="footer.jsp" %>