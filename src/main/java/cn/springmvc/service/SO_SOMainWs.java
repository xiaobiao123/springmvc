package cn.springmvc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", serviceName = "SO_SOMainWs", portName = "SO_SOMainWsSoap12")
public interface SO_SOMainWs {
	@WebResult(name = "InsertResult")
	@WebMethod(operationName = "Insert", action = "http://tempuri.org/Insert")
	public String Insert(
					@WebParam(name = "xml", targetNamespace = "") String xml,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update", action = "http://tempuri.org/Update")
	public String Update(
					@WebParam(name = "xml", targetNamespace = "") String xml,
	                @WebParam(name = "cSerialnumber", targetNamespace = "") String cSerialnumber);

}
