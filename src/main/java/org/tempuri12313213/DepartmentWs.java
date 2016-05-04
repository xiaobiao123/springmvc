package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "DepartmentWs", portName = "DepartmentWsSoap12")
public interface DepartmentWs {
	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(
					@WebParam(name = "cDepCode", targetNamespace = "")String cDepCode,
					@WebParam(name = "cDepName", targetNamespace = "")String cDepName, 
					@WebParam(name = "cSerialnumber", targetNamespace = "")String cSerialnumber);

	
	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(@WebParam(name = "cDepCode", targetNamespace = "")String cDepCode,
					@WebParam(name = "cDepName", targetNamespace = "")String cDepName,
					@WebParam(name = "cSerialnumber", targetNamespace = "")String cSerialnumber);

}
