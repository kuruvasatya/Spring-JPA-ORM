package com.test;

import com.pojo.Employee;
import com.service.EmployeeService;

public class Test {
	public static void main(String[] args) {
//		Employee e = new Employee();
//	    e.setEmpId("xyx1");
//		e.setEmpName("satya");
//		e.setEmpSalary(125000);
//		e.setEmpDept("HR");
//		
		EmployeeService es = new EmployeeService();
//		es.insert(e);
		
		System.out.println(es.getEmployee("xyx1"));
	}
}
