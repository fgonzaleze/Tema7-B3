package ejercicio02;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el objeto libro param: Libro, Autor, libros, libros prestados, genero 
		Libro libro1 = new Libro("1984","George Orwell", 5, 1, "Narrativo");
		
		libro1.prestamo();
		libro1.devolucion();
		
		System.out.println(libro1);
		
		// Otro objeto libro
		Libro libro2 = new Libro ("El señor de las moscas", "William Golding", 4, 2, "Dramatico");
		
		libro2.prestamo();
		
		System.out.println(libro2);
	}

}
