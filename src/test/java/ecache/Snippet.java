package ecache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.junit.Test;

public class Snippet {
	@Test  
	public void testDefaultCache() {  
		
		CacheManager cacheManager = CacheManager.newInstance("src/main/resources/conf/ehcache.xml"); 
		
//	   CacheManager cacheManager = CacheManager.create();  
	   //cache1将使用默认配置  
	   cacheManager.addCache("cache1");  
	   Cache cache1 = cacheManager.getCache("cache1");  
	   Element ele = new Element("key", "value");  
	   cache1.put(ele);  
	   Element ele2 = cache1.get("key");  
	   System.out.println(ele == ele2);  //false  
	    
	   Cache test2 = cacheManager.getCache("userCache");  
	   test2.put(ele);  
	   Element ele3 = test2.get("key");  
	   System.out.println(ele == ele3);  //true  
	   cacheManager.shutdown();
	}  
}

