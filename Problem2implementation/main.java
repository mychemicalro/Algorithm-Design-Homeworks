
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myrch
 */
public class main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Set<Edge> edges = new HashSet<>();
        
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");
        Vertex I = new Vertex("I");
        Vertex J = new Vertex("J");
        Vertex K = new Vertex("K");
        
        Edge ac = new Edge (A,C);
        Edge cb = new Edge (C,B);
        Edge cd = new Edge (C,D);
        Edge de = new Edge (D,E);
        Edge ef = new Edge (E,F);
        Edge fg = new Edge (F,G);
        Edge gh = new Edge (G,H);
        Edge hi = new Edge (H,I);
        Edge gj = new Edge (G,J);
        Edge jk = new Edge (J,K);
        
        A.setLeaf(true);
        B.setLeaf(true);
        I.setLeaf(true);
        K.setLeaf(true);
        
        
        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        graph.addVertex(F);
        graph.addVertex(G);
        graph.addVertex(H);
        graph.addVertex(I);
        graph.addVertex(J);
        graph.addVertex(K);
        
        graph.addEdge(ac);
        graph.addEdge(cb);
        graph.addEdge(cd);
        graph.addEdge(de);
        graph.addEdge(ef);
        graph.addEdge(fg);
        graph.addEdge(gh);
        graph.addEdge(hi);
        graph.addEdge(gj);
        graph.addEdge(jk);
        
        edges.add(ac);
        edges.add(cb);
        edges.add(cd);
        edges.add(de);
        edges.add(ef);
        edges.add(fg);
        edges.add(gh);
        edges.add(hi);
        edges.add(gj);
        edges.add(jk);
        
        System.out.print("Graph1 rooted in D,");
        GraphDivision.removeHub(graph, D);
        GraphDivision.resetExplorations(graph, D);
        Vertex v0 = GraphDivision.returnHub(graph, D);
        System.out.println("other method result: "+v0.getLabel());
        GraphDivision.resetExplorations(graph, D);
        
        System.out.print("Graph1 rooted in J,");
        GraphDivision.removeHub(graph, J);
        GraphDivision.resetExplorations(graph, J);
        Vertex v1 = GraphDivision.returnHub(graph, J);
        System.out.println("other method result: "+v1.getLabel());
        
        /////////////////////////////////////////////////////////////
        
        Graph graph2 = new Graph();
        
        Vertex A2 = new Vertex("A");
        Vertex B2 = new Vertex("B");
        Vertex C2 = new Vertex("C");
        Vertex D2 = new Vertex("D");
        Vertex E2 = new Vertex("E");
        Vertex F2 = new Vertex("F");
        Vertex G2 = new Vertex("G");
        Vertex H2 = new Vertex("H");
        Vertex I2 = new Vertex("I");
        Vertex J2 = new Vertex("J");
        Vertex K2 = new Vertex("K");
        Vertex L2 = new Vertex("L");
        Vertex M2 = new Vertex("M");
        
        Edge ab2 = new Edge (A2,B2);
        Edge bc2 = new Edge (B2,C2);
        Edge cd2 = new Edge (C2,D2);
        Edge de2 = new Edge (D2,E2);
        Edge ef2 = new Edge (E2,F2);
        Edge fg2 = new Edge (F2,G2);
        Edge gh2 = new Edge (G2,H2);
        Edge hi2 = new Edge (H2,I2);
        Edge ij2 = new Edge (I2,J2);
        Edge jk2 = new Edge (J2,K2);
        Edge kl2 = new Edge (K2, L2);
        Edge lm2 = new Edge (L2, M2);
        
        M2.setLeaf(true);
        
        graph2.addVertex(A2);
        graph2.addVertex(B2);
        graph2.addVertex(C2);
        graph2.addVertex(D2);
        graph2.addVertex(E2);
        graph2.addVertex(F2);
        graph2.addVertex(G2);
        graph2.addVertex(H2);
        graph2.addVertex(I2);
        graph2.addVertex(J2);
        graph2.addVertex(K2);
        graph2.addVertex(L2);
        graph2.addVertex(M2);
        
        graph2.addEdge(ab2);
        graph2.addEdge(bc2);
        graph2.addEdge(cd2);
        graph2.addEdge(de2);
        graph2.addEdge(ef2);
        graph2.addEdge(fg2);
        graph2.addEdge(gh2);
        graph2.addEdge(hi2);
        graph2.addEdge(ij2);
        graph2.addEdge(jk2);
        graph2.addEdge(kl2);
        graph2.addEdge(lm2);
        
       
        
        System.out.print("Graph2 rooted in A2,");
        GraphDivision.removeHub(graph2, A2);
        GraphDivision.resetExplorations(graph2, A2);
        Vertex v2 = GraphDivision.returnHub(graph2, A2);
        System.out.println("other method result: "+v2.getLabel());
        
        
        
        Graph graph3 = new Graph();
        
        Vertex A3 = new Vertex("A");
        Vertex B3 = new Vertex("B");
        Vertex C3 = new Vertex("C");
        Vertex D3 = new Vertex("D");
        Vertex E3 = new Vertex("E");
        Vertex F3 = new Vertex("F");
        Vertex G3 = new Vertex("G");
        Vertex H3 = new Vertex("H");
        Vertex I3 = new Vertex("I");
        Vertex J3 = new Vertex("J");
        Vertex K3 = new Vertex("K");
        
        Edge ab3 = new Edge (A3,B3);
        Edge ac3 = new Edge (A3,C3);
        Edge cd3 = new Edge (C3,D3);
        Edge de3 = new Edge (D3,E3);
        Edge cf3 = new Edge (C3,F3);
        Edge fg3 = new Edge (F3,G3);
        Edge fh3 = new Edge (F3,H3);
        Edge gi3 = new Edge (G3,I3);
        Edge ij3 = new Edge (I3,J3);
        Edge hk3 = new Edge (H3,K3);
        
        graph3.addVertex(A3);
        graph3.addVertex(B3);
        graph3.addVertex(C3);
        graph3.addVertex(D3);
        graph3.addVertex(E3);
        graph3.addVertex(F3);
        graph3.addVertex(G3);
        graph3.addVertex(H3);
        graph3.addVertex(I3);
        graph3.addVertex(J3);
        graph3.addVertex(K3);

        
        graph3.addEdge(ab3);
        graph3.addEdge(ac3);
        graph3.addEdge(cd3);
        graph3.addEdge(de3);
        graph3.addEdge(cf3);
        graph3.addEdge(fg3);
        graph3.addEdge(fh3);
        graph3.addEdge(gi3);
        graph3.addEdge(ij3);
        graph3.addEdge(hk3);
        
        B3.setLeaf(true);
        E3.setLeaf(true);
        J3.setLeaf(true);
        K3.setLeaf(true);
        
        System.out.print("Graph3 rooted in A3,");
        GraphDivision.removeHub(graph3, A3);
        GraphDivision.resetExplorations(graph3, A3);
        Vertex v3= GraphDivision.returnHub(graph3, A3);
        System.out.println("other method result: "+v3.getLabel());
    }
}
