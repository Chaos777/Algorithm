package first;

import java.util.Scanner;

public class Sixth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
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
		System.out.println("���Լ��"+y);
		System.out.println("��С������"+x1*y1/y);

	}

}
