import java.util.*;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Calling the method to input elements
        inputArr(arr, size, sc);
        dispArr(arr);

        sc.close();
    }

    // Method to input elements into the array
    public static void inputArr(int[] arr, int size, Scanner sc) {
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1)); // Displaying the 1-based index
            switch (i + 1) {
                case 1:
                    System.out.print("st element: ");
                    break;
                case 2:
                    System.out.print("nd element: ");
                    break;
                case 3:
                    System.out.print("rd element: ");
                    break;
                default:
                    System.out.print("th element: ");
            }
            arr[i] = sc.nextInt();
        }
    }
    public static void dispArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(", ");
            }
        }
    }
}
