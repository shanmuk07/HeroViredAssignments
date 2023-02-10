import java.util.Arrays;
import java.util.Scanner;
public class ArrayUniqueNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		printUniqueElements(arr, n);
		sc.close();
	}
	
	public static void printUniqueElements(int[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			if(arr[i] != arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
		if(arr[n-1] != arr[n-2]) {
			System.out.print(arr[n-1]);
		}
	}

}
