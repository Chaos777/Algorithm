import java.io.BufferedReader;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String name="数据";
		String keyword1="数据 任务";
		String keyword2="数据";
		String keyword3="数据 历史";
		String keyword4="数据";
		String keywordEN="english test";
		String keywordEN1="english english*test test";
		String keywordEN2="english2";
		String keywordEN3="english3";
		String keywordEN4="english4";
		String [] keyword1_str = keyword1.split(" ");
		String [] keyword2_str = keyword2.split(" ");
		String [] keyword3_str = keyword3.split(" ");
		String [] keyword4_str = keyword4.split(" ");
		String [] keywordEN_str= keywordEN.split("\\*");
		String [] keywordEN1_str= keywordEN1.split("\\*");
		String [] keywordEN2_str= keywordEN2.split("\\*");
		String [] keywordEN3_str= keywordEN3.split("\\*");
		String [] keywordEN4_str= keywordEN4.split("\\*");
		String search="(\"";
		search+=name+"\"";
		for(String s:keywordEN_str){
			search+="|"+"\""+s+"\"";
		}
		search+=")";
		search+="+(";
		for(String s:keyword1_str){
			search+="\""+s+"\"|";
		}
		for(String s:keywordEN1_str){
			
			search+="\""+s+"\"|";
		}
		
		System.out.println(search);*/
		/*File f = new File("E:\\01");
		File [] files = f.listFiles();删除文件。获得文件的最后修改时间
		for(int i=0;i<files.length;i++){
			long time = files[i].lastModified();//返回文件最后修改时间，是以个long型毫秒数
			String ctime = new SimpleDateFormat("yyyyMMdd").format(new Date(time));
			String nowtime = new SimpleDateFormat("yyyyMMdd").format(new Date());
			System.out.println(ctime+"----"+nowtime);
			int Filetime = Integer.valueOf(ctime);
			int cutime = Integer.valueOf(nowtime);
			System.out.println(Filetime+"-----"+cutime);
			if(Filetime==20131014){
			//	files[i].delete();
				files[i].deleteOnExit();
			}
		}*/
		
		/*String chString = "你+";
		System.out.println(chString.length());*/
		
	}

}
