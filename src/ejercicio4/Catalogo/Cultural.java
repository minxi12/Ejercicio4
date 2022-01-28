package ejercicio4.Catalogo;

public class Cultural implements Catalogo {
    private String type;

    public Cultural(String name) {
        this.type = name;
    }
    
    
    public String getName() {
        return this.type;
    }
    
}
