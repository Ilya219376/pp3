
/*
 * 23.	The speed of vehicles on a highway in Poland must be between 40 and 140 km/h. 
 * Write a program that checks whether the vehicle speed saved in a variable is correct. 
 * 
 * Sample result:
 * Vehicle speed: 158
 * Speed is valid: False
 * 
 */
public class Speed {
    
public static void main (String [] args){
    int speed = 150;
    String isOk = (speed > 40 && speed < 140) ? "True" : "False"; 
    System.out.println("Speed is valid: "+ isOk);
}

}
