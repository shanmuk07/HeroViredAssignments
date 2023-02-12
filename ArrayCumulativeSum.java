package pkg_09_02_23;
import java.util.Scanner;
public class ArrayCumulativeSum {
	public static void printCummulativeSum(int[] arr, int n) {
		int pref[] = new int[n];
		pref[0] = arr[0];
		for(int i = 1; i < n; i++) {
			pref[i] = arr[i] + pref[i-1];
		}
		for(int i: pref) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		printCummulativeSum(arr, n);
		sc.close();
	}

}
