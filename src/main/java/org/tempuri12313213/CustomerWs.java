package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "CustomerWs", portName = "CustomerWsSoap12")
public interface CustomerWs {
	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(@WebParam(name = "cCusCode", targetNamespace = "") String cCusCode,
	                @WebParam(name = "cCusName", targetNamespace = "") String cCusName,
	                @WebParam(name = "cCusAbbName", targetNamespace = "") String cCusAbbName,
	                @WebParam(name = "cCCCode", targetNamespace = "") String cCCCode,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);
	
	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update (
					@WebParam(name = "cCusCode", targetNamespace = "") String cCusCode,
	                @WebParam(name = "cCusName", targetNamespace = "") String cCusName,
	                @WebParam(name = "cCusAbbName", targetNamespace = "") String cCusAbbName,
	                @WebParam(name = "cCCCode", targetNamespace = "") String cCCCode,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);
}
