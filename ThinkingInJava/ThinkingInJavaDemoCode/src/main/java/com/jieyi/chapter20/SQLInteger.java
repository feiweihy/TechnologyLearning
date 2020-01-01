package com.jieyi.chapter20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * SQLInteger
 *
 * @author wei.feng
 * @date 2020-1-1
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {

    String name() default "";

    Constraints constraints() default @Constraints;

    /**
     * 给其中某个元素设置值，则这样定义
     */
    //Constraints constraints() default @Constraints(unique =true);
}
