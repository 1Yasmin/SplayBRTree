import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * En esta clase se encuentran todos los metodos a utilizar para la HDT9
 */
public class Arboles {
	Factory factory = new Factory();
	iBinaryTree<String,String> var;
	
	public void diccionario() throws IOException {
		//Leer el diccionario ingles-español
		String cadena = "";
		BufferedReader txt = new BufferedReader(new FileReader("freedictEngSpa.txt"));
		String palabra;
		while((palabra=txt.readLine())!=null){
			cadena=cadena+" "+palabra;
			ingresoData(palabra);
			}
		}
	
	//Utilizar el arbol elegido por el usuario 
	public void seleccionArb(String entrada){
		var=factory.choose(entrada);
		if (var instanceof SplayTree){
			System.out.println("El arbol elegido es el: SplayTree");
		}else if (var instanceof TwoThreeBST){
			System.out.println("El arbol elegifo es el: 2-3 Three");
		}
	}
	
	//Setear
	public void ingresoData(String str){
		String cadena = str.replaceAll(" ", ",");
		cadena = cadena.replaceAll("\t", ",");
		String oracion[]= cadena.split(",");
		var.put(oracion[0], oracion[1]);
	
	}
	
	//Abrir y leer el archivo que contiene la oracion a traducir
	public String archTraduccion() throws IOException{
		String cadena = ""; 
		FileReader fr = new FileReader("traduccion.txt");
		BufferedReader bf = new BufferedReader(fr);
		cadena = (bf.readLine());
		bf.close(); // cierra el txt
		return cadena;
	}
	
	//Obtener la traduccion de la oración 
	public String txtTraducido(String texto){
		String traducido="";
		texto = texto.toLowerCase();
		String palabrasATraducir[] = texto.split("\\s+");
		for (int i=0; i<palabrasATraducir.length;i++){
			String x =palabrasATraducir[i];
			if ( var.get(palabrasATraducir[i]) != null){
				traducido = traducido + var.get(palabrasATraducir[i]).toString() +" ";
			}else{
				traducido = traducido + "*"+x+"* ";
			}
		}
		return traducido;
	}
}
