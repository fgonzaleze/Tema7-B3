package ejercicio03;

public class Main {

	public static void main(String[] args) {
		
				// Objeto articulo 
				Articulo articulo = new Articulo ("Monster", 1.80, 7, "Alimentacion");
				
				double precio = articulo.getPVP();
				double precioDescuento = articulo.getPVPDescuento(0.50);
				
				
				System.out.println(articulo);
				
				System.out.println("Este es el precio de un artículo: "+precio);		
				System.out.println("Este es el precio con descuento: "+precioDescuento);
				
				articulo.vender(5);
				
				System.out.println(articulo);
	}

}
