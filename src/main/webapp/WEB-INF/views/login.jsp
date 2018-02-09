<jsp:include page="plantilla/cabecera.jsp" />
    <h1>Introduce tus datos</h1>
    <form action="EjecutarLogin" method="post">
        <label for="nombre">Nombre de usuario: </label>
        <input type="text" name="nombre" placeholder="Nombre de usuario"> <br/>
        <label for="password">Contraseña: </label>
        <input type="password" name="password" placeholder="Contraseña"/> <br/>
        <button type="submit">Enviar</button>
    </form>   
<jsp:include page="plantilla/pie.jsp" />
