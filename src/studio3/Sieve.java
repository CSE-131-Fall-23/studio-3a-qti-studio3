package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Finding prime numbers up to what number? _______");
		int n = in.nextInt();

		boolean[] sieve = new boolean[n];

		for (int l = 0; l < (sieve.length); l++) {
			sieve[l] = true;

			for(int i = 2; i < Math.sqrt(sieve.length); i++) {
				if (sieve[l] = true) {

					for (int j = i*i; j < sieve.length; j+=i) {
						sieve[j] = false;
					}
				}
			}
		}


		for (int num = 2; num < sieve.length; num++) {
			if (sieve[num] == true) {
				System.out.println(num);
			}
		}








	}

}
