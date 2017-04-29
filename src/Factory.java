import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Esta clase permite que se puedan implementar dos tipos de arboles, dependiendo de lo que el usuario elija
 */

public class Factory {
	
	/**
	 * @param comp
	 * @return TwoThreeBST-3 o SplayTree
	 * El return depende de lo que se haya elegido en el main
	 */
	public iBinaryTree choose(String comp){
		if(comp.equals("TwoThreeBST")){
			return new TwoThreeBST();
		}
		if(comp.equals("SplayTree")){
			return new SplayTree();
		}
		return null;

	}

}
