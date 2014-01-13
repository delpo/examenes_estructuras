package ej3;

public class PrincipalMezcla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoubleLinkedList<Integer> lista1 = new DoubleLinkedList<Integer>();
		DoubleLinkedList<Integer> lista2 = new DoubleLinkedList<Integer>();
		lista1.add(2); lista1.add(4); lista1.add(5);
		lista2.add(9); lista2.add(8); lista2.add(7); lista2.add(6);
		System.out.println(lista1.toString());
		System.out.println(lista2.toString());
		//lista1.shuffle(lista2);
		lista1.awesomeShuffle(lista2);
		System.out.println(lista1.toString());
		lista1 = new DoubleLinkedList<Integer>();
		lista2 = new DoubleLinkedList<Integer>();
		lista1.add(2); lista1.add(4); lista1.add(5);
		lista2.add(99); lista2.add(100);
		System.out.println(lista1.toString());
		System.out.println(lista2.toString());
		//lista1.shuffle(lista2);
		lista1.awesomeShuffle(lista2);
		System.out.println(lista1.toString());
	}

}
