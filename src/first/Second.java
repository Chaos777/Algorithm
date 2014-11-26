package first;

public class Second {

	/**求素数，高效的算法在corejava 13章sieve
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		int count=0;
		for(int i=2;i<2000000;i++){
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=true;
					break;
				}
				else {
					flag=false;
				}
				
			}
			if(!flag){
				count++;
				System.out.print(i+"\t");
			}
			
		}	
		System.out.println("\n素数个数"+count);
	}

}
