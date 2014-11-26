package first;

import java.util.Scanner;

public class Seventh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个字符串");
		String string=scanner.nextLine();
		char s[]=string.toCharArray();
		int digital = 0,alph = 0,blank = 0,other = 0;
		for(int i=0;i<s.length;i++){
			if(s[i]>='0'&&s[i]<='9'){
				digital++;
			}
			else if(s[i]>='a'&&s[i]<='z'||s[i]>='A'&&s[i]<='Z'){
				alph++;
			}
			else if(s[i]==' '){
				blank++;
			}
			else {
				other++;
			}
		}
		System.out.println("数字"+digital+"字母"+alph+"空格"+blank+"其他"+other);

	}

}
