package com.cimc.senheyun.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateUtils {
	
	public static String datetime2String(Date dt){
		DateFormat dFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String formatDate = dFormat2.format(dt); 
        return formatDate;
	}

	/*
	 * yyMMddHHmmss 转换  yyyy-MM-dd HH:mm:ss
	 */
	public static String BCDdatetime2datetime(String BCDdatetime){
		DateFormat dFormat1 = new SimpleDateFormat("yyMMddHHmmss");
		Date dt = null;
		try {
			dt = dFormat1.parse(BCDdatetime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		DateFormat dFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String formatDate = dFormat2.format(dt); 
        return formatDate;
	}
	
	
	public static Date BCDdatetime2date(String BCDdatetime){
		DateFormat dFormat1 = new SimpleDateFormat("yyMMddHHmmss");
		Date dt = null;
		try {
			dt = dFormat1.parse(BCDdatetime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dt;
	}
	/*
	 * yyyy-MM-dd HH:mm:ss 转换为 yyMMddHHmmss
	 */
	public static String Strdatetime2BCDdatetime(String datetime){
		DateFormat dFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt = null;
		try {
			dt = dFormat1.parse(datetime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		DateFormat dFormat2 = new SimpleDateFormat("yyMMddHHmmss");  
        String formatDate = dFormat2.format(dt); 
        return formatDate;
	}
	
	public static String getDoDayTime(){
		DateFormat dFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt =new Date();
		String toDateTime = dFormat1.format(dt); 
        return toDateTime;
	}
	
	public static String getNewDate2BCDandUTC(int fewHour){
		DateFormat format = new SimpleDateFormat("yyMMddHHmmss");
		Date dt =new Date();
		long time_long;
        long hour_long=3600000;
        String time="";
		try {
			time_long = format.parse(format.format(dt)).getTime();
	        Date date1 = new Date(time_long-hour_long*fewHour);
	        time=format.format(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return time;
	}
	
	public static String getNewDate2FewMinutes(int fewMinutes){
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Date dt =new Date();
		long time_long;        
        long hour_long=3600000;
        long Minutes_long=60000;
        String time="";
		try {
			time_long = format.parse(format.format(dt)).getTime();
	        Date date1 = new Date(time_long-hour_long*8-Minutes_long*fewMinutes);
	        time=format.format(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return time;
	}
	
	/**
	 * 比较两个时间大小
	 * @param DATE1 "1999-12-11 09:58:01"
	 * @param DATE2 "1999-12-11 09:58:00"
	 * @return
	 */
	public static int compare_dateTime(String DATE1, String DATE2) { 
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }
	
	public static long getDatePoor(String endDate, String nowDate) throws ParseException {		 
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   Date begin=dfs.parse(endDate);
		   Date end = dfs.parse(nowDate);
		   long between=(end.getTime()-begin.getTime())/1000;//除以1000是为了转换成秒
		   long min=between/60;
		   return min;
	}
	
	public static List<String> getmon(String startdatetime,String enddatetime){
		List<String> ls=new ArrayList<String>();
		DateFormat dFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt1 = null;
		try {
			dt1 = dFormat1.parse(startdatetime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		DateFormat dFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt2 = null;
		try {
			dt2 = dFormat2.parse(enddatetime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		int year=dt2.getYear()-dt1.getYear();
		int month=dt2.getMonth()-dt1.getMonth();
		if(year>0) {
			for(int i=0;i<year;i++) {
				int ye=dt1.getYear()-100+i;
				int mo=i>0?0:dt1.getMonth();
				// 添加年的月份
				for(int y=mo; y<12;y++) {
					int m=y+1;
					//System.out.println(ye+"_"+(m>9?m:"0"+m));
					ls.add(ye+"_"+(m>9?m:"0"+m));
				}
			}
			for(int e=1;e<dt2.getMonth()+2;e++) {
				int ye=dt2.getYear()-100;
				//System.out.println(ye+"_"+(e>9?e:"0"+e));
				ls.add(ye+"_"+(e>9?e:"0"+e));
			}
		}else {
			int ye=dt1.getYear()-100;
			int mo=dt1.getMonth()+1;
			if(month>0) {
				for(int e=0;e<month+1;e++) {
					int mon= mo+e;
					//System.out.println(ye+"_"+(mon>9?mon:"0"+mon));
					ls.add(ye+"_"+(mon>9?mon:"0"+mon));
				}
			}else {
				//System.out.println(ye+"_"+(mo>9?mo:"0"+mo));
				ls.add(ye+"_"+(mo>9?mo:"0"+mo));
			}
		}
		
		return ls;
	}
}
