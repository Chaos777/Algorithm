package first;

public class Thirteenth {

	/**һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
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
