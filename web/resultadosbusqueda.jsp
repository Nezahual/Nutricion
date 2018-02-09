<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" >
    <jsp:param name="titulo" value="Resultados de busqueda"/>
</jsp:include>
        <h1>Resultados de busqueda</h1>
        <table border="1">
            <thead>
                <tr>
                    <td>Pelicula</td>
                    <td>Director</td>
                    <td>Año de estreno</td>
                </tr>
            </thead>
            
            <c:forEach  items="${requestScope.listado}" var="p">
            <tr>
                <td><a href="Detalle?id=${p.getId()}">${p.getNombre()}</a></td>
                <td><a href="Detalle?id=${p.getId()}">${p.getDirector()}</a></td>
                <td><a href="Detalle?id=${p.getId()}">${p.getAnyoProduccion()}</a></td>
                
            </tr>
            </c:forEach>
        </table>
<jsp:include page="plantilla/pie.jsp" />