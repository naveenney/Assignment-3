import java.util.Scanner;
public class Assignment3 {

	static Scanner scan=new Scanner(System.in);
	
	//1.Take three numbers from the user and print the greatest number.
	
	public static void printGreatestNumber()
	{
		System.out.print("enter the values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println(Math.max(a,Math.max(b,c)));
	}	
	
	//2. Write a Java program to find the number of days in a given month and year.
	
	public static void findNumOfDays()
	{
		System.out.print("enter the YEAR:");
		int year=scan.nextInt();
		System.out.print("enter the MONTH<1 to 12>:");
		int month=scan.nextInt();
		    switch(month)
		    {
		       case 1,3,5,7,8,10,12:
		    	   System.out.println("31 Days");
		           break;
		       case 2:
		    	   if(year%4==0)
		    		   System.out.println("29 Days");
		    	   else
		    		   System.out.println("28 Days");
		    }
		}
		
	//3. Create a program that takes a student's score as input and outputs their corresponding grade.
	
	public static void studentsGrade()
	{
		System.out.print("enter the mark:");
		int mark=scan.nextInt();
		
		if(mark>=0&&mark<=100)
		{
			if(mark>90&&mark<=100)
				System.out.println("GRADE A");
			else if(mark>80&&mark<=90)
				System.out.println("GRADE B");
			else if(mark>70&&mark<=80)
				System.out.println("GRADE C");
			else if(mark>60&&mark<=70)
				System.out.println("GRADE D");
			else if(mark>50&&mark<=60)
				System.out.println("GRADE E");
			else if(mark>35&&mark<=50)
				System.out.println("GRADE F");
			else 
				System.out.println("FAIL");
		}
		else
			System.out.println("invalid input");
	}

	//4. Write a program to print multiplication table of a given number in a neat format
	
	public static void printMultipleTable()
	{
		System.out.print("enter the number:");
		int num=scan.nextInt();
		System.out.print("enter the table limit:");
		int tablelimit=scan.nextInt();
		int res=0;
		System.out.println("MULTIPLICATION TABLE FOR THE VALUE : "+num);
		for(int i=1;i<=tablelimit;i++)
		{
			res=i*num;
			System.out.println(i+" * "+num+" = "+res);
		}
	}

	//5. Write a program to print factorial of a given number using loop

	public static void factorial()
	{
	   System.out.print("enter the value:");
	   int n=scan.nextInt();
	   int res=1;
	   for(int i=1;i<=n;i++)
	   {
		   res*=i;
	   }
		System.out.println(res);
	}
	
	}

