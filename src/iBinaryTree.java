/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 */

/**
 * @param <K>
 * @param <V>
 */
public interface iBinaryTree<K extends Comparable<K>, V> {
	
	public boolean contains(K item);
	public V get (K item);
	public void put(K key, V value);

}
