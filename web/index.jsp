<%-- 
    Document   : index
    Created on : 03/12/2018, 15:59:24
    Author     : Albert Lima de Melo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consulta Temperatura</h1>
        
        <form method="POST" action="http://localhost:8080/DADOS2018_Jax_Rs_Service/rest/cidade/inserir">
            <label>Id :</label>
            <input type="text" id="id" name="id"/>
            <label>Cidade :</label>
            <input type="text" id="nome" name="nome"/>
            <label>Estado: </label>
            <input type="text" id="estado" name="estado"/>
            <input type="submit" id="btnenviar" name="btnenviar" value="Enviar"/>
        </form>
        
        
        
    </body>
</html>
