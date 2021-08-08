import java.util.Scanner;
 
public class 백준10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int x = sc.nextInt();

		int st[] = new int[n];
        
		for (int i = 0; i < n; i++) {
			st[i] = sc.nextInt();
		}
 
		sc.close();
        
		for (int i = 0; i < n; i++) {
			if (st[i] < x) {
				System.out.print(st[i] + " ");
			}
		}

	}
}