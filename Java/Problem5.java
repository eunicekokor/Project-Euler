import java.util.Scanner;

public class Problem5{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int max= sc.nextInt();
        
        System.out.println(getmaxDiv(max));
    }
    
    public static int getmaxDiv(int number) {
        int j = number;
        while (number>0) {
            for (int i = 1; i < (number+1); i++) {
                int check = j%i;
                if (check != 0){
                    j++;
                    i = 1;
                }
            }
            number = 0;
        }
        
        return j;
    }
}