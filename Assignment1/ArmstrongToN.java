package Assignment1;
import java.util.*;
public class ArmstrongToN {
	public static boolean IsArmstrong(int n) {
		int sum = 0;
		int z = n;
		/**/
		int digitCount = 0;

		for (int tempNumber = n; tempNumber != 0; tempNumber /= 10) {
			digitCount++;
		}

		while (n != 0) {
			int n1 = n % 10;
			sum += (Math.pow(n1, digitCount));
			n = n / 10;

		}
		if (z == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int N = obj.nextInt();
		for (int i = 1; i <= N; i++) {
			if (IsArmstrong(i)) {
				System.out.println(i);
			}
		}
		obj.close();
	}
}