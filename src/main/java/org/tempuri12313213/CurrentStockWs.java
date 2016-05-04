package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "CurrentStockWs", portName = "CurrentStockWsSoap12")
public interface CurrentStockWs {

	@WebResult(name = "GetAllResult")
	@WebMethod(operationName = "GetAll", action = "http://tempuri.org/GetAll")
	public String GetAll(@WebParam(name = "cInvCode", targetNamespace = "") String cInvCode,
	                @WebParam(name = "cWhCode", targetNamespace = "") String cWhCode,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

	@WebResult(name = "GetAll2Result")
	@WebMethod(operationName = "GetAll2", action = "http://tempuri.org/GetAll2")
	public String GetAll2(@WebParam(name = "cInvCode", targetNamespace = "")String cInvCode,
	                @WebParam(name = "cCusCode", targetNamespace = "") String cCusCode,
	                @WebParam(name = "cDefine3", targetNamespace = "") String cDefine3,
	                @WebParam(name = "dDateB", targetNamespace = "") String dDateB,
	                @WebParam(name = "dDateE", targetNamespace = "") String dDateE,
	                @WebParam(name = "cRollback", targetNamespace = "") String cRollback,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(@WebParam(name = "cCode", targetNamespace = "") String cCode,
	                @WebParam(name = "rows", targetNamespace = "") int rows,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

}
