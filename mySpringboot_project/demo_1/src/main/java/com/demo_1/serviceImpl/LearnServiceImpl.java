package com.demo_1.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo_1.dao.LearnDao;
import com.demo_1.entity.LearnResouce;
import com.demo_1.service.LearnService;

@Service()
public class LearnServiceImpl implements LearnService {
    @Autowired 
    LearnDao learnDao;
    
	@Override
	public LearnResouce selectById(int id) {
		// TODO Auto-generated method stub
		return learnDao.selectById(id);
	}

}
