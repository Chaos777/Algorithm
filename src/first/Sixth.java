package first;

import java.util.Scanner;

public class Sixth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入两个正数");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int x1=x,y1=y;
		if(x<y){
			int temp=y;
			y=x;
			x=temp;
			
		}
		int temp=x%y;
		while(temp!=0){
			x=y;
			y=temp;
			temp=x%y;
		}
		System.out.println("最大公约数"+y);
		System.out.println("最小公倍数"+x1*y1/y);

	}

}
