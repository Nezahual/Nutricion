<%-- 
    Document   : editarplato
    Created on : 08-feb-2018, 12:49:19
    Author     : The HBoy
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="plantilla/cabecera.jsp" />
<div class="container" style="width:50%">
  <h2>Datos del plato: </h2>
  <form action="EjecutarEditarPlato" method="Post">
  <table>
    <div class="form-group">
      <label for="nombrep">Nombre actual: </label>
      <input type="text" class="form-control" id="nombrep" value="${requestScope.p.nombre}" name="nombre">
    </div>
    <div class="form-group">
      <label for="desc">Descripcion actual: </label>
      <textarea class="form-control" id="desc" name="descripcion" rows="4">${requestScope.p.descripcion}</textarea>
    </div>
    <div class="form-group">
      <label for="aut">Autor del plato: ${requestScope.p.autor}</label>
      <input type="hidden" class="form-control" id="autc" value="${requestScope.p.autor}" name="autor">
      <input type="hidden" class="form-control" id="idPlato" value="${requestScope.p.id}" name="id">
    </div>
      
    <button type="submit" class="btn btn-primary">Enviar</button>
    <a href="Inicio" class="btn btn-info" role="button">Cancelar</a>
    </table>
  </div>
  <div class="container"
    <br/>
    <div class="table-responsive">
    <table class="table">
      <thead>
        <tr>
          <th>Cantidad</th>
          <th>Agua</th>
          <th>Energia</th>
          <th>Proteinas</th>
          <th>Grasas</th>
          <th>Carbohidratos</th>
          <th>Fibra</th>
          <th>Azucar</th>
          <th>Calcio</th>
          <th>Hierro</th>
          <th>Magnesio</th>
          <th>Fosforo</th>
          <th>Potasio</th>
          <th>Sodio</th>
          <th>Vitamina C</th>
          <th>Vitamina B12</th>
          <th>Vitamina A</th>
          <th>Vitamina E</th>
          <th>Vitamina D</th>
          <th>Grasas Saturadas</th>
          <th>Grasas Monoinsaturadas</th>
          <th>Grasas Polyinsaturadas</th>
          <th>Colesterol</th>
        </tr>
      </thead>
      <tbody>
      	<c:forEach items="${requestScope.listado}" var="c" >
            <tr>
                <td colspan="23">${c.getDescripcion()}</td>
            </tr>
      		<tr>
                    <td style="white-space: nowrap;">${c.getCantidad()}</td>
                    <td>${c.getAgua()*(c.getCantidad()/100)}</td>
                    <td>${c.getEnergia()*(c.getCantidad()/100)}</td>
                    <td>${c.getProteinas()*(c.getCantidad()/100)}</td>
                    <td>${c.getGrasas()*(c.getCantidad()/100)}</td>
                    <td>${c.getCarbohidratos()*(c.getCantidad()/100)}</td>
                    <td>${c.getFibra()*(c.getCantidad()/100)}</td>
                    <td>${c.getAzucar()*(c.getCantidad()/100)}</td>
                    <td>${c.getCalcio()*(c.getCantidad()/100)}</td>
                    <td>${c.getHierro()*(c.getCantidad()/100)}</td>
                    <td>${c.getMagnesio()*(c.getCantidad()/100)}</td>
                    <td>${c.getFosforo()*(c.getCantidad()/100)}</td>
                    <td>${c.getPotasio()*(c.getCantidad()/100)}</td>
                    <td>${c.getSodio()*(c.getCantidad()/100)}</td>
                    <td>${c.getVitaminaC()*(c.getCantidad()/100)}</td>
                    <td>${c.getVitaminaB12()*(c.getCantidad()/100)}</td>
                    <td>${c.getVitaminaA()*(c.getCantidad()/100)}</td>
                    <td>${c.getVitaminaE()*(c.getCantidad()/100)}</td>
                    <td>${c.getVitaminaD()*(c.getCantidad()/100)}</td>
                    <td>${c.getGrasasSaturadas()*(c.getCantidad()/100)}</td>
                    <td>${c.getGrasasMono()*(c.getCantidad()/100)}</td>
                    <td>${c.getGrasasPoli()*(c.getCantidad()/100)}</td>
                    <td>${c.getColesterol()*(c.getCantidad()/100)}</td>
        	</tr>
         </c:forEach>
      </tbody>
    </table>
  </div>
  </form>
</div>
<a href="AgregarIngrediente">Agregar ingrediente</a>
<a href="Inicio">Volver al inicio</a>
<jsp:include page="plantilla/pie.jsp" />
