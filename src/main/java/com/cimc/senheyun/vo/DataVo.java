package com.cimc.senheyun.vo;

import java.util.List;

public class DataVo extends PageBasics {

	private String id;
	
	private List<String> datas;

	public List<String> getDatas() {
		return datas;
	}

	public void setDatas(List<String> datas) {
		this.datas = datas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
