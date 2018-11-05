package com.fuqinqin.dao;

import com.fuqinqin.domain.Test;

import java.util.List;

/**
 * Created by fuqinqin on 2018/10/30.
 */
public interface TestDao {
    int add(Test test);
    List<Test> findAll();
}
