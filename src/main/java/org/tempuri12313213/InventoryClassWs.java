package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "InventoryClassWs", portName = "InventoryClassWsSoap12")
public interface InventoryClassWs {
	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(

	@WebParam(name = "cInvCCode", targetNamespace = "") String cInvCCode,
	                @WebParam(name = "cInvCName", targetNamespace = "") String cInvCName,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(@WebParam(name = "cInvCCode", targetNamespace = "") String cInvCCode,
	                @WebParam(name = "cInvCName", targetNamespace = "") String cInvCName,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);
}
