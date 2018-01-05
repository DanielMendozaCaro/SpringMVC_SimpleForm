<%-- 
    Document   : success
    Created on : 
    Author     : Daniel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Form completed</title>
    </head>
    <body>
        <h1>Success !! :D</h1>
        <ul>
            <li>Nombre: <c:out value="${name}"/> </li>
            <li>Email: <c:out value="${email}"/> </li>
            <li>Edad: <c:out value="${age}"/> </li>
            <li>Pais: <c:out value="${country}"/> </li>
        </ul>
    </body>
</html>
