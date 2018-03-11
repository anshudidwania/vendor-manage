package com.manage.vendor.user.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manage.vendor.user.exception.UserException;
import com.manage.vendor.user.manager.UserManager;
import com.manage.vendor.user.vo.UserVO;


@RestController
public class UserService {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private UserManager userManager;
    
	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	@RequestMapping(path="/create", method=RequestMethod.POST)
	public String createUser(@RequestBody UserVO userVO){
		try {
			userManager.createOrUpdate(userVO);
		} catch (UserException e) {
			e.printStackTrace();
			return "User addition failed!!";
		}
		return "User added successfully!!";
	}
	
	@RequestMapping(path="/update", method=RequestMethod.POST)
	public String updateUser(@RequestBody UserVO userVO){
		try {
			userManager.createOrUpdate(userVO);
		} catch (UserException e) {
			e.printStackTrace();
			return "User updation failed!!";
		}
		return "User updated successfully!!";
	}
	
	@RequestMapping(path="/getUser/{id}", method=RequestMethod.GET)
	public UserVO getUser(@PathVariable(value = "id") Long id) throws UserException{
			return userManager.getUser(id);
	}
	
	@RequestMapping(path="/getAllUser", method=RequestMethod.GET)
	public List<UserVO> getAllUser() throws UserException{
			return userManager.getAllUser();
	}
	
	@RequestMapping(path="/deleteUser/{id}", method=RequestMethod.GET)
	public String deleteUserById(@PathVariable(value = "id") Long id){
		try {
			userManager.deleteUserById(id);
		} catch (UserException e) {
			e.printStackTrace();
			return "User deletion failed!!";
		}
		return "User deleated successfully!!";
		
	}
	
	@RequestMapping("/greeting")
    public UserVO greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new UserVO(counter.incrementAndGet(),
                            String.format(template, name));
    }

}
