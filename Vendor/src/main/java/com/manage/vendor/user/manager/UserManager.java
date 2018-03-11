package com.manage.vendor.user.manager;

import java.util.List;

import com.manage.vendor.user.exception.UserException;
import com.manage.vendor.user.vo.UserVO;

public interface UserManager {
	
	public void createOrUpdate(UserVO userVO) throws UserException;
	
	public UserVO getUser(Long id) throws UserException;
	
	public List<UserVO> getAllUser() throws UserException;
	
	public void deleteUserById(Long id) throws UserException;
	
	

}
