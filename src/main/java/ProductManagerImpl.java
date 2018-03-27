import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductManagerImpl {

    private static final ProductManagerImpl pm = new ProductManagerImpl();

    private ProductManagerImpl() {
    }

    public static ProductManagerImpl getInstance() {
        return pm;
    }



    private List<Producto> listaProductosRealizados = new ArrayList <Producto> ();

    private ArrayList<Producto> listaProductos = new ArrayList <Producto> ();

    private Queue<Usuario> cola = new LinkedList();

    private  Usuario usuario = new Usuario();

    private List<Producto> listaProductosVendidos = new ArrayList<Producto>();

    Logger logger = Logger.getLogger("myLogger");

    public void añadirProductos() {

        //Hago una lista, añado cosas y la ordeno

        Producto productos1 = new Producto();
        productos1.setNombre("Patata");
        productos1.setPrecio(1);
        listaProductos.add(productos1);

        Producto productos2 = new Producto();
        productos2.setNombre("Huevo");
        productos2.setPrecio(3);
        listaProductos.add(productos2);

        Producto productos3 = new Producto();
        productos3.setNombre("Carne");
        productos3.setPrecio(10);
        listaProductos.add(productos3);

        Collections.sort(listaProductos, Comparator.comparing(Producto::getPrecio));

         logger.log(Level.SEVERE, "Lista de productos:");
        for(Producto producto : listaProductos) {
            logger.log(Level.SEVERE, producto.getNombre());
        }

    }
    public void realizarPedido(){

        //Realizo un pedido por parte de un usuario identificado
        Scanner sc = new Scanner(System.in);
        logger.log(Level.SEVERE, "Identifíquese como usuario");
        logger.log(Level.SEVERE, "Nombre:");
        String nombreUsuario = sc.nextLine();
        logger.log(Level.SEVERE, "Producto 1:");
        String nombreProducto1 = sc.nextLine();
        logger.log(Level.SEVERE, "Añadido a la lista "+nombreProducto1);
        logger.log(Level.SEVERE, "Producto 2:");
        String nombreProducto2 = sc.nextLine();
        logger.log(Level.SEVERE, "Añadido a la lista "+nombreProducto2);
        logger.log(Level.SEVERE, "Producto 3:");
        String nombreProducto3 = sc.nextLine();
        logger.log(Level.SEVERE, "Añadido a la lista "+nombreProducto3);
        logger.log(Level.SEVERE, "Producto 4:");
        String nombreProducto4 = sc.nextLine();
        logger.log(Level.SEVERE, "Añadido a la lista "+nombreProducto3);
        logger.log(Level.SEVERE, "Producto 5:");
        String nombreProducto5 = sc.nextLine();
        logger.log(Level.SEVERE, "Añadido a la lista "+nombreProducto3);

        usuario.setNombreUsuario(nombreUsuario);

        for (Producto producto : listaProductos){
            if (producto.getNombre().equals(nombreProducto1)){
                usuario.listaProductosUsuario.add(producto);
                listaProductosRealizados.add(producto);
                producto.setIncrementarVentas();
                logger.log(Level.SEVERE, "Se ha añadido a " + usuario.listaProductosUsuario.getClass().getName() +" el producto " + producto.getNombre());
            }
            if (producto.getNombre().equals(nombreProducto2)) {
                usuario.listaProductosUsuario.add(producto);
                listaProductosRealizados.add(producto);
                producto.setIncrementarVentas();
                logger.log(Level.SEVERE, "Se ha añadido a " + usuario.listaProductosUsuario.getClass().getName() +" el producto " + producto.getNombre());

            }
            if (producto.getNombre().equals(nombreProducto3)) {
                usuario.listaProductosUsuario.add(producto);
                listaProductosRealizados.add(producto);
                producto.setIncrementarVentas();
                logger.log(Level.SEVERE, "Se ha añadido a " + usuario.listaProductosUsuario.getClass().getName() +" el producto " + producto.getNombre());
            }
            if (producto.getNombre().equals(nombreProducto4)){
                usuario.listaProductosUsuario.add(producto);
                listaProductosRealizados.add(producto);
                producto.setIncrementarVentas();
                logger.log(Level.SEVERE, "Se ha añadido a " + usuario.listaProductosUsuario.getClass().getName() +" el producto " + producto.getNombre());
            }
            if (producto.getNombre().equals(nombreProducto5)){
                usuario.listaProductosUsuario.add(producto);
                listaProductosRealizados.add(producto);
                producto.setIncrementarVentas();
                logger.log(Level.SEVERE, "Se ha añadido a " + usuario.listaProductosUsuario.getClass().getName() +" el producto " + producto.getNombre());
                }

        }
    }
    public void cola(){
            //Sirvo los productos en orden de llegadas => FIFO, COLA.
            //Solo hay un usuario, en caso de haber varios, se añadiria cada usuario a la cola después de pedir productos.
            //No existe una clase pedido puesto que no es necesario, la cola de pedidos son los usuarios de la cola

            cola.add(usuario);
        }
    public void listaVentas() {
        //Lista de productos ordenados por número de ventas
        logger.log(Level.SEVERE,"El número de items vendidos es:");

        for (Producto producto : listaProductos){
            logger.log(Level.SEVERE,producto.getNombre()+": " + producto.getNumeroVentas());
        }


        listaProductosVendidos = (List) listaProductos.clone();
        Collections.sort(listaProductosVendidos, Comparator.comparing(Producto::getNumeroVentas));
        Collections.reverse(listaProductosVendidos);

        logger.log(Level.SEVERE,"La lista de vendidos descendiente es:");
        for (Producto producto : listaProductosVendidos){
            logger.log(Level.SEVERE,producto.getNombre() + " vendido: " + producto.getNumeroVentas() + " veces");
        }

    }

}

