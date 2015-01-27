package Algorithm;

import java.util.Scanner;

/**
 * Merge sort
 * 
 * @author Dandy Test case 10 9 4 7 1 3 8 6 5 2 10
 */

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		merge_sort(a, 0, n);
		//bottomUp_merge(a);

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void merge(int[] unsorted, int first, int mid, int last) {
		int i = first, j = mid;
		int k = 0;
		int[] array = new int[last-first];
		while (i < mid && j < last)
			array[k++] = unsorted[i] < unsorted[j] ? unsorted[i++] : unsorted[j++];
		while (i <  mid)
			array[k++] = unsorted[i++];
		while (j < last)
			array[k++] = unsorted[j++];
		k = 0;
		for (int v = first; v < last; v++) {
			unsorted[v] = array[k++];
		}
	}

	public static void merge_sort(int[] array, int first, int last) {
		if (first + 1 < last) {
			int mid = (first + last) / 2;
			merge_sort(array, first, mid);
			merge_sort(array, mid, last);
			merge(array, first, mid, last);
		}
	}

	public static void bottomUp_merge(int[] array) {
		int length = 1;
		int i;
		while(length < array.length) {
			for (i = 0; i + 2 * length < array.length; i += 2 * length)
				merge(array, i, i + length, i + 2 * length);
			if(i+length < array.length)
				merge(array, i, i+length, array.length);
			length *= 2;
		}
	}
}
