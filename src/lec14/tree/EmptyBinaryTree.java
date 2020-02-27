package lec14.tree;

public class EmptyBinaryTree<T> implements BinaryTree<T> {

	@Override
	public T getValue() {
		throw new RuntimeException();
	}

	@Override
	public BinaryTree<T> getLeft() {
		throw new RuntimeException();
	}

	@Override
	public BinaryTree<T> getRight() {
		throw new RuntimeException();
	}

	@Override
	public void setLeft(BinaryTree<T> left) {
		throw new RuntimeException();
	}

	@Override
	public void setRight(BinaryTree<T> right) {
		throw new RuntimeException();
	}

	@Override
	public int height() {
		return -1;
	}

	@Override
	public void setValue(T value) {
		throw new RuntimeException();
	}

	@Override
	public boolean contains(T element) {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

}
