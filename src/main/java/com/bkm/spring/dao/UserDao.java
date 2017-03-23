package com.bkm.spring.dao;

import com.bkm.spring.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/3/19.
 */
@Repository
public interface UserDao
{
    //@Param是一个注解，表示传进去的参数名字，在xml当中通过@Param括号里面的名字，可以获取到传进去的参数
    User selectUserById(@Param("id") int id);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone);

    List<User> selectAllUser();

    int insert(@Param("id") int id,@Param("name") String name,@Param("phone") String phone);

}
