import java.util.Scanner;
class Paramainemployee{
	public static void main(String args[]){
		int id;
		String name;
		double basic;
		
		Paraemployee em=new Paraemployee();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		id=scan.nextInt();
		
		System.out.print("Enter Name : ");
		name=scan.next();
		
		System.out.print("Enter Basic salary : ");
		basic=scan.nextDouble();
		
		System.out.println("************************");
		
		em.setemployee(id,name,basic);
		em.calcbonus();
		em.display();
	}
}
		
		
		