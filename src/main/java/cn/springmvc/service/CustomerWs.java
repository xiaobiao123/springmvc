package cn.springmvc.service;

public interface CustomerWs {

	public String Update(String cCode, int rows, String cSerialnumber);
	
	public String Insert(String cCusCode, String cCusName, String cCusAbbName, String cCCCode, String cSerialnumbe);
}
