package numberprogram;
import java.util.*;
public class SecondLargest {
				public static void main(String[] args) {
					Scanner s=new Scanner(System.in);
					int a=s.nextInt();
					int b=s.nextInt();
					int c=s.nextInt();
					if(a>b&&a>c) {
						if(b>c) {
							System.out.println(b+" "+"b is second Largest" );
						}else {
							System.out.println(c+" "+"c is second Largest");
						}
					}else if(b>a&&b>c){
						if(a>c) {
							System.out.println(a+" "+"a is second Largest");
						}else {
							System.out.println(c+" "+"c is the second Largest'");
						}
					}else {
						if(a>b) {
							System.out.println(a+" "+"a is the second largest");
						}else {
							System.out.println(b+" "+"b is the second Largest");
						}
					}
				}

				
					
				
}
