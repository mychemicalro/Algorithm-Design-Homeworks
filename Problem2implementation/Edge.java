
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myrch
 */
public class Edge {
    Vertex v1, v2;
    private String tag;
    
    public Edge (Vertex v1, Vertex v2){
        super();
        this.v1 = v1;
        this.v2 = v2;
        tag = "UNEXPLORED";
    }
        @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;
        
        Edge e = (Edge) o;
        return e.v1.equals(this.v1) && e.v2.equals(this.v2);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.v1);
        hash = 19 * hash + Objects.hashCode(this.v2);
        return hash;
    }
    @Override
    public String toString(){
        return "edge between "+v1.getLabel()+" and "+v2.getLabel();
    }
    public void explore (){
        this.tag = "EXPLORED";
    }
    public String seeIfExplored(){
        return this.tag;
    }
    public Vertex getV1 (){
        return this.v1;
    }
    public Vertex getV2 (){
        return this.v2;
    }
    public void unexplore(){
        this.tag = "UNEXPLORED";
    }
    
}
