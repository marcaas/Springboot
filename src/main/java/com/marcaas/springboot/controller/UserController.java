package com.marcaas.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marcaas.springboot.entity.User;
import com.marcaas.springboot.mapper.UserMapper;
import com.marcaas.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 新增或更新接口
    @PostMapping
    public boolean save(@RequestBody User user) {
       return userService.saveUser(user);
    }

    // 查询所有数据
    @GetMapping
    public List<User> findAll() {
        return userService.list();
    }

    // 按id删除数据
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return userService.removeById(id);
    }

    // 分页查询
    // 接口路径：/user/page?pageNum=1&pageSize=10
    // @RequestParam接受
//    @GetMapping("/page")
//    public Map<String, Object> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
//        pageNum = (pageNum - 1) * pageSize;
//        List<User> data = userMapper.selectPage(pageNum, pageSize);
//        Integer total = userMapper.selectTotal();
//        Map<String, Object> res = new HashMap<>();
//        res.put("data", data);
//        res.put("total", total);
//        return res;
//    }
    // 分页查询 - mybatis-plus的方式
    @GetMapping("/page")
    public IPage<User> findPage(@RequestParam Integer pageNum,
                                @RequestParam Integer pageSize,
                                @RequestParam String username) {
        IPage<User> page = new Page<>(pageNum, pageSize);
        QueryWrapper<User>queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username", username);
        return userService.page(page, queryWrapper);
    }

}
