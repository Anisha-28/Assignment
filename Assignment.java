import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		String inp;
		double yearlySavings=0;	
		double monthlySalary;
		double monthlyExpense;
		double monthlySavings;
		double HousePrice;
		double dp;
		double yearlysavings[] = new double [6];
		  // array of five person savings yearly
		double waitingTime [] =new double [6];
		  // array of down payment of five person
		
		
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Do you want to start the system or exit the system ");
		System.out.println("Start");
		System.out.println("Exit");
		inp = scanner.nextLine();
		String test="start";
		String text="exit";
		
		   if(inp.toLowerCase().contains(test.toLowerCase())) {
			     // Even if the user enters start in any casing the system will ignore that
			   printHash();
			   
			   System.out.println("\n" + "Welcome to my system");
			   System.out.println("Student ID- k190755");
			   System.out.println("Student Name- Anisha");
			   System.out.println("Current Date - " + java.time.LocalDate.now());
			     // java.time.LocalDate.now() is used to get the current date in the program
			
			   printHash();
			     
			      for (int i=1; i<yearlysavings.length; i++) {
				       yearlySavings=0;
				
				   {
					
					
					  for (int j=1;j<13;j++) {
					
						System.out.println("\n" + "Enter the month" + " " + (j) + " salary of person " + (i));
						monthlySalary=scanner.nextDouble();
						  // storing the monthly salary in monthlySalary
						while(!(monthlySalary>0.00)) {
							System.out.println("Enter the correct salary !! It should be a positive number");
							monthlySalary=scanner.nextDouble();
						}
						  // if the user enters the salary 0 or less, the message will appear asking to re-enter and then storing that
						System.out.println("Enter the month" + " " + (j) + " expense of person " + (i));
						monthlyExpense=scanner.nextDouble();
						  // storing the monthly expense in monthlyExpense
						
						while(!(monthlyExpense>0.00)) {
							System.out.println("Enter the correct expense !! It should be a positive number");
							monthlyExpense=scanner.nextDouble();
						}
						  // if the user enters the expense 0 or less, the message will appear asking to re-enter and then storing that
						
						monthlySavings = monthlySalary - monthlyExpense;
						System.out.println("The monthly savings of month " + (j) + " of person " + (i) + " is" + " " + monthlySavings);
						  // calculation of monthly savings
						yearlySavings = yearlySavings+monthlySavings;
						  // calculation of yearly savings
					
						yearlysavings[i]=yearlySavings;
						  // storing yearly savings in a array
						
					 }
						System.out.println("The yearly savings of person" + " " + (i) + " is " + yearlysavings[i]);
							   
						
							
							
						System.out.println("Enter the preferred house price of person " + (i));
						HousePrice=scanner.nextDouble();
							  // asking the house price
						if(HousePrice<500000) {
							dp=((5.00/100.00)*HousePrice);
						}
						else if(HousePrice>=500000 && HousePrice>1000000) {
							dp=((10.00/100.00)*HousePrice);
							
					    }
						else {
							dp=((15.00/100.00)*HousePrice);
							
						}
							  // calculation of down payment
							
							  
						
							
							double waitingtime = dp/yearlySavings;
						    waitingTime[i]=waitingtime;
						
						
							  // calculation of waiting time
							
							
							 
							
				  }
			}
		
			       double totalYearlySavings=0;
				       for(int i=0; i<yearlysavings.length; i++) {
					   
					   
					   totalYearlySavings+=yearlysavings[i];
					   
					   
			         // calculation of average yearly savings
				   
				      }
				   double average=totalYearlySavings/5;
				 
		          
			
		           double totalWaitingTime=0;
		               for(int i=0; i<waitingTime.length; i++) {
		            	   totalWaitingTime+=waitingTime[i];
		               }
		            // calculation of average waiting time
		               double averageWaitingTime=totalWaitingTime/5;
		               
			printHash();
			System.out.println("\n" + "According to data entered from five users on current date,");
			System.out.println("Their Average yearly savings = $" + average + " and they need average of " + averageWaitingTime + " years to save their down payment");
			System.out.println("Thank you for using the system.");
			
			printHash();
		}
		
			else if (inp.toLowerCase().contains(text.toLowerCase())) {
				  // Even if the user enters exit in any casing the system will ignore that
				printHash();
			    System.out.println("Thank you using this system");
			    System.out.println("Good Bye");
			    System.out.println("Student ID- k190755");
			    System.out.println("Student Name- Anisha ");
			    printHash();
		   }
			else {
				System.out.println("Error !! ");
			}
	
		


	
	

	}


	public static void printHash() {
		
		for(int a=0; a<80; a++) {
			System.out.print("#");
		}
	}
		/*
		 public static double calculation(double HousePrice) {
   
		double dop;
		if(HousePrice<500000) {
			dop=((5.00/100.00)*HousePrice);
		}
		else if(HousePrice>=500000 && HousePrice>1000000) {
			dop=((10.00/100.00)*HousePrice);
			
	    }
		else {
			dop=((15.00/100.00)*HousePrice);
			
		}
		
		return dop;
		}
		*/
	
	
   
}
