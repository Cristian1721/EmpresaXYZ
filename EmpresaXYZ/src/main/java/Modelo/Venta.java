package Modelo;

import java.util.Date;

public class Venta {
    
    //Atributos
    private int id;
    private Producto producto;
    private Date fechaVenta;
    private int cantidadVendida;
    private Double precioVenta;

    //Constructor
    public Venta(int id, Producto producto, Date fechaVenta, int cantidadVendida, Double precioVenta) {
        this.id = id;
        this.producto = producto;
        this.fechaVenta = fechaVenta;
        this.cantidadVendida = cantidadVendida;
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
    
    
    
}
