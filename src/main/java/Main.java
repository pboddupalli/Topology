public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.buildTree(args);
		tree.printBreadthFirst();		
	}
}
