package Controlador;

import DAO.EmpleadoDAO;
import Modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GestionEmpleado extends HttpServlet {

    String listar = "Financiero.jsp";
    String add = "Recursos_Humanos.jsp";
    String editar = "Produccion.jsp";
    EmpleadoDAO dao = new EmpleadoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("add")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {
            String nombre = request.getParameter("txtnombre");
            String apellido = request.getParameter("txtapellido");
            String fecha_nacimiento_str = request.getParameter("txtfecha");
            String puesto = request.getParameter("txtpuesto");
            String departamento = request.getParameter("txtdepartamento");

            // Convertir el String de fecha a tipo Date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha_nacimiento = null;
            try {
                fecha_nacimiento = sdf.parse(fecha_nacimiento_str);
            } catch (ParseException e) {
                e.printStackTrace(); // Maneja el error de parseo de fecha aquí
            }

            Empleado emp = new Empleado(0, nombre, apellido, fecha_nacimiento, puesto, departamento);
            
            // Agregar el empleado a la base de datos
            if (dao.add(emp)) {
                // Si la inserción es exitosa, redirige a la página de listar
                acceso = listar;
            } else {
                // Maneja el caso en que la inserción falla
                // Puedes redirigir a una página de error o hacer otra acción apropiada
                // Por ejemplo, podrías establecer acceso = add para volver al formulario de agregar con un mensaje de error
                // acceso = add;
            }

            /* emp.setId(0);
            emp.setNombre(nombre);
            emp.setApellido(apellido);
            emp.setFechaNacimiento(fecha_nacimiento);
            emp.setPuesto(puesto);
            emp.setDepartamento(departamento);
            dao.add(emp);
            
            acceso = listar;*/
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);

        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
