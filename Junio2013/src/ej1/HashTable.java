package ej1;

public interface HashTable<K,V> extends Iterable<Pair<K,V>> {
	
	/** Return the pair with key <code>key</code> 
	 * @param key The key of the entry to search
	 * @return The pair with this <code>key</code>. <code>null</code> if not found
	 */
	Pair<K, V> getEntry(K key);
	
	/** Adds a new entry to the hash table.
	 * 
	 * Adds a new pair consisting of <code>key, value<\code> to the hash table. 
	 * If an entry with the same <code>key</code> exists, its associated value is replaced.
	 * @param key The key of the new entry, must be hashable
	 * @param Value The associated value.
	 * @return The entry that has been replaced if it already existed. <code>null</code> otherwise.
	 */
	Pair<K, V> addEntry(Pair<K,V> entry);
	
	/** Removes the entry pair with key <code>key</code> 
	 * @param key The key of the entry pair to be removed
	 * @return The deletes pair. <code>null</code> if not found.
	 */
	Pair<K, V> removeEntry(K key);
	
	/** The number of different pairs stored in the hash table
	 * @return The number of pairs. 0 if none.
	 */
	int size();
	
	/** Returns whether the hash table contains elements.
	 * @return <code>true</code> if none element is stored in this table. <code>false</code> otherwise
	 */
	boolean isEmpty();
	
	/** Removes all the entries from the table
	 * 
	 */
	void clear();
}
