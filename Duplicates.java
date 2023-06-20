package numberprogram;

public class Duplicates {
public static void main(String[] args) {
	int a[]= {23,45,5,66,45,23};
	int count=0;
	for(int i=0;i<a.length;i++) {
		count=0;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]&&a[j]!=-1) {
				count++;
			a[j]=-1;
			}
		}
if(count>0)
	System.out.println(a[i]);
	}
}
}
