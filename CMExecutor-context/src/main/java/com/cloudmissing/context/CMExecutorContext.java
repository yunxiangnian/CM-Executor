package com.cloudmissing.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * CM TheadPoolExecutor context，can stats CMExecutor
 */
public class CMExecutorContext implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private static final Map<String, ThreadPoolExecutor> THREAD_POOLS_CACHE = new ConcurrentHashMap<>(256);


    public static boolean containThreadPool(String beanName) {
        return THREAD_POOLS_CACHE.containsKey(beanName);
    }

    @Override
    public void afterPropertiesSet() {
        Map<String, ThreadPoolExecutor> beanName2Pool = applicationContext.getBeansOfType(ThreadPoolExecutor.class);
        THREAD_POOLS_CACHE.putAll(beanName2Pool);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
