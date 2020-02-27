package lec14.tree;

public interface BinaryTree<T> {

	T getValue();
	void setValue(T value);
	BinaryTree<T> getLeft();
	BinaryTree<T> getRight();
	void setLeft(BinaryTree<T> left);
	void setRight(BinaryTree<T> right);
	int height();
	boolean contains(T element);
	boolean isEmpty();
}
