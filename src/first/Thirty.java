package first;

import java.util.Scanner;

public class Thirty {

	/**��һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ�������������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,5,8,9,10,15};
		int b[]= new int[a.length+1];
//		int i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ����");
		int number = scanner.nextInt();
		if(number>a[a.length-1]){
			b[b.length-1]=number;
			for(int i=0;i<a.length;i++)
				b[i]=a[i];
		}
		else if (number<a[0]) {
			b[0]=number;
			for(int i=0;i<a.length;i++)
				b[i+1]=a[i];
		}
		else {
			for(int i=0;i<a.length;i++){
				if(number>a[i])
					b[i]=a[i];
				else{
					b[i]=number;
					break;
				}
				for(int j=i+1;j<b.length;j++){
					b[j]=a[j-1];
				}
			}
		}
		for(int s:b)
			System.out.print(s+"\t");
	}

}


/*if(number >= a[a.length-1]) {
	b[b.length-1] = number;
	for(i=0; i<a.length; i++) {
	     b[i] = a[i];
	}
} else {
	for(i=0; i<a.length; i++) {
		if(number >= a[i]) {
			b[i] = a[i];
	    } else {    
	    	b[i] = number;
	    	break;
	    }
	}
	for(int j=i+1; j<b.length; j++) {
	  b[j] = a[j-1];
	}
}*/