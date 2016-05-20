package cn.springmvc.controller;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tempuri12313213.DepartmentWs;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@Controller
@RequestMapping("/")
public class UserController{
	@Autowired
	private UserService userService;
	@RequestMapping("index")
	@Cacheable(value = {"user"}, key="all")
	public String index() {
		
		User user=new User();
		user.setId(123);
		user.setNickname("nickname");
		user.setState(0);
		//userService.insertUser(user);
		return "index";

	}
	

	public static void main(String[] args) {
		
//		//创建客户端的ws服务代理工厂
		JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
		//指定要访问的webService的地址--wsdl文件的位置
		factoryBean.setAddress("http://122.224.66.27:801/GJWPub/DepartmentWs.asmx");
		//指定要访问的方法的类型(方法的发布的接口类)
		factoryBean.setServiceClass(DepartmentWs.class);
		//获取指定方法
		DepartmentWs pic=(DepartmentWs) factoryBean.create();
		//远程的调用
		System.out.println("客户端的调用的结果是: "+pic.Insert("14", "name", "123"));
//		//创建一个客户端的代理工厂
//		ClientProxyFactoryBean clientProxy=new ClientProxyFactoryBean();
//		clientProxy.setServiceClass(GL_accvouchWs.class);
//		clientProxy.setAddress("http://122.224.66.27:801/GJWPub/GL_accvouchWs.asmx");
//		GL_accvouchWs pic=(GL_accvouchWs) clientProxy.create();
//		System.out.println(pic.GetAll("12","12","12","12","12", "123"));
		
    }
}
