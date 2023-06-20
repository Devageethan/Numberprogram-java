package numberprogram;

import java.util.*;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		int count = 0, sum = 0, product = 1, last = 0, temp = num;
		while (num > 0) {
			num /= 10;
			count++;
		}
		num = temp;
		while (num > 0) {
			last = num % 10;
			product = 1;
			for (int i = 1; i <= count; i++) {
				product *= last;
			}
			sum += product;
			num /= 10;
		}
		String res = (temp == sum) ? "number is Armstrong" : "number is not Armstrong";
		System.out.println(res);
	}
}
