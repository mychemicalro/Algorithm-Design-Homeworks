
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myrch
 */
public class Problem1 {
    public static void main(String[] args) {
        
        double [] A = new double [] {1, 2, 3.1, 0, 7, 8, 9, 0.01, 1000000, 1};
        System.out.println(maxProduct(A));
    }
    
    public static double maxProduct(double[] nums) {
        
    double[] max = new double[nums.length];
    max[0] = nums[0];
    double result = nums[0];
 
    for(int i=1; i<nums.length; i++){
        
        max[i]=Math.max(nums[i], max[i-1]*nums[i]);
        result = Math.max(result, max[i]);
    }
 
    return result;
}
    
}

