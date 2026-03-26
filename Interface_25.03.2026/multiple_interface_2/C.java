class C implements IA,IB{
	int z;
	C(){
		this.z=855;
	}
	public void getx(){
		System.out.println("IAX is "+X);
	}
	public void gety(){
		System.out.println("IBY is "+Y);
	}
	void getz(){
		System.out.println("Cz is "+this.z);
	}
	
}