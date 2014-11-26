package first;

import java.util.Scanner;

public class Twenty_five {

	/**一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个正整数");
		long number=scanner.nextLong();
		String s=Long.toString(number);
		char a[]=s.toCharArray();
		boolean flag=false;
		for(int i=0;i<(a.length-1)/2;i++){
			if(a[i]==a[a.length-1-i])
				flag=true;
		}
		if(flag==true)
			System.out.println("回文");
		else 
			System.out.println("非回文");
	}

}
