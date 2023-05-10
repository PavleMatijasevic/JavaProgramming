package learning.javaprojekat;

import java.awt.Point;

/**
 *
 * @author pavle
 */
public class PointSetter {
 
    
    public static void main(String[] args) {
        
        Point pt = new Point(5,7);
        
        System.out.println("Startne kordinate tacke su: ");
        System.out.println("X: " + pt.x);
        System.out.println("Y: "+ pt.y);
        
        
        System.out.println("Nove kordinate su: (4, 9)");
        pt.x = 4;
        pt.y = 9;
        
        System.out.println("X: " + pt.x);
        System.out.println("Y: " + pt.y);
        
        
        
        
    }
    
    
    
    
    
}
