package com.demo_1.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo_1.entity.LearnResouce;
import com.demo_1.serviceImpl.LearnServiceImpl;

@Controller
public class MyController {
    @Autowired
    LearnServiceImpl learnServiceImpl;
    
    @RequestMapping(value="selectResouce")
    public String selectResouce(Model model) {
    	Logger log=Logger.getLogger(this.getClass());
    	log.info("调用方法selectResouce");
    	log.warn("调用方法selectResouce");
    	log.error("调用方法selectResouce");
    	System.out.println("调用selectResouce方法");
    	int id=1;
    	LearnResouce learnResouce=new LearnResouce();
    	learnResouce=learnServiceImpl.selectById(id);
    	model.addAttribute("learnList",learnResouce);
    	return "index1";
    }
}
