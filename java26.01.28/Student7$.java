class Student7${
	int id;
	String name;
	int m1;
	int m2;
	int m3;
	
	Student7$(int id,String name){
		this.id=id;
		this.name=name;
	}
	void setmarks(int m1,int m2,int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	int calctotal(){
		int total=this.m1+this.m2+this.m3;
		return total;
	}
	double calcaverage(int total){
		double average=total/3.0;
		return average;
	}
	char getresult(double average){
		char result = '\u0000'; 

		if(average>=75){
			result='A';
		}else if(average>=65){
			result='B';
		}else if(average>=55){
			result='C';
		}else if(average>=45){
			result='S';
		}else{
			result='F';
		}
		return result;
	}
	void display(){
		System.out.println("Student ID : "+this.id);
		System.out.println("Student Name : "+this.name);
		System.out.println("Subject 1 : "+this.m1);
		System.out.println("Subject 2 : "+this.m2);
		System.out.println("Subject 3 : "+this.m3);

		int tot=this.calctotal();
		System.out.println("Total : "+tot);
		
		double ave=this.calcaverage(tot);
		System.out.println("Average : "+ave);
		
		char r=this.getresult(ave);
		System.out.println("Result : "+r);
	}
	
}