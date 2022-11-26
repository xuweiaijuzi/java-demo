package com.asyf.demo.controller;

import com.asyf.demo.common.Result;
import com.asyf.demo.entity.User;
import com.asyf.demo.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author yjz
 * @Date 2021/8/18 10:17
 */
@RestController
@RequestMapping(value = "/mybatisplus")
@Api(tags = "mybatisplus测试")
public class MybatisPlusController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "test", method = RequestMethod.POST)
    @ApiOperation(value = "查询用户列表")
    public Object test() {
        List<User> userList = userMapper.selectList(null);
        return Result.success(userList);
    }

    @RequestMapping(value = "findUserList", method = RequestMethod.POST)
    @ApiOperation(value = "查询用户列表-分页")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页数", required = true, type = "int", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "每页数量", required = true, type = "int", example = "3")
    })
    public Object findUserList(Integer pageNum, Integer pageSize) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        Page<User> page = new Page<>(pageNum, pageSize);
        Page<User> userPage = userMapper.selectPage(page, queryWrapper);
        return Result.success(userPage);
    }

    @RequestMapping(value = "findUserById", method = RequestMethod.POST)
    @ApiOperation(value = "查询用户-自定义xml")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", required = true, type = "string", example = "1")
    })
    public Object findUserById(String id) {
        User user = userMapper.findUserById(id);
        return Result.success(user);
    }

}
