import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String star="*";
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (j=0; j<b; j++) {
			for (i=0; i<a; i++) {
				System.out.print(star);
				if (i == a-1){
					System.out.print('\n');
				}
			}
		}
    }
}