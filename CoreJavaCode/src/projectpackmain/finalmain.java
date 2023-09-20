package projectpackmain;

import projectpack1.*;
import projectpack2.*;
import projectpack3.*;
import projectpack4.*;

public class finalmain {

	public static void main(String[] args)
	{
		intro obj = new intro();
		intro1 obj1 = new intro1();
		obj.msg();
		obj.msg2();
		obj1.msg();
		
		orderveg obj3 = new orderveg();
		ordernonveg obj4 = new ordernonveg();
		obj3.vegmenu();
		obj4.nonvegmenu();
		
		vegorderplacing obj6 = new vegorderplacing();
		nonvegorderplacing obj7 = new nonvegorderplacing();
		obj6.order();
		obj7.order();
		
		bill obj5 = new bill();
		obj5.totbill();
	}
}
