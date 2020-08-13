package com.chinasoft.mapper;

import com.chinasoft.domain.User;

import java.util.List;

public interface IUserMapper {


    /**
     * 查询所有用户列表
     * @return
     */
    List<User> findAll();


    /**
     * 添加用户信息
     * @param user
     */
    void addUser(User user);


    /**
     * 删除用户
     * @param i
     */
    void deleteUser(Integer i);


    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(User user);


    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User findOne(Integer id);


    /**
     * 根据条件查询用户信息
     */
    List<User> findUserByCondition(User user);


}
