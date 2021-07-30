import java.util.Scanner;
import java.util.Arrays;
public class Student {

	public static String firstname[] = {"Nada","Eman","Mahmoud"};
	public static String lastname []= {"Ahmed","Ibrahim","Omar"};
	public static String password[]= {"1234","2345","3456"};
	public static String ID[]= {"21521" , "21522" , "21523"};
	
		public static void main(String[] args) {
			fun();
		}
		
	
		public static void fun()	{
			System.out.println("Welcome to OOP Management System: \n ");
			System.out.println(" Please Enter Your Username");
			Scanner input = new Scanner(System.in);
			String n = input.next();
			
			System.out.println(" Please Enter Your Password");	
			String p = input.next();
			
			System.out.println("Please Enter Your ID");	
			String d = input.next();
			
			
		
			for( int i=0 ; i< firstname.length ;i++ ) {
				
				if(firstname[i].equals(n) && password[i].equals(p) && ID[i].equals(d)) {
					System.out.println("Username is successfully logined \n");
				
					if ("21521".equals(d)) {
						System.out.println("Hello Nada Ahmed");
						mainpage();
					}
					else if ("21522".equals(d)) {
						System.out.println("Hello Eman Ibrahim");
						mainpage1();
					}
					else if ("21523".equals(d)) {
						System.out.println("Hello Mahmoud Omar");
						mainpage2();
					}
			}
				}
	
			for( int i=0 ; i< firstname.length ;i++ ) {
				if(!firstname[i].equals (n) || !password[i].equals (p) || !ID[i].equals(d) ) {
						System.out.println("Invalid Username or Password or ID \n");
						fun();}
				}
			}


	public static void ListCourses() {
		 Scanner input = new Scanner(System.in);
		 System.out.println("1- Math 1. code: MTH");
		 System.out.println("2- Circuits 2. code: ELC");
		 System.out.println("3-Programming Principles. code: CMP ");
		 System.out.println("Choise Your Option");
		 System.out.println("1..View Course.");
		 System.out.println("2..Step back.");
		 System.out.println("3..Log out.");
		 
		 int s = input.nextInt();
		 switch(s) {
		 case 1:
			 ViewCourse() ;
		 case 2:
			 Stepback();
		 case 3: 
			 Logout();
			 
		 }
	 }
	 public static void Stepback() {
		 mainpage();
	 }
	 public static void Logout() {
		 fun();
	 }
	 
	 public static void ViewCourse() {
		 System.out.println("Please enter course code:");
		 Scanner input = new Scanner(System.in);
		 String code = input.next();
		 if ("MTH".equals(code)) {
			 System.out.println("Course Name : Integration and Linear Algebra.");
			 System.out.println("Course Code: MTH.");
			 System.out.println("Materials: \n 1-Lec1.pdf \n 2-Lec2.pdf");
			 System.out.println("Assignments: \n 1-Task1 →  done. \n 2-Task2 → Not responded.");
			 System.out.println("Do you want to submit any Assignment? \n 1- Yes. \n 2- No. \n 3- Log out.");
			 int op = input.nextInt();
			 switch (op) {
			 case 1:
				 System.out.println("Please enter Assignment Number:");
				 int num = input.nextInt();
				 System.out.println("Please enter assignment Solution:");
				 String sol = input.next();
				 System.out.println("Do you want to Log out or go to main page ? \n Choose:\n 1-Log out. \n 2-main page.  ");
				 int out = input.nextInt();
				 switch (out) {
				 case 1:
					 Logout();
				 case 2:
					 mainpage();
				 }
			 case 2:
				 ListCourses();
			 case 3:
				 Logout();
			 
			 }
		 }
		 else if ("ELC".equals(code)) {
			 System.out.println("Course Name : Electrical Circuits.");
			 System.out.println("Course Code: ELC.");
			 System.out.println("Materials: \n 1-Lec1.pdf \n 2-Lec2.pdf  \n 3-Lec3.pdf");
			 System.out.println("Assignments: \n 1-Task1 → done. \n 2-Task2 → done.");
			 System.out.println("DO you want to do another operation");
			 System.out.println("1- YES \n 2- NO");
				 int O = input.nextInt();
			 switch (O) {
			  case 1:
				mainpage();
			 case 2:
				 Logout();
			 }
		 }
		 else if ("CMP".equals(code)) {
			 System.out.println("Course Name : Object-Oriented Programming .");
			 System.out.println("Course Code: CMP.");
			 System.out.println("Materials: \n 1-Lec1.pdf  ");
			 System.out.println("Assignments: \n 1-Task 1 → done. ");
			 System.out.println("DO you want to do another operation");
			 System.out.println("1- YES \n 2- NO");
				int O = input.nextInt();
			 switch (O) {
			 case 1 :
				mainpage();
			 case 2:
				 Logout();
			 }
		 }
		 else {
			 System.out.println("Invalid code");
			 ViewCourse();
		 }
	 }
	 public static void Registertoanewcourse() {
		 System.out.println("Please enter course code:");
		 Scanner input = new Scanner(System.in);
		 String code = input.next();
		 System.out.println("Its done");
		 System.out.println("DO you want to do another operation");
		 System.out.println("1- YES \n 2- NO");
			int O = input.nextInt();
		 switch (O) {
		 case 1 :
			mainpage();
		 case 2:
			 Logout();
		 }
	 }
 public static void Gradereport() {
		 System.out.println("MTH Grade is : 130/150");
		 System.out.println("ELC Grade is : 135/150");
		 System.out.println("CMP Grade is : 90/125");
		 System.out.println("DO you want to do another operation");
		 System.out.println("1- YES \n 2- NO");
		 Scanner input = new Scanner(System.in);
		 int O = input.nextInt();
		 switch (O) {
		 case 1 :
			mainpage();
		 case 2:
			 Logout();
		 }
	 }

