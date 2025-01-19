public class fibonacci{
    public static void main(String[] args) {
        int num = 5;
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fib(a,b,num);
    }
    public static void fib(int a, int b, int num){
        if(num == 0){
            return;
        }
        int c = a + b;
        System.err.print(c+" ");
        fib(b, c, num-1);
    }
       
}