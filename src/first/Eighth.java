package first;

import java.util.Scanner;

public class Eighth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("输入两个数");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int sum=0,temp=0,i=0;
		while(i<b){											//
			temp=temp+a;
			sum=sum+temp;
			a=a*10;
			i++;
		}
		System.out.println("和"+sum);	
	}

}
/****
 * /*
 * 
 * 或者
 * for(int j=0;j<b;j++){
			temp=temp+a;
			sum=sum+temp;
			a=a*10;
		}
 */
 
