import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scanner.nextInt();
        for(int j=0;j<size-1;j++){
            for(int k=0;k<size-j-1;k++){
                if(arr[k] > arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }

    }
}
