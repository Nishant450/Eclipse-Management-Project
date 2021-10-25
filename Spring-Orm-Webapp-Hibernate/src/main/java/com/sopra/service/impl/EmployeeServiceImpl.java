package com.sopra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.EmployeeDao;
import com.sopra.entity.Employee;
import com.sopra.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	 @Autowired
	 private EmployeeDao dao;

	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Transactional
	public int save(Employee emp) {
		//business logic
		return dao.create(emp);
	}
	 
}
