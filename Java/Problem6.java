//I feel like the design of my code could be tremendously improved
public class Problem6{

     public static void main(String []args){
        int numnat = 100;
        int sum = 0;
        int square = 0;
        int difference = 0;
        
        for (int i = 1; i<numnat + 1; i++) {
            sum += i*i;
        }
        System.out.println("the sum of squares is: " + sum);
        
        for (int j = 1; j<numnat+1; j++){
            square += j;
        }
        System.out.println("the sum of nat nums is: " + square);
        
        square = square * square;
        System.out.println("the square of the sum of nat nums is: " + square);
        
        difference = square - sum;
        System.out.println("the difference is: " + difference);
     }
}
