package first;

public class Twenty_two {

	/**���õݹ鷽����5!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((function(5)));

	}
	static int  function(int n){
		if(n==0)
			return 1;
		else {
			return function(n-1)*n;
		}
	}

}
