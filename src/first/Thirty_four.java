package first;

import java.util.Scanner;

public class Thirty_four {

	/**编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,
		当输入n为奇数时，调用函数1/1+1/3+...+1/n
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个数");
		long n=scanner.nextLong();
		double sum=0;
		if(n%2==0){
			for(int i=2;i<=n;i+=2){
				sum=sum+(double)1/i;
			}
		}
		if(n%2!=0){
			for(int i=1;i<=n;i+=2){
				sum=sum+(double)1/i;
			}
		}
		System.out.println(sum);
	}

}
