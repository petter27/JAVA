<%-- 
    Document   : index
    Created on : 05-23-2019, 12:43:51 AM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <% String numero1= "primer numero";
           String numero2= "segundo numero";      %>
        
        <h1>Calculadora JSP </h1>
        <form method="GET" action="miServlet">
            <div>
            <label for="numero1">Numero 1:</label>
            <input type="number" name="num1" placeholder="<%= numero1 %>">
            </div>
            <div>
            <label for="numero2">Numero 2:</label>
            <input type="number" name="num2" placeholder="<%= numero2 %>">
            </div>
            <div>
                 <input type="radio" name="operacion" value="suma" checked>Suma 
                 <input type="radio" name="operacion" value="resta">Resta
                  <input type="radio" name="operacion" value="multiplicacion">multiplicacion 
            </div>
            <button type="submit"> Sumar </button>
        </form>
    </body>
    <footer>
        Derechos Reservados - Peter27
    </footer>
        
</html>
