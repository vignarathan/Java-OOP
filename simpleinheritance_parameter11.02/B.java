class B extends A{
	int y;
	
	B(int y){
		super(27);
		this.y=y;
	}
	void gety(){
		System.out.println("By is :"+this.y);
	}
}