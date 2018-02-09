<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" />
<div class="container" style="width:40%">
    <h1>Listado de platos: </h1>

    <form action="EditarPlato" method="POST">
        <div class="form-group">
            <label for="selector">Seleccione un plato</label>
            <select class="form-control" id="selector" name="idPlato">
                <c:if test="${empty requestScope.listadoPlatos}">
                    <option disabled selected>Sin platos</option>
                </c:if>
                <c:forEach items="${requestScope.listadoPlatos}" var="plato">
                    <option value="${plato.getId()}">${plato.getNombre()}</option>
                </c:forEach>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Consultar</button>
    </form>
</div>
 <jsp:include page="plantilla/pie.jsp" />