package first;

public class Nineteen {

	/**
	 * @param args
	 */
	
/*	¥Ú”°
	    *
	   ***
	  *****
	 *******
	  *****
	   ***
	    *
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=9;
		int w=10;
		for(int i=0;i<(h+1)/2;i++){
			for(int j=0;j<(w-1)/2-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i+1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=h/2;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=w-1-2*i;k++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
