public class Problem3{

    public static void main(String []args){
        
        long num = 600851475143L;
        int fac = 0;
        //literally after trying "my own" algorithm for finding the largest
        //prime factors (find factors then checking if they're prime)
        //took to long, I switched. I checked if the number was prime first
        //by getting to the smallest divisor, then incremented this until I 
        //got to the largest possible prime
        for (int i = 2; i< num; i++){
            if (num%i ==0){
                num = num/i;
            }
        }
        
        System.out.println(num);
    
    }
}

