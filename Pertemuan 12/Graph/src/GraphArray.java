import java.util.Scanner;

public class GraphArray<T> {
    private final T[] vertices;
    private final int[][] twoDArray;

    public GraphArray(T[] vertices) {
        this.vertices = vertices;
        int size = vertices.length;
        twoDArray = new int[size + 1][size + 1];
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            twoDArray[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex unavailable");
        }
    }

    public int getEdge(int to, int from) {
        try {
            return twoDArray[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex unavailable");
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] vertices = { "Malang", "Surabaya", "Gresik", "Bandung" };
        int v = vertices.length;
        int count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray<String> graph;

        try {
            System.out.println("Input amount of edges: ");
            int e = sc.nextInt();

            graph = new GraphArray<>(vertices);

            System.out.println("Input edges: <to> <from> ");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }

            System.out.println("2D Array representation of the graph: ");
            System.out.print(" ");
            for (String vertex : vertices) {
                System.out.print(vertex + " ");
            }
            System.out.println();

            for (int i = 1; i <= v; i++) {
                System.out.print(vertices[i - 1] + " ");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error. Please check again\n" + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
