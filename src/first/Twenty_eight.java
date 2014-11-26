package first;

import java.util.Scanner;

public class Twenty_eight {

	/**对10个数进行排序
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入十个数");
		int []a= new int[10];
		for(int i=0;i<10;i++){
			a[i]=scanner.nextInt();
		}
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int t:a)
			System.out.print(t+"\t");
	}

}
