
import java.util.Scanner;

public class Calculadora {
	
	private static Scanner teclado = new Scanner(System.in);
	private static Double resultado = 0.0;
	private static Double a;
	private static Double b;
	private final static int SALIR = 5;
	public static void main(String[] args) {
		
		Integer opcion;
		
		do{
			System.out.println("Ingrese su operación \n 1 para multiplicar \n 2 para restar \n 3 para sumar \n 4 para dividir \n 5 Salir");
			opcion = teclado.nextInt();
			
			switch(opcion) {
		case 1:
			multiplicar();
			System.out.println("El resultado es " + resultado + "\n");
			break;
		case 2:
			restar();
			System.out.println("El resultado es " + resultado + "\n");
			break;
		case 3:
			sumar();
			System.out.println("El resultado es " + resultado + "\n");
			break;
		case 4:
			dividir();
			System.out.println("El resultado es " + resultado + "\n");
			break;
		case SALIR:
			System.out.println("Gracias por usar Calculadora!");
			break;
		}
			

		}while(!opcion.equals(SALIR));

		
	}
	
	private static Double dividir() {
		ingresarValores();
		if(a == 0) {
			return 0.0;
		}
		return resultado = a / b;
	}

	private static Double multiplicar() {
		ingresarValores();
		return  resultado = a * b;
	}

	private static Double restar() {
		ingresarValores();
		return resultado = a - b;
	}

	public static Double sumar () {
		ingresarValores();
		return resultado = a + b;
	}

	private static void ingresarValores() {
		System.out.println("Ingrese el primer numero");
		a = teclado.nextDouble();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextDouble();
	}

}
