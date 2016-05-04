package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "PersonWs", portName = "PersonWsSoap12")
public interface PersonWs {
	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(
					@WebParam(name = "cPersonCode", targetNamespace = "") String cPersonCode, 
					@WebParam(name = "cPersonName", targetNamespace = "") String cPersonName,
					@WebParam(name = "cDepCode", targetNamespace = "") String cDepCode,
					@WebParam(name = "rSex", targetNamespace = "") String rSex, 
					@WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(
					@WebParam(name = "cPersonCode", targetNamespace = "") String cPersonCode, 
					@WebParam(name = "cPersonName", targetNamespace = "") String cPersonName,
					@WebParam(name = "cDepCode", targetNamespace = "") String cDepCode,
					@WebParam(name = "rSex", targetNamespace = "") String rSex, 
					@WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

}
