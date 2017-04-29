import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author ychav
 *
 */
public class JUnit23BST {

	@Test
	public void testSplay() {
		TwoThreeBST<String,String> b = new TwoThreeBST<String,String>();
		b.put("hello", "hola");
		b.put("bye", "adios");
		assertEquals("adios",b.get("bye"));
	}

}
