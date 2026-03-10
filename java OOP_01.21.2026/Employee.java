import java.util.Scanner;
class Employee{
	int id;
	String name;
	double basic;
	double bonus;
	
	void calcbonus(){
		if(basic>=100000){
			this.bonus=basic*0.05;
		}else if(basic>=75000){
			this.bonus=basic*0.03;
		}else{
			this.bonus=0;
		}
	}
	void setemployee(){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the ID : ");
		this.id=scan.nextInt();
		
		System.out.print("Enter the name : ");
		this.name=scan.next();
		
		System.out.print("Enter Basic Salary: ");
		this.basic=scan.nextDouble();
		
		System.out.println("********************************************");
	}
	void display(){
		System.out.println("Employee ID: "+this.id);
		System.out.println("Employee Name: "+this.name);
		System.out.println("Basic Salary: "+this.basic);
		System.out.println("Your Bonus: "+this.bonus);
	}
}
		