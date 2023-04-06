package com.cloudmissing.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.TimeUnit;

/**
 * expose config to user
 * @author cloudmissing@ll.com
 */
@ConfigurationProperties(prefix = "spring.cm.executor")
public class CMExecutorConfig {

    private String executorNamePrefix;

    private String threadNamePrefix;

    private Integer coreThread;

    private Integer maxThread;

    private TimeUnit keepTimeUnit = TimeUnit.SECONDS;


}
