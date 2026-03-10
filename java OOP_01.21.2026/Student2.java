class Student2{
	int id;
	String name;
	
	void setstudent(int ids,String names){
		id=ids;
		name=names;
	}
	void getstudent(){
		System.out.println("Student ID:"+id);
		System.out.println("Student Name:"+name);
	}
}