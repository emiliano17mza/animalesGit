
package animales.entidades;

public class Caballo {
   private String nombre;
   private int anio;
   private String tipo;
   private Double peso;
   private Double altura;
   private boolean hijos;

    public Caballo() {
    }

    public Caballo(String nombre, int anio, String tipo, Double peso, Double altura, boolean hijos) {
        this.nombre = nombre;
        this.anio = anio;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public boolean isHijos() {
        return hijos;
    }

    public void setHijos(boolean hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Caballo" + "nombre=" + nombre + ", anio=" + anio + ", tipo=" + tipo + ", peso=" + peso + ", altura=" + altura + ", hijos=" + hijos + '}';
    }
   
    
   
   
}
