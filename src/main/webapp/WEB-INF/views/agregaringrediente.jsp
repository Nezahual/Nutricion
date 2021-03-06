<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" />
<div class="container" style="height: 80vh; padding-top: 10vh; width: 50%">
    <h1>Seleccione un ingrediente</h1>
    <form action="EjecutarAgregarIngrediente" method="POST">
        <div class="form-group">
            <label for="ingrediente">Ingrediente</label>
            <input type="text" list="ingredientes" id="ingrediente" class="form-control"  name="idIngrediente">
            <datalist id="ingredientes">
                <c:forEach items="${requestScope.listaIngredientes}" var="ingredienteAux">
                    <option value="${ingredienteAux.getId()}">${ingredienteAux.getDescripcion()}</option>
                </c:forEach>
            </datalist>
        </div>
        <div class="form-group">
            <label for="cantidad">Cantidad (g)</label>
            <input type="number" class="form-control" id="cantidad" min="0" step="10" name="cantidad">
        </div>
        <input type="hidden" value="${requestScope.idPlato}" name="idPlato">
        <input type="hidden" id="accion" name="accion">
        
        <button type="submit" id="agregarTerminar" class="btn btn-primary">A�adir y terminar</button>
        <button type="submit" id="agregarSeguir" class="btn btn-primary">A�adir y agregar otro</button>
    </form>
</div>
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
