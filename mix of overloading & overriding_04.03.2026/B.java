class B extends A{
	int y;
	int x;
	
	B(){
		this.x=20;
		this.y=70;
	}
	void gety(){
		System.out.println("By is :"+this.y);
	}
	void getx(){
		System.out.println("Bx is :"+this.x);
	}
	void getx(int x){
		System.out.println("Ax is :"+super.x);
		this.x=x;
		System.out.println("Bx is :"+this.x);
	}
}	