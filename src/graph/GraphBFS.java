/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Scanner;

/**
 *
 * @author roaggarw
 */
public class GraphBFS {

    /**
     *
     * @param arg
     */
    public static void main(String[] arg) {
        int number_no_nodes, source;
        Scanner scanner = null;

        try {
            System.out.println("Enter the number of nodes in the graph");
            scanner = new Scanner(System.in);
            number_no_nodes = scanner.nextInt();

            int adjacency_matrix[][] = new int[number_no_nodes + 1][number_no_nodes + 1];
            System.out.println("Enter the adjacency matrix");
            for (int i = 1; i <= number_no_nodes; i++) {
                for (int j = 1; j <= number_no_nodes; j++) {
                    adjacency_matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter the source for the graph");
            source = scanner.nextInt();

            System.out.println("The BFS traversal of the graph is ");
//            BFS bfs = new BFS();
//            bfs.bfs(adjacency_matrix, source);

        } catch (Exception inputMismatch) {
            System.out.println("Wrong Input Format");
        }
        scanner.close();
    }

}
