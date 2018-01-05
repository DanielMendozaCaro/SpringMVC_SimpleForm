<%-- 
    Document   : form
    Created on : 
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Form Spring web</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery,min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Complete the next form</h1>
                <hr>
                <form:form method="post" commandName="person">
                    <p>
                        <form:label path="name">Nombre: </form:label>
                        <form:input path="name" cssClass="form-control"/>
                    </p>

                    <p>
                        <form:label path="email">Email: </form:label>
                        <form:input path="email" cssClass="form-control"/>
                    </p>

                    <p>
                        <form:label path="age">Edad: </form:label>
                        <form:input path="age" cssClass="form-control"/>
                    </p>
                    <p>
                        <form:label path="country">Pais: </form:label>
                        <form:select path="country" cssClass="form-control">
                            <form:option value="0">Seleccione pais...</form:option>
                        </form:select>
                        
                    </p>
                    <hr>
                    <input type="submit" value="ENVIAR" class="form-control"/>
                </form:form>
            </div>
        </div>
    </body>
</html>
