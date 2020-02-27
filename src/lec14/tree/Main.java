package lec14.tree;

public class Main {

	public static void main(String[] args) {
		
		String v = "Test string";
		String v1 = "different string";
		String v2 = "another one";
		
		BinaryTree<String> l = new EmptyBinaryTree<String>();
		BinaryTree<String> r = new BinaryTreeImpl<String>("random", 
				new EmptyBinaryTree<String>(), 
				new EmptyBinaryTree<String>());
		
		//		getValue(new(V, L, R)) 		= V	
		
		if ((new BinaryTreeImpl<String>(v, l, r)).getValue().equals(v)) {
			System.out.println("getValue(new(V, L, R)) = V test passes");
		} else {
			System.out.println("getValue(new(V, L, R)) = V test fails");			
		}
		
		//		setValue(new(V, L, R), V*) 	= new(V*, L, R)
		
		BinaryTree<String> rhs = (new BinaryTreeImpl<String>(v, l, r));
		rhs.setValue(v1);
		
		BinaryTree<String> lhs = new BinaryTreeImpl<String>(v1, l, r);
		
		if (treesAreSame(rhs, lhs)) {
			System.out.println("setValue(new(V, L, R), V*) = new(V*, L, R) test passes");
		} else {
			System.out.println("setValue(new(V, L, R), V*) = new(V*, L, R) test fails");
		}
		
		//		getLeft(new(V, L, R)) 		= L
		//		getRight(new(V, L, R)) 		= R
		//		setLeft(new(V, L, R), L*) 	= new(V, L*, R)
		//		setRight(new(V, L, R), R*) 	= new(V, L, R*)
		//		contains(new(V1, L, R), V1)	= true
		//		contains(new(V2, L, R), V1)	= contains(L, V1) || contains(R, V1)
		//		isEmpty(new(V, L, R)) 		= false
	}

	private static boolean treesAreSame(BinaryTree<String> a, BinaryTree<String> b) {
		if (a.isEmpty() && b.isEmpty()) {
			return true;
		}
		
		if (!a.getValue().equals(b.getValue())) {
			return false;
		}
		
		if (!treesAreSame(a.getLeft(), b.getLeft())) {
			return false;
		}
		
		if (!treesAreSame(a.getRight(), b.getRight())) {
			return false;
		}
		return true;
	}
}
