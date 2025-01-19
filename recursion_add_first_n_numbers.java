import java.util.*;
public class recursion_add_first_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int a = sc.nextInt();
        int sum = sumN(a);
        System.out.println(sum);
        sc.close();
    }
    public static int sumN(int n){
        if (n == 0){
            return 0;
        }
        return n+= sumN(n-1);
    }
}
