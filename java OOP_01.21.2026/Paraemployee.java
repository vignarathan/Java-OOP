class Paraemployee{
	int id;
	String name;
	double basic;
	double bonus;
	double net;
	
	void calcbonus(){
		if(basic>=100000){
			this.bonus=basic*0.05;
		}else{
			this.bonus=basic*0.03;
		
		}
		
	}
	
	void setemployee(int id,String name,double basic){
		this.id=id;
		this.name=name;
		this.basic=basic;
	}
	
	void display(){
		System.out.println("Employee ID : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Baisc Salary : "+this.basic);
		System.out.println("Bonus emount : "+this.bonus);
		System.out.println("Net Salary : "+(this.basic + this.bonus));
	}
}
		