package oasis;
import java.util.Scanner;  
public class ATMExample {
	   
	    public static void main(String args[] )  
	    {  
	        
	        int balance = 200000, withdraw, deposit;  
	          
	        Scanner sc = new Scanner(System.in);  
	          
	        while(true)  
	        {  
	            System.out.println("ATM INTERFACE OPERATIONS");  
	            System.out.println(" 1 for Transaction History");  
	            System.out.println(" 2 for Withdraw");  
	            System.out.println(" 3 for Deposit ");   
	            System.out.println(" 4 for EXIT"); 
	            System.out.println(" ************************************************"); 
	            System.out.print("\nChoose the operation you want to perform:\n ");  
	              	           
	            int choice = sc.nextInt();  
	            switch(choice)  
	            {  
	                case 1:  
	                    //displaying transcation history
	                    System.out.println("Balance : "+balance);  
	                    System.out.println("");  
	                    break;    
	                case 2:  //withdrawing money from user
	                    System.out.print("Enter money to be withdrawn:");  
	                 
	                    withdraw = sc.nextInt();  
	                                  	                    
	                    if(balance >= withdraw)  
	                    {  
	                        //remove the withdrawl amount from the total balance  
	                        balance = balance - withdraw;  
	                        System.out.println("Please collect your money");  
	                        System.out.println("THANKYOU");  
	                    }  
	                    else  
	                    {  
	                        //show custom error message   
	                        System.out.println("Insufficient Balance");  
	                    }  
	                    System.out.println("");  
	                    break;  
	               
	                case 3:  
	                      
	                    System.out.print("Enter money to be deposited:");  
	                                  
	                    //get deposite amount from  user  
	                    deposit = sc.nextInt();  
	                                  
	                    //add the deposit money to the total balanace  
	                    balance = balance + deposit;  
	                    System.out.println("Your Money has been successfully depsited");  
	                    System.out.println("");  
	                    break;	   	   
	                case 4:  
	                	//exit from the menu  
	                	System.exit(0);  
	            }  
	        }  
	    }   
}
