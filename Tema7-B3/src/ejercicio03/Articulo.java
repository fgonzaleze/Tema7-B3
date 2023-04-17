package ejercicio03;

public class Articulo {

	private String nombre;

	private double precio;


	public static final double IVA = 0.21;

	private int cantidad;

	private enum Departamento {
		Electronica, Alimentación, Droguería
	};

	private Departamento departamento;

	/**
	 * Constructor de la clase Articulo que no devuelve nada.
	 * 
	 * @param nombre nombre del articulo
	 * @param precio precio del articulo 
	 * @param cant cantidad del articulo
	 */
	public Articulo(String nombre, double precio, int cant, String departamento) {

		if (!nombre.isEmpty() && nombre != null) {

			this.nombre = nombre;

		} else {
			System.out.println("El nombre no es correcto.");
		}
		if (precio > 0) {
			precio = precio;

		} else {
			System.out.println("El precio no puede ser negativo.");
		}
		if (cant >= 0) {
			cantidad = cant;
		} else {
			System.out.println("La cantidad es incorrecta");
		}
		this.departamento = Departamento.valueOf(departamento);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCuantosQuedan() {
		return cantidad;
	}

	public void setCuantosQuedan(int cant) {
		this.cantidad = cant;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * Metodo para pasar a string los atributos
	 * 
	 * @return resultado a modo de string
	 */
	public String toString() {

		String resultado = "";

		resultado += "Nombre: " + nombre + "\n";
		resultado += "Precio: " + precio + "\n";
		resultado += "IVA: " + IVA + "\n";
		resultado += "Cantidad: " + cantidad + "\n";
		resultado += "Departamento: " + departamento + "\n";

		return resultado;

	}

	/**
	 * Metodo para aplicar el IVA
	 * 
	 * @return PVP precio al consumidor
	 */
	public double getPVP() {

		double PVP;
		
		// El pvp es el precio del producto más el precio del producto x 0.21
		PVP = precio + (precio * IVA);

		return PVP;
	}

	/**
	 * Metodo que aplica el PVP
	 * 
	 * @param descuento double con el descuento de pvp
	 * @return precioDescuento devuelve el PVP con el descuento
	 */
	public double getPVPDescuento(double descuento) {

		double precioDescuento;
		double precioPVP = getPVP();
		
		// El precio de descuento sera el precio pvp menos el precio pvp x descuento
		precioDescuento = precioPVP - (precioPVP * descuento);

		return precioDescuento;

	}

	/**
	 * Metodo para vender. Se comprieba si se piede vender, y si se puede, se resta
	 * la cantidad de aticulos que se venden a la cantidad total. 
	 * 
	 * @param cantidadVender hace referencia a la cantidad que se quiere vender
	 * @return venta indica si se ha efectuado la venta.
	 */
	public boolean vender(int cantidadVender) {

		boolean venta = false;

		if (cantidad >= cantidadVender) {

			cantidad -= cantidadVender;
			venta = true;
		}

		return venta;
	}

	/**
	 * Meotdo para modificar la cantidad del producto. Se añade la cantidad
	 * por parametro
	 * 
	 * @param guardar se añade a las cantidades ya existentes.
	 */
	public void almacenar(int guardar) {

		cantidad += guardar;
	}

}
