import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Tree {
	private Node root;

	Tree()
	{
		root = new Node("/");
	}

	public Node getRoot() {
		return root;
	}

	public void buildTree(String[] paths)
	{
		for (String path : paths) {
			String[] pathElements = path.split("/");
			System.out.println("pathElement: " + Arrays.toString(pathElements));
			Node parent = root;
			for (String pathElement : pathElements) {
				parent = parent.addChild(pathElement);
			}
		}
	}
	
	public void printBreadthFirst()
	{
		Queue<Node> queue = new LinkedList<Node>();
		Node levelMarker = new Node("Level Marker");
		
		queue.add(root);
		queue.add(levelMarker);
		
		while (queue.peek() != null) {
			Node node = queue.remove();
			if (node == levelMarker) {
				System.out.println();
				continue;
			}
			System.out.println(node.getLabel() + " ");
			for (Node child : node.getChildNodes()) {
				queue.add(child);
			}
			if (queue.peek() == levelMarker) {
				queue.add(levelMarker);
			}
		}
	}
}
