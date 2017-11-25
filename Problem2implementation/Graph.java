
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myrch
 */
public class Graph {
    private Set<Vertex> vertices;
    private Set<Edge> edges;
    private Map<Vertex, Set<Edge>> adjList;
    
    public Graph(){
        vertices = new HashSet<>();
        edges = new HashSet<>();
        adjList = new HashMap<>();
    }
    public boolean addVertex (String label){
        return vertices.add(new Vertex(label));
    }
    public boolean addVertex (Vertex v){
        return vertices.add(v);
    }
    public boolean addVertices (Collection<Vertex> vert){
        return this.vertices.addAll(vertices);
    }
    public boolean removeVertex (Vertex v){
        return vertices.remove(v);
    }
    public boolean removeVertex (String label){
        return vertices.remove(new Vertex (label));
    }
    public boolean addEdge (Edge e){
        if (!edges.add(e)) return false;
        adjList.putIfAbsent(e.v1, new HashSet<>());
        adjList.putIfAbsent(e.v2, new HashSet<>());
        
        adjList.get(e.v1).add(e);
        adjList.get(e.v2).add(e);
        
        return true;
    }
    public boolean addEdge (String labelv1, String labelv2){
        return addEdge (new Edge(new Vertex(labelv1), new Vertex(labelv2)));
        
    }
    public boolean removeEdge (Edge e){
        if (!edges.remove(e)) return false;
        Set<Edge> edgesOfV1 = adjList.get(e.v1);
        Set<Edge> edgesOfV2 = adjList.get(e.v2);
        
        if (edgesOfV1 != null) edgesOfV1.remove(e);
        if (edgesOfV2 != null) edgesOfV2.remove(e);
        
        return true;
    }
    public boolean removeEdge (String v1label, String v2label){
        return removeEdge (new Edge (new Vertex(v1label), new Vertex(v2label)));
    }
    public Set<Vertex> getAdjVertices (Vertex v){
        return adjList.get(v).stream().map(e -> e.v1.equals(v) ? e.v2 : e.v1).collect(Collectors.toSet());
    }
    public Set<Vertex> getVertices (){
        return Collections.unmodifiableSet(vertices);
    }
    public Set<Edge> getEdges (){
        return Collections.unmodifiableSet(edges);
    }
    public Map<Vertex, Set<Edge>> getAdjList (){
        return Collections.unmodifiableMap(adjList);
    }
    public Set<Edge> getEdges (Vertex v){
        return Collections.unmodifiableSet(adjList.get(v));
    }

}
