package first;

import java.util.Scanner;

public class Thirty_four {

	/**��дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,
		������nΪ����ʱ�����ú���1/1+1/3+...+1/n
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ����");
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
