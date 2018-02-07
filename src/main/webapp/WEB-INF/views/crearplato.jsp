<%-- 
    Document   : newjsp
    Created on : 06-feb-2018, 12:28:37
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Nuevo plato</title>
    </head>
    <body>
        <h1>Datos del Autor: </h1>
        <form action="EjecutarCrear" method="POST">
            <table>
                <tr>
                    <td><label for="nombre">Nombre:</label></td>
                    <td><input type="text" name="nombre" placeholder="Nombre del plato"/></td>
                </tr>
                <tr>
                    <td><label for="descripcion">Descripcion:</label></td>
                    <td><input type="text" name="descripcion" placeholder="Descripcion del plato"/></td>
                </tr>
                <tr>
                    <td><label for="autor">Autor del plato:</label></td>
                    <td><input type="text" name="autor" placeholder="Autor del plato"/></td>
                </tr>
                <tr>
                    <td style="text-align:center">
                        <button type="submit">Insertar</button>
                    </td>
                    <td style="text-align:center">
                        <a href="Inicio">Cancelar</a>
                    </td>
                </tr>
            </table>
        </form>
        <h1>Añadir Ingredientes: </h1>
        <form action="AnadirIngrediente" method="POST">
            <table>
                <tr>
                    <td><label for="ingrediente">Ingrediente:</label></td>
                    <td><input type="text" name="ingrediente" placeholder="Ingrediente"/></td>
                </tr>
                <tr>
                    <td style="text-align:center">
                        <button type="submit">Insertar</button>
                    </td>
                </tr>
            </table>
        </form>
        <a href="AddIngredient">Añadir ingrediente</a>
        <a href="Inicio">Volver al inicio</a>
    </body>
</html>
