<%-- 
    Document   : login
    Created on : 08-feb-2018, 11:41:15
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Inicio de sesión</title>
    </head>
    <body>
        <h1>Introduce tus datos</h1>
        <form action="HacerLogin" method="post">
            <label for="nombre">Nombre de usuario: </label>
            <input type="text" name="nombre" placeholder="Nombre de usuario"> <br/>
            <label for="password">Contraseña: </label>
            <input type="password" name="password" placeholder="Contraseña"/> <br/>
            <button type="submit">Enviar</button>
        </form>   
    </body>
</html>
