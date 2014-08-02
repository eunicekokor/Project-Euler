import java.util.Scanner;

public class Problem7{

    public static void main(String []args){
        int count = 0;
        Scanner sc=new Scanner(System.in);
        int check = sc.nextInt();
        int i = 1;
        
        while (i > 0) {
            i++;
            if (isPrime(i)) {
                count++;
            }
            if (count == check){
                System.out.println("yay, this number is the 5th prime");
                System.out.println(i);
                i = 0;
            }
        }
    }

    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}