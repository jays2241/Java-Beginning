import java.util.*;
public class recursion_factorial {
    public static void main(String args[]){
        System.out.println("Enter no");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int fact = factorial(num);
        System.out.println(fact);
        s.close();
    }

    public static int factorial(int x){
        if(x == 0){
           return 1;
        }
        System.out.print(x+" ");
        if(x != 1){
            System.out.print("X ");
        }else
        System.out.print("= ");
        return x *= factorial(x-1);        
    }
}
