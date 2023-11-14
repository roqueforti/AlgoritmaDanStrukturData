import java.util.LinkedList;

public class Graph<T> {
    private int vertex;
    private LinkedList<Integer>[] list;

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    public void degree(int source) {
        boolean isUndirected = graphType();

        if (isUndirected) {
            System.out.println("Degree of vertex " + source + ": " + list[source].size());
        } else {
            int inDegree = 0;
            int outDegree = list[source].size();

            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) {
                        inDegree++;
                    }
                }
            }

            int degree = inDegree + outDegree;

            System.out.println("Indegree from vertex " + source + ": " + inDegree);
            System.out.println("Outdegree from vertex " + source + ": " + outDegree);
            System.out.println("Degree of vertex " + source + ": " + degree);
        }
    }

    public boolean graphType() {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                int destination = list[i].get(j);
                if (!list[destination].contains(i)) {
                    return true; // Undirected graph
                }
            }
        }
        return false; // Directed graph
    }

    public void removeEdge(int source, int destination) throws Exception {
    if (source >= 0 && source < vertex && destination >= 0 && destination < vertex) {
        list[source].removeFirstOccurrence(destination);
        if (!graphType()) {
            // For undirected graph, also remove the back edge
            list[destination].removeFirstOccurrence(source);
        }
        System.out.println("Edge (" + source + ", " + destination + ") removed successfully");
    } else {
        System.out.println("Invalid source or destination vertex");
    }
}

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph cleared successfully");
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].isEmpty()) {
                System.out.print("Vertex " + i + " connected with: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
    }
}
