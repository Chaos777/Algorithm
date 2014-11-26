package first;

public class Thirteenth {

	/**一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(long i=1l;i<100000;i++){
			if(Math.sqrt(i+100)%1==0){
				if(Math.sqrt(i+168)%1==0)
					System.out.println(i);
			}
		}
		
	}

}
