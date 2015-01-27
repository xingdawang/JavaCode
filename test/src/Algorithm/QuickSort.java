package Algorithm;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		quickSort(a, 0, n -1);
		for(int i = 0; i< n;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	private static void quickSort(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		if(left < right) {
			int first = left;
			int last = right;
			int key = a[left];
			while (first < last) {
				while (first < last && a[last] > key)
					last --;
				a[first] = a[last];
				while (first < last && a[first] < key)
					first ++;
				a[last] = a[first];
			}
			a[first] = key;
			quickSort(a, left, first - 1);
			quickSort(a, first + 1, right);
		}
	}
}
