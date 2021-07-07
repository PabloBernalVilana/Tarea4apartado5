package tarea4Apartado5;
/* 
 *  Declara cuatro variables enteras A, B, C y D y
 *  asígnale un valor a cada una. A continuación realiza las instrucciones
 *  necesarias para que:
 *  B tome el valor de C
 *  C tome el valor de A
 *  A tome el valor de D
 *  D tome el valor de B*/
public class MainApp {

	public static void main(String[] args) {
		// Declaracion variables enteras A,B,C,D y asignacion de un valor
		int A = 2;
		int B = 4;
		int C = 8;
		int D = 16;
		// Muestra los valores iniciales de las variables
		System.out.println("Valor inicial de A = " + A);
		System.out.println("Valor inicial de B = " + B);
		System.out.println("Valor inicial de C = " + C);
		System.out.println("Valor inicial de D = " + D);
		System.out.println("");
		// Cambiar valor de las variables
		B = C;
		C = A;
		A = D;
		D = B;
		// Muestra el nuevo valor que tomara la variable
		System.out.println("B Toma el valor de " + C);
		System.out.println("C Toma el valor de " + A);
		System.out.println("A Toma el valor de " + D);
		System.out.println("D Toma el valor de " + B);
		System.out.println("");
		// Muestra los valores ya cambiados
		System.out.println("Valor final de A = " + A);
		System.out.println("Valor final de B = " + B);
		System.out.println("Valor final de C = " + C);
		System.out.println("Valor final de D = " + D);
	}

}
