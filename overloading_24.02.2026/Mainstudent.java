//Overloading
class Mainstudent{
	public static void main(String args[]){
		
		Student st1=new Student();
		st1.setstudent();
		st1.getstudent();
		
		Student st2=new Student();
		st2.setstudent(4007);
		st2.getstudent();
		
		Student st3=new Student();
		st3.setstudent("Vikki");
		st3.getstudent();
		
		Student st4=new Student();
		st4.setstudent(5005,"v.rathan");
		st4.getstudent();
		
		Student st5=new Student(); 
		st5.setstudent("vigna",2026);
		st5.getstudent();
	}
}
		