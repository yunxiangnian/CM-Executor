package com.cloudmissing.core.annotation;

import com.cloudmissing.core.AutoRegisterCMEexcutorSelector;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.cloudmissing.core.annotation.EnableCMExecutor.EXT_CONFIG_PATH;

/**
 * use springboot coding style, Annotation and ImportSelector.
 * its present use CM-Executor manage executor, can use @CMExecutor annotation
 * to implement auto monitor
 *
 * @author cloudmissing@ll.com
 * @since 0.5
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AutoRegisterCMEexcutorSelector.class)
@ImportResource({"classpath:" + EXT_CONFIG_PATH + "/*.yml", "classpath:" + EXT_CONFIG_PATH + "/*.yml"})
public @interface EnableCMExecutor {
    String EXT_CONFIG_PATH = "/config/ext";

    boolean enableMetrics() default false;

    boolean autoNotifyOnWarning() default false;

}
