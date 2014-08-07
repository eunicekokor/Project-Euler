public class Problem4{

    public static void main(String []args){
    int lower = 100;
    int upper = 1000;
    System.out.println(getMaxPal(lower, upper));
    }
    
    public static int getMaxPal(int num1, int num2){
    int x = 0;
    int pal = 0;
    int count = 0;
    //x is continuously defined as the product of i&j
    //pal is the greatest palindrome
    
        for (int i = num1; i < num2; i++){
            for (int j = num1; j < num2; j++){
                x = i*j;
                
                if (isPal(x,getRev(x))){
                    //trying to count efficiency
                    count++;
                    if (x > pal) {
                        pal = x; //stores value of largest palindrome
                    }
                }
            }
        }
    //System.out.println(count);
    return pal;
    }
    
    //reversing the number
    public static int getRev(int number){
        int num = number;
        int rev = 0;
        int temp = 0;
            while (num > 0){
                temp = (num)%10;
                rev = rev * 10 + temp;
                num = num/10;
            }
    return rev;
    }
    
    public static boolean isPal(int num1, int num2){
        if (num1 == num2){
            return true;
        }
        else return false;
    }
}