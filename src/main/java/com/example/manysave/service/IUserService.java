package com.example.manysave.service;

import com.example.manysave.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cyp
 * @since 2022-02-24
 */
public interface IUserService extends IService<User> {

    Map register (User user);
}
