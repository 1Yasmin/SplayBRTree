import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author ychav
 *
 */
public class Factory {
	
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
