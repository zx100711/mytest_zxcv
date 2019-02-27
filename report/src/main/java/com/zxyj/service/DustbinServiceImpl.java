package com.zxyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxyj.dao.DustbinDao;
import com.zxyj.dao.UserDao;
import com.zxyj.entity.Dustbin;

@Service
public class DustbinServiceImpl implements DustbinService{

    @Autowired
    private DustbinDao dustbinDao;

    public List<?> finds(){
        return dustbinDao.findAllDustbion();
    }
}

