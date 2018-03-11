package com.manage.vendor.user.manager.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manage.vendor.user.dao.UserDAO;
import com.manage.vendor.user.entity.User;
import com.manage.vendor.user.exception.UserException;
import com.manage.vendor.user.manager.UserManager;
import com.manage.vendor.user.vo.UserVO;

@Component
public class UserManagerImpl implements UserManager{

	@Autowired
	private UserDAO userDAO;


	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void createOrUpdate(UserVO userVO) throws UserException {
		User user = null;
		try {
			if(null != userVO) {
				if(null != userVO.getId()) {
					user = userDAO.findOne(userVO.getId());
					user.update(userVO);
				}else {
					user = new User(userVO);
				}
				userDAO.save(user);
			}
		} catch (Exception ex) {
			throw new UserException("error.message.save", ex);
		}
	}

	@Override
	public UserVO getUser(Long id) throws UserException {
		try {
			User user = userDAO.findOne(id);
			return user.retrive();
		} catch (Exception ex) {
			throw new UserException("error.message.retrive", ex);
		}
	}

	@Override
	public List<UserVO> getAllUser() throws UserException {
		try {
			List<UserVO> voList = new ArrayList<> ();
			User user = null;
			Iterable<User> userList = userDAO.findAll();
			Iterator<User> userIt = userList.iterator();
			while(userIt.hasNext()) {
				user = userIt.next();
				voList.add(user.retrive());
			}
			return voList;
		} catch (Exception ex) {
			throw new UserException("error.message.retrive", ex);
		}
	}

	@Override
	public void deleteUserById(Long id) throws UserException {
		try {
			userDAO.delete(id);
		} catch (Exception ex) {
			throw new UserException("error.message.delete", ex);
		}
	}
}
