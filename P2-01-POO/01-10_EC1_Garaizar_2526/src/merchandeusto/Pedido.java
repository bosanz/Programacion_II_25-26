package merchandeusto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
	
	private static int contadorId = 1;
	
	private int codigo;
	protected Cliente cliente;
	protected LocalDate fecha;
	protected ArrayList<Producto> productos;
	
	public Pedido(Cliente cliente, LocalDate fecha, ArrayList<Producto> productos) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
		this.productos = new ArrayList<Producto>(productos);
		this.codigo = contadorId++;
	}
	
	public Pedido() {
		super();
		this.cliente = null;
		this.fecha = LocalDate.now();
		this.productos = new ArrayList<Producto>();
		this.codigo = contadorId++;
	}
	
	public Pedido(Pedido p) {
		super();
		this.cliente = p.cliente;
		this.fecha = p.fecha;
		this.productos = new ArrayList<Producto>(p.productos);
		this.codigo = contadorId++;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", fecha=" + fecha + ", productos=" + productos + "]";
	}

	public int getCodigo() {
		return codigo;
	}
	
	public double totalPedido() {
		double total = 0.0;
		
		for(Producto p: this.productos) {
			total += p.getPrecio();
		}
		
		if(this.cliente.isAlumni())
			return total *0.8;
		else
			return total;
	}
	
}
