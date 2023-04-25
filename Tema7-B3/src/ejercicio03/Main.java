package ejercicio03;

public class Main {

	public static void main(String[] args) {
		
				// Objeto articulo 
				Articulo articulo = new Articulo ("Monster", 1.80, 7, "Alimentación");
				
				double precio = articulo.getPVP();
				double precioDescuento = articulo.getPVPDescuento(0.50);
				
				
				System.out.println(articulo);
				
				System.out.println("Este es el precio de un artículo: "+precio);		
				System.out.println("Este es el precio con descuento: "+precioDescuento);
				
				articulo.vender(5);
				
				System.out.println(articulo);
				
				Articulo articulo2 = new Articulo ("TV", 180.99, 12, "Electronica");
				
				double precio2 = articulo.getPVP();
				double precioDescuento2 = articulo.getPVPDescuento(0.50);
				
				
				System.out.println(articulo2);
				
				System.out.println("Este es el precio de un artículo: "+precio2);		
				System.out.println("Este es el precio con descuento: "+precioDescuento2);
				
				articulo2.vender(5);
				
				System.out.println(articulo2);
				
				Articulo articulo3 = new Articulo ("Colonia Bustamante", 19.99, 6, "Droguería");
				
				double precio3 = articulo.getPVP();
				double precioDescuento3 = articulo.getPVPDescuento(0.50);
				
				
				System.out.println(articulo2);
				
				System.out.println("Este es el precio de un artículo: "+precio3);		
				System.out.println("Este es el precio con descuento: "+precioDescuento3);
				
				articulo3.vender(6);
				
				System.out.println(articulo3);
	}

}
