package first;

public class Thirty_three {

	/**��n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void chageNum(int m,int n){
		int[] arr=new int[m];
		int[] newarr=new int[m+n];
		for(int i=0;i<=arr.length;i++){
			newarr[i+n]=arr[i];
		}
		for(int j=0;j<n;j++){
			newarr[j]=newarr[newarr.length-1-j];
		}
	}

}
