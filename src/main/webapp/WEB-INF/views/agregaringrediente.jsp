<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" />
    <h1>Seleccione un ingrediente</h1>
    <form action="/action_page.php" method="get" id="theform">
        <div class="form-group">
            <label for="ingrediente">Ingrediente</label>
            <input type="text" list="ingredientes" id="ingrediente" class="form-control" >
            <datalist id="ingredientes">
                <c:forEach items="${requestScope.listado}" var="ingredienteAux">
                    <option value="${ingredienteAux.getId()}">${ingredienteAux.getDescripcion()}</option>
                </c:forEach>
            </datalist>
        </div>
        <div class="form-group">
            <label for="cantidad">Cantidad</label>
            <input type="number" class="form-control" id="cantidad" name="cantidad">
        </div>
        <input type="hidden" value="${requestScope.idPlato}" name="idPlato">
        
        <<!--<input type="button" value="Añadir y terminar">
        <input type="button" value="Añadir y agregar otro">-->
        <button type="submit" id="agregarTerminar">Añadir y terminar</button>
        <button type="submit" id="agregarSeguir">Añadir y agregar otro</button>
    </form>
    <script>
        /*document.getElementById('anadirTerminar').onclick(function(){
            document.theform.action = "AgregarTerminar";
            document.theform.submit();
        });
        
        document.getElementById('agregarSeguir').onclick(function(){
            document.theform.action = "AgregarSeguir";
            document.theform.submit();
        });*/
    
        $(document).ready(function(){
            $('#anadirTerminar').on('click', function(){
                $('#theform').attr('action', 'AgregarTerminar');
                $('#theform').submit();
            });

            $('#agregarSeguir').on('click', function(){
                $('#theform').attr('action', 'AgregarSeguir');
                $('#theform').submit();
            });
        });
    </script>
<jsp:include page="plantilla/pie.jsp" />