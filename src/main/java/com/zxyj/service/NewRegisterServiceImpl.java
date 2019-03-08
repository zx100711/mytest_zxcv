package com.zxyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxyj.dao.NewRegisterDao;

@Service
public class NewRegisterServiceImpl implements NewRegisterService {
	@Autowired
	private NewRegisterDao newRegisterDao;
	public List<?> findNewRegNum(int cur_Page,int pNumbers) {
		
		return newRegisterDao.findRegNumForDay(cur_Page, pNumbers);
	}
	@Override
	public List<?> findNewRegRowCount() {
		
		return newRegisterDao.findRegRowCount();
	}
	

}
