<%-- 
    Document   : subir
    Created on : Sep 28, 2017, 12:14:06 PM
    Author     : jrglu
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css">
         <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">
        
        <link rel="shortcut icon" href="assets/ico/favicon.png">

        <title>Login</title>
    </head>
    <body style="background-color: #1b6d85">
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	
                            <div class="form-bottom" style="float:left;">
                                <form action="subir"  method="POST">
                                    <div class="form-group">
			                    		
                                	<input type="text" name="txtarchivo" placeholder="archivo" >
                                    </div>
			           
                                   <%-- <input type="submit" value="login" class="btn btn-primary">--%>
			            <button type="submit"  class="btn"  onclick="location.href = 'login.jsp'">subir archivo a carpeta principal!</button> 
                                     
			        </form>
                                    <br>
                                    
                                   <%--  <form action=""  method="POST">
                                    <div class="form-group">
			                    		
                                	<input type="text" name="txtarchivo" placeholder="archivo" >
                                    </div>
			           
                                   <%-- <input type="submit" value="login" class="btn btn-primary">
			            <button type="submit"  class="btn"  onclick="location.href = 'login.jsp'">Crear archivo!</button> 
                                    
			        </form>
                                   --%>
		            </div>
                              <div class="form-bottom" style="float:right;">
                                <form action="subirB"  method="POST">
                                    <div class="form-group">
			                    		
                                	<input type="text" name="txtcarpeta" placeholder="carpeta" >
                                    </div>
                                      <div class="form-group">
			                    		
                                	<input type="text" name="txtarchivo" placeholder="archivo" >
                                    </div>
			           
                                   
			            <button type="submit"  class="btn"  onclick="location.href = 'login.jsp'">Subir archivo a caperta mencionada!</button> 
                                     <a href="deleteAr.jsp">eliminar archivo!</a>  
			        </form>
                                  
                                   
                                
		            </div>
                                    
                               
                              
                        </div>
                            
                    </div>
                   
                </div>
            </div>
            
        </div>
    </body>
</html>