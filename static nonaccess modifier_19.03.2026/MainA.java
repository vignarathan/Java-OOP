class MainA{
	static int z=33; //class variable
	public static void main(String args[]){
		A obja=new A();
		obja.getx();  //output Ax is 10
		obja.getx2();
		//obja.gety(); //error
		
		A.x=20;
		A.getx();  //Ax is 20  //because x is a static variable 
					//we can call a static variable or static method without using a object
					
		A obja1=new A();
		obja1.getx();   //out put Ax is 10
		
		A obja2=new A();
		obja2.getx();  //out put Ax is 10
		
		obja1.x=30;
		obja1.getx();  //out put Ax is 30
		
		obja2.getx(); //now also out put Ax is 30 because static is used for memory management and centralize
		
		System.out.println("static z is "+z); //33
	}
}