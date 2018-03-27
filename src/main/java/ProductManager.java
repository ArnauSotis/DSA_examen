import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface ProductManager {

    public class run{
    public static void main(String[]args) {

        ProductManagerImpl.getInstance().añadirProductos();
        ProductManagerImpl.getInstance().realizarPedido();
        ProductManagerImpl.getInstance().cola();
        ProductManagerImpl.getInstance().listaVentas();


    }

    }
}

