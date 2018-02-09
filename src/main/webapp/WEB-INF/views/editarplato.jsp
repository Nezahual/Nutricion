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
          <th>Nombre</th>
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
      	<c:forEach items="${requestScope.ingredientes}" var="c" >
      		<tr>
          		<td>${c.descripcion}</td>
          		<td>${c.agua}</td>
          		<td>${c.energia}</td>
          		<td>${c.proteinas}</td>
          		<td>${c.grasas}</td>
          		<td>${c.carbohidratos}</td>
          		<td>${c.fibra}</td>
          		<td>${c.azucar}</td>
          		<td>${c.calcio}</td>
          		<td>${c.hierro}</td>
          		<td>${c.magnesio}</td>
          		<td>${c.fosforo}</td>
          		<td>${c.potasio}</td>
          		<td>${c.sodio}</td>
          		<td>${c.vitaminaC}</td>
          		<td>${c.vitaminaB12}</td>
          		<td>${c.vitaminaA}</td>
          		<td>${c.vitaminaE}</td>
         		<td>${c.vitaminaD}</td>
          		<td>${c.grasasSaturadas}</td>
          		<td>${c.grasasMono}</td>
          		<td>${c.grasasPoli}</td>
          		<td>${c.colesterol}</td>
        	</tr>
         </c:forEach>
      </tbody>
    </table>
  </div>
  </form>
</div>
<a href="AgregarIngrediente">Añadir ingrediente</a>
<a href="Inicio">Volver al inicio</a>
<jsp:include page="plantilla/pie.jsp" />
