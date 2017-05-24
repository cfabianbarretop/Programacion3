package datos;

import java.util.ArrayList;

public class Cliente {

    private static ArrayList<String> nombre = new ArrayList<String>();
    private static ArrayList<String> ubicacion = new ArrayList<String>();
    
    public Cliente() {
        ubicacion.add("Ecuador Cuenca Universidad de cuenca");
        nombre.add("Oficina");
    }
    
    public static ArrayList<String> getNombre() {
        return nombre;
    }

    public static ArrayList<String> getUbicacion() {
        return ubicacion;
    }

    public static void ingresarRegistro(String nombreCliente, String ubicacionCliente){
        nombre.add(nombreCliente);
        ubicacion.add(ubicacionCliente);
    }
}
