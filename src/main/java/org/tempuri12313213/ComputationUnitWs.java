package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "ComputationUnitWs", portName = "ComputationUnitWsSoap12")
public interface ComputationUnitWs {

	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(@WebParam(name = "cComunitCode", targetNamespace = "") String cComunitCode, 
					@WebParam(name = "cComUnitName", targetNamespace = "")  String cComUnitName, 
					@WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);
    
	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(
					@WebParam(name = "cComunitCode", targetNamespace = "")String cComunitCode,
					@WebParam(name = "cComUnitName", targetNamespace = "")String cComUnitName,
					@WebParam(name = "cSerialnumber", targetNamespace = "")String cSerialnumber);

}
