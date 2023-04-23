package com.cloudmissing.core.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author cloudmissing@ll.com
 * @date 2023/4/23 22:28
 */
public final class CMExecutors {
    private CMExecutors() {}

    public static ThreadPoolExecutor fixThreadCMExecutors(String executorName, int nThreads) {
        return new CMExecutor(executorName, nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }
}
