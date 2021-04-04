package com.cg.eis.service;

public class Serviceimpl implements EmployeeService{

	/*Salary	Designation	Insurance scheme
	>5000 and < 20000	System Associate	Scheme C
	>=20000 and <40000	Programmer	Scheme B
	>=40000	Manager	Scheme A
	<5000 	Clerk	No Scheme*/

	@Override
	public void empservice(String scheme) {
		// TODO Auto-generated method stub
		if(scheme=="System Associate")
			System.out.println("Services Of System Associate");
		else if(scheme=="Programmer")
			System.out.println("Services Of Programmer ");
		else if(scheme=="Manager")
			System.out.println("Services Of Manager ");
		else if(scheme=="Clerk")
			System.out.println("Services Of Clerk ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
