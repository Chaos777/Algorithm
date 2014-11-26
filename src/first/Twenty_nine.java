package first;

import java.util.Scanner;

public class Twenty_nine {

	/**求一个3*3矩阵对角线元素之和
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("输入矩阵");
		int [][] a=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=scanner.nextInt();
			}
		}
		for(int s[]:a){
			for(int r:s)
				System.out.print(r+"\t");
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==j)
					sum=sum+a[i][j];
			}
		}
		System.out.println("对角线和为"+sum);
	}

}
