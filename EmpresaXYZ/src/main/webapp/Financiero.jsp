<%-- 
    Document   : agregarEmpleado
    Created on : 2 may. 2024, 21:05:22
    Author     : ASUS
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Empleado"%>
<%@page import="DAO.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
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

        <div>
            <h1>Empleado</h1>
            <table border = "1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>APELLIDO</th>
                        <th>FECHA NACIMIENTO</th>
                        <th>PUESTO</th>
                        <th>DEPARTAMENTO</th>
                    </tr>
                </thead>

                <%
                    EmpleadoDAO dao = new EmpleadoDAO();
                    List<Empleado> list = dao.listar();
                    Iterator<Empleado> iter = list.iterator();
                    Empleado emp = null;
                    while (iter.hasNext()) {
                        emp = iter.next();
                %>

                <tbody>
                    <tr>
                        <td><%= emp.getId() %></td>
                        <td><%= emp.getNombre() %></td>
                        <td><%= emp.getApellido() %></td>
                        <td><%= emp.getFechaNacimiento() %></td>
                        <td><%= emp.getPuesto() %></td>
                        <td><%= emp.getDepartamento() %></td>
                        
                    </tr>
                </tbody>
                <%}%>
            </table>
        </div>
            
            <a href="GestionEmpleado?accion=add">Agregar Empleado</a>


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
