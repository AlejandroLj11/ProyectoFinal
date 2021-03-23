<%-- 
    Document   : formCliente
    Created on : 03-mar-2021, 18:08:01
    Author     : Santiago Mendez
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid" style="width: 30%; margin:auto">
            <div class="row">
                <div class="col-sm-offset-4">
                    <div class="row">
                        <h3>Datos personales</h3>
                    </div>
                    <form role="form" name="persona" action="mostrarCliente.htm" method="POST">
                        <div class="form-group">
                            <label for="nombre">Ingrese su identiicaicon:</label>
                            <input type="text" class="form-control" name="Id" id="nom_cli" 
                            placeholder="Id">
                        </div>
                        <div class="form-group">
                            <label for="nombre">Ingrese su nombre:</label>
                            <input type="text" class="form-control" name="Nombre" id="nom_cli" 
                            placeholder="Nombre">
                        </div>
                        <div class="form-group">
                            <label for="telefono">Ingrese su Apellido:</label>
                            <input type="text" class="form-control" name="telefono" id="tel_cli" 
                            placeholder="Telefono">
                        </div>
                        <div class="form-group">
                            <label for="direccion">Ingrese su Telefono:</label>
                            <input type="text" class="form-control" name="direccion" id="dir_Cli" 
                            placeholder="Telefono">
                        </div>
                        
                        <input type="submit" class="btn btn-info" value="Enviar">
                        <a href="index.htm"><input type="button" class="btn btn-info" value="Regresar"></a>
                        
                </div>
                        </form>
            </div>
            </div>
        </div>
    </body>
</html>

