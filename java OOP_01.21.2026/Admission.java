import java.util.Scanner;
class Admission{
	int id;
	String name;
	
	void setadmission(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the ID : ");
		this.id=scan.nextInt();
		System.out.print("Enter the name : ");
		this.name=scan.next();
		
	}
	void getadmission(){
		System.out.println("Student ID:"+this.id);
		System.out.println("Student Name:"+this.name);
	}
}
		