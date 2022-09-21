package com.sgtesting.parameterized;
class Employee
{
	String employeename;
	int empid;
	Employee(String ename,int id)
	{
		
		employeename=ename;
        empid=id;
        System.out.println("Employee name:"+employeename);
        System.out.println("employee id:"+empid);
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        
	}
	
}
class Department
{
	String departmentname;
	int deptno;
	Department(String dname,int dno)
	{
		
        departmentname=dname;
        deptno=dno;
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
	Insurance(String ph,String pt,String tp)
	{
		
        policyholder=ph;
        policytype=pt;
        termplan=tp;
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
		Employee emp1=new Employee("Priyanka",0001);
		
        Employee emp2=new Employee("Devika",0002);
        
        
        Employee emp3=new Employee("Ramya",0003);
        
        
        Department dep1=new Department("HR",01);
        

        Department dep2=new Department("Accounting",02);
        
        
        Department dep3=new Department("Salse",03);
        
        
        Insurance ins1=new Insurance("Ramya","Health Insurance","10yrs");
        
        
        Insurance ins2=new Insurance("Priyanka","Health Insurance","20yrs");
        
        Insurance ins3=new Insurance("Devika","Health Insurance","11yrs");
        
        
        
        
        
	}

}
