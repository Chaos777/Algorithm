package first;

import java.util.Scanner;

public class Thirty_two {

	/**输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("输入数组(7位)");
		int a[]= new int[7];
		for(int i=0;i<7;i++){
			a[i]=sc.nextInt();
		}
		int index1=0,index2=0;
		int max=a[0],min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
				index1=i;
			}
			if(a[i]<min){
				min=a[i];
				index2=i;
			}
		}
		if(index1!=0){
			int tem=a[0];
			a[0]=a[index1];
			a[index1]=tem;			
		}
		if(index2!=a.length-1){
			int tem=a[a.length-1];
			a[a.length-1]=a[index2];
			a[index2]=tem;
		}
		for(int s:a){
			System.out.print(s+"\t");
		}
	}

}
