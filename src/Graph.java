public class Graph {
    private int vertices;
    private int[][] adjacency_mat;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjacency_mat = new int[vertices][vertices];
    }

    public void add_edges(int from, int to){
        this.adjacency_mat[from][to] = 1;
        this.adjacency_mat[to][from] = 1;
    }

    public void display_matrix(){

        // outer loop to iterate through each row
        for (int i = 0; i< adjacency_mat.length; i++){

            // inner loop to iterate through each column under each row
            for (int j=0; j<adjacency_mat[i].length; j++){
                System.out.print( adjacency_mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Implement the functionality to check the connectedness
    public void connectedness(int from, int to) {
        if (adjacency_mat[from][to] == 1) {
            System.out.println("Vertex " + from + " is connected to vertex " + to);
        } else {
            System.out.println("Vertex " + from + " is not connected to vertex " + to);
        }
    }

    // Implement the functionality to list the adjacent nodes of a given node
    public void adjacent_nodes(int vertex){
        System.out.print("Adjacent nodes of vertex " + vertex + ": ");

        for (int i = 0; i < vertices; i++) {
            if (adjacency_mat[vertex][i] == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}