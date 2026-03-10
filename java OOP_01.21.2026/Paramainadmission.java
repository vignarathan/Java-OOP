import java.util.Scanner;
class Paramainadmission{
	public static void main(String args[]){
		int id;
		String name;
	Paraadmission ad=new Paraadmission();
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter your ID : ");
	id=scan.nextInt();
	
	System.out.print("Enter your name : ");
	name=scan.next();
	
	
	
	ad.setparaadmission(id,name);
	ad.getparaadmission();
	}
}
	