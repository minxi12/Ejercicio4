package ejercicio4.Catalogo;

public class Guerras implements Catalogo {
    private String type;

    public Guerras(String name) {
        this.type = name;
    }
    
    
    public String getName() {
        return this.type;
    }
    
}
