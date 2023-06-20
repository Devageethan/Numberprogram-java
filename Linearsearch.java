package numberprogram;
import java.util.*;
public class Linearsearch {
	static String res="not present";
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]= {65,66,44,11,98};
	System.out.println("enter the key element");
	int key=s.nextInt();
	
	System.out.println(linearsearch(a,key));
	}
public static String linearsearch(int a[],int key) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==key) {
			res="present";
		}
	}
		return res;
}
}
