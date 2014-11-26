package first;

public class Ninth {

	/**
	 * @param argsÍêÊı
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++){
			int temp=0;
			for(int j=1;j<=i/2;j++){
				if(i%j==0){
					temp=temp+j;
				}
			}
			if(temp==i){
				System.out.println(i);
			}
		}
	}

}
