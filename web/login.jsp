<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" >
    <jsp:param name="titulo" value="Login"/>
</jsp:include>
        <h1>Login</h1>
        <form action="HacerLogin" method="post">
            <label for="nombre">Nombre de usuario: </label>
            <input type="text" name="nombre" placeholder="Nombre de usuario aqu�..."> <br/>
            <label for="password">Contrase�a: </label>
            <input type="password" name="password" poaceholder="Contrase�a aqui..."/> <br/>
            <button type="submit">Login</button>
        </form>
<jsp:include page="plantilla/pie.jsp" />