	public static void mainpage() {
		Scanner input = new Scanner(System.in);
		
		 System.out.println("Choose:\n 1-List Courses. \n 2-View Course. \n 3-Register to a new course. \n 4-Grade Report. \n 5-Log out.");
		
		 int op = input.nextInt();
		 switch (op) {
         case 1:
        	 ListCourses();
        	  break;
         case 2:
        	 ViewCourse();
        	  break;
         case 3:
        	 Registertoanewcourse();
        	 break;
        	 case 4:
        		  Gradereport();
        		 break;
        	 case 5:
        		 Logout();
                  break;
	}}
	public static void mainpage1() {
		Scanner input = new Scanner(System.in);
		 System.out.println("Choose:\n 1-List Courses. \n 2-View Course. \n 3-Register to a new course. \n 4-Grade Report. \n 5-Log out.");
	
		 int c = input.nextInt();
		 switch (c) {
         case 1:
        	 ListCourses1();
        	  break;
         case 2:
        	 viewcourse();
        	  break;
         case 3:
        	 Registertoanewcourse1();
        	 break;
        	 case 4:
        		  Gradereport1();
        		 break;
        	 case 5:
        		 Logout();
                  break;}
	}
	public static void mainpage2() {
		Scanner input = new Scanner(System.in);
		 System.out.println("Choose:\n 1-List Courses. \n 2-View Course. \n 3-Register to a new course. \n 4-Grade Report. \n 5-Log out.");
		
		 int o = input.nextInt();
		 switch (o) {
         case 1:
        	 ListCourses2();
        	  break;
         case 2:
        	 Viewcourse();
        	  break;
         case 3:
        	 Registertoanewcourse2();
        	 break;
        	 case 4:
        		  Gradereport2();
        		 break;
        	 case 5:
        		 Logout();
                  break;}
		}

