/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampack;

import java.sql.*;
public class Examclass {
    
    Connection cn=null;
    ResultSet rs=null;
    Statement st=null;
    public Examclass()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/examdata","root","root");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    public boolean insert(String str)
    {
        boolean b=false;
        try
        {
            st=cn.createStatement();
            st.executeUpdate(str);
            b=true;
        }
        catch(Exception e)        
        {
            
        }
        return b;
    }
    public boolean delete(String str)
    {  
        boolean b=false;
        try
        {
            st=cn.createStatement();

        st.executeUpdate(str);
            b=true;
        }
        catch(Exception e)        
        {
          System.out.println(e);  
        }
        return b;
    }      

    public ResultSet select(String selQry)
    {
        try
        {
            st=cn.createStatement();
            rs=st.executeQuery(selQry);
        }
        catch(Exception e)
        {
           
        }
         return rs;
    }
      
}
