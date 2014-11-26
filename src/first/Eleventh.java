package first;

public class Eleventh {

	/**
	 * @param args1,2.3.4的三位数的排列组合
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				for(int k=1;k<5;k++){
					if(i!=j&&i!=k&&j!=k){
						count++;
						System.out.print(i*100+j*10+k+"\t");
						if(count%4==0)
							System.out.println();
					}
					
				}
			}
		}
		System.out.println("共有"+count+"个");
	}

}
