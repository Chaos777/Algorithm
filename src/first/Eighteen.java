package first;

public class Eighteen {

	/**
	 * @param args
	 * ����ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
		�ѳ�ǩ���������������������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char teamA[]={'a','b','c'};
		char teamB[]={'x','y','z'};
		for(int i=0;i<teamA.length;i++){
			for(int j=0;j<teamB.length;j++){
				if(teamA[i]=='a'&&teamB[j]=='x'||teamA[i]=='a'&&teamB[j]=='y')
				{}
				else if(teamA[i]=='c'&&teamB[j]=='x'||teamA[i]=='c'&&teamB[j]=='z')
				{}
				else if(teamA[i]=='b'&&teamB[j]=='y'||teamA[i]=='b'&&teamB[j]=='z')
				{}
				else {
					System.out.println(teamA[i]+" VS "+teamB[j]);
				}
				
			}
		}
	}

}
