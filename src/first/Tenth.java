package first;

public class Tenth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double height=100.0;
		double distance=100;
		for(int i=0;i<10;i++){
			
			System.out.println(i+1+"次落地"+"距离"+distance+"，跳起高度"+height/2);
			distance=distance+height;
			height=height/2;
			
		}
		

	}

}
