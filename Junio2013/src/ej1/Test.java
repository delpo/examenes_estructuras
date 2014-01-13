package ej1;

public class Test {

	public static void main(String[] args) {
		ChainHashTable<String, String> tabla = new ChainHashTable<String, String>(5); //tama�o inicial 5
		Pair<String, String> par = new PairData<String, String>("1", "Martin Scorsese");
		tabla.addEntry(par);
		par = new PairData<String, String>("2", "Robert De Niro");
		tabla.addEntry(par);
		par = new PairData<String, String>("3", "Scarlett Johannson");
		tabla.addEntry(par);
		par = new PairData<String, String>("3", "Ricky Gervais");
		tabla.addEntry(par);
		par = new PairData<String, String>("4", "Julia Roberts");
		tabla.addEntry(par);
		
		par = new PairData<String, String>("4", "Jet Li");
		tabla.addEntry(par);
		
		System.out.println(tabla.toString());
	}

}
