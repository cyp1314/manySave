package com.example.manysave.service.impl;

import com.example.manysave.entity.User;
import com.example.manysave.mapper.UserMapper;
import com.example.manysave.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cyp
 * @since 2022-02-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map register (User user) {
        Map result = new HashMap();
        User u = userMapper.selectByPhone(user.getPhone());

        if (u!=null){
            result.put("code","0001");
            result.put("msg","用户已经存在哦！");
            return result;
        }

        int insert = userMapper.insert(user);
        if (insert>0){
            result.put("code","200");
            result.put("msg","用户注册成功！");
            return result;
        }
        result.put("code","400");
        result.put("msg","用户注册失败！");
        return result;
    }
}
