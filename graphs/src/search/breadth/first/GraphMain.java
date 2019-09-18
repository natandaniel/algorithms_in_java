package search.breadth.first;

public class GraphMain {
	
	public static void main(String[] args) throws Exception {
		
		Graph graph = Graph.newInstance();
		graph.addNode(0, 1, 2);
		graph.addNode(1, 2);
		graph.addNode(2, 0, 3);
		graph.addNode(3, 3);
		
		System.out.println(graph);
		
	}

}
