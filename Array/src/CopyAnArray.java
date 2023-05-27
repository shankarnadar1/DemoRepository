import java.util.Scanner;

public class CopyAnArray {
	int[] rollNo=new int[5];
    int[] copyRollNo=new int[rollNo.length];
    Scanner scan = new Scanner(System.in);
	 void input() {
		 System.out.println("Enter elements of an array: ");
	for(int i=0;i<rollNo.length;i++) {
		rollNo[i]=scan.nextInt();
	}
	}
	void display()
	{
		System.out.println("Displaying the OG array");
		for(int num:rollNo) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
	void toCopy() {
		for(int i=0;i<rollNo.length;i++) {
			copyRollNo[i]=rollNo[i];
		}
		System.out.println("To display copy array");
		for(int n:copyRollNo) {
			System.out.print(n+" ");
		}
		
	}
	public static void main(String[] args) {
		CopyAnArray ob= new CopyAnArray();
		ob.input();
		ob.display();
		ob.toCopy();
		
	}

}
