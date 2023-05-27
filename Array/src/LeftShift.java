import java.util.Scanner;

public class LeftShift {
	
public static void main(String[] args) {
	int shift;
	int arr[]= {1,2,3,4,5,6};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of shifts :");
	shift=sc.nextInt();
	System.out.println("The Original array:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	for(int i=0;i<shift;i++) {
		int j,first;
		first=arr[0];
		
		for(j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
			
		}
		arr[j]=first;
	}
	
	System.out.println();
	System.out.println("Array after shifting");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
