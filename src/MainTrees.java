import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ychav
 *
 */
public class MainTrees {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in); 
		String cadena;
		String textoOriginal = "";
		String textoTraducido = "";
		
		//Utilizacion de buffered Reader para obtener los datos de un archivo de texto
		FileReader fr = new FileReader("diccionario.txt");
		BufferedReader bf = new BufferedReader(fr);
		while ((cadena = bf.readLine()) != null) {
				cadena = cadena.replaceAll("[()]", "");
				String[] datos = cadena.split("\\s*,\\s*");
		}
		bf.close(); // cierra el txt

	}

}
