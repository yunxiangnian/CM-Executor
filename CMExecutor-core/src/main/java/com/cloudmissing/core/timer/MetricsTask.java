package com.cloudmissing.core.timer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TimerTask;

public abstract class MetricsTask extends TimerTask {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final String metricsName;

    protected MetricsTask(String metricsName) {
        LOG.info("init metricsTask, metricsName is {}", metricsName);
        this.metricsName = metricsName;
    }

    /**
     * subclass declare performanceLoad result,
     * to show the performance of the currently monitored objects
     * @return performanceMetrics result
     */
    public abstract Double getPerformanceLoad();
}
