<jsp:include page="plantilla/cabecera.jsp" />
<div class="container" style="width:30%">
    <form action="EjecutarLogin" method="post">
        <div class="form-group">
            <label for="nombre">Nombre de usuario: </label>
            <input type="text" id="nombre" name="usuario" class="form-control" placeholder="Nombre de usuario"> <br/>
        </div>
        <div class="form-group">
            <label for="password">Contraseña: </label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Contraseña"/> <br/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <a href="Inicio" class="btn btn-info" role="button">Cancelar</a>
    </form> 
</div>
<jsp:include page="plantilla/pie.jsp" />
