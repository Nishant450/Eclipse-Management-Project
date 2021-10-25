package com.sopra.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sopra.dao.EmployeeDao;
import com.sopra.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	 @Autowired
	 private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public int create(Employee emp) {
		
		Integer result = (Integer)template.save(emp);
		System.out.println(emp.getId());
		return result;
	}
	 
	 
}