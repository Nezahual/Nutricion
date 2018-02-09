<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br/><br/>
        <c:if test="${empty sessionScope.usuario}">
            <a href="Login">Hacer Login</a><br/>
        </c:if>
        <c:if test="${not empty sessionScope.usuario }">
            <a href="Logout">Salir</a><br/>
        </c:if>
    </body>
</html>
