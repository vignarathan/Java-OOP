//Overloading
class Student{
	int id;
	String name;
	
	void setstudent(){
		this.id=1004;
		this.name="vignarathan";
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
	}
	void setstudent(int id){
		this.id=id;
		this.name="rathan";
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
	}
	void setstudent(String name){
		this.id=3000;
		this.name=name;
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
	}	
	void setstudent(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
	}
	void setstudent(String name,int id){
		this.id=id;
		this.name=name;
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
	}
}