package animales.entidades;

/**
 * @author Rodrigo Grellet
 */
public class Pajaro {
    
    private String nombre;
    private String clase;
    private Integer plumas;
    private String color;
    private double peso;
    private Integer velocidad;

    public Pajaro() {
    }

    public Pajaro(String nombre, String clase, Integer plumas, String color, double peso, Integer velocidad) {
        this.nombre = nombre;
        this.clase = clase;
        this.plumas = plumas;
        this.color = color;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Integer getPlumas() {
        return plumas;
    }

    public void setPlumas(Integer plumas) {
        this.plumas = plumas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "nombre=" + nombre + ", clase=" + clase + ", plumas=" + plumas + ", color=" + color + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }
    
    
    
    

}
