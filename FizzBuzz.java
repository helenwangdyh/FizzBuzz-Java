import java.io.*;
public class FizzBuzz {
		
	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System. in));
						
	public static void main(String[] args) {
		//variables
		int fizz, buzz, start, end ;
		
		while (true){
		//print title of the game
		System.out.println("   JAVA FIZZBUZZ PROGRAM");
		
		//get "fizz","buzz","start","end" from users
		System.out.print("Enter Fizz number: ");
		fizz = getfizzbuzzInput();
		
		System.out.print("Enter Buzz number: ");
		buzz = getfizzbuzzInput();
		
		System.out.print("Enter starting number: ");
		start = getstartInput();
		
		System.out.print("Enter ending number: ");
		end = getendInput(start);
			
		//calling the for loop
		fizzbuzz_forloop(fizz,buzz,start,end);
		
		System.out.println();
		}
	}//end of main
	
	//sub-method 1 for loop
	public static int fizzbuzz_forloop(int f,int b,int s,int e) {
		int i = 0;
		for (i = s; i <= e; i++) {
			if ((i % f == 0) && (i % b == 0)){
				System.out.format("\n%d. FizzBuzz",i);
			}
			else if (i % f == 0) {
				System.out.format("\n%d. Fizz",i);
			}
			else if (i % b == 0) {
				System.out.format("\n%d. Buzz",i);
			}
			else {
				System.out.format("\n%d. %d",i,i);
			}	
		}
		return 0;//int method has to return an int.		
	}
	
	//sub-method2 check the validity of Fizz/Buzz value 
	public static int getfizzbuzzInput() {
		int x = 0;
		boolean valid;
		
		do {
			valid = true;
			try {
				x = Integer.parseInt(cin.readLine());
			}
			catch(IOException e) {
				System.out.println("ERROR: IO format exception!\n");
				valid = false;
				//System.out.println("getfizzbuzzInput IO\n");
				System.exit(0);
				
			}
			
			catch(NumberFormatException e) {
				System.out.println("ERROR: Number format exception!\n");
				valid = false;
				//System.out.println("getfizzbuzzInput NF\n");
				System.exit(0);
				
			}
			if (valid && x<0 ) {	
				valid = false;
				System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
			}
			else if (valid && x == 0) {
				valid = false;
				System.out.println();
				System.out.println("The end.");
				System.exit(0);
			}
		}
		while(!valid);
			return x;	
	}

	//sub-method3 check the validity of start value 
	public static int getstartInput() {
		int x = 0;
		boolean valid;
	
		do {
			valid = true;
			try {
				x = Integer.parseInt(cin.readLine());
			}
			catch(IOException e) {
				System.out.println("ERROR: IO format exception!\n");
				valid = false;
				//System.out.println("getstartInput IO\n");
				System.exit(0);
			}
		
			catch(NumberFormatException e) {
				System.out.println("ERROR: Number format exception!\n");
				valid = false;
				//System.out.println("getstartInput NF\n");
				System.exit(0);
			}
		}
		while(!valid);
			return x;	
	}
	
	//sub-method4 check the validity of end value 
	public static int getendInput(int y) {
		int x = 0;
		boolean valid;
	
		do {
			valid = true;
			try {
				x = Integer.parseInt(cin.readLine());
			}
			catch(IOException e) {
				System.out.println("ERROR: IO format exception!\n");
				valid = false;
				//System.out.println("getendInput IO\n");
				System.exit(0);
			}
		
			catch(NumberFormatException e) {
				System.out.println("ERROR: Number format exception!\n");
				valid = false;
				//System.out.println("getendInput NF\n");
				System.exit(0);
			}
			if (valid && x < y){
				valid = false;
				System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
				//System.exit(0);
			}
		}
		while(!valid);
			return x;	
	}
}//end of code
	

