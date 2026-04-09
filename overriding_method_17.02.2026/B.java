class B extends A{
	int y;
	int x;
	
	B(){
		this.y=30;
		this.x=555;
	}
	void getx(){
		System.out.println("Bx is :"+this.x);
		/* System.out.println("Bx is :"+super.x); */
	}
	void gety(){
		System.out.println("By is :"+this.y);
		/* super.getx(); */
	}
}