package ej2;

import java.util.List;


public interface BinaryTree<T> {
	
public boolean isEmpty();
public boolean isLeaf();
public T getData();
public BinaryTree<T> getLeftSubTree();
public BinaryTree<T> getRightSubTree();
public void inOrder(List<T> listT);
public void preOrder(List<T> listT);
public void trasverse(List<T> listT);
public int height();
public int size();
public void displayTree();
}
