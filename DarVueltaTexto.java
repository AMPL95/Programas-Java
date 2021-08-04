package EjerciciosPOO;

import java.util.Scanner;

public class DarVueltaTexto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		
		System.out.println("Introduce una frase: ");
		String texto = tec.nextLine(); //texto que se introduce por teclado
		String sep[] = texto.split(" ");//Separa la cadena almacenada en "texto" en cada bloque separado por las comillas y almacena sus valores
		String vuelta[] = new String[sep.length]; //Preparamos otro array para almacenar cada palabra dada la vuelta

		for (int i = 0; i < sep.length; i++) { // Bucle para almacenar cada palabra en el sitio contrario.
			vuelta[i] = sep[sep.length - 1 - i];
		}
		
		String hecho2= String.join(" ", vuelta); //Unión del array vuelta separado por " " en un unico String
		
		System.out.println(hecho2); //Imprimimos por pantallada
		

	}
}
