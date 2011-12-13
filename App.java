
public class App {
//	In deze opdracht programmeer je een Binaire boom.
//	Dit moet je doen door zelf de link-structuur te 
//	implementeren. In de boom worden studenten opgeslagen.
//	De knopen in de boom hebben als key het studentnummer 
//	van de studenten.
	
	
	/**
	 * De main wordt gebruikt om de tree te testen.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student student = new Student(8);
		
		Tree tree = new Tree(student);		
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(4));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(12));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(2));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(6));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(10));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(14));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(15));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(16));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(17));
		System.out.println(tree.isBalanced());
		
		tree.insert(new Student(18));
		System.out.println(tree.isBalanced());
		
		System.out.println(tree.toString());
		
		
		
		
		
		
		
		
//		Programmeer een paar cases waarbij 
//		je laat zien dat de boom werkt
		
//		voeg studenten met studentnummers Ó0802063Ó tot en met Ó0824836Ó toe
		
//		Verwijder de root
		
//		print de studenten op volgorde van studentnummer
	}

}
