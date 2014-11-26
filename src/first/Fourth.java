package first;

import java.util.Scanner;

public class Fourth {

	/**
	 * @param args
	 */
	 static int k=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个正整数");
		int number=scanner.nextInt();
		System.out.print(number+"=");
		function(number);
		
	}
	
	public static void function(int n){
		while(k<=n){
			if(k==n){
				System.out.println(n);
				break;
			}
			else if(n>k&&n%k==0){
				System.out.print(k+"*");
				function(n/k);
				break;
			}
			else if(n>k&&n%k!=0){
				k++;
				function(n);
				break;
			}
			
		}
	}

}
