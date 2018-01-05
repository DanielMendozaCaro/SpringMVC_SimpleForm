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
    </head>
    <body>
        <h1>Complete the next form</h1>
        <form:form>
            <p>
                <form:label path="name">Nombre: </form:label>
                <form:input path="name"/>
            </p>
            
            <p>
                <form:label path="email">Email: </form:label>
                <form:input path="email"/>
            </p>
            
            <p>
                <form:label path="years">Edad: </form:label>
                <form:input path="years"/>
            </p>
            <hr>
            <form:button>Enviar</form:button>
        </form:form>
    </body>
</html>
