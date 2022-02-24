package com.example.manysave.interceptor;

import com.example.manysave.anno.CurrentUser;
import com.example.manysave.consts.Consts;
import com.example.manysave.entity.User;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
 
/**
 * @CurrentUser 注解 解析器
 */
@Service
public class CurrentUserMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        System.out.println("1-------------------");
        return parameter.getParameterType().isAssignableFrom(User.class)
                && parameter.hasParameterAnnotation(CurrentUser.class);
    }
 
    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) {
        System.out.println("2-------------------");
        return  (User) webRequest.getAttribute(Consts.CURRENT_USER, RequestAttributes.SCOPE_REQUEST);
    }
}