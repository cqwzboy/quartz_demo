package com.fuqinqin.job.quartz;

import java.io.Serializable;
import java.util.Date;

/**
 * 封装quartz的JobDetail
 * @author silongz
 *
 */
public class TJKJobDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2452465619645690766L;
	
	/**
	 * 运行job操作
	 */
	public static final int OPER_RUN = 1;
	
	/** 
	 * 暂停job操作
	 */
	public static final int OPER_PAUSE = 2;
	
	/** 
	 * 恢复job操作 
	 */
	public static final int OPER_RESUME = 3;

	/**
	 * 任务名称
	 */
	private String name;
	
	/**
	 * 任务分组
	 */
	private String group;
	
	/**
	 * 任务状态
	 */
	private Integer status;

	/**
	 * 开始时间
	 */
	private Date startTime;
	
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 执行时长
	 */
	private long execTimes;
	
	/**
	 * 执行结果信息
	 */
	private String resultMsg;
	
	/**
	 * 任务类型: 1定时任务, 2立即执行任务
	 */
	private int type;
	
	/**
	 * jobClass，当前都是由同一个类统一调度
	 */
	private String jobClass = "com.tj.platform.job.service.job.ScheduleCenter";
	
	/**
	 * 任务的描述
	 */
	private String description;
	
	/**
	 * 任务的上次触发时间
	 */
	private Date preFireTime;
	
	/**
	 * 任务的下次触发时间
	 */
	private Date nextFireTime;
	
	/**
	 * 任务参数: 格式同url参数
	 */
	private String jobParam;
	
	/**
	 * 任务负责人
	 */
	private String creator;

    /**
	 * 邮箱
	 */
	private String email;

	/**
	 * 状态名, 用于界面显示
	 */
	private String statusName;
	
	/**
	 * JOB执行的cron表达式
	 */
	private String cronExpression ;
	
	/**
	 * 间隔多少秒执行一次
	 */
	private Integer interval ;
	
	/**
	 * JOB执行的优先级
	 */
	private int priority ;
	
	/**
	 * JOB消息通道key是否排除jobName
	 */
	private Boolean jobMsgKeyExcludeJobName ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getJobClass() {
		return jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getNextFireTime() {
		return nextFireTime;
	}

	public void setNextFireTime(Date nextFireTime) {
		this.nextFireTime = nextFireTime;
	}

	public String getJobParam() {
		return jobParam;
	}

	public void setJobParam(String jobParam) {
		this.jobParam = jobParam;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public void setExecTimes(long execTimes) {
		this.execTimes = execTimes;
	}

	public long getExecTimes() {
		return execTimes;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusName() {
		return statusName;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getPreFireTime() {
		return preFireTime;
	}

	public void setPreFireTime(Date preFireTime) {
		this.preFireTime = preFireTime;
	}

	public Boolean getJobMsgKeyExcludeJobName() {
		return jobMsgKeyExcludeJobName;
	}

	public void setJobMsgKeyExcludeJobName(Boolean jobMsgKeyExcludeJobName) {
		this.jobMsgKeyExcludeJobName = jobMsgKeyExcludeJobName;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
