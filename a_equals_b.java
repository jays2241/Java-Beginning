import java.util.*;

public class a_equals_b {
    public static void main(String arg[])
    {   int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        if(a==b){
            System.out.println("a == b");
        }
        else{
            if(a>b){
                System.out.println("a > b");
            }
            else
            System.out.println("a < b");
        }
        sc.close();
    }
}
