package com.hexudong.Demo;

import java.io.IOException;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hexudong.entity.Dept;
import com.hexudong.entity.Plan;
import com.hexudong.mapper.DeptMapper;
import com.hexudong.mapper.PlanMapper;
import com.hexudong.service.Impl.PlanServiceImpl;
import com.hexudong.utils.entity.FileUtil;

//测试类必备条件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")

public class InsertFile {
	
	@Autowired
	PlanMapper pm;
	
	@Autowired
	DeptMapper dp;
	

	//读取文件
		@Test
		public void testReadLines() throws IOException {
			
			List<String> lines = FileUtil.readByLines("E:\\新建文本文档.txt");
			
			//lines.forEach(x->{System.out.println(" x is " + x);});
			
			for (String string : lines) {
				
				String[] split = string.split("\\|\\|");
				
				
//				System.out.println("每个项目的项目名称为:+++"+split[0]);//工程名称
//				System.out.println("项目金额为:"+split[1]);//项目金额
//				System.out.println("分管领导为:"+split[3]);//分管领导
//				System.out.println("项目说明为:"+split[2]);//项目说明
//				System.out.println("分管部门为:"+split[4]);//分管部门
				
				/*plan.setPname(split[0]);//工程名称
				plan.setPname(split[1]);//项目金额
				plan.setManager(split[3]);//分管领导
				plan.setContent(split[2]);//项目说明
*/				String deptName = split[4];//分管部门
				Dept dept = dp.seleteByName(deptName);
				
				Plan plan = new Plan(null, split[0],split[1] , split[3], split[2], dept.getDid());
				
				System.err.println(plan);
				
				pm.add(plan);
				
			}
			
		}
	
}