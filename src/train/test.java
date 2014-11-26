package train;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class test {

	/**@author LCZ
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URLConnection connectionData; 
	    StringBuilder sb = null; 
	    BufferedReader br;// ��ȡdata������ 
	    JSONObject jsonData; 
	    JSONObject info; 
		URL url = new URL("http://dynamic.12306.cn/otsquery/query/queryRemanentTicketAction.do?method=queryLeftTicket&orderRequest.train_date=2013-08-10&orderRequest.from_station_telecode=BJP&orderRequest.to_station_telecode=SHH&orderRequest.train_no=&trainPassType=QB&trainClass=QB%23D%23Z%23T%23K%23QT%23&includeStudent=00&seatTypeAndNum=&orderRequest.start_time_str=00:00--24:00"); 
        connectionData = url.openConnection(); 
        connectionData.setConnectTimeout(1000); 
        try { 
            br = new BufferedReader(new InputStreamReader( 
                    connectionData.getInputStream(), "UTF-8")); 
            sb = new StringBuilder(); 
            String line = null; 
            while ((line = br.readLine()) != null) 
                sb.append(line); 
        } catch (SocketTimeoutException e) { 
            System.out.println("���ӳ�ʱ"); 
        } catch (FileNotFoundException e) { 
            System.out.println("�����ļ�����"); 
        } 
            String datas = sb.toString();   
           
           jsonData = JSONObject.fromObject(datas); 
           info = jsonData.getJSONObject("weatherinfo");
           String sourceString = jsonData.toString();
           //sourceString = sourceString.replaceAll("", "");
           String temp[] = sourceString.split("n\\d");  
           String temp2[];
           JSONObject jsonObject = new JSONObject();
		   JSONArray array = new JSONArray();
           for(String s:temp){        	  
        	   s=s.replaceAll("<span [^>]+>", "");
        	   s=s.replaceAll("<\\\\/span>", "");
        	   s=s.replaceAll("<img [^>]+>", "");
        	   s=s.replaceAll("<font [^>]+>", "");
        	   s=s.replaceAll("<\\\\/font>", "");
        	   s=s.replaceAll("&nbsp;", "");
        	   s=s.replaceAll("<br>", "");
        	   s=s.replaceAll(",\\\\\\\\", "");
        	   s=s.replaceFirst("\\d{0,}+,", "");
        	   s=s.replaceAll("\\{[^>]+\"", "");
        	   s=s.replaceAll(",\"+[^>]+\\}", "");
        	   
        	   //System.out.println(s);
        	   temp2 = s.split(","); 
        	   jsonObject.put("trainID", temp2[0]);					//�г���
        	   jsonObject.put("fromStation", temp2[1]);				//����վ+����ʱ��
        	   jsonObject.put("toStation", temp2[2]);				//Ŀ��վ+����ʱ��
        	   jsonObject.put("time", temp2[3]);					//��ʱ
        	   jsonObject.put("business", temp2[4]);				//������
        	   jsonObject.put("tgrade", temp2[5]);					//�ص���
        	   jsonObject.put("tfirst", temp2[6]);					//һ����
        	   jsonObject.put("tsecond", temp2[7]);					//������
        	   jsonObject.put("tgaoruanW", temp2[8]);				//�߼�����
        	   jsonObject.put("truanW", temp2[9]);					//����
        	   jsonObject.put("tyingW", temp2[10]);					//Ӳ��
        	   jsonObject.put("truanZ", temp2[11]);					//����
        	   jsonObject.put("tyingZ", temp2[12]);					//Ӳ��
        	   jsonObject.put("twuZ", temp2[13]);					//����
        	   jsonObject.put("elseZ", temp2[14]);					//����
        	   
        	   array.add(jsonObject);
        	  
           }
           System.out.println(array.toString());
          // System.out.println(jsonData.toString());
           
	}

}
