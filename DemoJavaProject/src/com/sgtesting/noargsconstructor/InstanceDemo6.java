package com.sgtesting.noargsconstructor;
class Employee
{
	String employeename;
	int empid;
	Employee()
	{
		
		employeename="Priyanka";
        empid=0001;
        System.out.println("Employee name:"+employeename);
        System.out.println("employee id:"+empid);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        
        employeename="Devika";
        empid=0002;
        System.out.println("Employee name:"+employeename);
        System.out.println("employee id:"+empid);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        
        employeename="Ramya";
        empid=0003;
        System.out.println("Employee name:"+employeename);
        System.out.println("employee id:"+empid);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
	}
	
}
class Department
{
	String departmentname;
	int deptno;
	Department()
	{
		
        departmentname="HR";
        deptno=01;
        System.out.println("Employee name:"+departmentname);
        System.out.println("employee id:"+deptno);
        System.out.println("++++++++++++++++++++++++++++++++++");
        

        
        departmentname="Accounting";
        deptno=02;
        System.out.println("Employee name:"+departmentname);
        System.out.println("employee id:"+deptno);
        System.out.println("++++++++++++++++++++++++++++++++++");
       
        departmentname="Sales";
        deptno=03;
        System.out.println("Employee name:"+departmentname);
        System.out.println("employee id:"+deptno);
        System.out.println("++++++++++++++++++++++++++++++++++");
	}
	
}
class Insurance
{
	String policyholder;
	String policytype;
	String termplan;
	Insurance()
	{
		
        policyholder="Ramya";
        policytype="Health Insurance";
        termplan="10yrs";
        System.out.println("Policy holder:"+policyholder);
        System.out.println("Policy type:"+ policytype);
        System.out.println("Term plan:"+ termplan);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        
        policyholder="Priyanka";
        policytype="Health Insurance";
        termplan="20yrs";
        System.out.println("Policy holder:"+policyholder);
        System.out.println("Policy type:"+ policytype);
        System.out.println("Term plan:"+ termplan);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        
        policyholder="Devika";
        policytype="Health Insurance";
        termplan="11yrs";
        System.out.println("Policy holder:"+policyholder);
        System.out.println("Policy type:"+ policytype);
        System.out.println("Term plan:"+ termplan);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
	}
	
}
public class InstanceDemo6 
{

	public static void main(String[] args)
	{
		Employee emp1=new Employee();
		
        Employee emp2=new Employee();
        
        
        Employee emp3=new Employee();
        
        
        Department dep1=new Department();
        
        

        Department dep2=new Department();
        
        
        Department dep3=new Department();
        
        
        Insurance ins1=new Insurance();
        
        
        Insurance ins2=new Insurance();
        
        Insurance ins3=new Insurance();
        
        
        
        
        
	}

}
