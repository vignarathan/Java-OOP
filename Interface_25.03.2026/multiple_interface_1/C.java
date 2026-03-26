class C extends A implements IB{
	int z;
	//int Y;
	C(){
		this.z=33;
		//this.Y=555;
	}
	void getx(){
		System.out.println("Ax is "+super.x);
	}
	public void gety(){
		System.out.println("IBY is "+Y);
		//System.out.println("CY is "+this.Y);
	}
	void getz(){
		System.out.println("Cz is "+this.z);
	}
	
}