import java.util.*;
import java.io.*;

public class Problem5{

    public static void main(String []args) throws IOException {
        List<String> integers = new ArrayList<String>();    
        Scanner sc = new Scanner(new File("input.txt"));
        
        while (sc.hasNext()) {
            integers.add(sc.next());
        }
        sc.close();
        
        String money = "";
        
        for (String s: integers){
            money += s;
        }
        
        for (int i = 0; i < 10; i++){
            if(Character.getNumericValue(money.charAt(i)) > 5) {
                System.out.println(money.charAt(i) + " is greater than 5!");
            }
            
            else {
                System.out.println(money.charAt(i) + " is 5 or less.");
            }
        }
        
        System.out.println("Value of first:" + String.valueOf(money.charAt(1)));
        
        System.out.print("we're done here");
        //System.out.print(money);
        
    }
    
}