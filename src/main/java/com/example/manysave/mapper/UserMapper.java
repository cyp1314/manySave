package com.example.manysave.mapper;

import com.example.manysave.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cyp
 * @since 2022-02-24
 */
public interface UserMapper extends BaseMapper<User> {

    User selectByPhone (String phone);
}
