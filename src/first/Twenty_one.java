package first;

public class Twenty_one {

	/**Çó1+2!+3!+...+20!µÄºÍ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,f=1;
		for(int i=1;i<=20;i++){
			f=f*i;
			sum=sum+f;
		}
		System.out.println(sum);

	}

}
