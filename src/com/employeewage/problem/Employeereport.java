package com.employeewage.problem;

import java.util.Random;

/*
 *  employeereport class handling all operation
 */
public class Employeereport {

	public static void main(String[] args) {
		/*user display message*/
  System.out.println("Welcome to Employee Wage Computation ");
   int attendance = 0;
   Random random = new Random();
   attendance = random.nextInt(2);
   System.out.println("Attendance:"+attendance);
   if(attendance == 0) {
	   System.out.println("Employee is Absent");
   }
   else {
	   System.out.println("Employee is Present");
   }
	} 
}