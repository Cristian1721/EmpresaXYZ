package Modelo;

public class Venta_CampaniaMarketing {

    //Atributos
    private Venta venta;
    private CampaniaMarketing campaniaMarketing;

    //Constructor
    public Venta_CampaniaMarketing(Venta venta, CampaniaMarketing campaniaMarketing) {
        this.venta = venta;
        this.campaniaMarketing = campaniaMarketing;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public CampaniaMarketing getCampaniaMarketing() {
        return campaniaMarketing;
    }

    public void setCampaniaMarketing(CampaniaMarketing campaniaMarketing) {
        this.campaniaMarketing = campaniaMarketing;
    }
    
    

}
