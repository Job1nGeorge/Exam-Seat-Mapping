<%@include file="header.jsp" %>    
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<h1></h1>
<form name="branch" method="post" action="updatedept_action.jsp">
    <table border="0" cellspacing="7" cellpadding="10">

        <tbody><%
            String id=request.getParameter("id");
            
            String queue = "SELECT * from branch where id='"+id+"'";
                        
            ResultSet rs = cn.select(queue);
            if(rs.next()){
            %>
            <tr>
                <td>Branch name</td>
                <td><input type="text" name="branch" value="<%=rs.getString("branch")%>" size="30"placeholder="Enter the Branch" required="1"/></td>
                <input type="hidden" name="id" value="<%=rs.getString("id")%>" size="30"placeholder="Enter the Branch" required="1"/></td>
    
            </tr><%}%>
            <tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Submit" name="Update" /></td>
            </tr>
        </tbody>
    </table>
     </form>
<%@include file="footer.jsp" %>