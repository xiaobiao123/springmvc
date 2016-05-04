package cn.springmvc.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.springmvc.model.User;

public interface UserDAO {

	/**
	 * 
	 * 添加新用户
	 * 
	 * @param user
	 * 
	 * @return
	 */

	public int insertUser(User user);

	
	 @Select("select * from Useraaa where id=#{userId}")  
	 public User getUser(@Param("userId") Long userId);  
}
