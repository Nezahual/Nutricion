<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" />
    <h1>Seleccione un ingrediente</h1>
    <form action="/action_page.php" method="get">
    <input list="ingredientes">
    <datalist id="ingredientes">
        <c:forEach items="" var="">
            
        </c:forEach>
    </datalist>
    <input type="submit">
    </form>
<jsp:include page="plantilla/pie.jsp" />