package graph;

import java.util.*;

class Graph {

	private HashMap<Integer, List<Integer> > hmap = new HashMap<>();
	public void addVertex(Integer s)
	{
		hmap.put(s, new LinkedList<Integer>());
	}

	public void addEdge(Integer source,Integer nextVertex)
	{

		if (!hmap.containsKey(source))
			addVertex(source);

		if (!hmap.containsKey(nextVertex))
			addVertex(nextVertex);

		hmap.get(source).add(nextVertex);
	    hmap.get(nextVertex).add(source);
	}
	public void BFS(Integer begin) {
        if (!hmap.containsKey(begin)) {
            System.out.println("Vertex " + begin + " does not exist in the graph.");
            return;
        }
        Integer size=maxKey()+1;
        boolean[] visited = new boolean[size];
        Queue<Integer> q = new LinkedList<>();

        visited[begin] = true;
        q.add(begin);

        while (!q.isEmpty()) {
            Integer currVertex = q.poll();
            System.out.print(currVertex + " ");

            List<Integer> next = hmap.get(currVertex);
            for (Integer vertex : next) {
                if (visited[vertex]==false) {
                    visited[vertex] = true;
                    q.add(vertex);
                }
            }
		}
	}

	void DFS(Integer begin){
	    if (!hmap.containsKey(begin)) {
            System.out.println("Vertex " + begin + " does not exist in the graph.");
            return;
        }
        Integer size=maxKey()+1;
        boolean[] visited = new boolean[size];
        Stack<Integer> s = new Stack<>();

        visited[begin] = true;
        s.push(begin);

        while (!s.isEmpty()) {
            Integer currVertex = s.pop();
			if (!visited[currVertex]) {
                System.out.print(currVertex + " ");
                visited[currVertex] = true;
            }

            List<Integer> next = hmap.get(currVertex);
            for (Integer vertex : next) {
                if (!visited[vertex]) {
                    s.push(vertex);
                }
			}
		}
            
	}

	Integer maxKey(){
		Integer max=0;
		for(Map.Entry<Integer,List<Integer>>ite : hmap.entrySet())
		{
			Integer key=ite.getKey();
    		if(key>max)
				max=ite.getKey();
		}
		return max;
	}
}

public class GraphImplementation {

	public static void main(String args[])
	{

		Graph g = new Graph();

		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 6);
		g.addEdge(2, 6);
		g.BFS(3);
		System.out.println();
		g.DFS(0);

	}
}

