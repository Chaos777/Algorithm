package first;

import java.util.Scanner;

public class Fourteen {

	/**�ж������ǵڼ���
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0,days=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������");
		int year=scanner.nextInt();
		System.out.println("�����·�");
		int month=scanner.nextInt();
		System.out.println("��������");
		int day = scanner.nextInt();
		if(year<=0||month<=0||month>=13||day<=0||day>31)
			System.out.println("�������");
		for(int i=0;i<month;i++){
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			days=31;
				
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;

			case 2:
				if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
					days=29;
				}
				else {
					days=28;
				}
				break;
			}
			d=d+days;
		}
		System.out.println(d+day+"��");

	}

}
