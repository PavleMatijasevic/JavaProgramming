
package learning.javaprojekat;

/**
 *
 * @author pavle
 */
public class Exercise_2 {
    
    public static void main(String[] args) {
        
        int startBalance = 14000;
        
        System.out.println("Start: " + startBalance);
        int afterOneYear = (int) (startBalance * 1.4);
        System.out.println("One year later\nAfter increasing of 40%: " + afterOneYear);
        
        int afterTwoYear = afterOneYear - 1500;
        System.out.println("Two year later\nAfter decreasing of 1500: " + afterTwoYear);
        
        int afterThreeYear = (int) (afterTwoYear * 1.12); 
        System.out.println("Three year later\nAfter increasing of 12%: " + afterThreeYear);
    }
    
   
    
}
