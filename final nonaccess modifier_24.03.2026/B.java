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
	/*getx() in B cannot override getx() in A void getx(){*/
        
	/*void getx(){
		System.out.println("Bx is "+this.x);
	}*/
}