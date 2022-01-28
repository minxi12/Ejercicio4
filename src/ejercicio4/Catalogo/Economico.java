package ejercicio4.Catalogo;

public class Economico implements Catalogo {
    private String type;

    public Economico(String name) {
        this.type = name;
    }
    
    
    public String getName() {
        return this.type;
    }
    
}
