package com.example.manysave.config;

import com.example.manysave.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Component
public class TokenUtils {

    public User getUserByToken (String token) {
        return new User(1,"张三","15555555555","北京","zhangsan","123456","admin", LocalDateTime.now(),"admin",LocalDateTime.now(),"0");
    }
}
