package Modelo;

import java.util.Date;

public class Nomina {
    
    //Atributos
    private int id;
    private Empleado empleado;
    private Date fechaPago;
    private Double monto;

    // Constructor
    public Nomina(int id, Empleado empleado, Date fechaPago, Double monto) {
        this.id = id;
        this.empleado = empleado;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    
}

    

