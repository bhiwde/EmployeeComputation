package com.employeewage.problem;

import java.util.Random;

/*
 *  employee report class handling all operation
 */
public class Employeereport {

	public static void main(String[] args) {
		/*user display message*/
  System.out.println("Welcome to Employee Wage Computation ");
   int attendance ;
  int daily_wage = 0;
  int emptype ;
  int i;
  int month_wage = 0;
  final int IS_ABSENT = 0;
  final int WAGE_PER_HR = 20;
  final int FULL_TIME_HR =8;
  final int PART_TIME_HR = 4;
  final int IS_PART_TIME = 0;
  final int IS_full_TIME = 1;

  
 Random random = new Random();
  
  for( i = 1;i<21;i++) {
	  System.out.println("Day"+i);
	 
	  
	  
  attendance = random.nextInt(2);
  System.out.println("Attendance:"+attendance);

  if(attendance == IS_ABSENT) {
	   System.out.println("Employee is Absent");
   }
   else  {
		   System.out.println("Employee is Present");
		   
	        emptype = random.nextInt(2);
      switch(emptype)
            {
            case IS_PART_TIME :
			   System.out.println("Employee is Part Time:");
			   daily_wage = WAGE_PER_HR * PART_TIME_HR;
		  break;
            case IS_full_TIME :
			   
			   System.out.println("Employee is Full Time:");
               daily_wage   = WAGE_PER_HR * FULL_TIME_HR;
               
              break;
              }
   
             System.out.println("Daily Wage :"+daily_wage);
               month_wage = month_wage + daily_wage  ;
           
   } 
  System.out.println("**********************************");

	  }
 
  System.out.println("Employee Total  Monthly  Wage: "+month_wage);

 

   }
  }
   
   
	


	



