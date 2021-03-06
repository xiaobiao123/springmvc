package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "CustomerClassWs", portName = "CustomerClassWsSoap12")
public interface CustomerClassWs {

	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(@WebParam(name = "cCCCode", targetNamespace = "") String cCCCode,
	                @WebParam(name = "cCCName", targetNamespace = "") String cCCName,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(@WebParam(name = "cCCCode", targetNamespace = "") String cCCCode,
	                @WebParam(name = "cCCName", targetNamespace = "") String cCCName,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

}
