package floatAndDouble;

public class OperatorChallenge {

	public static void main(String[] args) {
		//1.Create a double variable with a value of 20.00
		//2.Create a second variable of type double with the value 80.00
		//3.Add both numbers together and multiply by 100.00
		//4.Use the remainder operator to figure out what the remainder from the result of the
		//operations in step 3 and 40.00.We used the modulus or remainder operator on ints in the course
		//,but we can also use it on a double
		//5.create a boolean variable that assigns the value true if the remainder in #4 is 0,or false 
		//if its not 0.
		//6. output the boolean variable
		//7.write an if-then statement that displays a message "Got some remainder "if the boolean in step
		//5 is not true.
		double myFirstValue = 20.00d;
		double mySecondValue = 80.00d;
		double myTotalValue = (myFirstValue+mySecondValue) *100.00d;
		System.out.println("myTotalValue: "+ myTotalValue);
		double theRemainder = myTotalValue % 40.00d;
		System.out.println("theRemainder: "+ theRemainder);
		boolean isNoRemainder = (theRemainder==0)? true: false;
		System.out.println("isNoRemainder: "+ isNoRemainder);
		if(!isNoRemainder) {
			System.out.println("Got Some Remainder");
		}
		
	}	
	

}
