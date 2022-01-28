package ejercicio4.Fotografia;

import java.util.List;

abstract class Fotografia {
    private String name;
    private List<Fotografia> lista;

    public Fotografia(String name, List<Fotografia> lista) {
        this.name = name;
        this.lista = lista;
    }


    public String getName() {
        return name;
    }
}
