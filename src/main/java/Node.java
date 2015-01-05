import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Node {
	private String label;
	Map<String, Node> children;

	Node(String label)
	{
		this.label = label;
		children = new HashMap<String, Node>();
	}
	
	public String getLabel()
	{
		return label;
	}
	
	public Node addChild(String pathElement)
	{
		// have to check if child is already present in the children list
		if (children.containsKey(pathElement))
			return children.get(pathElement); 
		
		Node node = new Node(pathElement);
		children.put(pathElement, node);
		return node;
	}
	
	public List<Node> getChildNodes()
	{
		return new ArrayList<Node>(children.values());
	}
}
