package floatAndDouble;

public class MinMaxValue {

	public static void main(String[] args) {
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Minimum Value : "+ myMinFloatValue );
		System.out.println("Float Maximum Value : "+ myMaxFloatValue );
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Minimum Value : "+ myMinDoubleValue );
		System.out.println("Double Maximum Value : "+ myMaxDoubleValue );
		
		int myIntValue =5/3;
		float myFloatValue = 5f/3f;
		double myDoubleValue = 5d/3d;  //its good practice to use d after value its not mandatory
		//In decimal double are default values so to store something in float we have to 
		//use suffix or prefix in float so that it is clear for java that which type of data is this.
		System.out.println("My Int Value: "+ myIntValue );
		System.out.println("My Float Value: "+ myFloatValue );
		System.out.println("My Double Value: "+ myDoubleValue );
	}

}
