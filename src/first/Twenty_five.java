package first;

import java.util.Scanner;

public class Twenty_five {

	/**һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ��������");
		long number=scanner.nextLong();
		String s=Long.toString(number);
		char a[]=s.toCharArray();
		boolean flag=false;
		for(int i=0;i<(a.length-1)/2;i++){
			if(a[i]==a[a.length-1-i])
				flag=true;
		}
		if(flag==true)
			System.out.println("����");
		else 
			System.out.println("�ǻ���");
	}

}
