package clases;

/**
 *
 * @author FRANCIS
 */
public class descuento {
    private static double primerDescuento = 0.075;
    private static double segundoDescuento =0.10;
    private static double tercerDescuento =0.125;
    
    //Falta agregar una wea pal descuento xddd
    //private static double cuartoDescuento =0.150;

    public static void setPrimerDescuento(double primerDescuento) {
        descuento.primerDescuento = primerDescuento;
    }

    public static void setSegundoDescuento(double segundoDescuento) {
        descuento.segundoDescuento = segundoDescuento;
    }

    public static void setTercerDescuento(double tercerDescuento) {
        descuento.tercerDescuento = tercerDescuento;
    }

    public static void setTodoDescuento (double desc1, double desc2, double desc3){
        primerDescuento = desc1;
        segundoDescuento = desc2;
        tercerDescuento = desc3;
    }
    
    
    public static double getPrimerDescuento() {
        return primerDescuento;
    }

    public static double getSegundoDescuento() {
        return segundoDescuento;
    }

    public static double getTercerDescuento() {
        return tercerDescuento;
    }

    //metodo para dar el descuento adecuado
    public static double getDescuentoPorCantidad (int cantidad){
        if(cantidad >= 1 && cantidad <= 5){
            return primerDescuento;
        }else if(cantidad >= 6 && cantidad<= 10){
            return segundoDescuento;
        }else if(cantidad >= 11 && cantidad <=15){
            return tercerDescuento;
        }else{
            return 0;
        }
    }
}
