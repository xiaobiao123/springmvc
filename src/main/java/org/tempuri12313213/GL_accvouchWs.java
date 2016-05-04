package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "GL_accvouchWs", portName = "GL_accvouchWsSoap12")
public interface GL_accvouchWs {
	@WebResult(name = "GetAllResult")
	@WebMethod(operationName = "GetAll", action = "http://tempuri.org/GetAll")
	public String GetAll(@WebParam(name = "citem_id", targetNamespace = "") String citem_id,
	                @WebParam(name = "ccus_id", targetNamespace = "") String ccus_id,
	                @WebParam(name = "cdefine3", targetNamespace = "") String cdefine3,
	                @WebParam(name = "dDateB", targetNamespace = "") String dDateB,
	                @WebParam(name = "dDateE", targetNamespace = "") String dDateE,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

}
