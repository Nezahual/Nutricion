<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
              rel="stylesheet" 
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
              crossorigin="anonymous">
        <link href="resources/styles/menu.css" rel="stylesheet" type="text/css">
        <link href="resources/styles/pie.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${requestScope.titulo}</title>
    </head>
    <body>
        <div class="container">
            <div class="row" id="menuContainer" style="height: 12vh; border: 1px solid black;">
                <jsp:include page="menu.jsp" />
            </div>
            <!--Inicio Contenido Pagina-->
            <div class="row"style="height: 80vh; border: 1px solid black;">
                <div class="col align-self-center">