package logica;

import datos.Cliente;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import maps.Route;

public class Distancia {

    private static Route ObjRoute = new Route();

    public ArrayList<String> rutaOptima() throws IOException {
        String inicio, aux = "";
        double distancia;
        ArrayList ubicaciones = new ArrayList<String>();
        ArrayList ubicacion = new ArrayList<String>();
        ArrayList recorrido = new ArrayList<String>();
        ubicaciones=Cliente.getUbicacion();
        for (int i = 0; i < ubicaciones.size(); i++) {
            ubicacion.add(""+ubicaciones.get(i));
        }
        inicio = "" + ubicacion.get(0);
        while (ubicacion.size() != 1) {
            distancia = 10000;
            recorrido.add(inicio);
            for (int i = 0; i < ubicacion.size(); i++) {
                
                if (!inicio.equals(ubicacion.get(i))  && distancia > distancia(inicio, "" + ubicacion.get(i))) {
                    distancia = distancia(inicio, "" + ubicacion.get(i));
                    aux = "" + ubicacion.get(i);
                }
            }
            ubicacion.remove(inicio);
            inicio = aux;
        }
        recorrido.add(ubicacion.get(ubicacion.size() - 1));
        ubicacion.remove(ubicacion.get(ubicacion.size() - 1));
        return recorrido;
    }

    private double distancia(String inicio, String fin) throws MalformedURLException, UnsupportedEncodingException {
        double distanciaTol;
        ArrayList hitos = new ArrayList<String>();
        if (!inicio.isEmpty() && !fin.isEmpty()) {
            String[][] arrayRoute = ObjRoute.getRoute(inicio, fin, hitos, Boolean.TRUE, Route.mode.driving, Route.avoids.nothing);
        }
        ArrayList<Integer> distanciaTotal = ObjRoute.getTotalDistance();
        int distanciaAux = 0;
        for (Integer item : distanciaTotal) {
            distanciaAux += item;
        }
        distanciaTol = (double) (distanciaAux);
        return (distanciaTol / 1000);
    }


}
