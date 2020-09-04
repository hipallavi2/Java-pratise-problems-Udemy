package dataMembers;

public class MinMaxValue {

	public static void main(String[] args) {
		int MyValue=1000;
		int MyMinValue= Integer.MIN_VALUE;
		int MyMaxValue= Integer.MAX_VALUE;
		System.out.println(MyValue);
		System.out.println("Integer minimum value = "+ MyMinValue);
		System.out.println("Integer maximum value = "+ MyMaxValue);
		System.out.println("Busted minimum value= " + MyMinValue + 1);//putting a value larger than 
																	//the minimum value - underflow
		
		System.out.println("Busted maximum value= " + MyMaxValue + 1);// putting a value larger than 
																		//the maximum value- overflow
	}
}
