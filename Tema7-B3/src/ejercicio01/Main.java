package ejercicio01;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuenta= new CuentaCorriente("12345678", "Javi", 0, "Masculino");
		CuentaCorriente cuenta2= new CuentaCorriente ("87654321", "Sara", 5000, "Femenino");

		cuenta2.sacarDinero(500);
		cuenta.ingresoDinero(50);
		
		System.out.println(cuenta);
		System.out.println(cuenta2);
	}

}
