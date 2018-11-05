package com.fuqinqin.controller;

import com.fuqinqin.dao.TestDao;
import com.fuqinqin.domain.Test;
import com.fuqinqin.job.MyJob;
import com.fuqinqin.job.quartz.JobManager;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fuqinqin on 2018/10/30.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestDao testDao;
    @Autowired
    private JobManager jobManager;

    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "hello "+name;
    }

    @GetMapping("/insert/{name}")
    public int insert(@PathVariable("name") String name){
        Test test = new Test();
        test.setName(name);
        return testDao.add(test);
    }

    @GetMapping("/findAll")
    public List<Test> findAll(){
        return testDao.findAll();
    }

    @GetMapping("/addSchedule/{name}")
    public String addSchedule(@PathVariable("name") String name) throws SchedulerException {
        jobManager.addJob(name, MyJob.class);
        return "任务 "+name+" 触发成功...";
    }

}
