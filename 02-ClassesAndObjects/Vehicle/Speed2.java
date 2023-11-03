/* 
 * 23.	The speed of vehicles on a highway in Poland must be between 40 and 140 km/h. 
 * Write a program that checks whether the vehicle speed saved in a variable is correct. 
 * 
 * Sample result:
 * Vehicle speed: 158
 * Speed is valid: False
 * 
 */

public class Speed2 {
        public static void main(String[] args) {
            int vehicleSpeed = 145; // Zmień na rzeczywistą prędkość do sprawdzenia
    
            boolean isSpeedValid = (vehicleSpeed >= 40 && vehicleSpeed <= 140);
    
            System.out.println("Vehicle speed: " + vehicleSpeed);
            System.out.println("Speed is valid: " + isSpeedValid);
        }
    }
    

