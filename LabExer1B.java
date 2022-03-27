
package labexer1b;
import java.util.*;

public class LabExer1B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int inputtedNumber = s.nextInt();
        
        System.out.println(inputtedNumber + " plus 10 is " + showNumberPlus10(inputtedNumber));
        System.out.println(inputtedNumber + " plus 100 is " + showNumberPlus100(inputtedNumber));
        System.out.println(inputtedNumber + " plus 1000 is " + showNumberPlus1000(inputtedNumber));
    }
    
    public static int showNumberPlus10(int x){
        int add10 = x + 10;
        return add10;
    }
    
    public static int showNumberPlus100(int x){
        int add100 = x + 100;
        return add100;
    }
    
    public static int showNumberPlus1000(int x){
        int add1000 = x + 1000;
        return add1000;
    }
    
}
