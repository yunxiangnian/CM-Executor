package com.cloudmissing.core;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * superclass about CMExecutor
 */
public interface CMExecutor {

    /**
     * proxy executor's name.
     * @return target custom name
     * @see BeanDefinition#getBeanClassName()
     */
    String executorName();


}
