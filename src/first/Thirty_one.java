package first;

public class Thirty_one {

	/**��ӡ����������Σ�Ҫ���ӡ��10������ͼ��
	1.���������
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
   1 5 10 10 5 1
*/
/*
* ����ǧƪһ��������д������Ҳû��ʲô���£�
* a[i][j]=a[i-1][j]+a[i-1][j-1] �����������ĺ���
* ������Ƕ�ά���飬Ϊ��ʹ����Ľ��������Ư��һ��
* ������for��int k=0; k<2*(10-i)-1; k++����������Ŀո�
* ���ѭ�����ڿ���������ѭ�����棬����������ѭ�����档
* �ǵ����������ʱΪ�˿����°벿�ֵ����������ƴ����д��
* for(int k=1; k<=WIDTH-2*i-1; k++) �������¡�

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= new int [10][10];
		for(int i=0;i<10;i++){		
			a[i][i]=1;
			a[i][0]=1;			
		}
		for(int i=2;i<10;i++){
			for(int j=1;j<i;j++){
				a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		for(int i=0;i<10;i++){
			for(int k=0;k<2*(10-i)-1;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	

	}

}
