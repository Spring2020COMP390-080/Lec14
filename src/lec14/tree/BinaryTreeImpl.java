package lec14.tree;

public class BinaryTreeImpl<T> implements BinaryTree<T> {

	private T _value;
	private BinaryTree<T> _left;
	private BinaryTree<T> _right;
	
	public BinaryTreeImpl(T value, BinaryTree<T> left, BinaryTree<T> right) {
		// TODO - add defensive programming that checks for null arguments.
		
		_value = value;
		_left = left;
		_right = right;
	}

	@Override
	public T getValue() {
		return _value;
	}

	@Override
	public void setValue(T value) {
		if (value == null) {
			throw new IllegalArgumentException();
		}
		_value = value;
	}

	@Override
	public BinaryTree<T> getLeft() {
		return _left;
	}

	@Override
	public BinaryTree<T> getRight() {
		return _right;
	}

	@Override
	public void setLeft(BinaryTree<T> left) {
		if (left == null) {
			throw new IllegalArgumentException();
		}
		_left = left;
	}

	@Override
	public void setRight(BinaryTree<T> right) {
		if (right == null) {
			throw new IllegalArgumentException();
		}
		_right = right;
	}

	@Override
	public int height() {
		return Math.max(_left.height(), _right.height()) + 1;
	}

	@Override
	public boolean contains(T element) {
		if (element.equals(_value)) {
			return true;
		}

		if (_left.contains(element)) {
			return true;
		}
		
		if (_right.contains(element)) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}
}
