package first;

import java.util.Scanner;

public class Twenty_four {

	/**��һ��������5λ����������
	Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ������");
		long number=scanner.nextLong();
		String string=Long.toString(number);
		char a[]=string.toCharArray();
		System.out.println("λ��"+a.length);
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);
	}

}
