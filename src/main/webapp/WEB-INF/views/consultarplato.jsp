<jsp:include page="plantilla/cabecera.jsp" />
        <h1>Listado de platos: </h1>
        
        <div>
            <label> </label>
            <select>
                <option value="tortillaPatatas">Tortilla de patatas</option>
                <option value="bocadilloJamon">Bocadillo de jamón</option>
                <option value="lentejas">Lentejas</option>
                <option value="espinacasConGarbanzos">Espinacas con garbanzos</option>
            </select>
            <a href="DetallesPlato">
                <button>Consultar</button>
            </a>
            <!-- boton bootstrap <button type="submit" class="btn btn-primary">Submit</button> -->
            <a href="Inicio" class="btn btn-info" role="button">Cancelar</a>
        </div>
 <jsp:include page="plantilla/pie.jsp" />