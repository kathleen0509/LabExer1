
package labexer1a;
public class LabExer1A {

    public static void main(String[] args) {
        int faveNumber = 5;
        // We declared an int data type and we named it as faveNumber, we used 5 as the value.
        String faveCartCar = "Mr. Bean";
        //We declared a String data type, and we named it as faveCartCar, we used Mr Bean as the value.
        char mi = 'L';
        //We declared a char data type, and we used L as a value.
        char[] nickNameArray = {'K', 'a', 't', 'y'};
        //We declares a char array named nickNameArray, we used multiple letters such as K, a, t, and y as the value
        
        // Print section
        System.out.println(faveNumber + " is my favorite number.");
        /*faveNumber variable is called inside the print statement
        and we used plus(+) to add it to the inputted string to get the output, which is
        
        5 is my favorite number.
        */
        
        System.out.println("I love " + faveCartCar + "!");
        /*faveCartCar variable is called inside the print statement
        ans used a plus(+) to add it to the inputted string to get the output, which is
        
        I love Mr. Bean!
        */
        
        System.out.println("My name is Kathleen Joyce " + mi + ". Hontiveros.");
        /*mi variable is called inside the print statement
        and used plus(+) to add it to the inputted string to get the output, which is
        
        My name is Kathleenn Joyce L. Hontiveros.
        */
        
        System.out.println("You can call me " + nickNameArray[0] + nickNameArray[1] + nickNameArray[2] + nickNameArray[3] + nickNameArray[1] + "." );
        /*Each index from nickNameArray variable was called  and we put specific number to print out
        
        You can call me Katya.
        */
    
        
    }
    
}
