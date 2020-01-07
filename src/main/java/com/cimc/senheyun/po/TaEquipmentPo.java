package com.cimc.senheyun.po;

public class TaEquipmentPo {
	private String  pk_equipment ;//'装备主键',
	private String  pk_company ;// '公司主键',
	private String   equipmentNo ;// '装备号',
	private Integer   equipmentType ;// '装备类型1:推肥机 2:气象站 3:压力泵  4:网关  5:电池阀  6:液肥灌  7:孢子捕捉器  8:昆虫捕捉器',
    private String  creator ;// '创建人',
    private String  creatortime ;// '创建时间',
    private String  modifier ;// '修改人',
    private String   modifiedtime ;//'修改时间',
    private Integer  enablestate ;//T '启用状态  1为启动  2为未启动',
	
	public String getPk_equipment() {
		return pk_equipment;
	}
	public void setPk_equipment(String pk_equipment) {
		this.pk_equipment = pk_equipment;
	}
	public String getPk_company() {
		return pk_company;
	}
	public void setPk_company(String pk_company) {
		this.pk_company = pk_company;
	}
	public String getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	public Integer getEquipmentType() {
		return equipmentType;
	}
	public void setEquipmentType(Integer equipmentType) {
		this.equipmentType = equipmentType;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreatortime() {
		return creatortime;
	}
	public void setCreatortime(String creatortime) {
		this.creatortime = creatortime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getModifiedtime() {
		return modifiedtime;
	}
	public void setModifiedtime(String modifiedtime) {
		this.modifiedtime = modifiedtime;
	}
	public Integer getEnablestate() {
		return enablestate;
	}
	public void setEnablestate(Integer enablestate) {
		this.enablestate = enablestate;
	}
}
