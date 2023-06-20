package numberprogram;
import java.util.*;
public class Strong {
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter the num");
				int given=s.nextInt();
				int last=0,fact=1,sum=0;
				int temp=given;
				while(given>0) {
					last=given%10;
					fact=1;
					for(int i=1;i<=last;i++) {
						fact*=i;
					}
					sum+=fact;
					given/=10;
				}
				if(sum==temp) {
					System.out.println(sum+" "+"strong");
				}else {
					System.out.println(sum+"not Strong");
				}
			}
}
