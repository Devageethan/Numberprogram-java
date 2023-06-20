package numberprogram;

public class SumofDigit {
	public static void main(String[] args) {
		 
		
				int given=123;
				int temp=0,last;
				while(given>0) {
					temp+=given%10;
					given/=10;
				}
				System.out.println(temp);
					
				
	}
}
