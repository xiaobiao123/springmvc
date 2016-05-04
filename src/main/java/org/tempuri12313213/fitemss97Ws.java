package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "fitemss97Ws", portName = "fitemss97WsSoap12")
public interface fitemss97Ws {
	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(@WebParam(name = "citemcode", targetNamespace = "") String citemcode,
	                @WebParam(name = "citemname", targetNamespace = "") String citemname,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(@WebParam(name = "citemcode", targetNamespace = "") String citemcode,
	                @WebParam(name = "citemname", targetNamespace = "") String citemname,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

}
