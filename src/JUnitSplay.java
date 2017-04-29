import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitSplay {

	@Test
	public void test() {
		SplayTree<String,String> b = new SplayTree<String,String>();
		b.put("hello", "hola");
		b.put("bye", "adios");
		assertEquals("adios",b.get("bye"));
	}

}
