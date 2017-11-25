/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myrch
 */
public class PairResult {
    private final int children;
    private final int position;
    
    public PairResult(int a, int b){
        this.children = a;
        this.position = b;
    }
    public int getChildren(){
        return this.children;
    }
    public int getPosition(){
        return this.position;
    }
    
}
