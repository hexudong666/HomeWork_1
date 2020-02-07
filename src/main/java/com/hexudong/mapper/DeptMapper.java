package com.hexudong.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hexudong.entity.Dept;

public interface DeptMapper {

	@Select("select * from dept where dname=#{deptName}")
	Dept seleteByName(@Param("deptName")String deptName);

	
	
}
