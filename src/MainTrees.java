import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 */

public class MainTrees {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Arboles arb = new Arboles();
		String traduc = arb.lectura();
		
		Scanner sc = new Scanner(System.in); 
		String cadena;
		String textoOriginal = "";
		String textoTraducido = "";
		String entrada = ""; 
		int eleccion = -1; 
		
		//Utilizacion de buffered Reader para obtener los datos de un archivo de texto
		FileReader fr = new FileReader("traduccion.txt");
		BufferedReader bf = new BufferedReader(fr);
		cadena = (bf.readLine());
		System.out.println("El texto que se desea traducir es: "+cadena);
		bf.close(); // cierra el txt
		
		try{
			 //Instrucciones para usuario
			 System.out.println("Instrucciones: por favor solo ingrese el entero correspondiente"
			 		+ " a la accion que desee realizar");
			 
			 //Elegir que arbol desea implementar
			 System.out.println("Elige que arbol deseas usar:\n1.- SplayTree" +
						"\n2.- Arboles 2-3\n" +
						"0.- Salir");
			 //Se guarda el valor
			 eleccion = Integer.parseInt(sc.nextLine()); 
			 
			 switch(eleccion){
				case 1: 
					//El usuario eligio TreeSet
					 entrada = "SplayTree";
					 break;
				case 2: 
					//El usuario eligio HashSet
					entrada = "TwoThreeBST";
					break;
				case 0: 
					//El usuario eligio salir 
					System.out.println("Hasta pronto");
					break;
				default:
					//El usuario eligio un numero erroneo
					System.out.println("Número no reconocido");
					//Vuelve a darle al usuario el menu
					System.out.println("Elige que arbol deseas usar:\n1.- SplayTree" +
							"\n2.- Arboles 2-3\n" +
							"0.- Salir");
					 //Se guarda el valor
					 eleccion = Integer.parseInt(sc.nextLine()); 
			 }
	}catch(Exception e){
		//Mensaje de Error
		System.out.println("Error");
		}
		
		arb.seleccionArb(entrada);
		arb.s();
		System.out.println("La traducción es: \n" + arb.traduccion(traduc));
	}

}
