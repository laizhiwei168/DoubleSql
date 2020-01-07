package com.cimc.senheyun.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		getmon("2019-07-01 14:30:04", "2019-06-01 14:30:04");
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
					System.out.println(ye+"_"+(m>9?m:"0"+m));
					ls.add(ye+"_"+(m>9?m:"0"+m));
				}
			}
			for(int e=1;e<dt2.getMonth()+2;e++) {
				int ye=dt2.getYear()-100;
				System.out.println(ye+"_"+(e>9?e:"0"+e));
				ls.add(ye+"_"+(e>9?e:"0"+e));
			}
		}else {
			int ye=dt1.getYear()-100;
			int mo=dt1.getMonth()+1;
			if(month>0) {
				for(int e=0;e<month+1;e++) {
					int mon= mo+e;
					System.out.println(ye+"_"+(mon>9?mon:"0"+mon));
					ls.add(ye+"_"+(mon>9?mon:"0"+mon));
				}
			}else {
				System.out.println(ye+"_"+(mo>9?mo:"0"+mo));
				ls.add(ye+"_"+(mo>9?mo:"0"+mo));
			}
		}
		
		return ls;
	}
}
