/**
 * @author ychav
 *
 */
public interface iBinaryTree<K extends Comparable<K>, V> {
	
	public boolean contains(K item);
	public V get (K item);
	public void put(K key, V value);

}
