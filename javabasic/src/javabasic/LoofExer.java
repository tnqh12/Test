package javabasic;

public class LoofExer {
	public static void main(String[] args) {
		//별찍기 1
		for (int i=0; i<5;i++){
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
		//별찍기2
		for (int i=0; i<5; i++){
			for(int k=0; k<4-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
		
		//별찍기 3
		for (int i=5; i>0; i--){
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		//별찍기4
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i%4==0 || j%4==0) {
					System.out.print("*");
				}else {
				 System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("*****\n*   *\n*   *\n*   *\n*****");
		
		System.out.println("\n");
		
		int k=12;
		for(int i=0; i<k+1; i++) {
			for(int j=0; j<k+1; j++) {
				if(i%k==0 || j%k==0 || i+j == k) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i%4==0 || j%4==0) {
					System.out.print(" ");
				}else if(i==j) {
					System.out.print("4");
				}else if(i%2==0 || j%2==0) {
					System.out.print("9");
				}else {
				System.out.print("3");
				}
			}
			System.out.println();
		}
		System.out.println();
		//별찍기6
		//5줄 z모양
		int k2=4;
		for(int i=0; i<k2+1; i++) {
			for(int j=0; j<k2+1; j++) {
				if(i%k2==0 ||  i+j == k2) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//별찍기 7
		//5줄 H모양
		
		int k3=4;
		for(int i=0; i<k3+1; i++) {
			for(int j=0; j<k3+1; j++) {
				if(i==k3/2 || j==k3 || j==0) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//별찍기8
		//  *  
		// ***
		//*****
		// *** 
		//  *     
		int k4=4;
		for(int i=0; i<k4+1; i++) {
			for(int j=0; j<k4+1; j++) {
				if(j==k4/2 || i==k4/2) {
					System.out.print("*");
				}else if(i%k4==0 || j%k4==0) {
					System.out.print(" ");
				}else if(i==j || i+j==k4) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
	
		
}
}
