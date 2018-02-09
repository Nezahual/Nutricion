<jsp:include page="plantilla/cabecera.jsp" />
        <h1>Detalles del plato</h1>
        <label class="titulo">Nombre: </label><label>nombre del plato.</label>
        <br>
        <label class="titulo">Descricion </label><label>descripcion del plato.</label>
        <br>
        <label class="titulo">Valor nutricional total: </label><label>valor nutricional total</label>
        <div>
            <table>
                <thead>
                    <tr>
                        <td class="titulo">Ingrediente</td>
                        <td class="titulo">valor1</td>
                        <td class="titulo">valor2</td>
                        <td class="titulo">valor3</td>
                        <td class="titulo">valor4</td>
                        <td class="titulo">valor5</td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><a href="DetalleAlimento">ingrediente1</a></td>
                        <td>5</td>
                        <td>65</td>
                        <td>65</td>
                        <td>23</td>
                        <td>4</td>
                    </tr>
                    <tr>
                        <td><a href="DetalleAlimento">ingrediente2</a></td>
                        <td>87</td>
                        <td>1</td>
                        <td>34</td>
                        <td>7</td>
                        <td>87</td>
                    </tr>
                    <tr>
                        <td><a href="DetalleAlimento">ingrediente3</a></td>
                        <td>3</td>
                        <td>44</td>
                        <td>32</td>
                        <td>23</td>
                        <td>5</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <a href="Inicio">Volver al inicio</a>
<jsp:include page="plantilla/pie.jsp" />