package com.org.springframework.annotation;

import java.lang.annotation.*;

/**
 * 容器注解阿聚合若干个{@link PropertySource}注解
 * 可以自然的使用，声明几个嵌套的{@link PropertySource}注解。
 * 也可以结合Java8对重复注解的支持使用，{@link PropertySource}可以在
 * {@linkplain ElementType#TYPE type}声明多次，隐式的生成此容器注解
 *
 * @author JiangLei
 * @since 4.0
 * @see PropertySource
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PropertySources {
    PropertySource[] value();
}
