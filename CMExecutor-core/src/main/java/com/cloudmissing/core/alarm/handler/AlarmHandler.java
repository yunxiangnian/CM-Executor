package com.cloudmissing.core.alarm.handler;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * alarm handler. such as queue too large, or free thread to much
 * @author cloudmissing@ll.com
 * @date 2023/4/23 22:21
 */
public interface AlarmHandler {

    boolean handleQueueAlarm();

    boolean handleThreadInterrupt(ThreadPoolExecutor cmExecutor);
}
