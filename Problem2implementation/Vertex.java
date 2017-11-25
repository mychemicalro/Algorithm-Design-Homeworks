
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
public class Vertex {
    private String uniqueLabel;
    private boolean isLeaf;
    private int descendents;
    private boolean visited;
    
    
    public Vertex (String uniqueLabel) {
        super ();
        this.uniqueLabel = uniqueLabel;
        this.isLeaf = false;
        descendents = 0;
        this.visited = false;
    }
    
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;
        
        Vertex v = (Vertex) o;
        return (v.uniqueLabel == null ? this.uniqueLabel == null : v.uniqueLabel.equals(this.uniqueLabel));
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.uniqueLabel);
        return hash;
    }
    public String getLabel(){
        return this.uniqueLabel;
    }
    public boolean getIfLeaf(){
        return this.isLeaf;
    }
    public void setLeaf(boolean b){
        this.isLeaf = b;
    }
    public void setDescendents(int d){
        this.descendents = d;
    }
    public int getDescendents(){
        return this.descendents;
    }
    public void visit(){
        this.visited = true;
    }
    public boolean visited(){
        return this.visited;
    }
    public void unexplore(){
        this.visited = false;
    }
   
}
