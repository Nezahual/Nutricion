<%-- 
    Document   : newjsp
    Created on : 06-feb-2018, 12:28:37
    Author     : USUARIO
--%>

<jsp:include page="plantilla/cabecera.jsp" />
<div class="container">
    <h2>Datos del plato: </h2>
    <form action="EjecutarCrearPlato" method="Post">
        <div class="form-group">
            <label for="nombrep">Plato</label>
            <input type="text" class="form-control" id="nombrep" placeholder="Introducir nombre" name="nombrep">
        </div>
        <div class="form-group">
            <label for="desc">Descripcion</label>
            <input type="text" class="form-control" id="desc" placeholder="Introducir descripcion" name="descp">
        </div>
        <div class="form-group">
            <label for="autor">Autor</label>
            <input type="text" class="form-control" id="autor" placeholder="Introducir nombre" name="autorp">
        </div>
        <button type="submit" class="btn btn-primary">Enviar</button>
        <a href="Inicio" class="btn btn-info" role="button">Cancelar</a>
    </form>
</div>
<a href="AgregarIngrediente?idIngrediente=${requestScope.ingredientes.idPlato}">Añadir ingrediente</a>
<a href="Inicio">Volver al inicio</a>
<jsp:include page="plantilla/pie.jsp" />