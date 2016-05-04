package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "InventoryWs", portName = "InventoryWsWsSoap12")
public interface InventoryWs {
	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(
					@WebParam(name = "cInvCode", targetNamespace = "") String cInvCode,
					@WebParam(name = "cInvName", targetNamespace = "") String cInvName, 
					@WebParam(name = "cInvCCode", targetNamespace = "") String cInvCCode,
					@WebParam(name = "cComUnitCode", targetNamespace = "") String cComUnitCode, 
					@WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);
	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(	@WebParam(name = "cInvCode", targetNamespace = "") String cInvCode,
					@WebParam(name = "cInvName", targetNamespace = "") String cInvName, 
					@WebParam(name = "cInvCCode", targetNamespace = "") String cInvCCode,
					@WebParam(name = "cComUnitCode", targetNamespace = "") String cComUnitCode, 
					@WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);
}
