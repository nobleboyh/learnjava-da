package datastructures.selfdefined;

import java.util.ArrayList;

public class Graph {
    private final int[][] matrix;
    ArrayList<Node> nodes;

    public Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void print() {
        System.out.print("  ");
        for(Node node : nodes) {
            System.out.print(node.data
                    + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void depthSearchFirst(int src){
        boolean[] visited = new boolean[matrix[src].length];
        depthSearch(src, visited);
    }

    private void depthSearch(int src, boolean[] visited) {
        if (visited[src]) return;
        else {
            visited[src] = true;
            System.out.println("Visit " + nodes.get(src).data);
        }

        for(int i = 0; i < visited.length; i++){
            if (matrix[src][i] == 1){
                depthSearch(i, visited);
            }
        }
    }
}
