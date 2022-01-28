package ejercicio4.evento;

import ejercicio4.evento.Sincronicidad;
import ejercicio4.*;
import java.util.List;

public class EventoHistoricoConTrayectoria extends Sincronicidad{
    private String trayectoria;

    public EventoHistoricoConTrayectoria(String trayectoria, String localization, String nombre, String descripcion, String fecha, String periodo, String fotografias, List<ejercicio4.Catalogo.Catalogo> Catalogo) {
        super(localization, nombre, descripcion, fecha, periodo, fotografias, Catalogo);
        this.trayectoria = trayectoria;
    }

   
    
    

}
