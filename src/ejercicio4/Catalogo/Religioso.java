package ejercicio4.Catalogo;

public class Religioso implements Catalogo {
    private String type;

    public Religioso(String name) {
        this.type = name;
    }
    
    
    public String getName() {
        return this.type;
    }
    
}
