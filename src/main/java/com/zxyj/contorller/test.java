package com.zxyj.contorller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxyj.dao.NewRegisterDao;
import com.zxyj.dao.NewRegisterDaoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring.xml") 
public class test {

	@Autowired
	private NewRegisterDao newRegisterDao;
	
	@Test
	public void test () {
		newRegisterDao.findRegNumForDay(2,3);
		
	}
}
