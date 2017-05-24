package logica;

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import maps.*;

public class Ruta {

    public static Image dibujarRuta() throws UnsupportedEncodingException, IOException {
        String marcador = "";
        int etiqueta = 1;
        Distancia distancia = new Distancia();
        ArrayList ubicacion = new ArrayList<String>();
        ubicacion=distancia.rutaOptima();
        for (int i = 0; i < ubicacion.size(); i++) {
            if (i == 0) {
                marcador += "&markers=color:green|label:" + etiqueta + "|" + URLEncoder.encode("" + ubicacion.get(i), "utf-8");
            } else if (i == ubicacion.size() - 1) {
                marcador += "&markers=color:red|label:" + etiqueta + "|" + URLEncoder.encode("" + ubicacion.get(i), "utf-8");
            } else {
                marcador += "&markers=color:orange|label:" + etiqueta + "|" + URLEncoder.encode("" + ubicacion.get(i), "utf-8");
            }
            etiqueta++;
        }
        
        String[] puntosVisita;
        Route rutas = new Route();
        String[][] camino;
        Route.mode modoRuta = Route.mode.driving;
        puntosVisita = new String[2];
        try {
            camino = rutas.getRoute("" + ubicacion.get(0), "" + ubicacion.get(ubicacion.size() - 1), ubicacion, true, modoRuta, Route.avoids.nothing);
            String resultado = rutas.getGeneralPolyline();
            StaticMaps map = new StaticMaps();
            return map.getStaticMapRoute(new Dimension(950, 950), 1, marcador, StaticMaps.Format.png, StaticMaps.Maptype.roadmap, resultado);
        } catch (Exception e) {
            System.err.println("Revise la conexion a internet");
            return null;
        }

    }
}
