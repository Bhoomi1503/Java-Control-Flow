import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int week=sc.nextInt();
	    int tennum=sc.nextInt();
		sc.close();
	    if(num>0){
	        System.out.println("Positive");
	    }
	    else if(num==0){
	        System.out.print("Zero");
	    }
	    else{
		    System.out.println("Negative");
	    }
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
	    
	    for(int i=1;i<=tennum;i++){
	        System.out.print(i+" ");
	    }
	    System.out.print("\n");
	    int n1=5;
	    while(n1>0){
	        
	        System.out.print(n1+" ");
	        n1--;
	    }
	    System.out.print("\n");
	    int n2=1;
	    do{
	        System.out.print(n2+" ");
	        n2++;
	    }
	    while(n2<=3);
	}
}
