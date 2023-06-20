package numberprogram;

import java.util.Scanner;

public class Sumofnum {
public static void main(String[] args) {
	int given=new Scanner(System.in).nextInt();
	int last=given%10;
	int sum=0;
	while(given>9) {
		given/=10;
		sum=given+last;
		
		
	}
	System.out.println(sum);
}
}
