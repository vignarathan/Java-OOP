class Student4{
	int id;
	String fname;
	String lname;
	
	void setdata(int id,String fname,String lname){
		this.id=id;
		this.fname=fname;
		this.lname=lname;
	}
		
	String getfullname(){
		String fullname=this.fname+" "+this.lname;
		
		return fullname;
	}
	
	void display(){
		System.out.println("First name : "+this.fname);
		System.out.println("Last name : "+this.lname);
		String fna=this.getfullname();
		System.out.println("Full name : "+fna);
		System.out.println("Student ID : "+this.id);
	}
}
		