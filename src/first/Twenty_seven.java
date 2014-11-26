package first;

public class Twenty_seven {

	/**求100以内的素数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int count=0;
		for(int i=2;i<=100;i++){
			boolean flag=false;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					flag=true;
					break;
				}
				else {
					flag=false;
					
				}
			}
			if(flag==false){
				count++;
				System.out.print(""+i+"\t");				
			}
		}
		System.out.println("\n"+count+"个");
	}

}
