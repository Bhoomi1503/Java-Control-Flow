import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);      //Scanner class
	    
	    //Getting input from the user 
	    
	    System.out.print("Enter the Number:");
	    int num=sc.nextInt();
	    System.out.print("Enter a number from 1 to 7 to display the weak:");
	    int week=sc.nextInt();
	    System.out.print("Enter a number to print a range:");
	    int tennum=sc.nextInt();
	    
	    //if else loop
	    
	    if(num>0){
	        System.out.println("Positive");
	    }
	    else if(num==0){
	        System.out.print("Zero");
	    }
	    else{
		    System.out.println("Negative");
	    }
	    
	    //Switch case
	    
	    switch(week){
	        case 1:
	            System.out.println("Sunday");
	            break;
	       case 2:
	           System.out.println("Monday");
	           break;
	       case 3:
	           System.out.println("Tuesday");
	           break;
	       case 4:
	           System.out.println("Wednesday");
	           break;
	       case 5:
	           System.out.println("Thrusday");
	           break;
	       case 6:
	           System.out.println("Friday");
	           break;
	       case 7:
	           System.out.println("Saturday");
	           break;
	       default:
	        System.out.println("Enter correct number");
	           
	    }
	    
	    //for loop
	    
	    for(int i=1;i<=tennum;i++){
	        System.out.print(i+" ");
	    }
	    System.out.print("\n");
	    
	    //while loop 
	    
	    int n1=5;
	    while(n1>0){
	        
	        System.out.print(n1+" ");
	        n1--;
	    }
	    System.out.print("\n");
	    
	    //do while loop
	    
	    int n2=1;
	    do{
	        System.out.print(n2+" ");
	        n2++;
	    }
	    while(n2<=3);
	}
}
