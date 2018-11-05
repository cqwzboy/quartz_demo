package com.fuqinqin.job.quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * 
 * @author silongz
 *
 */
@Component
public class JobManager {

	@Autowired
	private Scheduler scheduler;

	private static final String DEFAULT_GROUP = "default_group";

	public void addJob(String name, Class<? extends QuartzJobBean> clazz) throws SchedulerException {
	    JobDetail jobDetail = JobBuilder.newJob(clazz)
                .withIdentity(name, DEFAULT_GROUP)
                .withDescription("this is "+name+"'sJOB")
                .storeDurably()
                .build();
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        jobDataMap.put("hello", "word");
        scheduler.addJob(jobDetail, false);

        SimpleTrigger simpleTrigger = TriggerBuilder.newTrigger()
                .withIdentity(name, DEFAULT_GROUP)
                .forJob(name, DEFAULT_GROUP)
                .withDescription("this is "+name+"'s Trigger")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(2)
                        .repeatForever())
                .build();

        scheduler.scheduleJob(simpleTrigger);
    }
}
