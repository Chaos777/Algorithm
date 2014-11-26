package first;

import java.util.Scanner;

public class Twenty_four {

	/**给一个不多于5位的正整数，
	要求：一、求它是几位数，二、逆序打印出各位数字。

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个正数");
		long number=scanner.nextLong();
		String string=Long.toString(number);
		char a[]=string.toCharArray();
		System.out.println("位数"+a.length);
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);
	}

}
