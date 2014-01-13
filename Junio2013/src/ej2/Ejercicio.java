package ej2;

public class Ejercicio {

	public static Boolean esMinHeap(int v[]){
		return esMinHeap(v, 1, true);
	}
	
	private static Boolean esMinHeap(int[] v, int i, Boolean previous) {
		if(2*i+1 < v.length){
			int a = 2*i+1;
			Boolean aux = true;
			if(v[2*i] == 0 && v[2*i+1] == 0){ //existe nodo?
				return previous;
			}else if(v[2*i] > v[i] && v[a] > v[i]){ //los hijos tienen menor valor?
				System.out.println(v[i]+">"+v[2*i]+"-"+v[2*i+1]);
				aux = esMinHeap(v, 2*i, previous);
				if(aux==true)
					aux = esMinHeap(v, (2*i)+1, previous);
				return aux;
			}else{ //hijos con valor mayor
				return false;
			}
		}else{ //nodo hoja
			return previous;
		}
	}

	public static void main(String[] args) {
		EDBinaryTree<Integer> a = new EDBinaryTree<Integer>(2);
		EDBinaryTree<Integer> f = new EDBinaryTree<Integer>(10);
		EDBinaryTree<Integer> b = new EDBinaryTree<Integer>(12);
		EDBinaryTree<Integer> c = new EDBinaryTree<Integer>(4);
		EDBinaryTree<Integer> hijoderizq = new EDBinaryTree<Integer>(8, f, b);
		EDBinaryTree<Integer> hijoder = new EDBinaryTree<Integer>(3, hijoderizq, c);
		EDBinaryTree<Integer> ab = new EDBinaryTree<Integer>();
		ab = new EDBinaryTree<Integer>(1, a, hijoder);
		System.out.println("-----�rbol utilizado--------");
		ab.displayTree();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		System.out.println("----------------------------");
		int[] v = {0,1,2,3,0,0,8,4,0,0,0,0,10,12};
		System.out.println("Es MinHeap? "+esMinHeap(v));
	}

}
