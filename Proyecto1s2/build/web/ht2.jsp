<%-- 
    Document   : newUser
    Created on : Sep 12, 2017, 10:22:53 PM
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
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Registrate</h3>
                            		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-lock"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
                                <form action="ht2"  method="POST">
                                    <div class="form-group">
			                    		
                                	<input type="text" name="txtusuario" placeholder="Usuario" >
                                    </div>
			            <div class="form-group">
                                        <input type="password" name="txtpass" placeholder="password">      	
			                
			            </div>
                                   <%-- <input type="submit" value="login" class="btn btn-primary">--%>
			            <button type="submit"  class="btn"  onclick="location.href = 'login.jsp'">Completado!</button> 
                                    
			        </form>
		            </div>
                        </div>
                    </div>
                   
                </div>
            </div>
            
        </div>
    </body>
</html>

