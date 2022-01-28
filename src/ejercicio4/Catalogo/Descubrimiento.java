package ejercicio4.Catalogo;

public class Descubrimiento implements Catalogo {
    private String type;

    public Descubrimiento(String name) {
        this.type = name;
    }
    
    
    public String getName() {
        return this.type;
    }
    
}
