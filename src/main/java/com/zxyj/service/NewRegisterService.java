package com.zxyj.service;

import java.util.List;

import com.zxyj.entity.Dustbin;

public interface NewRegisterService {
    public List<?> findNewRegNum(int cur_Page,int pNumbers);
    public List<?> findNewRegRowCount();
}
