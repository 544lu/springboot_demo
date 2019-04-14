package com.demo_1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.demo_1.entity.LearnResouce;

@Mapper
public interface LearnDao {
    @Select("select * from learnResouce_tb where id=#{id}")
    LearnResouce selectById(int id);
}