	public static void viewcourse() {
		System.out.println("Please enter course code:");
		 Scanner input = new Scanner(System.in);
		 String code = input.next();
		 if ("MTH".equals(code)) {
			 System.out.println("Course Name : Integration and Linear Algebra.");
			 System.out.println("Course Code: MTH.");
			 System.out.println("Materials: \n 1-Lec1.pdf \n 2-Lec2.pdf");
			 System.out.println("Assignments: \n 1-Task1 → Not responded. \n 2-Task2 → Not responded.");
			 System.out.println("Do you want to submit any Assignment? \n 1- Yes. \n 2- No. \n 3- Log out.");
			 int op = input.nextInt();
			 switch (op) {
			 case 1:
				 System.out.println("Please enter Assignment Number:");
				 int num = input.nextInt();
				 System.out.println("Please enter assignment Solution:");
				 String sol = input.next();
				 System.out.println("Do you want to Log out or go to main page ? /n Choose:\n 1-Log out. \n 2-main page.  ");
				 int out = input.nextInt();
				 switch (out) {
				 case 1:
					 Logout();
				 case 2:
					 mainpage1();
				 }
			 case 2:
				 ListCourses1();
			 case 3:
				 Logout();
			 
			 }
		 }
		 else if ("ELC".equals(code)) {
			 System.out.println("Course Name : Electrical Circuits.");
			 System.out.println("Course Code: ELC.");
			 System.out.println("Materials: \n 1-Lec1.pdf \n 2-Lec2.pdf  \n 3-Lec3.pdf");
			 System.out.println("Assignments: \n 1-Task1 → done. \n 2-Task2 → Not responded.");
			 System.out.println("Do you want to submit any Assignment? \n 1- Yes. \n 2- No. \n 3- Log out.");
			 int op = input.nextInt();
			 switch (op) {
			 case 1:
				 System.out.println("Please enter Assignment Number:");
				 int num = input.nextInt();
				 System.out.println("Please enter assignment Solution:");
				 String sol = input.next();
				 System.out.println("DO you want to do another operation");
				 System.out.println("1- YES \n 2- NO");
				 int O = input.nextInt();
				 switch (O) {
				  case 1:
					mainpage1();
				 case 2:
					 Logout();
				 }
			 case 2:
				 ListCourses1();
			 case 3:
				 Logout();
			 
			 }
			
		
		 }
		 else if ("CMP".equals(code)) {
			 System.out.println("Course Name : Object-Oriented Programming .");
			 System.out.println("Course Code: CMP.");
			 System.out.println("Materials: \n 1-Lec1.pdf  ");
			 System.out.println("Assignments: \n 1-Task 1 → done. ");
			 System.out.println("DO you want to do another operation");
			 System.out.println("1- YES \n 2- NO");
				int O = input.nextInt();
			 switch (O) {
			 case 1 :
				mainpage1();
			 case 2:
				 Logout();
			 }
		 }
		 else {
			 System.out.println("Invalid code");
			 viewcourse();
		 }
	}
	
	public static void Viewcourse() {
		System.out.println("Please enter course code:");
		 Scanner input = new Scanner(System.in);
		 String code = input.next();
		 if ("MTH".equals(code)) {
			 System.out.println("Course Name : Integration and Linear Algebra.");
			 System.out.println("Course Code: MTH.");
			 System.out.println("Materials: \n 1-Lec1.pdf \n 2-Lec2.pdf");
			 System.out.println("Assignments: \n 1-Task1 → done. \n 2-Task2 → done.");
			 System.out.println("Do you want to Log out or go to main page ? /n Choose:\n 1-Log out. \n 2-main page.  ");
				 int out = input.nextInt();
				 switch (out) {
				 case 1:
					 Logout();
				 case 2:
					 mainpage2();
				 }
		 }
		 else if ("ELC".equals(code)) {
			 System.out.println("Course Name : Electrical Circuits.");
			 System.out.println("Course Code: ELC.");
			 System.out.println("Materials: \n 1-Lec1.pdf \n 2-Lec2.pdf  \n 3-Lec3.pdf");
			 System.out.println("Assignments: \n 1-Task1 → Not responded. \n 2-Task2 → Not responded.");
			 System.out.println("Do you want to submit any Assignment? \n 1- Yes. \n 2- No. \n 3- Log out.");
			 int op = input.nextInt();
			 switch (op) {
			 case 1:
				 System.out.println("Please enter Assignment Number:");
				 int num = input.nextInt();
				 System.out.println("Please enter assignment Solution:");
				 String sol = input.next();
				 System.out.println("DO you want to do another operation");
				 System.out.println("1- YES \n 2- NO");
					 int O = input.nextInt();
				 switch (O) {
				  case 1:
					mainpage2();
				 case 2:
					 Logout();
				 }
			 case 2:
				 ListCourses2();
			 case 3:
				 Logout();
			 
			 }
		
		 }
		 else if ("CMP".equals(code)) {
			 System.out.println("Course Name : Object-Oriented Programming .");
			 System.out.println("Course Code: CMP.");
			 System.out.println("Materials: \n 1-Lec1.pdf  ");
			 System.out.println("Assignments: \n 1-Task 1 → Not responded. ");
			 System.out.println("Do you want to submit any Assignment? \n 1- Yes. \n 2- No. \n 3- Log out.");
			 int op = input.nextInt();
			 switch (op) {
			 case 1:
				 System.out.println("Please enter Assignment Number:");
				 int num = input.nextInt();
				 System.out.println("Please enter assignment Solution:");
				 String sol = input.next();
				 System.out.println("DO you want to do another operation");
				 System.out.println("1- YES \n 2- NO");
					int O = input.nextInt();
				 switch (O) {
				 case 1 :
					mainpage2();
				 case 2:
					 Logout();
				 }
			 case 2:
				 ListCourses2();
			 case 3:
				 Logout();
			 
			 }
		
		 }
		 else {
			 System.out.println("Invalid code");
			 Viewcourse();
		 }
	}
	
