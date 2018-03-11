package com.manage.vendor.register.dao;

import org.springframework.data.repository.CrudRepository;

import com.manage.vendor.register.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
