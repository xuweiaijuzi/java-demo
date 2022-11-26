package com.asyf.demo.mapper;

import com.asyf.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author yjz
 * @Date 2021/8/18 11:05
 */
public interface UserMapper extends BaseMapper<User> {

    User findUserById(@Param(value = "id2") String id);

}
