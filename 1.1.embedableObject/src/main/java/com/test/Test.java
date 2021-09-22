package com.test;

import com.pojo.Address;
import com.pojo.Employee;
import com.pojo.Name;
import com.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService es = new EmployeeService();
		
		Name empName = new Name();
		empName.setFname("satya");
		empName.setLname("kuruva");
		
		Address address = new Address();
		address.setCity("bangalore");
		address.setPincode(560048);
		
		Employee e= new Employee();
		e.setEmpId(1);
		e.setEmpName(empName);
		e.setAddress(address);

		es.insert(e);
		es.getEmployee(1);
	}

}
