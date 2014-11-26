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
	    BufferedReader br;// 读取data数据流 
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
            System.out.println("连接超时"); 
        } catch (FileNotFoundException e) { 
            System.out.println("加载文件出错"); 
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
        	   jsonObject.put("trainID", temp2[0]);					//列车号
        	   jsonObject.put("fromStation", temp2[1]);				//出发站+出发时间
        	   jsonObject.put("toStation", temp2[2]);				//目的站+到达时间
        	   jsonObject.put("time", temp2[3]);					//历时
        	   jsonObject.put("business", temp2[4]);				//商务坐
        	   jsonObject.put("tgrade", temp2[5]);					//特等座
        	   jsonObject.put("tfirst", temp2[6]);					//一等座
        	   jsonObject.put("tsecond", temp2[7]);					//二等座
        	   jsonObject.put("tgaoruanW", temp2[8]);				//高级软卧
        	   jsonObject.put("truanW", temp2[9]);					//软卧
        	   jsonObject.put("tyingW", temp2[10]);					//硬卧
        	   jsonObject.put("truanZ", temp2[11]);					//软座
        	   jsonObject.put("tyingZ", temp2[12]);					//硬座
        	   jsonObject.put("twuZ", temp2[13]);					//无座
        	   jsonObject.put("elseZ", temp2[14]);					//其他
        	   
        	   array.add(jsonObject);
        	  
           }
           System.out.println(array.toString());
          // System.out.println(jsonData.toString());
           
	}

}
