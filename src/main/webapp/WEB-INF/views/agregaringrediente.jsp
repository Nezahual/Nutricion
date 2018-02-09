<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" />
    <h1>Seleccione un ingrediente</h1>
    <form method="EjecutarAgregarIngrediente" id="theform">
        <div class="form-group">
            <label for="ingrediente">Ingrediente</label>
            <input type="text" list="ingredientes" id="ingrediente" class="form-control" >
            <datalist id="ingredientes" name="idIngrediente">
                <c:forEach items="${requestScope.listaIngredientes}" var="ingredienteAux">
                    <option value="${ingredienteAux.getId()}">${ingredienteAux.getDescripcion()}</option>
                </c:forEach>
            </datalist>
        </div>
        <div class="form-group">
            <label for="cantidad">Cantidad</label>
            <input type="number" class="form-control" id="cantidad" name="cantidad">
        </div>
        <input type="hidden" value="${requestScope.idPlato}" name="idPlato">
        <input type="hidden" id="accion" name="accion">
        
        <button type="submit" id="agregarTerminar">Añadir y terminar</button>
        <button type="submit" id="agregarSeguir">Añadir y agregar otro</button>
    </form>
    <script>
        $(document).ready(function(){
            $('#agregarTerminar').on('click', function(){
                $('#accion').attr('value', 'terminar');
            });

            $('#agregarSeguir').on('click', function(){
                $('#accion').attr('value', 'seguir');
            });
        });
    </script>
<jsp:include page="plantilla/pie.jsp" />