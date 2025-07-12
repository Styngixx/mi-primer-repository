package clases;

import java.util.ArrayList;

/**
 *
 * @author FRANCIS
 */
public class ArregloBoleta extends Boleta {
    private final double CuotaDiaria = 150000;
    private ArrayList<Boleta> listaBoletas;
    
    public ArregloBoleta(){
        listaBoletas = new ArrayList<>();
    }

    // Agregar una boleta a la lista
    public void agregarBoleta(Boleta boleta) {
        listaBoletas.add(boleta);
    }

    // Sumar todos los importes a pagar de las boletas en la lista
    public double sumarImportePagar() {
        double total = 0;
        for (Boleta b : listaBoletas) {
            total += b.ImportePagar();
        }
        return total;
    }
    
    public double PorcentajeDiario(){
        return (sumarImportePagar()/CuotaDiaria)*100;
    }

}