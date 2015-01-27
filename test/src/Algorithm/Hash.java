package Algorithm;

public class Hash {
	public static void main(String[] args) {
		int n = 10;
		int[][] a = new int[10][10];
		print(a, 10);
	}
	
	static void print(int a[][], int size){
		for(int i = 0; i < size; i ++) {
				for(int j = 0; j < size; j ++)
						System.out.print(a[i][j]+ " ");
				System.out.println();
		}
	}
}
