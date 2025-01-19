public class recursion_print_1_to_10{
    public static void main(String args[]){
        int a = 10;
        printNum(a);
    }
    public static void printNum(int a){
        if(a == 0){
            return;
        }
       
        printNum(a-1);
        System.out.println(a);
    }
}