package com.atguigu.springboot.repository;


import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//继承JpaRepository两个泛型：操作哪个实体类和主键的类型
public interface UserRepository extends JpaRepository<User,Integer>{


}
