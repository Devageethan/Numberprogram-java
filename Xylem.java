package numberprogram;
import java.util.*;
public class Xylem {
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				int num=s.nextInt();
				int meansum=0,last=num%10,temp=num;
				num/=10;
				while(num>9) {
					meansum+=num%10;
					num/=10;
				}
				int total=num+last;
				if(total==meansum) {
					System.out.println("number is xylem");
				}else {
					System.out.println("number is not xylem");
				}
			}
}
