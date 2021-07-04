package search.breadth.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Graph {

	Set<Node> nodes = new HashSet<Node>();

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
		
		public List<Integer> getAdjNodes(){
			return adjNodes;
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Node)) {
				return false;
			} else {
				Node node = (Node) o;
				System.out.println(node);
				return this.value == node.value;
			}
		}

		@Override
		public int hashCode() {
			return value;
		}
	}

	public static Graph newInstance() {
		return new Graph();
	}

	public void addNode(int value, Integer... adjNodes) throws Exception {
		Node node = Node.newInstance(value, Arrays.asList(adjNodes));
		nodes.add(node);
	}

	public List<Integer> getAdjacentNodes(int value) {

		List<Node> nodeList = nodes.stream().filter(node -> node.value == value).collect(Collectors.toList());
		
		if(!nodeList.isEmpty()) {
			Node node = nodeList.get(0);
			return node.getAdjNodes();
		}else {
			return new ArrayList<>();
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
