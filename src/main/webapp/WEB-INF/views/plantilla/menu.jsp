<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="col align-self-start" id="menuTitleContainer">
    <a href="Inicio">Healthy Smart</a>
    <img src=""/>
</div>
<div class="col align-self-end" id="menuButtonsContainer">
    <c:if test="${not empty sessionScope.usuario}">
        <a href="ConsultarPlato">Consultar plato</a>
        <a href="CrearPlato">Crear plato</a>
        <a href="Logout" class="loginLogout">Login</a>
    </c:if>
    <c:if test="${empty sessionScope.usuario}">
        <a href="Login" class="loginLogout">Login</a>
    </c:if>
</div>
