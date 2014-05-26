public class Problem4{

     public static void main(String []args){

     int x = 0;
     int pal = 0;
    
      for (int i = 100; i < 1000; i++){
        for (int j = 100; j < 1000; j++){
            x = i*j;
            int num = x; //reverse number algo
            int rev = 0;
            int temp = 0;
            while (num > 0){
                temp = (num)%10;
                rev = rev * 10 + temp;
                num = num/10;
            }
            
            if (x == rev){ //for sure a palindrome
                if (x > pal) {
                    pal = x; //stores value of largest palindrome
                }
            }
        }    
    }
    System.out.println(pal);
    /*note, can create isPal method*/


     }
}
