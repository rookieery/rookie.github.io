package com.cashsystem.cmd.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//反射取class对象
@Target(ElementType.TYPE)//用于类上
public @interface AdminCommand {
}
