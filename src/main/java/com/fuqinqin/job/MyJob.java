package com.fuqinqin.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by fuqinqin on 2018/10/30.
 */
@Slf4j
public class MyJob extends QuartzJobBean {
    private static int count = 0;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        String jobName = jobDetail.getKey().getName();
        log.info("jobName={}, count={}, hash={}", jobName, count++, this.hashCode());
    }
}
