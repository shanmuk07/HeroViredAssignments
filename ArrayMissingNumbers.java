package pkg_09_02_23;
import java.util.Scanner;
public class ArrayMissingNumbers {
	public static void missingNumbers(int[] arr, int n) {
		int freq[] = new int[n];
		for(int num: arr) {
			freq[num - 1] = 1;
		}
		for(int i = 0; i < n; i++) {
			if(freq[i] == 0) {
				System.out.print(i+1 + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count  = arr[n-1];
		missingNumbers(arr, count);
		sc.close();
	}

}
