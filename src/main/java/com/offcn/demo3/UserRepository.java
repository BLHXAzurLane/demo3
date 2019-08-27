package com.offcn.demo3;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Classname UserRepository
 * @Description TODO
 * @Date 2019/8/27 16:08
 * @Created by Administrator
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
    User findByNameAndAge(String name,Integer age);
}
