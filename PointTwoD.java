/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myrch
 */
public class PointTwoD {
    private int x;
    private int y;
    
    public PointTwoD(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    @Override
    public String toString(){
        return "*** X="+this.x+" y="+this.y+"***";
    }
}
