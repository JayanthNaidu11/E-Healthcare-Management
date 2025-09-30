package com.model;
import java.sql.*;
import java.util.Scanner;

import db.ConnectionProvider;
public class Admin extends Person
{

	Scanner sc =new Scanner(System.in);
	private int AutoDoctorID()
	{
@@ -86,7 +84,6 @@ public void RemoveDoctor(int id)/*Admin can remove doctor */
		catch(Exception e)
		{ System.out.println("EXCEPTION OCCURS"+e.getMessage());}  
	}
	
	public void ViewFeedback() //To view Feedback given by Patients. Admin can view all the feedback details//
	{
		try 
@@ -97,7 +94,6 @@ public void ViewFeedback() //To view Feedback given by Patients. Admin can view
		catch(Exception e)
		{ System.out.println("EXCEPTION OCCURS");}	
	}
	
	public void ViewAppointment()/*To view all the all the appointments taking place */
	{
		try 
@@ -106,8 +102,7 @@ public void ViewAppointment()/*To view all the all the appointments taking place
			DBTablePrinter.printTable(con, "Appointments");
		}
		catch(Exception e)
		{ System.out.println("EXCEPTION OCCURS");}  
		
		{ System.out.println("EXCEPTION OCCURS");}  	
	}  
	public void ViewReports()
	{
