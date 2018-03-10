
import java.util.HashSet;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myrch
 */
public class FarthestPair{
    public static void main(String[] args) {
        PointTwoD p1 = new PointTwoD(10,3);
        PointTwoD p2 = new PointTwoD(10,-2);
        PointTwoD p3 = new PointTwoD(-20,3);
        PointTwoD p4 = new PointTwoD(-3,-2);
        PointTwoD p5 = new PointTwoD(1,4);
        PointTwoD p6 = new PointTwoD(4,-3);

        HashSet<PointTwoD> set = new HashSet<>();
        set.add(p6);
        set.add(p5);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        
        HashSet<PointTwoD> p=calcolaMinMax(set);
        
        double distance = findDistance(p);
        System.out.println(distance);
        
        double distance1 = findDistance(set);
        System.out.println(distance1);
        
    }
    
    static HashSet<PointTwoD> calcolaMinMax(HashSet<PointTwoD> s){
        HashSet<PointTwoD> pp = new HashSet<>();
        PointTwoD maxX = new PointTwoD(Integer.MIN_VALUE,0);
        PointTwoD maxY = new PointTwoD(0,Integer.MIN_VALUE);
        PointTwoD minX = new PointTwoD(Integer.MAX_VALUE,0);
        PointTwoD minY = new PointTwoD(0,Integer.MAX_VALUE);
        
        Iterator<PointTwoD> i  = s.iterator();
        while (i.hasNext()){
            PointTwoD p = i.next();
            
            if (p.getX() > maxX.getX()){
                maxX = p;
            }
            if (p.getY() > maxY.getY()){
                maxY = p;
            }
            if (p.getX() < minX.getX()){
                minX = p;
            }
            if (p.getY() < minY.getY()){
                minY = p;
            }
        }
        System.out.println("max X "+maxX.toString());
        System.out.println("max Y "+maxY.toString());
        System.out.println("min X "+minX.toString());
        System.out.println("min Y "+minY.toString());
        
        pp.add(maxX);
        pp.add(maxY);
        pp.add(minX);
        pp.add(minY);
        return pp;
        
    }
    static double findDistance(HashSet<PointTwoD> pp){
        double distance = 0;
        
        Iterator<PointTwoD> p = pp.iterator();
        
        while (p.hasNext()){
            PointTwoD p1 = p.next();
            Iterator<PointTwoD> pint = pp.iterator();
            
            while(pint.hasNext()){
                PointTwoD p2 = pint.next();
                distance = Math.max(distance, Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2) ));
            }
        }   
        return distance;
    }
}