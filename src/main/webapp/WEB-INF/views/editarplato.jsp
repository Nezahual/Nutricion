<%-- 
    Document   : editarplato
    Created on : 08-feb-2018, 12:49:19
    Author     : The HBoy
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="plantilla/cabecera.jsp" />
<div style="min-height: 80vh">
<div class="container" style="width:50%; margin-top: 20px; margin-bottom: 20px;">
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
                <input type="hidden" class="form-control" id="autc" value="${requestScope.p.autor}" name="autor">
                <input type="hidden" class="form-control" id="idPlato" value="${requestScope.p.id}" name="idPlato">
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
            <c:set var = "agua" scope = "request" value = "0"/>
            <c:set var = "energia" scope = "request" value = "0"/>
            <c:set var = "proteina" scope = "request" value = "0"/>
            <c:set var = "grasas" scope = "request" value = "0"/>
            <c:set var = "carbohidratos" scope = "request" value = "0"/>
            <c:set var = "fibra" scope = "request" value = "0"/>
            <c:set var = "azucar" scope = "request" value = "0"/>
            <c:set var = "calcio" scope = "request" value = "0"/>
            <c:set var = "hierro" scope = "request" value = "0"/>
            <c:set var = "magnesio" scope = "request" value = "0"/>
            <c:set var = "fosforo" scope = "request" value = "0"/>
            <c:set var = "potasio" scope = "request" value = "0"/>
            <c:set var = "sodio" scope = "request" value = "0"/>
            <c:set var = "vitaminac" scope = "request" value = "0"/>
            <c:set var = "vitaminab12" scope = "request" value = "0"/>
            <c:set var = "vitaminaa" scope = "request" value = "0"/>
            <c:set var = "vitaminae" scope = "request" value = "0"/>
            <c:set var = "vitaminad" scope = "request" value = "0"/>
            <c:set var = "grasassat" scope = "request" value = "0"/>
            <c:set var = "grasasmono" scope = "request" value = "0"/>
            <c:set var = "grasaspoli" scope = "request" value = "0"/>
            <c:set var = "colesterol" scope = "request" value = "0"/>

            <tbody>
                <c:forEach items="${requestScope.listado}" var="c" >
                    <c:set var = "agua" scope = "request" value = "${agua=agua+(c.getAgua()*(c.getCantidad()/100))}"/>
                    <c:set var = "energia" scope = "request" value = "${energia=energia+(c.getEnergia()*(c.getCantidad()/100))}"/>
                    <c:set var = "proteina" scope = "request" value = "${proteina=proteina+(c.getProteinas()*(c.getCantidad()/100))}"/>
                    <c:set var = "grasas" scope = "request" value = "${grasas=grasas+(c.getGrasas()*(c.getCantidad()/100))}"/>
                    <c:set var = "carbohidratos" scope = "request" value = "${carbohidratos=carbohidratos+(c.getCarbohidratos()*(c.getCantidad()/100))}"/>
                    <c:set var = "fibra" scope = "request" value = "${fibra=fibra+(c.getFibra()*(c.getCantidad()/100))}"/>
                    <c:set var = "azucar" scope = "request" value = "${azucar=azucar+(c.getAzucar()*(c.getCantidad()/100))}"/>
                    <c:set var = "calcio" scope = "request" value = "${calcio=calcio+(c.getCalcio()*(c.getCantidad()/100))}"/>
                    <c:set var = "hierro" scope = "request" value = "${hierro=hierro+(c.getHierro()*(c.getCantidad()/100))}"/>
                    <c:set var = "magnesio" scope = "request" value = "${magnesio=magnesio+(c.getMagnesio()*(c.getCantidad()/100))}"/>
                    <c:set var = "fosforo" scope = "request" value = "${fosforo=fosforo+(c.getFosforo()*(c.getCantidad()/100))}"/>
                    <c:set var = "potasio" scope = "request" value = "${potasio=potasio+(c.getPotasio()*(c.getCantidad()/100))}"/>
                    <c:set var = "sodio" scope = "request" value = "${sodio=sodio+(c.getSodio()*(c.getCantidad()/100))}"/>
                    <c:set var = "vitaminac" scope = "request" value = "${vitaminac=vitaminac+(c.getVitaminaC()*(c.getCantidad()/100))}"/>
                    <c:set var = "vitaminab12" scope = "request" value = "${vitaminab12=vitaminab12+(c.getVitaminaB12()*(c.getCantidad()/100))}"/>
                    <c:set var = "vitaminaa" scope = "request" value = "${vitaminaa=vitaminaa+(c.getVitaminaA()*(c.getCantidad()/100))}"/>
                    <c:set var = "vitaminae" scope = "request" value = "${vitaminae=vitaminae+(c.getVitaminaE()*(c.getCantidad()/100))}"/>
                    <c:set var = "vitaminad" scope = "request" value = "${vitaminad=vitaminad+(c.getVitaminaD()*(c.getCantidad()/100))}"/>
                    <c:set var = "grasassat" scope = "request" value = "${grasassat=grasassat+(c.getGrasasSaturadas()*(c.getCantidad()/100))}"/>
                    <c:set var = "grasasmono" scope = "request" value = "${grasasmono=grasasmono+(c.getGrasasMono()*(c.getCantidad()/100))}"/>
                    <c:set var = "grasaspoli" scope = "request" value = "${grasaspoli=grasaspoli+(c.getGrasasPoli()*(c.getCantidad()/100))}"/>
                    <c:set var = "colesterol" scope = "request" value = "${colesterol=colesterol+(c.getColesterol()*(c.getCantidad()/100))}"/>
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
                <tr>
                    <td colspan="23"><b>Aporte total</b></td>
                </tr>
                <tr>
                    <td>N/A</td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${agua}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${energia}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${proteina}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${grasas}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${carbohidratos}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${fibra}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${azucar}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${calcio}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${hierro}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${magnesio}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${fosforo}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${potasio}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${sodio}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${vitaminac}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${vitaminab12}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${vitaminaa}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${vitaminae}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${vitaminad}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${grasassat}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${grasasmono}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${grasaspoli}"/></p></td>
                    <td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = "${colesterol}"/></p></td>
                    
                </tr>
            </tbody>
        </table>
    </div>
</form>
</div>
<form action="AgregarIngrediente" method="Post" style="margin: 20px">
    <input type="hidden" class="form-control" value="${requestScope.p.id}" name="idPlato">
    <button type="submit" class="btn btn-primary">Agregar nuevo ingrediente</button>
</form>
</div>
<jsp:include page="plantilla/pie.jsp" />
