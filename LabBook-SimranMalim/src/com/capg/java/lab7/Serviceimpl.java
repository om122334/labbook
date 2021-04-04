package com.capg.java.lab7;

import java.util.Map;

public class Serviceimpl implements EmployeeService{

	/*Salary	Designation	Insurance scheme
	>5000 and < 20000	System Associate	Scheme C
	>=20000 and <40000	Programmer	Scheme B
	>=40000	Manager	Scheme A
	<5000 	Clerk	No Scheme*/

	@Override
	public void empservice(int eid,String name,String scheme) {
		// TODO Auto-generated method stub
		if(scheme=="Scheme C")
			System.out.println("Services Of System Associate");
		else if(scheme=="Scheme B")
			System.out.println("Services Of Programmer ");
		else if(scheme=="Scheme A")
			System.out.println("Services Of Manager ");
		else if(scheme=="No Scheme")
			System.out.println("Services Of Clerk ");
		
		EmployeeDAO edao=new EmployeeDAO();
		Employee emp=new Employee();
		emp.setEid(eid);
		emp.setName(name);
		emp.setInsuranceScheme(scheme);
		
		
	}
	
	

}
