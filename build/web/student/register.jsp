<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
  <title>Exam seat mapping</title>
  <meta name="description" content="free website template" />
  <meta name="keywords" content="enter your keywords here" />
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <link rel="stylesheet" type="text/css" href="../minimalistic_wood/css/style.css" />
  <script type="text/javascript" src="../minimalistic_wood/js/jquery.min.js"></script>
  <script type="text/javascript" src="../minimalistic_wood/js/jquery.easing.min.js"></script>
  <script type="text/javascript" src="../minimalistic_wood/js/jquery.lavalamp.min.js"></script>
  <script type="text/javascript">
    $(function() {
      $("#lava_menu").lavaLamp({
        fx: "backout",
        speed: 700
      });
    });
  </script>
  <script type="text/javascript" src="../minimalistic_wood/js/jquery.nivo.slider.pack.js"></script>
    <script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
    </script>

</head>

<body>
  <div align="center" id="main">	
	<div id="menubar">
      <ul class="lavaLampWithImage" id="lava_menu">
     
      </ul>
	</div><!--close menubar-->	    
	<div id="site_content">        	  
	  <div id="header"> 
        <div id="header_name"> 	  
          <h1>Exam SEAT <span>Mapping</span></h1>
        </div><!--close header_name-->	
        <div id="header_slogan"> 		
	      <h2>Look around Think different</h2>
		 </div><!--close header_slogan-->	
      </div><!--close header-->	
	  <div id="banner_image">
	    <div>        
          <div id="slider" class="nivoSlider">
              <img src="../minimalistic_wood/images/pic8.jpg" alt="" />
              <img src="../minimalistic_wood/images/pic9.jpg" alt="" />
		  </div>
		</div><!--close slider-wrapper-->
	  </div><!--close banner_image--><br>
                   <h2 align="center">REGISTRATION</h2>
              <form name="registration" method="post" action="reg_action.jsp">
                            <table border="0" cellspacing="10">
                         <tbody>

                    <tr>
                        <td><font size="4">First name</font></td>
                        <td><input type="text" name="fname" value="" size="38" required="1"/></td>
                    </tr>
                    <tr>
                        <td><font size="4">Last name</font></td>
                        <td><input type="text" name="lname" value="" size="38" required="1"/></td>
                    </tr>
                    <tr>
                        <td><font size="4">Register number</font></td>
                        <td><input type="text" name="rnumber" value="" size="38" required="1"/></td>
                    </tr>
                    <tr>
                        <td><font size="4">Department</font></td>
                        <td><select name="department" style="width: 299px;" required="1">
                                <option selected disabled>Select your department</option>
                                <option>Computer science & engineering</option>
                                <option>Civil Engineering</option>
                                <option>Mechanical engineering</option>
                                <option>Electrical & communication Engineering</option>
                                <option>Electronics and Electrical Engineering</option>
                            </select></td>
                  </tr>
                    <tr>
                        <td><font size="4">Semester</font></td>
                        <td><select name="semester" style="width: 299px;" required="1">
                                <option selected disabled >Select your semester</option>
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
                        <td><font size="4">Username</font></td>
                        <td><input type="text" name="username" value="" required="1" size="38"/></td>
                    </tr>
                     <tr>
                        <td><font size="4">Password</font></td>
                        <td><input type="password" name="pass" value="" size="38" id="password" required="1"/></td>
                    </tr>
                    <tr>
                        <td><font size="4">Confirm Password</font></td>
                        <td><input type="password" name="passc" value="" size="38" id="password2" required="1"/></td>
                        <td><div id="errcpass" style="color: red"></div></td>
                    </tr>                
                     <tr>
                         <td></td>
                         <td><input type="submit" value="Register" onclick="return Validate();" /></td>
                    </tr>
                  
                </tbody>
            <script type="text/javascript">
    function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("password2").value;
        if (password !== confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
</script>
            </table>
                              </form>
              
              <div id="content">
       	
       <br style="clear:both;" />
      </div><!--close content-->	
    </div><!--close site_content-->	
    <div id="footer">  
	  <div id="footer_content">
       Exam seat mapping | project | by | Code i3
      </div><!--close footer_content-->	
    </div><!--close footer-->	
  </div><!--close main-->	
</body>
</html>
