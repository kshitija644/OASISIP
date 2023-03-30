package oasis;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {

	public static void main(String args[])
	{
		Random Rand= new Random();
		
		Scanner sc=new Scanner(System.in);
		
		int RandomNo= Rand.nextInt(100) + 1;
		System.out.println("Random number :" +RandomNo);
		
		int trialCount=0;
		int trialLimit=4;
		boolean Out_of_limit=false;
		
		while(true && !Out_of_limit)
		{
		    if(trialCount < trialLimit)
		    {
		        System.out.println("Guess any Number (1-100) : ");	
        		int user_num= sc.nextInt();
        		
        		trialCount++;
        		if(user_num ==RandomNo)
        		{
        			System.out.println("Congratulations....You Win !!! ");
        			System.out.println("\nTotal Trials to Win game is " +trialCount);
            	    if(trialCount==1)
    		        {
    		            System.out.println("***Your Score is 100***");
    		        }
    		        else if(trialCount==2)
    		        {
    		            System.out.println("***Your Score is 75***");   
    		        }
    		        else if(trialCount== 3)
    		        {
    		            System.out.println("***Your Score is 50***");
    		        }
    		        else if(trialCount==4)
    		        {
    		            System.out.println("***Your Score is 25***");
    		        }
        			break;
        		}
        		else if(RandomNo > user_num)
        		{
        			System.out.println("\nWrong Guess....the number is Higher  ");
        		}
        		else if(RandomNo < user_num)
        		{
        			System.out.println("\nWrong Guess....the number is Lower  ");
        		}
		     
		    }
		    else{
		        Out_of_limit=true;
		        System.out.println("***You are out of guesses......\nTry to answer in 4 attempts\n");   
		    }		    			  
		}
	}	
}
