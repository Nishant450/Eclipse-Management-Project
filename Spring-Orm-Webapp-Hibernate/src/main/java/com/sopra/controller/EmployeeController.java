package com.sopra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sopra.entity.Employee;
import com.sopra.services.EmployeeService;

@Controller
public class EmployeeController {

	 @Autowired
	 private EmployeeService service;
	 
	 public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}

	@RequestMapping("registrationPage")
		public String showRegistrationPage() {
			return "userReg";
		}

	
		@RequestMapping(value = "registerUser", method = RequestMethod.POST)
		public ModelAndView registerUser(@RequestParam("empid") int empid,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName ) {
			
			Employee emp = new Employee();
			emp.setId(empid);
			emp.setFirstName(firstName);
			emp.setLastName(lastName);
			
			
			int result = service.save(emp);
			
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("result", "employee created with empid: " + result);
            mv.setViewName("userReg");
            return mv;
            
			
		}

	
	
	 
}