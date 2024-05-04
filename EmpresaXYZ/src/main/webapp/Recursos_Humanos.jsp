<%-- 
    Document   : listaEmpleados
    Created on : 2 may. 2024, 19:22:47
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="estilos/estilos.css" rel="stylesheet" type="text/css"/>
        <title>EMPLEADOS</title>        
    </head>
    <body>  

        <nav class="navbar navbar-dark bg-dark">
            <a style="color: white"class="navbar-toggler"><span class="navbar-toggler-icon"></span> INICIO</a>


            <div class="dropdown">
                <a style="color: white"href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar Session</a>
                <div class="dropdown-menu text-center">
                    <a><img src="img/User3.png" height="80" width="80"></a><br>
                    <a>User</a>

                    <div class="dropdown-divder"></div>
                    <a href="index.jsp" class="dropdown-item">SALIR</a>

                </div>
            </div>
        </nav>

        <div class="container mt-4">

        </div>
        <h1>Formulario de Ingreso de Empleado</h1>
        <div class="formulario-container">
            <form action="GestionEmpleado" method="post">
                
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="txtnombre" required><br><br>

                <label for="apellido">Apellido:</label>
                <input type="text" id="apellido" name="txtapellido" required><br><br>

                <label for="fechaNacimiento">Fecha Nacimiento:</label>
                <input type="date" id="fecha" name="txtfecha" required><br><br>

                <label for="puesto">Puesto:</label>
                <input type="text" id="puesto" name="txtpuesto" required><br><br>

                <label for="departamento">Departamento:</label>
                <input type="text" id="departamento" name="txtdepartamento" required><br><br>


                <input type="submit" name="accion" value="Agregar">
            </form>
        </div>       

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
