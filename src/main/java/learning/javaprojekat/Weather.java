package learning.javaprojekat;

/**
 *
 * @author pavle
 */
public class Weather {
    
    
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ... ");
        
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " degrees Celsius\n");
        
        float cel = 33;
        System.out.println(cel + " degrees Celsius is ... ");
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " degrees Fahrenheit");

        
        
        
        
//        int x, y, z;
//        x = 42;
//        
//        y = x++;
//        z = ++x;
//        
//        System.out.println("X = " + x); //44
//        System.out.println("Y = " + y); // 42
//        System.out.println("Z = " + z); // 44
//        
//        
    }

    
}
