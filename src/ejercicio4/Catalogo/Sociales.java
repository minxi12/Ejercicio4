package ejercicio4.Catalogo;

public class Sociales implements Catalogo {
    private String type;

    public Sociales(String name) {
        this.type = name;
    }
    
    
    public String getName() {
        return this.type;
    }
    
}
