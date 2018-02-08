<%-- 
    Document   : newjsp
    Created on : 06-feb-2018, 12:28:37
    Author     : USUARIO
--%>

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
        </form>
        <a href="AgregarIngrediente?idIngrediente=${requestScope.ingredientes.idPlato}">Añadir ingrediente</a>
        <a href="Inicio">Volver al inicio</a>
    <jsp:include page="plantilla/pie.jsp" />