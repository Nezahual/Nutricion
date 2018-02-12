<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="plantilla/cabecera.jsp" />
<div class="container" style="height:80vh; padding-top: 10vh;">
<c:choose>
    <c:when test="${not empty requestScope.mensaje}">
        <h1>${requestScope.mensaje}</h1>
    </c:when>
    <c:otherwise>
        <h1>
            Bienvenido a la web de Nutrición Healthy Smart.
        </h1>
    </c:otherwise>
</c:choose>

</div>
<jsp:include page="plantilla/pie.jsp" />
