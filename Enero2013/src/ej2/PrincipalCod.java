package ej2;

import java.util.Scanner;

public class PrincipalCod {

	/**
	 * @param args
	 */
	
	public static String visitNode(EDBinaryTree<Character> ab, char car, String decode) {
		System.out.println("Valor: "+ab.getData());
		System.out.println("Decode actual: "+decode);
		if(ab.isLeaf() && ab.getData().equals(car)) {
	    	System.out.println("¡¡¡¡found!!!! decode correcto: "+decode);
	    	return decode;
	    }else{
	    	String aux = decode;
	    	if(ab.getLeftSubTree() != null) {
				System.out.println("entro en nodo hijo izq");
		        aux = visitNode(ab.getLeftSubTree(), car, decode+"0");
		    }
		    if(ab.getRightSubTree() != null) {
				System.out.println("entro en nodo hijo der");
		        aux = visitNode(ab.getRightSubTree(), car, decode+"1");
		    }
		    System.out.println("---LOS DOS IF PASADOS CON: "+aux);
		    return aux;
	    }
	}
	
	private static String codificar(EDBinaryTree<Character> ab, char car){
		return visitNode(ab, car, "");
	}
	
	public static void main(String[] args) {
		char caracter = 'f';
		EDBinaryTree<Character> ab = new EDBinaryTree<Character>();
		//creo nodos hoja
		EDBinaryTree<Character> a = new EDBinaryTree<Character>('a');
		EDBinaryTree<Character> f = new EDBinaryTree<Character>('f');
		EDBinaryTree<Character> b = new EDBinaryTree<Character>('b');
		EDBinaryTree<Character> c = new EDBinaryTree<Character>('c');
		EDBinaryTree<Character> hijoderizq = new EDBinaryTree<Character>(null, f, b);
		EDBinaryTree<Character> hijoder = new EDBinaryTree<Character>(null, hijoderizq, c);
		ab = new EDBinaryTree<Character>(null, a, hijoder);
		System.out.println("-----Árbol utilizado--------");
		ab.displayTree();
		System.out.println("----------------------------");
		String cod = codificar(ab, caracter);
		System.out.println("El carácter codificado es: "+cod);
		System.out.println("Introduce operación a realizar: ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		EDBinaryTree<String> arbol = new EDBinaryTree<String>();
		arbol.createsBinaryExprTree(cadena);
		System.out.println("El resultado es: "+arbol.evaluate());
	}

}
