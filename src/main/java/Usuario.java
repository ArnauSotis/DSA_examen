import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombreUsuario;


    List<Producto> listaProductosUsuario = new ArrayList<Producto>();

    public Usuario(){

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
