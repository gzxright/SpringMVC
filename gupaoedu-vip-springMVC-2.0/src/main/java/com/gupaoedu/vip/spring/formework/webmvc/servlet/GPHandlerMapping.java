package com.gupaoedu.vip.spring.formework.webmvc.servlet;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.regex.Pattern;


public class GPHandlerMapping{

    private Object controller;
    //反射 可以获取对象的属性名 方法名方法参数 等信息
    private Method method;
    //正则  可以做不同数据的校验匹配
    private Pattern pattern; //url 的封装
    public GPHandlerMapping(Pattern pattern,Object controller, Method method) {
        this.controller = controller;
        this.method = method;
        this.pattern = pattern;
    }
    public Object getController() {
        return controller;
    }
    public void setController(Object controller) {
        this.controller = controller;
    }
    public Method getMethod() {
        return method;
    }

}
