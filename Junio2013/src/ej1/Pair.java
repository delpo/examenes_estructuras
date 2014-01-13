package ej1;

public interface Pair<K, V> {

	public  K getKey();
	
	public  V getValue();

	public  V setValue(V newValue);
	
}