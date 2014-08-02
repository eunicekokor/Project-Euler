import java.util.Scanner;

public class Problem6{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int numnat = sc.nextInt();
        
        System.out.println(getSumofSquares(numnat));
        System.out.println(getSquareofSum(numnat));
        System.out.println(getDifference(numnat));
     }

    public static int getSumofSquares(int numbers) {
        int sum = 0;
        for (int i = 1; i<numbers + 1; i++) {
            sum += i*i;
        }
        return sum;

    }

    public static int getSum(int numbers) {
        int sum = 0;
        for (int j = 1; j<numbers+1; j++){
            sum += j;
        }
        return sum;
    }

    public static int getSquareofSum(int number) {
        int sum = getSum(number);
        int square = sum * sum;
        return square;
    }

    public static int getDifference(int number) {
        int difference = (getSquareofSum(number) - getSumofSquares(number));
        return difference;
    }

}