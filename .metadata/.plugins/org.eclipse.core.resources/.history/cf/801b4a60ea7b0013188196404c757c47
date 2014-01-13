package ej1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListGraph<T,W> implements Graph<T,W> {
	private class Node<T>{
		T data;
		List<EDEdge<W>> lEdges;
		
		Node(T data){
			this.data = data;
			this.lEdges = new LinkedList<EDEdge<W>>();
		}
	}
	
	//Datos privados
	//private boolean isDirected;
	private List<Node> nodes = new ArrayList<Node>();
	private int size; //real number of nodes
	
	//Constructor
	public ListGraph(String nomFich){
		Scanner input;
		try {
			input = new Scanner(new FileInputStream(nomFich));
			size = input.nextInt();
			System.out.println("El numero de nodos es: "+size);
			input.nextLine(); //paso del espacio
			for(int i = 0; i < size; i++){
				String poblacion = input.nextLine();
				nodes.add(new Node(poblacion));
				System.out.println("He a–adido: "+poblacion);
			}
			for(Node n: nodes){
				String[] linea = input.nextLine().split(" ");
				int arcos = Integer.parseInt(linea[0].toString());
				for(int i = 0; i < arcos*2; i++){
					n.lEdges.add(linea[i+1]);
				}
				System.out.println("Contenido: "+n.lEdges.toString());
			}		
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
			System.exit(0);
		}catch(NoSuchElementException e){
			System.out.println("Fin de lectura de fichero.");
		}
	}
	
	
	@Override
	public boolean isDirected() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	@Override
	public int insertNode(T item) {
		nodes.add(new Node<T>(item));
		return nodes.size();
	}
	@Override
	public int getNodeIndex(T item) {
		int contador = 0;
		for(Node<T> n:nodes){
			if(n.data == item){
				return contador;
			}else{
				contador++;
			}
		}
		return -1;
	}
	@Override
	public T getNodeValue(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T removeNode(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean insertEdge(EDEdge<T> edge) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public EDEdge<W> getEdge(int source, int dest) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public EDEdge<W> removeEdge(int source, int dest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
