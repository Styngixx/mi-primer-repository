package Objetos;

import java.util.ArrayList;

public class ArregloBoleta extends BoletaVenta {
    private final double CuotaDiaria = 150000;
    private ArrayList<BoletaVenta> listaBoletas;
    
    public ArregloBoleta(){
        listaBoletas = new ArrayList<>();
    }

    // Agregar una boleta a la lista
    public void agregarBoleta(BoletaVenta boleta) {
        listaBoletas.add(boleta);
    }

    // Sumar todos los importes a pagar de las boletas en la lista
    public double sumarImportePagar() {
        double total = 0;
        for (BoletaVenta b : listaBoletas) {
            total += b.ImportePagar();
        }
        return total;
    }
    
    public double PorcentajeDiario(){
        return (sumarImportePagar()/CuotaDiaria)*100;
    }
}
