package ecache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.junit.Test;

public class TestEcash1 {

	@Test
	public void test() throws InterruptedException {
	     CacheManager manager = new CacheManager("src/main/resources/ecache/ehcache_cluster1.xml");  
	     
	     // 取得Cache  
	     Cache cache = manager.getCache("UserCache");  
	     Element element = new Element("client1" + System.currentTimeMillis(), "client1");  
	     cache.put(element);  
	     while (true)  
	     {  
	         Thread.sleep(5000);  
	         System.out.println("\n");  
	         for (Object key : cache.getKeys())  
	         {  
	             System.out.println(key + ":" + cache.get(key));  
	         }  
	     }
	}
	
	
	@Test
	public void test2() throws InterruptedException {
		CacheManager manager = new CacheManager("src/main/resources/ecache/ehcache_cluster2.xml");  
	     Cache cache = manager.getCache("UserCache");  
	     Element element = new Element("client2" + System.currentTimeMillis(), "client2");  
	     cache.put(element);  
	     while (true)  
	     {  
	         Thread.sleep(5000);  
	         System.out.println("\n");  
	         for (Object key : cache.getKeys())  
	         {  
	             System.out.println(key + ":" + cache.get(key));  
	         }  
	     }  
	}
	
	@Test
	public void test3() throws InterruptedException {
		CacheManager manager = new CacheManager("src/main/resources/ecache/ehcache_cluster3.xml");  
	       Cache cache = manager.getCache("UserCache");  
	  
	       Element element = new Element("client3" + System.currentTimeMillis(), "client3");  
	       cache.put(element);  
	       while (true)  
	       {  
	           Thread.sleep(5000);  
	           System.out.println("\n");  
	           for (Object key : cache.getKeys())  
	           {  
	               System.out.println(key + ":" + cache.get(key));  
	           }  
	       } 
	}
}
