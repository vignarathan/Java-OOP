class Employee1{
	int id;
	String name;
	double basic;
	double bonus;
	
	void calcbonus(){
		if(basic>=100000){
			this.bonus=basic*0.05;
		}else{
			this.bonus=basic*0.03;
		}
	}
	void setemployee(){
		
		this.id=1004;
		this.name="Vignarathan";
		this.basic=150000;
	}
	void display(){
		System.out.println("Employee ID: "+this.id);
		System.out.println("Employee Name: "+this.name);
		System.out.println("Basic Salary: "+this.basic);
		System.out.println("Bonus amount: "+this.bonus);
		System.out.println("Net Salary: "+(this.basic+this.bonus));
	}
}
		