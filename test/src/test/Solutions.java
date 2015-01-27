package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solutions {
	static BufferedReader in = new BufferedReader(new InputStreamReader(
			System.in));
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		int n,k;
		n =  Integer.parseInt(in.readLine());
		k = Integer.parseInt(in.readLine());
		int[] number = new int[n];
		for(int i=0; i < n; i++) {
			int temp = Integer.parseInt(in.readLine());
			number[i] = (temp);
		}
		Arrays.sort(number);
	    int unfairness = Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE, max = 0;

        for (int i = 0; i < (n - k); i++) {
               min = number[i];
               max = number[k + i - 1];

               if ((max - min) < unfairness) {
                     unfairness = max - min;
               }
        }
        System.out.println(unfairness);
	}
}
