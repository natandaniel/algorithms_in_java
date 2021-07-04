package search.breadth.first;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class BreadthFirst {

	public static void traverse(Graph graph, int node) {
		
		Set<Integer> discoveredNodes = new HashSet<>();

		Queue<Integer> nodesToProcess = new PriorityQueue<>();
		nodesToProcess.offer(node);
		
		while(!nodesToProcess.isEmpty()) {
			
			int currentNode = nodesToProcess.remove();
			System.out.println(currentNode + " ");
			
			discoveredNodes.add(currentNode);
			
			List<Integer> adjNodes = graph.getAdjacentNodes(currentNode);
			
			adjNodes.forEach(adjNode -> {
					boolean added = discoveredNodes.add(adjNode);
					if(added) {
						System.out.println(nodesToProcess.peek());
						nodesToProcess.offer(adjNode);
					}
			});
		}
	}

	public static Integer search() {
		return 0;
	}

}
