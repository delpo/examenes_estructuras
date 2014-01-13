package ej1;

public class PairData<K,V> implements Pair<K, V> {

	private K key;
	private V value;

	public PairData() {
		this.key = null;
		this.value = null;
	}

	public PairData(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public V setValue(V newValue) {
		V old = value;
		value = newValue;
		return old;
	}

	public String toString() {
		String retValue ="<";
		
		retValue += (key == null ? "" : key.toString()) + ",";
		retValue += (value == null ? "" : value.toString()) + ">";
		
		return retValue;
	}
	
	public boolean equals(PairData<K, V> pair) {
		return key.equals(pair.getKey());
	}
	
	public int hashCode() {
		return key.hashCode();
	}
}
