package com.cloudmissing.core.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * CM-Executor Core Configuration. Base on Spring's @Configuration annotation
 *
 * @author cloudmissing@ll.com
 *
 */
@Configuration
@EnableConfigurationProperties(CMExecutorConfig.class)
public class CMExecutorConfiguration {

    /**
     * 内存中的线程池缓存，K 为唯一标志 V 为线程池/CM线程池
     * @return 内存中线程池的引用
     */
    @Bean
    public Map<Long, ThreadPoolExecutor> executorMetadataCacheManager() {
        return Collections.emptyMap();
    }
}
