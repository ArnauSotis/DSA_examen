import java.util.function.Supplier;

public class Producto {

    private String nombre;
    private double precio;
    private int numeroVentas;

    public Producto(){}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas =+ numeroVentas;
    }
    public void setIncrementarVentas(){
        this.numeroVentas++;
    }


}

