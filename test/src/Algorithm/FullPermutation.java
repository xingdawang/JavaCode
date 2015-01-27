package Algorithm;

import java.util.Scanner;

public class FullPermutation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		permutation(a,0,a.length);
	}
	
	public static void permutation(int a[], int index, int size) {
		if(index == size) {
			for(int i = 0; i < size; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}
		else {
			for(int j = index; j < size; j++) {
				swap(a,index,j);
				permutation(a, index + 1, size);
				swap(a,index,j);
			}
		}
	}
	
	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
