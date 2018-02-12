<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" />

<div class="container" style="width:30%;height:80vh;padding-top:10vh;">
    <form action="EjecutarLogin" method="post">
        <div class="form-group">
            <label for="nombre">Nombre de usuario: </label>
            <input type="text" id="nombre" name="usuario" class="form-control" placeholder="Nombre de usuario"> <br/>
        </div>
        <div class="form-group">
            <label for="password">Contrase�a: </label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Contrase�a"/> <br/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <a href="Inicio" class="btn btn-info" role="button">Cancelar</a>
    </form> 
    <c:if test="${not empty requestScope.mensajeError}">
        <h6 style="color:red; margin-top: 15px;">${requestScope.mensajeError}</h6>
    </c:if>
</div>
<jsp:include page="plantilla/pie.jsp" />
