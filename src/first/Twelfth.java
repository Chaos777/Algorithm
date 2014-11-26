package first;

import java.util.Scanner;

public class Twelfth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ‰»ÎΩ∂Ó");
		double profit=scanner.nextDouble();
		double award=0;
		if(profit<=10&&profit>=0){
			award=profit*0.1;
		}
		else if (profit>10&&profit<=20) {
			award=10*0.1+(profit-10)*0.075;
		}
		else if (profit>20&&profit<=40) {
			award=10*0.1+10*0.075+(profit-20)*0.05;
		}
		else if (profit>40&&profit<=60) {
			award=10*0.1+10*0.075+20*0.05+(profit-40)*0.03;
		}
		else if (profit>60&&profit<=100) {
			award=10*0.1+10*0.075+20*0.05+20*0.03+(profit-60)*0.015;
		}
		else {
			award=10*0.01+10*0.075+20*0.05+20*0.03+40*0.015+(profit-100)*0.01;
		}
		
		System.out.println("Ω±Ω"+award);
	}

}
