package oj;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sushu {

	/**产生素数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		for (int i=2;;i++){
			boolean flag = true;
			for(int j=2;j<=Math.sqrt(i);j++){
				
				if(i%j==0){
					flag =false;
					break;
				}
			}
			if(flag){
				k++;
				file_write_code(String.valueOf(i),"utf-8");
				file_write_code("\t","utf-8");
				if(k%10==0){
					file_write_code("\n","utf-8");
				}
			}
			
		}
	}
	
	public static void file_write_code(String content,String code){					//以指定编码(code)写文件
		
	
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	//	File new_file = new File("f:\\test\\"+df.format(new Date()));
		File new_file = new File("f:\\test\\");
		if(!new_file.exists()&&!new_file.isDirectory()){
		//	new_file.createNewFile();
			new_file.mkdir();
		}
		String path=new_file.getPath();
		String temp = path+"/data.txt";
		
		File f = new File(temp);
		OutputStreamWriter write = null;
		try {
			write = new OutputStreamWriter(new FileOutputStream(f,true),code);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
        BufferedWriter writer=new BufferedWriter(write);     
        try {
			writer.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
        try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}

}
