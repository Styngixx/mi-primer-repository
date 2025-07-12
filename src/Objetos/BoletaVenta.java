
package Objetos;

import Objetos.*;

public class BoletaVenta {
    private String Modelo;
    private double precio;
    private int cantidad;
    private double descuento;
    private String obsequio;

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObsequio() {
        return obsequio;
    }
    public void setObsequio(String obsequio) {
        this.obsequio = obsequio;
    }

    public BoletaVenta() {
    }

    public BoletaVenta(double precio, int cantidad, double descuento) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    
    double ImporteCompra(){
        return cantidad*precio;
    }
    
    double ImporteDescuento(){
        return ImporteCompra()*descuento;
    }
    
    double ImportePagar(){
        return ImporteCompra()-ImporteDescuento();
    }

}
