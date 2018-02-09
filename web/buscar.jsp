<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" >
    <jsp:param name="titulo" value="Busqueda de articulos"/>
</jsp:include>
        <h1>Busqueda de peliculas</h1>
        
        <form action="ResultadosBusqueda" method="post">
            <label for="texto">Texto a buscar:</label>
            <input name="texto" type="text" placeholder="Texto a buscar aqui..." /><br/>
            <button type="submit">Buscar</button>
        </form>
        
<jsp:include page="plantilla/pie.jsp" />