package animales.entidades;
public class Pato {
    
    private int numPatas;
    private String nombre;
    private String parejaPata;
    private String color;

    public Pato(int numPatas, String nombre, String parejaPata) {
        this.numPatas = numPatas;
        this.nombre = nombre;
        this.parejaPata = parejaPata;
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
        return "Pato{" + "numPatas=" + numPatas + ", nombre=" + nombre + ", parejaPata=" + parejaPata + '}';
    }

    public String getParejaPata() {
        return parejaPata;
    }

    public void setParejaPata(String parejaPata) {
        this.parejaPata = parejaPata;
    }

    
    
    
    
}
