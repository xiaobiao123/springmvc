import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.tempuri12313213.CurrentStockWs;
import org.tempuri12313213.GL_accvouchWs;
import org.tempuri12313213.InventoryClassWs;
import org.tempuri12313213.SO_SOMainWs;

public class Test {
	public static void main(String[] args) {
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("classpath:conf/spring-client.xml");
		// DepartmentWs client = (DepartmentWs) ctx.getBean("client");
		// String result = client.Insert("10", "name1", "1");
		// System.out.println(result);

		// WarehouseWs client = (WarehouseWs) ctx.getBean("clientWarehouseWs");
		// String result = client.Insert("0009", "name1", "1");
		// System.out.println(result);

		 //创建客户端的ws服务代理工厂
//		 JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
//		 //指定要访问的webService的地址--wsdl文件的位置
//		 factoryBean.setAddress("http://122.224.66.27:801/GJWPub/WarehouseWs.asmx?wsdl");
//		 //指定要访问的方法的类型(方法的发布的接口类)
//		 factoryBean.setServiceClass(WarehouseWs.class);
//		 //获取指定方法
//		 WarehouseWs pic=(WarehouseWs) factoryBean.create();
//		 //远程的调用
//		 System.out.println("客户端的调用的结果是: "+pic.Insert("1", "name1", "123"));
//		
//		 System.out.println("客户端的调用的结果是: "+pic.Update("1", "仓库编码", "123"));

		// 创建客户端的ws服务代理工厂
		// JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
		// //指定要访问的webService的地址--wsdl文件的位置
		// factoryBean.setAddress("http://122.224.66.27:801/GJWPub/DepartmentWs.asmx");
		// //指定要访问的方法的类型(方法的发布的接口类)
		// factoryBean.setServiceClass(DepartmentWs.class);
		// //获取指定方法
		// DepartmentWs pic=(DepartmentWs) factoryBean.create();
		// //远程的调用
		// System.out.println("客户端的调用的结果是: "+pic.Insert("19", "12", "123"));
		//
		// System.out.println("修改部门："+pic.Update("19", "部门名称", "123"));

		// JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
		// //指定要访问的webService的地址--wsdl文件的位置
		// factoryBean.setAddress("http://122.224.66.27:801/GJWPub/ComputationUnitWs.asmx");
		// //指定要访问的方法的类型(方法的发布的接口类)
		// factoryBean.setServiceClass(ComputationUnitWs.class);
		// //获取指定方法
		// ComputationUnitWs pic=(ComputationUnitWs) factoryBean.create();
		// //远程的调用
		// System.out.println("客户端的调用的结果是: "+pic.Insert("19", "12", "123"));
		//
		// System.out.println(pic.Update("19", "购家网科技部", "123"));

//		 JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//		 // 指定要访问的webService的地址--wsdl文件的位置
//		 factoryBean.setAddress("http://122.224.66.27:801/GJWPub/CurrentStockWs.asmx");
//		 // 指定要访问的方法的类型(方法的发布的接口类)
//		 factoryBean.setServiceClass(CurrentStockWs.class);
//		 // 获取指定方法
//		 CurrentStockWs pic = (CurrentStockWs) factoryBean.create();
//		 // 远程的调用"1", "存货名称aupdate", "1", "19", "123"
//		 System.out.println("客户端的调用的结果是: " + pic.GetAll("1", "19", "123"));
//		
//		 //System.out.println(pic.GetAll("19", "购家网科技部", "123"));
//		 System.out.println(pic.GetAll2("19", "购家网科技部", "123", null, null,
//		 null, "123"));

//		 JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//		 // 指定要访问的webService的地址--wsdl文件的位置
//		 factoryBean.setAddress("http://122.224.66.27:801/GJWPub/GL_accvouchWs.asmx");
//		 // 指定要访问的方法的类型(方法的发布的接口类)
//		 factoryBean.setServiceClass(GL_accvouchWs.class);
//		 // 获取指定方法
//		 GL_accvouchWs pic = (GL_accvouchWs) factoryBean.create();
//		 // 远程的调用
//		 //System.out.println("客户端的调用的结果是: " + pic.GetAll("19", "12", "123"));
//		
//		 //System.out.println(pic.GetAll("19", "购家网科技部", "123"));
//		 System.out.println(pic.GetAll("1", "010001", "99998", null, null, "123"));

		// JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		// // 指定要访问的webService的地址--wsdl文件的位置
		// factoryBean.setAddress("http://122.224.66.27:801/GJWPub/CustomerWs.asmx");
		// // 指定要访问的方法的类型(方法的发布的接口类)
		// factoryBean.setServiceClass(CustomerWs.class);
		// // 获取指定方法
		// CustomerWs pic = (CustomerWs) factoryBean.create();
		// // 远程的调用
		// //System.out.println("客户端的调用的结果是: " + pic.GetAll("19", "12", "123"));
		//
		// //System.out.println(pic.GetAll("19", "购家网科技部", "123"));
		// System.out.println(pic.Insert("19", "12", "123", "19", "123"));
		//
		// System.out.println(pic.Update("19", "12", "123", "19", "123"));
		//

//		 JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//		 // 指定要访问的webService的地址--wsdl文件的位置
//		 factoryBean.setAddress("http://122.224.66.27:801/GJWPub/CustomerClassWs.asmx");
//		 // 指定要访问的方法的类型(方法的发布的接口类)
//		 factoryBean.setServiceClass(CustomerClassWs.class);
//		 // 获取指定方法
//		 CustomerClassWs pic = (CustomerClassWs) factoryBean.create();
//		 // 远程的调用
//		 //System.out.println("客户端的调用的结果是: " + pic.GetAll("19", "12", "123"));
//		
//		 //System.out.println(pic.GetAll("19", "购家网科技部", "123"));
//		 System.out.println(pic.Insert("19", "12", "123"));
//		
//		 System.out.println(pic.Update("19", "客户分类同步", "123"));

//		 JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//		 // 指定要访问的webService的地址--wsdl文件的位置
//		 factoryBean.setAddress("http://122.224.66.27:801/GJWPub/InventoryClassWs.asmx");
//		 // 指定要访问的方法的类型(方法的发布的接口类)
//		 factoryBean.setServiceClass(InventoryClassWs.class);
//		 // 获取指定方法
//		 InventoryClassWs pic = (InventoryClassWs) factoryBean.create();
//		 // 远程的调用
//		 //System.out.println(pic.GetAll("19", "购家网科技部", "123"));
//		 System.out.println(pic.Insert("Z", "大类", "123"));
//		 System.out.println(pic.Update("1", "大类存货分类编码", "123"));

		// JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		// // 指定要访问的webService的地址--wsdl文件的位置
		// factoryBean.setAddress("http://122.224.66.27:801/GJWPub/InventoryWs.asmx");
		// // 指定要访问的方法的类型(方法的发布的接口类)
		// factoryBean.setServiceClass(InventoryWs.class);
		// // 获取指定方法
		// InventoryWs pic = (InventoryWs) factoryBean.create();
		// // 远程的调用
		// //System.out.println(pic.GetAll("19", "购家网科技部", "123"));
		// System.out.println(pic.Insert("1", "存货名称a", "1", "19", "123"));
		// System.out.println(pic.Update("1", "存货名称aupdate", "1", "19", "123"));

//		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//		// 指定要访问的webService的地址--wsdl文件的位置
//		factoryBean.setAddress("http://122.224.66.27:801/GJWPub/PersonWs.asmx");
//		// 指定要访问的方法的类型(方法的发布的接口类)
//		factoryBean.setServiceClass(PersonWs.class);
//		// 获取指定方法
//		PersonWs pic = (PersonWs) factoryBean.create();
//		// 远程的调用
//		System.out.println("客户端的调用的结果是: " + pic.Insert("1919", "员工名称", "19", "1", "123"));
//
//		System.out.println("修改部门：" + pic.Update("1919", "员工名称update", "19", "1", "123"));
		
		
//		 JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
//		 //指定要访问的webService的地址--wsdl文件的位置
//		 factoryBean.setAddress("http://122.224.66.27:801/GJWPub/fitemss97Ws.asmx?wsdl");
//		 //指定要访问的方法的类型(方法的发布的接口类)
//		 factoryBean.setServiceClass(fitemss97Ws.class);
//		 //获取指定方法
//		 fitemss97Ws pic=(fitemss97Ws) factoryBean.create();
//		 //远程的调用
//		 System.out.println("客户端的调用的结果是: "+pic.Insert("1", "name1", "123"));
//		
//		 System.out.println("客户端的调用的结果是: "+pic.Update("1", "项目档案名称", "123"));
		
		
//		 JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
//		 String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
//							"<Root>" +
//							 	"<Head dDate=\"2015-07-22\" cSOCode=\"999918\" cCusCode=\"9999\" cDepCode=\"9901\""
//							 	+ " cPersonCode=\"\" iTaxRate=\"\" cDefine1=\"仓库\" cDefine2=\"库位\""
//							 	+ " dPreDateBT=\"2015-07-31\" dcreatesystime=\"2015-07-22\" />" +
//							 "<Bodys>" +
//							 	"<row id=\"1\">" +
//							 	    "<iRowNo>1</iRowNo>" +
//							 		"<cInvCode>9999</cInvCode>" +
//							 		"<dPreDate>2015-07-30</dPreDate>" +
//							 		"<iQuantity>2</iQuantity>" +
//							 		"<iQuotedPrice>22</iQuotedPrice>" +
//							 		"<iTaxUnitPrice>22</iTaxUnitPrice>" +
//							 		"<iSum>44</iSum>" +
//							 		"<iNatSum>44</iNatSum>" +
//							 		"<iTaxRate>0</iTaxRate>" +
//							 		"<bgift>False</bgift>" +
//							 	"</row>" +
//							 	"<row id=\"2\">" +
//							 	    "<iRowNo>2</iRowNo>" +
//							 		"<cInvCode>9999</cInvCode>" +
//							 		"<dPreDate>2015-07-30</dPreDate>" +
//							 		"<iQuantity>10</iQuantity>" +
//							 		"<iQuotedPrice>22</iQuotedPrice>" +
//							 		"<iTaxUnitPrice>22</iTaxUnitPrice>" +
//							 		"<iSum>44</iSum>" +
//							 		"<iNatSum>44</iNatSum>" +
//							 		"<iTaxRate>0</iTaxRate>" +
//							 		"<bgift>False</bgift>" +
//							 	"</row>" +
//							 "</Bodys>" + 
//							 "</Root>";
//		 
//		 //指定要访问的webService的地址--wsdl文件的位置
//		 factoryBean.setAddress("http://122.224.66.27:801/GJWPub/SO_SOMainWs.asmx?wsdl");
//		 //指定要访问的方法的类型(方法的发布的接口类)
//		 factoryBean.setServiceClass(SO_SOMainWs.class);
//		 //获取指定方法
//		 SO_SOMainWs pic=(SO_SOMainWs) factoryBean.create();
//		 //远程的调用
//		 System.out.println("客户端的调用的结果是: "+pic.Insert(xml, "123"));
//		
//		 System.out.println("客户端的调用的结果是: "+pic.Update(xml, "123"));
		 
		 
		 
		 JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		 // 指定要访问的webService的地址--wsdl文件的位置
		 factoryBean.setAddress("http://122.224.66.27:801/GJWPub/CurrentStockWs.asmx");
		 // 指定要访问的方法的类型(方法的发布的接口类)
		 factoryBean.setServiceClass(CurrentStockWs.class);
		 // 获取指定方法
		 CurrentStockWs pic1 = (CurrentStockWs) factoryBean.create();
		 // 远程的调用"1", "存货名称aupdate", "1", "19", "123"
		// System.out.println("客户端的调用的结果是: " + pic1.GetAll("WAB01-003-6397", null, "123"));
		
		 //System.out.println(pic1.GetAll("9999", null, "123"));
		 
		 System.out.println(pic1.GetAll2("9999", null, null, null, null,
		 "", "123"));
		 
//System.out.println(	 pic1.Update("0000000002", 1, "123"));
		
		 
		 
		 
	}
}