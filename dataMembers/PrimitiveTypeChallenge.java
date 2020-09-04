package dataMembers;

public class PrimitiveTypeChallenge {

	public static void main(String[] args) {
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		long longTotalValue = 50000L + 10L*(byteValue+shortValue+intValue);
		//long happily accepts int value because int max value also fits in long width
		System.out.println("Printing long total value: " + longTotalValue);
		short shortTotalValue = (short)(1000 + 10*(byteValue+shortValue+intValue));
		
		//here we need to do casting in short because java default data type for whole number is 
		//int so its returning int value so to convert it in short we need to cast it
		System.out.println("Printing short total value: " + shortTotalValue);
	}
}
