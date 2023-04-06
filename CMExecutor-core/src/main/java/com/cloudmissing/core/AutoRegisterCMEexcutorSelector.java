package com.cloudmissing.core;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/**
 * register BeanPostProcessor for CMExecutor
 * @author cloudmissing
 */
public class AutoRegisterCMEexcutorSelector implements DeferredImportSelector, ApplicationContextAware {

    private ApplicationContext applicationContext;


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Set<MethodMetadata> annotatedMethods = importingClassMetadata.getAnnotatedMethods(Conditional.class.getName());
        if (!CollectionUtils.isEmpty(annotatedMethods)) {
            for (MethodMetadata annotatedMethod : annotatedMethods) {
                Conditional conditional = (Conditional) annotatedMethod;
                Class<? extends Condition>[] value = conditional.value();
                for (Class<? extends Condition> clazz : value) {
                    try {
                        Condition condition = ReflectionUtils.accessibleConstructor(clazz).newInstance();

                    } catch (NoSuchMethodException |
                            InstantiationException |
                            IllegalAccessException |
                            InvocationTargetException e) {

                    }
                }
            }
        }
        return new String[0];
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
