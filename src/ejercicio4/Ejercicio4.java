package ejercicio4;

import ejercicio4.evento.EventoHistoricoConTrayectoria;
import ejercicio4.evento.Sincronicidad;
import ejercicio4.Catalogo.*;
import ejercicio4.Catalogo.Cultural;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<Catalogo> lista = new ArrayList<>();
        lista.add(new Cultural("cultura"));
        lista.add(new Descubrimiento("descubrimiento"));
        
        String name = "Descubrimiento";
        String local = "Mundo";
        String dscripcion = "buen viaje";
        String fecha = "2021";
        String periodo = "2021-2022";
        String fotografia = "foto1, foto2...";
        String trayectoria = " las Cruzadas Cristianas 1096 a 1291";
        
        
        Sincronicidad eventoTrayectoria = new EventoHistoricoConTrayectoria(local, 
                                        name, dscripcion, fecha, periodo, fotografia, lista, trayectoria);
    }
    
}
