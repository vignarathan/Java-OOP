import java.util.Scanner;
	class Password{
		public static void main(String args[]){
			String pw="Yit*2026";
			String ps="";
			
			Scanner scan=new Scanner(System.in);
			int x=1;
			do{
				System.out.print("Enter Your Password : ");
				ps=scan.next();
				x++;
			}while(x<=3);
				if(ps.equals(pw)){
					System.out.println("Welcome to YIT");
				}else{
					System.out.println("Wrong Password!");
				}
			
		}
	}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
				int x=1;
				while(x<=3){
					System.out.print("Enter Your Password : ");
				    ps=scan.next();
						if(ps.equals(pw)){
							System.out.println("Welcome to YIT");
						}else{
							System.out.println("Wrong Password!");
							x++;
						}
				}
			//}while(ps.equals(pw)){
				
					
				//}
		}
	}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(ps.equals(pw)){
						System.out.println("Welcome to YIT");
					}else{
						int x=1;
						while(x<=2){
						System.out.println("Wrong Password!");
						System.out.print("Enter Your Password : ");
						ps=scan.next();
							if(ps.equals(pw)){
								System.out.println("Welcome to YIT");
							}else{
								x++;
							}
						}
					}
		}
	}*/
				
		
	