import java.util.*;
public class Adult_or_not_adult {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are an Adult");
        }else{
            System.out.println("You are not an Adult");
        }
        sc.close();
    }
}
