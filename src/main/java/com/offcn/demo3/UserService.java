package com.offcn.demo3;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/8/27 16:09
 * @Created by Administrator
 */
public interface UserService {

    //获取全部用户数据
    public List<User> getUserList();
    //新增用户数据
    public void createUser(User user);
    //获取指定id用户信息
    public User getUser(Long id);
    //更新指定id用户信息
    public void updateUser(Long id,User user);
    //删除指定id用户
    public void deleteUser(Long id);
}
