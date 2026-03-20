package packB;
import packA.A;
public class B extends A{
	int y;
	
	public B(int x,int y){
		super(x);
		this.y=y;
	}
	void gety(){
		System.out.println("By is :"+this.y);
	}
}