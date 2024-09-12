import java.util.*;

// Clase Cliente
class Cliente {
    private String nombre, direccion;
    public Cliente(String nombre, String direccion) { this.nombre = nombre; this.direccion = direccion; }
    public String getNombre() { return nombre; }
    public String toString() { return "Cliente: " + nombre + ", Dirección: " + direccion; }
}

// Clase Pedido
class Pedido {
    private int numPedido;
    private List<String> articulos;
    private Cliente cliente;
    public Pedido(int numPedido, List<String> articulos, Cliente cliente) {
        this.numPedido = numPedido;
        this.articulos = articulos;
        this.cliente = cliente;
    }
    public String toString() { return "Pedido: " + numPedido + ", Artículos: " + articulos + ", Cliente: " + cliente.getNombre(); }
}

// Clase Pago
class Pago {
    private int numPedido;
    private String metodoPago;
    private double total;
    public Pago(int numPedido, String metodoPago, double total) {
        this.numPedido = numPedido;
        this.metodoPago = metodoPago;
        this.total = total;
    }
    public String toString() { return "Pago del pedido " + numPedido + ": Método de pago: " + metodoPago + ", Total: " + total; }
}

// Clase Notificación
class Notificacion {
    private int numPedido;
    private String guia, fechaEntrega, correo;
    public Notificacion(int numPedido, String guia, String fechaEntrega, String correo) {
        this.numPedido = numPedido;
        this.guia = guia;
        this.fechaEntrega = fechaEntrega;
        this.correo = correo;
    }
    public String toString() { return "Notificación: Pedido " + numPedido + ", Guía: " + guia + ", Fecha de entrega: " + fechaEntrega + ", Correo: " + correo; }
}

public class Comercio {
    public static void main(String[] args) {
        List<Cliente> clientes = Arrays.asList(
            new Cliente("Jammal Rodriguez", "Blvd. Ameyal"),
            new Cliente("Jonathan Sajor","secc. 7"),
            new Cliente("Sergio Soto","Pontevedra"),
            new Cliente("Kevin Vlencia","Agustin de Iturbide"),
            new Cliente("Estefania Silva","Orquideas")
        );
        List<List<String>> articulosList = Arrays.asList(
            Arrays.asList("Lenovo Ideapad", "SkullCandy"),
            Arrays.asList("Gorra", "Leche"),
            Arrays.asList("Logitech", "samsung"),
            Arrays.asList("Iphone", "Espejo"),
            Arrays.asList("Termo", "Zapatos")
        );
        List<Pedido> pedidos = new ArrayList<>();
        for (int i = 0; i < clientes.size(); i++) {
            pedidos.add(new Pedido(i + 1, articulosList.get(i), clientes.get(i)));
        }

        List<Pago> pagos = Arrays.asList(
            new Pago(1, "Tarjeta de crédito", 25000.00),
            new Pago(1, "Tarjeta de crédito", 250.00),
            new Pago(1, "Tarjeta de crédito", 6000.00),
            new Pago(1, "Tarjeta de crédito", 8000.00),
            new Pago(1, "Tarjeta de crédito", 1000.00)
        );

        List<Notificacion> notificaciones = Arrays.asList(
            new Notificacion(1, "7634827683282", "2024-09-15", "jammalfhz@gmail.com"),
            new Notificacion(1, "9284702938492", "2024-10-16", "Jona@gmail.com"),
            new Notificacion(1, "3847299384293", "2024-09-17", "SergioSC@gmail.com"),
            new Notificacion(1, "7347928343749", "2024-11-18", "KevinVal@gmail.com"),
            new Notificacion(1, "0192472229348", "2024-10-19", "EstefaniaS@gmail.com")
        );

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
            System.out.println(pedidos.get(i));
            System.out.println(pagos.get(i));
            System.out.println(notificaciones.get(i));
            System.out.println("================================================================");
        }
    }
}