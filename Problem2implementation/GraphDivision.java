
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myrch
 */
public class GraphDivision {
    public static List<Integer> vertexSubtree;
    public static List<Vertex> vertexList;
    
    public static Vertex removeHub (Graph graph, Vertex root){
        Vertex hub;
        vertexList = new LinkedList<>();
        vertexSubtree = new LinkedList<>();
        
        PairResult result = countNodes(graph, root, 0);

        hub = findVertex(result.getChildren());
        System.out.println("Vertex to be removed: "+ hub.getLabel());
        
        
        return hub;
    }
    
    public static PairResult countNodes (Graph g, Vertex root, int i){
        
        
        if (root.getIfLeaf()){
            vertexList.add(root);
            vertexSubtree.add(0);
            
            return (new PairResult(1, i+1));
        }
        
        int nodes = 0;
        
        Iterator<Edge> it =g.getEdges(root).iterator();
        while (it.hasNext()){
            Edge e = it.next();
            Vertex adj;
            if (e.seeIfExplored().equals("UNEXPLORED")){
               e.explore(); 
               adj = (e.getV1().equals(root)) ? e.getV2() : e.getV1();
               PairResult res = countNodes(g, adj, i);
               nodes +=res.getChildren();
               i = res.getPosition();
               
            }
        }
        vertexList.add(root);
        vertexSubtree.add(nodes);
        
        return new PairResult(nodes+1, i+1);
    }
    
    public static boolean UnexploredEdges ( Graph graph, Vertex v){
        
        
        Iterator<Edge> it =graph.getEdges(v).iterator();
        while (it.hasNext()){
            if (it.next().seeIfExplored().equals("UNEXPLORED")) return true;    
            
        }
        return false;
        
    }
    
    public static Vertex findVertex (int n){
        int half = n/2;
        for (int i=0; i<n; i++){
            if (vertexSubtree.get(i) >= half) return vertexList.get(i);
        }
        return null;
    }
    
    public static void resetExplorations(Graph g, Vertex root){
        Iterator<Edge> it = g.getEdges().iterator();
        while(it.hasNext()){
            it.next().unexplore();
        }
    }
    
    public static Vertex returnHub(Graph g, Vertex root){
        
        
        countDescendents(g, root, 0);
        int vertices = root.getDescendents() + 1;
        resetExplorations(g, root);
        resetVerticesExplorations(g);
        return findHub(g, root, vertices);
    }
    public static void resetVerticesExplorations(Graph g){
                Iterator<Vertex> it = g.getVertices().iterator();
        while(it.hasNext()){
            it.next().unexplore();
        }
    }
    
    
    public static int countDescendents(Graph g, Vertex root, int d){
        
        if (root.getIfLeaf()){
            root.setDescendents(0);
            return 1;
        }
        int children = 0;
        
        Iterator<Edge> it =g.getEdges(root).iterator();
        
        while(it.hasNext()){
            Edge e = it.next();
            Vertex adj;
            if (e.seeIfExplored().equals("UNEXPLORED")){
               e.explore(); 
               adj = (e.getV1().equals(root)) ? e.getV2() : e.getV1();
               children += countDescendents(g, adj, d);
               
            }
        }
        root.setDescendents(children);
        return children+1; 
    }
    public static Vertex findHub(Graph g, Vertex root, int v){
        if (root.getDescendents() == v/2){
            return root;
        }
        root.visit();
        Iterator<Edge> it =g.getEdges(root).iterator();
        
        while(it.hasNext()){
            Edge e = it.next();
            Vertex adj;
            
            if (e.seeIfExplored().equals("UNEXPLORED")){
                e.explore(); 
                adj = (e.getV1().equals(root)) ? e.getV2() : e.getV1();
                if (adj.getDescendents() >= v/2 && adj.visited() == false){
                    return findHub(g, adj, v);
                }
            }
        }
        return root;
        
        
    }
    
}
