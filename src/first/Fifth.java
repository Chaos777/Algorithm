package first;

import java.util.Scanner;

public class Fifth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("输入一个分数");
		int score = scanner.nextInt();
		int flag=function(score);
		if(flag==1)
			System.out.println("A");
		else if(flag==2)
			System.out.println("B");
		else 
			System.out.println("C");

	}
	
	public static int function(int score){
		return score>=90?1:
			score>=60?2:
				3;
	}

}
