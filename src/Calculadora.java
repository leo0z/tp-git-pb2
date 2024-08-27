import java.util.Scanner;

public class Calculadora {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Integer valorUno = null;
		Integer valorDos = null;
		Integer opcion;

		do {
			opcion = elejirOpcion();

			if(opcion != 5 ) {
				valorUno = ingreseUnNumero("Ingrese el primer número");

				valorDos = ingreseUnNumero("Ingrese el segundo número");
			}

			switch(opcion) {
			case 1:
				multiplicar(valorUno,valorDos);
				break;
			case 2:
				restar(valorUno , valorDos);
				break;
			case 3:
				sumar(valorUno, valorDos);
				break;
			case 4:
				dividir(valorUno,valorDos);
				break;
			case 5:
				mostrarMensaje("Adios");
				break;
			}

		}while(opcion != 5);
	}

	private static Integer elejirOpcion() {
		Integer opcion;
		do{
			opcion = ingreseUnNumero("Ingrese su operación /n 1 para multiplicar /n 2 para restar /n 3 para sumar /n 4 para dividir /n 5 para salir");

		}while(opcion < 1 || opcion > 5);

		return opcion;
	}

	private static Integer ingreseUnNumero(String mensaje) {
		mostrarMensaje(mensaje);
		return teclado.nextInt();
	}

	private static void sumar(Integer valorUno, Integer valorDos) {
		mostrarMensaje("El resultado de la suma es: "+(valorUno+valorDos));
	}

	private static void restar(Integer valorUno, Integer valorDos) {
		mostrarMensaje("El resultado de la resta es: "+(valorUno-valorDos));
	}

	private static void multiplicar(Integer valorUno, Integer valorDos) {
		mostrarMensaje("El resultado de la multiplicacion es: "+valorUno*valorDos);
	}

	private static void dividir(Integer valorUno, Integer valorDos) {
		if(valorDos != 0) {
			mostrarMensaje("El resultado de la division es: "+valorUno/valorDos);
		} else {
			mostrarMensaje("No se puede dividir por 0");
		}

	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}