package com.cloudmissing.core.config;

import com.cloudmissing.core.alarm.contact.DingTalkAlarm;
import com.cloudmissing.core.alarm.contact.MobileAlarm;
import com.cloudmissing.core.alarm.contact.WeChatAlarm;
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

    private DingTalkAlarm dingTalk;

    private MobileAlarm mobile;

    private WeChatAlarm weChat;


}
