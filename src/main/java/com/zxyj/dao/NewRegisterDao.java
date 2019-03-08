package com.zxyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;




public interface NewRegisterDao {
    public List<?> findRegNumForDay(int cur_Page,int pNumbers);
    public List<?> findRegRowCount();
}