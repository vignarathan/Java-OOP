class B extends A{
	int y;
	int x;
	B(){
		this.x=33;
		this.y=30;
	}
	void gety(){
		System.out.println("By is "+this.y);
	}
	void getx(){
		System.out.println("Bx is "+this.x);
	}
}