	public static void Gradereport1() {
		 System.out.println("MTH Grade is : 120/150");
		 System.out.println("ELC Grade is : 115/150");
		 System.out.println("CMP Grade is : 100/125");
		 System.out.println("DO you want to do another operation");
		 System.out.println("1- YES \n 2- NO");
		 Scanner input = new Scanner(System.in);
		 int O = input.nextInt();
		 switch (O) {
		 case 1 :
			mainpage1();
		 case 2:
			 Logout();
		 }
	 }
	
	public static void Gradereport2() {
		 System.out.println("MTH Grade is : 140/150");
		 System.out.println("ELC Grade is : 130/150");
		 System.out.println("CMP Grade is : 105/125");
		 System.out.println("DO you want to do another operation");
		 System.out.println("1- YES \n 2- NO");
		 Scanner input = new Scanner(System.in);
		 int O = input.nextInt();
		 switch (O) {
		 case 1 :
			mainpage2();
		 case 2:
			 Logout();
		 }
	 }
	
	public static void ListCourses1() {
		 Scanner input = new Scanner(System.in);
		 System.out.println("1- Math 1. code: MTH");
		 System.out.println("2- Circuits 2. code: ELC");
		 System.out.println("3-Programming Principles. code: CMP ");
		 System.out.println("Choise Your Option");
		 System.out.println("1..View Course.");
		 System.out.println("2..Step back.");
		 System.out.println("3..Log out.");
		 
		 int s = input.nextInt();
		 switch(s) {
		 case 1:
			 viewcourse() ;
		 case 2:
			 Stepback1();
		 case 3: 
			 Logout();
			 
		 }
	 }
	 public static void Stepback1() {
		 mainpage1();
	 }
	
		public static void ListCourses2() {
			 Scanner input = new Scanner(System.in);
			 System.out.println("1- Math 1. code: MTH");
			 System.out.println("2- Circuits 2. code: ELC");
			 System.out.println("3-Programming Principles. code: CMP ");
			 System.out.println("Choise Your Option");
			 System.out.println("1..View Course.");
			 System.out.println("2..Step back.");
			 System.out.println("3..Log out.");
			 
			 int s = input.nextInt();
			 switch(s) {
			 case 1:
				 Viewcourse() ;
			 case 2:
				 Stepback2();
			 case 3: 
				 Logout();
				 
			 }
		 }
		 public static void Stepback2() {
			 mainpage2();
		 }
		
		 public static void Registertoanewcourse1() {
			 System.out.println("Please enter course code:");
			 Scanner input = new Scanner(System.in);
			 String code = input.next();
			 System.out.println("Its done");
			 System.out.println("DO you want to do another operation");
			 System.out.println("1- YES \n 2- NO");
				int O = input.nextInt();
			 switch (O) {
			 case 1 :
				mainpage1();
			 case 2:
				 Logout();
			 }
		 }
		 
		 public static void Registertoanewcourse2() {
			 System.out.println("Please enter course code:");
			 Scanner input = new Scanner(System.in);
			 String code = input.next();
			 System.out.println("Its done");
			 System.out.println("DO you want to do another operation");
			 System.out.println("1- YES \n 2- NO");
				int O = input.nextInt();
			 switch (O) {
			 case 1 :
				mainpage2();
			 case 2:
				 Logout();
			 }
		 }
	}
