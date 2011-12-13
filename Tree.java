
public class Tree {

	private class Node {
		
		Student student;
		
		Node parent;
		Node leftChild;
		Node rightChild;
		
		public Node(){
			
		}
		
		public Node(Student student){
			this.student = student;
		}
		
		public String toString(){
			String result = "";
			String nl = "\n";
			
			result += student.nummer+nl;
			if (leftChild != null) result = leftChild.toString()+result; 
			if (rightChild != null) result += rightChild.toString();
			
			return result;
		}
		
		int levelsDown(int levels){
			int left = 0, right = 0;
			if (leftChild != null) left = leftChild.levelsDown(levels+1);
			if (rightChild != null) right = rightChild.levelsDown(levels+1);
			return Math.max(levels, Math.max(left, right));
		}
		
		int levelsUp(int levels){
			if (parent != null) levels = parent.levelsUp(levels+1);
			return levels;
		}
	
	}
	
	private Node root;
	private int numberOfItems;

	//---------------------------
	// Constructors
	public Tree(Student student){
		root = new Node();
		root.student = student;
		numberOfItems = 1;
	}
	
	//--------------------------
	//Data structure operations	
	/**
	 * Voeg een element toe aan de tree
	 */
	public void insert(Student student){
		Node node = findClosest(student.nummer, root);
		if (node != null){
			if (node.student.nummer > student.nummer){
				node.leftChild = new Node(student);
				node.leftChild.parent = node;
			} else {
				node.rightChild = new Node(student);
				node.rightChild.parent = node;
			}
			numberOfItems++;
		}
	}
	
	/**
	 * Verwijder een object uit de boom
	 */
	public void remove(/*Studentnummer*/){
		
	}
	
	
	/**
	 * Zoek een studentnummer in de boom en return 
	 * het oject
	 */
	public Node find(int nummer, Node node){
		if (node.student.nummer == nummer){
			return node;
		}
		if (node.student.nummer > nummer){
			if (node.leftChild == null)	return null;
			return find(nummer, node.leftChild);
		}
		if (node.student.nummer < nummer){
			if (node.rightChild == null) return null;
			return find(nummer, node.rightChild);
		}
		return null;
	}
	
	public Node findClosest(int nummer, Node node){
		if (node.student.nummer == nummer){
			return null;
		}
		if (node.student.nummer > nummer){
			if (node.leftChild == null)	return node;
			return findClosest(nummer, node.leftChild);
		}
		if (node.student.nummer < nummer){
			if (node.rightChild == null) return node;
			return findClosest(nummer, node.rightChild);
		}
		return null;
	}
	
	public boolean isBalanced(){
		System.out.println("n: "+numberOfItems);
		System.out.println("h: "+depth());
		if (
				(numberOfItems > (int)Math.pow(2, root.levelsDown(0))-1) &&
				(numberOfItems <= (int)Math.pow(2, root.levelsDown(0)+1)-1)
			) return true;
		return false;//dummy
	}
	
	public void balance(){
		
	}
	
	public int depth(){
		return root.levelsDown(0);
	}
	
	
	//------------------------------------------------------
	// Utility methods
	/**
	 * Print de tree In-Order
	 */
	public String toString(){
		return root.toString();
	}	
}
