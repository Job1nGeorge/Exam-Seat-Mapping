<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h3><b>
        <form action="addsub_action.jsp" method="post">
            <h2 align="center">Add subject details</h2>
<table align="center" border="0" cellspacing="7" cellpadding="10" >
<tbody>

        <tr>
            <td>Branch</td>
            <td><select style="width: 313px" name="branch" class="form-control"  required="1">
                     <option selected disabled>Select the branch </option>
                     <%
                     String select2="select DISTINCT branch from branch";
                     ResultSet rs1=cn.select(select2);
                     while(rs1.next())
                     {
                     %>
                       <option value="<%=rs1.getString("branch")%>"><%=rs1.getString("branch")%></option>
                                <%
                                 }
                                %> 
                 </select></td>

        </tr>

        <tr>
            <td>Semester</td>
            <td><select style="width: 313px" name="semester">
                    <option selected disabled>Select your semester</option>
                    <option>S1</option>
                    <option>S2</option>
                    <option>S3</option>
                    <option>S4</option>
                    <option>S5</option>
                    <option>S6</option>
                    <option>S7</option>
                    <option>S8</option>
                </select></td>
        </tr>
          <tr>
            <td>Subject</td>
            <td><input type="text" name="subject" value="" style="width: 308px" required="1" placeholder="Enter a subject" /></td>
        </tr>

         <tr>
             <td></td>
            <td><input type="submit" value="submit" autofocus="1" name="submit" /></td>
        </tr>
    </tbody>
</table>
        </form>
    </b></h3>
<%
String queue = "SELECT * from subject";
                        
            ResultSet rs3 = cn.select(queue);
  
  
%>                         
 <table border="0" class="table" align="center" cellspacing="7" cellpadding="10">   
    <tr><th>Branch</th><th>Semester</th><th>Subject</th><th>Action</th></tr>
 <%
 while(rs3.next())
 {
 %>
 <tr>
     <td align="center"><font color="black"  required="1"><%=rs3.getString("branch")%></td>
     <td align="center"><font color="black"><%=rs3.getString("semester")%></td>
     <td align="center"><font color="black"><%=rs3.getString("subject")%></td>
     <td> <a href="deletesub_action.jsp?id=<%=rs3.getString("id")%>" style="color:blue" >Delete</a></td>
 </tr>
 <%
 }
 %>
 </table>   
<%@include file="footer.jsp" %>