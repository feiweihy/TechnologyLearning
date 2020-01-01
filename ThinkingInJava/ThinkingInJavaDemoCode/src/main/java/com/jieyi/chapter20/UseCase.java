package com.jieyi.chapter20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * UseCase
 *
 * @author wei.feng
 * @date 2020-1-1
 * @Target用来定义你的注解将应用于什么地方
 * @Retention用来定义该注解在哪一个级别可用，源代码SOURCE、类文件CLASS还是运行时RUNTIME
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    public int id();

    /**
     * 如果在注解某个方法时没有给出description的值，则该注解的处理器就会使用此元素的默认值
     **/
    public String description() default "no description";
}
