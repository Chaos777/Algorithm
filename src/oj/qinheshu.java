package oj;

public class qinheshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M=5000000;
		int sum[] = new int[M+10];
		
		/*for(int i=1;i<=M;i++){			//方法一
			for(int j=1;j<=i/2;j++){
				if(i%j==0){
					sum[i]+=j;
				}
			}
			
		}*/
		
		for(int j=1;j<=M;j++){				//方法二 快
			for(int k=2*j;k<=M;k+=j){
				sum[k]+=j;
			}
		}
		
		for(int i=1;i<=M;i++){
			
			if((sum[i]>i)&&(sum[i]<M)&&(i==sum[sum[i]])){
				System.out.print(sum[i]+"\t");
			}
			
		}
	}

}
