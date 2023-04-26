package com.employeewage.problem;

import java.util.Random;

/*
 *  employeereport class handling all operation
 */
public class Employeereport {

	public static void main(String[] args) {
		/*user display message*/
  System.out.println("Welcome to Employee Wage Computation ");
   int attendance ;
  int daily_wage = 0;
  int emptype ;
  
  final int IS_ABSENT = 0;
  final int WAGE_PER_HR = 20;
  final int FULL_DAY_HR =8;
  final int FULL_TIME_HR =8;
  final int PART_TIME_HR = 4;
  final int IS_PART_TIME = 0;
  
 Random random = new Random();
  attendance = random.nextInt(2);
  
  System.out.println("Attendance:"+attendance);
  if(attendance == IS_ABSENT) {
	   System.out.println("Employee is Absent");
   }
   else  {
		   System.out.println("Employee is Present");
	       daily_wage   = WAGE_PER_HR * FULL_DAY_HR;
	       
	       emptype = random.nextInt(2);
            if(emptype == IS_PART_TIME ) {
			   System.out.println("Employee is Part Time:");
			   daily_wage = WAGE_PER_HR * PART_TIME_HR;
		   }
		   else {
			   
			   System.out.println("Employee is Full Time:");

		       daily_wage   = WAGE_PER_HR * FULL_TIME_HR;
	  }
   System.out.println("Employee Daily Wage "+daily_wage);
   
   }
	}
}

	



