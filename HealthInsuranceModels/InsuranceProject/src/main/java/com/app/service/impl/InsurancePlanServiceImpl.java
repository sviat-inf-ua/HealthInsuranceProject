package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IInsurancePlanDao;
import com.app.models.InsurancePlan;
import com.app.service.IInsurancePlanService;
@Service("insurancePlanService")
public class InsurancePlanServiceImpl implements IInsurancePlanService {

	@Autowired
	private IInsurancePlanDao insurancePlanDao;
	@Override
	public void createPlan(InsurancePlan insurancePlan) {
		try {
			insurancePlanDao.createPlan(insurancePlan);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void deletePlan(int id) {
		try {
			insurancePlanDao.deletePlan(id);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void updatePlan(InsurancePlan plan) {
	try {
		insurancePlanDao.updatePlan(plan);
	} catch(Exception ex) {
		ex.printStackTrace();
	}

	}

	@Override
	public InsurancePlan getInsurancePlanById(int id) {
		InsurancePlan plan = null;
		try {
			plan = insurancePlanDao.getInsurancePlanById(id);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return plan;
	}

	@Override
	public List<InsurancePlan> getAllInsurancePlan() {
		List<InsurancePlan> list = null;
		try {
			list = insurancePlanDao.getAllInsurancePlan();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

}
