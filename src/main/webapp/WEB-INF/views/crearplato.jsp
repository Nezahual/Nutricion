<%-- 
    Document   : newjsp
    Created on : 06-feb-2018, 12:28:37
    Author     : USUARIO
--%>

<jsp:include page="plantilla/cabecera.jsp" />
<div>
    <div class="container" style="width:50%; height: 80vh; padding-top: 10vh" >
        <h2>Datos del plato: </h2>
        <form action="EjecutarCrearPlato" method="Post">
            <div class="form-group">
                <label for="nombre">Plato</label>
                <input type="text" class="form-control" id="nombre" placeholder="Introducir nombre" name="nombre">
            </div>
            <div class="form-group">
                <label for="desc">Descripcion</label>
                <textarea class="form-control" name="descripcion" id="desc" rows="4" placeholder="Introducir descripcion"></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
            <a href="Inicio" class="btn btn-info" role="button">Cancelar</a>
        </form>
    </div>
</div>
<jsp:include page="plantilla/pie.jsp" />
