

package learning.javaprojekat;

/**
 *
 * @author pavle
 */
public class MarsApplication {

    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        MarsRobot oportunity = new MarsRobot();
        System.out.println("SPIRIT: ");
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        
     
        spirit.showAttributes();
        
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temperature = -90;
        
        spirit.showAttributes();
        
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
        System.out.println("-------------------");

        System.out.println("OPORTUNITY");
        oportunity.speed = 4;
        oportunity.status = "exploring";
        oportunity.temperature = -10;
        
        oportunity.showAttributes();
        
        System.out.println("Increasing speed to 6.");
        oportunity.speed = 6;
        
        oportunity.showAttributes();
        System.out.println("Changing temperature to -50");
         
        oportunity.temperature = -50;
        oportunity.showAttributes();
        System.out.println("Checking the temperature");
       
        oportunity.checkTemperature();
        oportunity.showAttributes();
                
        System.out.println("--------------------");
        


    }
}
