package first;


public class Twenty {

	/**��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double sum=0,x=2,y=1,t;
			for(int i=0;i<20;i++){
				sum=sum+x/y;
				t=y;
				y=x;;
				x=t+y;
			}
			System.out.println(sum);
	}

}
