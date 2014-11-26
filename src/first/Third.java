package first;

public class Third {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=100;i<1000;i++){
			if(function(i)){
				System.out.print(i+"\t");
				count++;
			}
		}
		System.out.println("¸öÊý"+count);
		
	}
	
	static boolean function(int i){
		int s=i/100;
		int t=(i%100)/10;
		int r=((i%100)%10);
		if(Math.pow(s, 3)+Math.pow(t, 3)+Math.pow(r, 3)==i){
			return true;
		}
		else {
			return false;
		}
	}

}
