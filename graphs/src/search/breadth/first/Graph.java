package search.breadth.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

	private static class Node {
		private int value;
		private List<Integer> adjNodes;

		public static Node newInstance(int value, List<Integer> adjNodes) {
			Node node = new Node();
			node.setValue(value);
			node.setAdjNodes(adjNodes);
			return node;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public void setAdjNodes(List<Integer> adjNodes) {
			this.adjNodes = adjNodes;
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Node)) {
				return false;
			} else {
				Node node = (Node) o;
				return this.value == node.value;
			}
		}
	}

	List<Node> nodes = new ArrayList<Node>();

	public static Graph newInstance() {
		return new Graph();
	}

	public void addNode(int value, Integer... adjNodes) throws Exception {
		
		Node node = Node.newInstance(value, Arrays.asList(adjNodes));
		
		if(nodes.contains(node)) {
			throw new Exception("Cannot add same node");
		}else {
			nodes.add(node);
		}
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		nodes.forEach(node -> {
			sb.append("node : " + node.value + "\n");
			sb.append("adjacent nodes :" + node.adjNodes + "\n");
		});
		
		return sb.toString();	
	}

}
