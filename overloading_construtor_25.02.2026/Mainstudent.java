//Constructor_Overloading
class Mainstudent{
	public static void main(String args[]){
		
		Student st1=new Student();
		st1.getstudent();
		
		Student st2=new Student(4007);
		st2.getstudent();
		
		Student st3=new Student("Vikki");
		st3.getstudent();
		
		Student st4=new Student(5005,"v.rathan");
		st4.getstudent();
		
		Student st5=new Student("vigna",2026); 
 		st5.getstudent();
	}
}
		