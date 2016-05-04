package pro.webws.client;  

import java.lang.reflect.Field;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

import cn.com.service.IHelloWorld;
import cn.springmvc.model.User;

public class TestField {  
    public static void main(String[] args) {  
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:conf/spring-client.xml");  
//        IHelloWorld client = (IHelloWorld) ctx.getBean("client");  
//        String result = client.sayHello("你好!");  
//        System.out.println(result);  
        
      User user =new User();
      user.setId(1);
      user.setNickname("name");
      user.setState(1);
      
      
      toXMLString(user);
    }  
    
    
    
    /**
	 * 将model转化为XML
	 * @return
	 */
	public static String toXMLString( User user ){
		StringBuffer sb = new StringBuffer();
		Field[] fields = user.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				sb.append("<"+field.getName()+">"+field.get(user)+"</"+field.getName()+">");
			} catch (Exception e) {
				
				return null;
			} 
		}
		System.out.println(sb.toString());
		return "<GYJ>"+sb.toString()+"</GYJ>";
		
		
	}
}  