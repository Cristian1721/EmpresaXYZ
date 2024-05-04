package DAO;

import Interfaces.CRUD;
import Modelo.Empleado;
import SQL.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmpleadoDAO implements CRUD{
    
    ConexionBDD cn = new ConexionBDD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;    

    @Override
    public List listar() {
        ArrayList<Empleado>list = new ArrayList<>();
        String sql = "select * from empleado";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Empleado emp = new Empleado(rs.getInt("id"), rs.getString("nombre"), 
                        rs.getString("apellido"), rs.getDate("fecha_nacimiento"), rs.getString("puesto"), rs.getString("departamento"));  
                /*emp.setId(rs.getInt("id"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
                emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                emp.setDepartamento(rs.getString("puesto"));
                emp.setDepartamento(rs.getString("departamento"));*/
                list.add(emp);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
                
    }

    @Override
    public Empleado list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Empleado emp) {
        String sql = "insert into empleado (nombre, apellido, fecha_nacimiento, puesto, departamento) values ('"+emp.getNombre()+"','"+emp.getApellido()+"','"+emp.getFechaNacimiento()+"','"+emp.getPuesto()+"','"+emp.getDepartamento()+"')";
        
         try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        // Establece los parámetros en el PreparedStatement
        ps.setString(1, emp.getNombre());
        ps.setString(2, emp.getApellido());
        ps.setDate(3, new java.sql.Date(emp.getFechaNacimiento().getTime())); // Convertir Date a java.sql.Date
        ps.setString(4, emp.getPuesto());
        ps.setString(5, emp.getDepartamento());
        
        ps.executeUpdate();
        return true; 
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return false;

        
        /*try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;*/
    }

    @Override
    public boolean edit(Empleado emp) {
        
        String sql = "UPDATE empleado SET nombre=?, apellido=?, fecha_nacimiento=?, puesto=?, departamento=? WHERE id=?";
    
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        
        ps.setString(1, emp.getNombre());
        ps.setString(2, emp.getApellido());
        ps.setDate(3, new java.sql.Date(emp.getFechaNacimiento().getTime())); // Convertir Date a java.sql.Date
        ps.setString(4, emp.getPuesto());
        ps.setString(5, emp.getDepartamento());
        ps.setInt(6, emp.getId());
        
        int resultado = ps.executeUpdate();
        return resultado > 0; // Devuelve true si se realizó la actualización correctamente
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return false;
        
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM empleado WHERE id=?";
    
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        
        ps.setInt(1, id); // Para identificar el empleado que se va a eliminar
        
        int resultado = ps.executeUpdate();
        return resultado > 0; // Devuelve true si se eliminó el empleado correctamente
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return false;
    }
}
