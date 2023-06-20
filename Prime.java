package numberprogram;

public class Prime {
			public static void main(String[] args) {
				int num=11,count=0;
				for(int i=1;i<=num;i++) {
					if(num%i==0) {
						count++;
					}
					
				}
				if(count==2) {
					System.out.println(num+" "+"prime");
				}else {
					System.out.println(num+" "+"not prime");
				}
			}
}
