<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" >
    <jsp:param name="titulo" value="Detalle de artículo"/>
</jsp:include>
        <h1>Detalle de artículo</h1>
        Nombre: ${requestScope.producto.getNombre()} <br/>
        Precio: ${requestScope.producto.getPrecio()} <br/>
        Fecha de caducidad: ${requestScope.producto.getFechaCaducidad()} <br/>
        <c:if test="${requestScope.producto.isOferta()}" >
            Está en oferta <br/>
        </c:if>
        
        <c:if test="${not empty sessionScope.usuario }">
            <form action="AnadirCarrito" method="post">
                <input type="hidden" name="id" value="${requestScope.producto.getId()}"/>
                <label for="unidades">Unidades:</label>
                <input type="number" name="unidades" min="1" required="1" step="1" placeholder="Unidades..." /><br/>
                <button type="submit">Añadir al carrito</button>
            </form>
        </c:if>
<jsp:include page="plantilla/pie.jsp" />