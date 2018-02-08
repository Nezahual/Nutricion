<%-- 
    Document   : ConsultarPlato
    Created on : 06-feb-2018, 13:43:18
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <!--No deberia de mostrarse si no estas logueado-->
    <head>
        <title>TODO supply a title</title>
        <meta charset="windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Consulta de plato: </h1>
        
        <div>
            <label> </label>
            <select>
                <option value="tortillaPatatas">Tortilla de patatas</option>
                <option value="bocadilloJamon">Bocadillo de jamón</option>
                <option value="lentejas">Lentejas</option>
                <option value="espinacasConGarbanzos">Espinacas con garbanzos</option>
            </select>
            <a href="DetallesPlato">
                <button>Consultar</button>
            </a>
            <a href="Inicio">Volver al inicio</a>
        </div>
    </body>
</html>
