package clases;

/**
 *
 * @author FRANCIS
 */
public class obsequiosDatos {
    private static String obsequio1 = "Mochila";
    private static String obsequio2 = "Parlantes duo";
    private static String obsequio3 = "Cooler";
    
    public static void setObsequio1(String obsequio){
        obsequio1 = obsequio;
    }
    
    public static void setObsequio2(String obsequio){
        obsequio2 = obsequio;
    }
    
    public static void setObsequio3(String obsequio){
        obsequio3 = obsequio;
    }
    
    public static void setTodosObsequios(String obs1, String obs2, String obs3){
        obsequio1 = obs1;
        obsequio2 =  obs2;
        obsequio3 = obs3;
    }

    public static String getObsequio1() {
        return obsequio1;
    }

    public static String getObsequio2() {
        return obsequio2;
    }

    public static String getObsequio3() {
        return obsequio3;
    }
    
    // metodo principal pa obtener obsequio segun cantidad comprada
    public static String getObsequioPorCantidad (int cantidad){
        if(cantidad == 1){
            return obsequio1;
        } else if (cantidad >= 2 && cantidad <= 5){
            return obsequio2;
        } else if(cantidad > 5){
            return obsequio3;
        } else{
            return "-------";
        }  
    }
    
     // verificar si hay obsequios configurados
    public static boolean osequiosConfigurados(){
        return !obsequio1.trim().isEmpty() && 
                   !obsequio2.trim().isEmpty() &&
                   !obsequio3.trim().isEmpty();
    }
    
}
