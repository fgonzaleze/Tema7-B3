package ejercicio02;

public class Libro {

	private String titulo;

	private String autor;

	private int numLibros;

	private int numLibrosPrestados;

	private enum Genero {
		Narrativo, Lirico, Dramatico, Didactico, Poetico
	};

	private Genero genero;

	/**
	 * Constructor de la clase Libro sin parámetros que no devuelve nada.
	 */
	public Libro() {

	}

	/**
	 * Constructor de la clase Libro con parámetros.
	 * 
	 * @param titulo titulo del libro
	 * @param autor autor del libro
	 * @param numLibros ejemplares disponibles
	 * @param numLibrosPres ejemplares prestados
	 */
	public Libro(String titulo, String autor, int numLibros, int numLibrosPres, String genero) {

		this.titulo = titulo;
		this.autor = autor;
		this.numLibros = numLibros;
		this.numLibrosPrestados = numLibrosPres;

		// Para luego asignar el valor leído a una variable de tipo genero, 
		// tenemos que convertirla en el valor enumerado correspondiente. Para eso usaremos el método valueOf()
		this.genero = Genero.valueOf(genero);

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numLibros;
	}

	public void setNumEjemplares(int numLibros) {
		this.numLibros = numLibros;
	}

	public int getNumEjemplaresPrestados() {
		return numLibrosPrestados;
	}

	public void setNumEjemplaresPrestados(int numLibrosPres) {
		this.numLibrosPrestados = numLibrosPres;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Metodo para prestar lkibros. Si el numLibros es menor que la cantidad de
	 * los que hay, es que se puede prestar. Entonces aumentamos en uno los
	 * prestados, y prestamo se vuelve true.
	 * 
	 * @return Devuelve un booleano en true si hay prestamo y false si no lo hay
	 * 
	 */
	public boolean prestamo() {

		boolean prestamo = false;

		if (numLibros >= numLibrosPrestados) {

			numLibrosPrestados++;
			prestamo = true;

		}

		return prestamo;
	}

	/**
	 * Metodo para devolver libros, si hay libros prestados (numLibrosPrestadps
	 * 
	 * Método que devuelve un libro. En el caso en el que haya libros prestados
	 * (cuando numEjemplaresPrestados es mayor que 0) puede ocurrir una devolución.
	 * En este caso, decrementa numEjemplaresprestados y devolución es true.
	 * 
	 * @return Devuelve un booleano que si es true es que ha habido una devolución y
	 *         si es false, no ha ocurrido nada.
	 */
	public boolean devolucion() {

		boolean devolucion = false;

		if (numLibros >= numLibrosPrestados && numLibrosPrestados > 0) {

			numLibrosPrestados--;
			devolucion = true;
		}

		return devolucion;
	}

	/**
	 * 
	 * Método que pasa a String todos los atributos y los devuelve a modo de mensaje
	 * 
	 * @return result mensaje tipo
	 */
	public String toString() {

		String result = "";

		result += "Título : " + titulo + "\n";
		result += "Autor: " + autor + "\n";
		result += "Número de ejemplares: " + numLibros + "\n";
		result += "Número de prestados: " + numLibrosPrestados + "\n";
		result += "Género: " + genero + "\n";

		return result;

	}
}
