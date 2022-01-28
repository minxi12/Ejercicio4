package ejercicio4.evento;

import ejercicio4.*;
import ejercicio4.Catalogo.Catalogo;
import ejercicio4.Fotografia.*;
import java.util.List;

abstract class Sincronicidad {
    protected String localization;
    protected String nombre;
    protected String descripcion;
    protected String fecha;
    protected String periodo;
    protected String fotografias;
    protected List<Catalogo> Catalogo;

    public Sincronicidad(String localization, String nombre, String descripcion, String fecha, String periodo, String fotografias, List<Catalogo> Catalogo) {
        this.localization = localization;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.periodo = periodo;
        this.fotografias = fotografias;
        this.Catalogo = Catalogo;
    }



    public String getLocalization() {
        return localization;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getFotografias() {
        return fotografias;
    }

    public List<Catalogo> getCatalogo() {
        return Catalogo;
    }
    
    
    
}
