import java.util.Scanner;  
public class BinarySearch {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];  
        System.out.println("Enter the elements in sorted order: ");
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        }
        System.out.print("Enter the value to search: ");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int position = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                position = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            }
            if(position != -1) {
                System.out.println("Value found at position: " + position);
            } else {
                System.out.println("Value not found.");
            }
            sc.close();
        }
}