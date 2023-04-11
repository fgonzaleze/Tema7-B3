package ejercicio01;

/*
 * Añade a la clase CuentaCorriente un enumerado llamado Sexo para indicar el sexo del titular (Femenino, Masculino). 
 * Crea también un atributo de nombre sexo que sea de tipo Sexo. 
Modifica los constructores para que también se le pase el sexo del titular por parámetro. Éste debe pasarse como String.
Añade getter y setter para el nuevo atributo.
Modifica también el método toString (o la función para imprimir por pantalla la clase CuentaCorriente) para incorporar el sexo del titular.
En el main lee el sexo por teclado de al menos dos titulares y pásalos a los constructores. Tras realizar modificaciones sobre el objeto, 
imprímelos usando el método toString o el que hayas creado para imprimir por pantalla.
 */

public class CuentaCorriente {

	private String dNI;
	private String nombre;
	private int saldo;
	
	// Enumeradoabsaksdmalksd
	enum Sexo {
		Femenino, Masculino
	};
	
	//  Atributo de nombre sexo que sea de tipo Sexo. 
	private Sexo sexo;

	public CuentaCorriente(String dNI, int saldo) {

		this.dNI = dNI;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dNI, String nombre, int saldo, String sexo) {

		this.dNI = dNI;
		this.nombre = nombre;
		this.saldo = saldo;

		// Para luego asignar el valor leído a una variable de tipo sexo, 
		// tenemos que convertirla en el valor enumerado correspondiente. Para eso usaremos el método valueOf()
		this.sexo = Sexo.valueOf(sexo);
	}

	public String getdNI() {
		return dNI;
	}

	public void setdNI(String dNI) {
		this.dNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int sacarDinero(int saldoR) {

		if (this.saldo > saldoR) {

			this.saldo -= saldoR;
		}

		return this.saldo;

	}

	public int ingresoDinero(int ingreso) {

		this.saldo += ingreso;

		return this.saldo;
	}

	public String toString() {

		String result;

		result = "DNI: " + this.dNI + " \n" + "Titular: " + this.nombre + " \n" + "Saldo: "
				+ this.saldo + "\n" + "Sexo: " + this.sexo;

		return result;
	}
}
