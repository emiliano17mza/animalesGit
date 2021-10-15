package animales.entidades;
public class Pato {
    
    private int numPatas;
    private String nombre;

    public Pato(int numPatas, String nombre) {
        this.numPatas = numPatas;
        this.nombre = nombre;
    }

    public Pato() {
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pato{" + "numPatas=" + numPatas + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
