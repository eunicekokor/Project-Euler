public class Problem2{

     public static void main(String []args){
        
        int first = 1;
        int second = 2;
        int p = 0;
        int max = 4000000;
        int sum = 2; //my code doesn't account for the initial even number in fib starting with 1 as the first and two as the second

        for (p = 0; p<max; p++) {
            p = first + second;
            first = second;
            second = p;
        
            if (p < generic_max && p%2 == 0) {
                sum += p;
                System.out.print(p + ", "); //to check if it's printing even fib numbers
            }
        }
        
        System.out.println("\n" + sum); //prints sum on new line
        
     }
}

