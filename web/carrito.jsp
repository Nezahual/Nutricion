<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" >
    <jsp:param name="titulo" value="Carrito"/>
</jsp:include>
        <h1>Liubros obtenidos</h1>
        
        <table>
        <c:forEach items="${sessionScope.carrito.getListado()}" var="p">
            <tr>
                <td>${p.getNombre()}</td>
                <td>${p.getDirector()}</td>
                <td>${p.getAnyoProduccion()}</td>
            </tr>
        </c:forEach>
        </table>
        Total del carrito: ${sessionScope.carrito.getTotal()}<br/>
            
<jsp:include page="plantilla/pie.jsp" />