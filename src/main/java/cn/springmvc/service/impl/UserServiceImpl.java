package cn.springmvc.service.impl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDAO userDAO;

	public int insertUser(User user) {
		logger.info("日志测试开始");
		logger.debug("This is debug message.");
		logger.error("日志测试开始");
		int k = 0;
		try {
			k = userDAO.insertUser(user);
			userDAO.getUser(26l);
		} catch (Exception e) {
			logger.error("插入数据库失败", e);
		}
		return k;
		
	}

	public User getUser(Long userId) {
		return userDAO.getUser(userId);
	}

}
