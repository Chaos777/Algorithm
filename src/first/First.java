package first;

import java.util.Scanner;

public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������·�");
		int MAX_month=scanner.nextInt();
		function1(MAX_month);
	//	System.out.println(MAX_month+"���µĶ�����"+function2(MAX_month));

	}
	static void  function1(long month){
		long f1=1,f2=1;
		long F;
		if(month<=0){
			System.out.println("�������");
		}
		else if(month==1||month==2){
			System.out.println("�ж���1");
		}
		else{
			for(int i=2;i<month;i++){
			
				F=f2;
				f2=f1+f2;
				f1=F;
				System.out.println(i+1+"���¶�����"+f2+"��");
			
			}
		}
	}
	static long function2(long month){
		if(month<=0){
			System.out.println("�������");
			return 0;
		}
		else if (month==1||month==2) {
		//	System.out.println("�ж���1��");
			return 1;
		}
		else {
			return(function2(month-1)+function2(month-2));
		}
	}

}
