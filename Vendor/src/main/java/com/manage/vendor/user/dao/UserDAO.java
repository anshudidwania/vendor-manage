package com.manage.vendor.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.manage.vendor.user.entity.User;


public interface UserDAO extends CrudRepository<User, Long>{

}
