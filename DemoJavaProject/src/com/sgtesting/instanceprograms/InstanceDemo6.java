package com.sgtesting.instanceprograms;
class Employee
{
	String employeename;
	int empid;
	
}
class Department
{
	String departmentname;
	int deptno;
	
}
class Insurance
{
	String policyholder;
	String policytype;
	String termplan;
	
}
public class InstanceDemo6 
{

	public static void main(String[] args)
	{
		Employee emp1=new Employee();
		emp1.employeename="Priyanka";
        emp1.empid=0001;
        System.out.println("Employee name:"+emp1.employeename);
        System.out.println("employee id:"+emp1.empid);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        Employee emp2=new Employee();
        emp2.employeename="Devika";
        emp2.empid=0002;
        System.out.println("Employee name:"+emp2.employeename);
        System.out.println("employee id:"+emp2.empid);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        Employee emp3=new Employee();
        emp3.employeename="Ramya";
        emp3.empid=0003;
        System.out.println("Employee name:"+emp3.employeename);
        System.out.println("employee id:"+emp3.empid);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        Department dep1=new Department();
        dep1.departmentname="HR";
        dep1.deptno=01;
        System.out.println("Employee name:"+dep1.departmentname);
        System.out.println("employee id:"+dep1.deptno);
        System.out.println("++++++++++++++++++++++++++++++++++");
        

        Department dep2=new Department();
        dep2.departmentname="Accounting";
        dep2.deptno=02;
        System.out.println("Employee name:"+dep2.departmentname);
        System.out.println("employee id:"+dep2.deptno);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        Department dep3=new Department();
        dep3.departmentname="Sales";
        dep3.deptno=03;
        System.out.println("Employee name:"+dep3.departmentname);
        System.out.println("employee id:"+dep3.deptno);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        Insurance ins1=new Insurance();
        ins1.policyholder="Ramya";
        ins1.policytype="Health Insurance";
        ins1.termplan="10yrs";
        System.out.println("Policy holder:"+ins1.policyholder);
        System.out.println("Policy type:"+ ins1.policytype);
        System.out.println("Term plan:"+ ins1.termplan);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        Insurance ins2=new Insurance();
        ins2.policyholder="Priyanka";
        ins2.policytype="Health Insurance";
        ins1.termplan="20yrs";
        System.out.println("Policy holder:"+ins2.policyholder);
        System.out.println("Policy type:"+ ins2.policytype);
        System.out.println("Term plan:"+ ins2.termplan);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        Insurance ins3=new Insurance();
        ins3.policyholder="Devika";
        ins3.policytype="Health Insurance";
        ins3.termplan="11yrs";
        System.out.println("Policy holder:"+ins3.policyholder);
        System.out.println("Policy type:"+ ins3.policytype);
        System.out.println("Term plan:"+ ins3.termplan);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        
        
        
	}

}
