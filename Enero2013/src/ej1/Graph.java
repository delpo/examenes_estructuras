package ej1;

public interface Graph<T,W> {
	public boolean isDirected();
	public int getSize();
	public boolean isEmpty();
	public int insertNode(T item);
	public int getNodeIndex(T item);
	public T getNodeValue(int index);
	public T removeNode(int index);
	public boolean insertEdge(EDEdge<T> edge);
	public EDEdge<W> getEdge(int source, int dest);
	public EDEdge<W> removeEdge(int source, int dest);
}
