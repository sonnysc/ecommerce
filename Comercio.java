import java.util.ArrayList;
import java.util.List;

// Clase Cliente
class Cliente {
    private String nombre;
    private String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Dirección: " + direccion;
    }
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

    public int getNumPedido() {
        return numPedido;
    }

    public List<String> getArticulos() {
        return articulos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Pedido: " + numPedido + ", Artículos: " + articulos + ", Cliente: " + cliente.getNombre();
    }
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

    public int getNumPedido() {
        return numPedido;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pago del pedido " + numPedido + ": Método de pago: " + metodoPago + ", Total: " + total;
    }
}

// Clase Notificación
class Notificacion {
    private int numPedido;
    private String guia;
    private String fechaEntrega;
    private String correo;

    public Notificacion(int numPedido, String guia, String fechaEntrega, String correo) {
        this.numPedido = numPedido;
        this.guia = guia;
        this.fechaEntrega = fechaEntrega;
        this.correo = correo;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public String getGuia() {
        return guia;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Notificación: Pedido " + numPedido + ", Guía: " + guia + ", Fecha de entrega: " + fechaEntrega + ", Correo: " + correo;
    }
}

public class Comercio {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Jammal Rodriguez", "Blvd. Ameyal");

        // Crear un pedido
        List<String> articulos = new ArrayList<>();
        articulos.add("Lenovo");
        articulos.add("Troyan");
        Pedido pedido = new Pedido(1, articulos, cliente);

        // Crear un pago
        Pago pago = new Pago(1, "Tarjeta de crédito", 250.00);

        // Crear una notificación
        Notificacion notificacion = new Notificacion(1, "7634827683282", "2024-09-15", "jammalfhz@gmail.com");

        // Mostrar la información
        System.out.println(cliente);
        System.out.println(pedido);
        System.out.println(pago);
        System.out.println(notificacion);
    }
}
