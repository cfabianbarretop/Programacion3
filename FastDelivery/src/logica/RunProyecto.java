package logica;

import vistas.Guardar;
import vistas.Informacion;
import vistas.Inicio;
import vistas.Recorrido;
import vistas.Registro;

public class RunProyecto {

    public static void main(String[] args) {
        
        Inicio inicio = new Inicio();
        Registro registro = new Registro(inicio);
        Recorrido recorrido = new Recorrido(inicio);
        inicio.correPantalla(registro, recorrido);
        Guardar guardar = new Guardar(registro);
        Informacion informacion = new Informacion(registro);
        inicio.setVisible(true);
    }
}
