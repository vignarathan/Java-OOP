class MainIAB{
	public static void main(String args[]){
		B objb=new B();
		objb.gety();
		objb.getx();
		//objb.X=32; can't assign a value (it's a final variable)
		System.out.println(IA.X); //we can call it without creating object(it's a static variable)
	}
}