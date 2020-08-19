package com.fh.common;

import java.lang.annotation.*;

@Documented
@Target(ElementType.PARAMETER)  //用于描述注解的使用范围 用在参数上面
@Retention(RetentionPolicy.RUNTIME)   //定义了该注解被保留的时间长短
public @interface MemberAnnotation {
}
