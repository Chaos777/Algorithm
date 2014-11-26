package first;

import java.util.Scanner;

public class Fifteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入三个数");
		int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
		int[] temp= new int[3];
		temp[0]=a;
		temp[1]=b;
		temp[2]=c;
		int tem;
		for(int i=0;i<temp.length;i++){
			for(int j=i+1;j<temp.length;j++){
				if(temp[i]>temp[j]){
					tem=temp[j];
					temp[j]=temp[i];
					temp[i]=tem;
				}
			}
		}
		for(int s:temp)
			System.out.print(s+"\t");

	}

}
