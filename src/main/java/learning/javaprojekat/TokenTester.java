package learning.javaprojekat;

import java.util.StringTokenizer;

/**
 *
 * @author pavle
 */
public class TokenTester {
    
    public static void main(String[] args) {
        
        StringTokenizer st1, st2;
        
        String quote1 = "TWTR 37.14 7.28";
        System.out.println("Podela stringa " + quote1 + " na tokene: \n");
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());
        System.out.println("--------------------------");
        
        
        String quote2 = "RHT@185.98@80";
        st2 = new StringTokenizer(quote2, "@");
        System.out.println("Podela stringa " + quote2 + " na tokene: \n");
        System.out.println("Token 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());
        
        System.out.println("--------------------------");

    }
    
    
    
    
    
    
}
