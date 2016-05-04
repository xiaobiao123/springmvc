package org.tempuri12313213;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

@WebService(targetNamespace = "http://tempuri.org/",serviceName="WarehouseWs",portName="WarehouseWsSoap12")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface  WarehouseWs{
	
	@WebResult(name = "InsertResult")
	//@Action(input="Insert",output="InsertResponse")
	@WebMethod(operationName = "Insert",action="http://tempuri.org/Insert")
	public String Insert(@WebParam(name = "cWhCode", targetNamespace = "")String cWhCode, 
					@WebParam(name = "cWhName", targetNamespace = "")String cWhName, 
					@WebParam(name = "cSerialnumber", targetNamespace = "")String cSerialnumber);
	
	@WebResult(name = "UpdateResult")
	@WebMethod(operationName = "Update",action="http://tempuri.org/Update")
	public String Update(@WebParam(name = "cWhCode", targetNamespace = "")String cWhCode, 
					@WebParam(name = "cWhName", targetNamespace = "")String cWhName, 
					@WebParam(name = "cSerialnumber", targetNamespace = "")String cSerialnumber);

}
