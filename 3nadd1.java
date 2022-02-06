import java.util.Scanner;


public class PlayAround {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a positive integer"); //I'll need to add another loop for if they put a non-positive integer. 
		int N = obj.nextInt();
		while (N > 1) {
			if (N % 2 == 0) {
				N = N / 2;
				System.out.println(N);
			}
			else {
				N = (3 * N) + 1;
				System.out.println(N);
			}
		}
	}
}
