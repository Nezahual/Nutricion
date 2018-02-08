<%-- 
    Document   : editarplato
    Created on : 08-feb-2018, 12:49:19
    Author     : The HBoy
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" />
<h1>Datos del Autor: </h1>
<form action="EjecutarCrearPlato" method="POST">
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
    <table>
        <thread>
            <tr>
                <td>Ingrediente</td>
            </tr>
        </thread>
        <c:forEach items="${requestScope.ingredientes}" var="c" >  <!--Crear y cambiar requestscope-->
            <tr>
                <td>
                    ${c.descripcion}
                    <a href="EliminarIngredientes?idIngrediente=${c.idPlato}&idPlato=${c.idIngrediente}">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
<a href="AddIngredient">Añadir ingrediente</a>
<a href="Inicio">Volver al inicio</a>
<jsp:include page="plantilla/pie.jsp" />