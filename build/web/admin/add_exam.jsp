<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h3><b>
        <form action="addexam_action.jsp" method="post">
            <h2 align="center">Add exam details</h2>
<table align="center" border="0" cellspacing="7" cellpadding="10" >
<tbody>

        <tr>
            <td>Date of exam</td>
            <td><input type="date" name="date" value="" style=" width: 308px" required="1" /></td>

        </tr>

        <tr>
            <td>Start time</td>
            <td><input type="time" name="start" value="" style="width: 308px" required="1" /></td>
        </tr>
        <tr>
            <td>End time</td>
            <td><input type="time" name="end" value="" style="width: 308px" required="1" /></td>
        </tr>
        <tr>
            <td>Branch name</td>
                                <td><select style="width: 313px" name="branch" class="form-control"  required="1">
                     <option selected disabled>Select the branch </option>
                     <%
                     String select1="select DISTINCT branch from subject";
                     ResultSet rs=cn.select(select1);
                     while(rs.next())
                     {
                     %>
                       <option value="<%=rs.getString("branch")%>"><%=rs.getString("branch")%></option>
                                <%
                                 }
                                %> 
                        </select></td>
        </tr>
        <tr>
            <td>Semester</td>
             <td><select style="width: 313px" name="semester" class="form-control"  required="1">
                     <option selected disabled>Select the semester </option>
                     <%
                     String select2="select DISTINCT semester from subject";
                     ResultSet rs1=cn.select(select2);
                     while(rs1.next())
                     {
                     %>
                       <option value="<%=rs1.getString("semester")%>"><%=rs1.getString("semester")%></option>
                                <%
                                 }
                                %> 
                 </select></td>
                 </tr>
         <tr>
            <td>Subject</td>
             <td><select style="width: 313px" name="subject" class="form-control"  required="1">
                     <option selected disabled>Select the subject </option>
                     <%
                     String select3="select DISTINCT subject from subject";
                     ResultSet rs2=cn.select(select3);
                     while(rs2.next())
                     {
                     %>
                       <option value="<%=rs2.getString("subject")%>"><%=rs2.getString("subject")%></option>
                                <%
                                 }
                                %> 
                 </select></td>

        </tr>
         <tr>
             <td><input type="submit" autofocus="1" value="submit" autofocus="1" name="submit" /></td>
            <td></td>
        </tr>
    </tbody>
</table>
        </form>
    </b></h3>
<%
String queue = "SELECT * from exam";
                        
            ResultSet rs3 = cn.select(queue);
  
  
%>                         
 <table border="0" class="table" align="center" cellspacing="7" cellpadding="10">   
    <tr><th>Date of exam</th><th>Start time</th><th>End time</th><th>Branch name</th><th>Semester</th><th>Subject</th><th>Action</th></tr>
 <%
 while(rs3.next())
 {
 %>
 <tr>
     <td align="center"><font color="black"  required="1"><%=rs3.getString("date_exam")%></td>
     <td align="center"><font color="black"><%=rs3.getString("start_time")%></td>
     <td align="center"><font color="black"><%=rs3.getString("end_time")%></td>
     <td align="center"><font color="black"><%=rs3.getString("branch")%></td>
     <td align="center"><font color="black"><%=rs3.getString("semester")%></td>
     <td align="center"><font color="black"><%=rs3.getString("subject")%></td>
     <td> <a href="deleteexam_action.jsp?id=<%=rs3.getString("id")%>" style="color:blue" >Delete</a></td>
 </tr>
 <%
 }
 %>
 </table>   
<%@include file="footer.jsp" %>