package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestCases.GetRequestAllData;
import org.testing.TestCases.GetRequestHit;
import org.testing.TestCases.PostRequestHit;
import org.testing.TestCases.PutRequestHit;
import org.testing.TestCases.TestCase5;
import org.testing.TestCases.TestCase6;
import org.testing.TestCases.TestCase7;
import org.testing.TestCases.TestCase8;

public class TriggerClass 											//TC2..8th ..we will call the TC1 and TC2 method 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.out.println("************TC1************** ");
		PostRequestHit post=new PostRequestHit();
		post.TC1();
		
		System.out.println("************TC2************** ");
		GetRequestHit get=new GetRequestHit();
		get.TC2();						
		
		System.out.println("************TC3************** ");
		GetRequestAllData Get_All=new GetRequestAllData();
		Get_All.TC3();	
		
		System.out.println("************TC4************** ");
		PutRequestHit put=new PutRequestHit();
		put.TC4();	
		
		System.out.println("************TC5************** ");
		TestCase5 Test5=new TestCase5();
		Test5.TC5();
		
		System.out.println("************TC6************** ");
		TestCase6 Test6=new TestCase6();
		Test6.TC6();	
		
		System.out.println("************TC7************** ");
		TestCase7 Test7=new TestCase7();
		Test7.TC7();	
		
		System.out.println("************TC8************** ");
		TestCase8 test8=new TestCase8();
		test8.TC8();		
	}
}
