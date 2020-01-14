package com.hexudong.service;

import java.util.List;

import com.hexudong.entity.Plan;

public interface PlanService {

	List<Plan> getList(String mhname);

	Plan getPlanBypid(int pid);

	void xg(Plan plan, int pid);

	void tj(Plan plan);

}
