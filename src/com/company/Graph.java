package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Graph {
    private List<Node> graph = new ArrayList<Node>();

    public void AddNode(int value, int[] connections) {
        graph.add(new Node(value, connections));
        int nodeIndex = graph.size() - 1;

        for (int connection : connections) {
            graph.get(connection).nodeList.add(nodeIndex);
        }
    }

    public void DepthFirstTraversal(int value, int index) {
        List<Integer> nodeList = graph.get(index).nodeList;

        if (graph.get(index).value == value) {
            System.out.println(index);
        }

        for (int node : nodeList) {
            if (!graph.get(node).visited) {
                graph.get(node).visited = true;
                DepthFirstTraversal(value, node);
            }
        }

        ClearVisited();
    }

    private void ClearVisited() {
        for (Node node : graph) {
            node.visited = false;
        }
    }
}

class Node {
    public List<Integer> nodeList = new ArrayList<>();
    public int value;
    public boolean visited = false;

    Node(int v, int[] list) {
        value = v;
        for (int i = 0; i < list.length; i++) {
            nodeList
        }
    }
}
