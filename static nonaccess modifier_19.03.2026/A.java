class A{
	static int x;
	int y;
	A(){
		x=10;
		y=39;
	}
	static void getx(){
		System.out.println("Ax is "+x); //10 static variable is usable in a static method
	}
	/*static void gety(){
		System.out.println("Ay is "+y);// error, non static vaiable is can't usable in a static method
	} */
	
	void getx2(){
		System.out.println(x);  //static variable is usable in a nonstatic method
	}
}