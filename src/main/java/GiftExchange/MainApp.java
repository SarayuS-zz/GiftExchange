package GiftExchange;

import java.util.ArrayList;
import java.util.List;

// The main method is defined here to call the gift exchange class.
// Each run of the main method will produce a different output.

/* 
 * PROBLEM STATEMENT:
 * Given a list of people's names, organize a gift exchange such that each person is 
 * randomly assigned someone else to give a gift to, and someone to receive a gift from. 
 * Caveat: The person cannot receive a gift from the same person to whom they are 
 * gifting one.
 * 
 * Example input: "Phil, Stephen, Ardi, Quan, Joel"
 * */

public class MainApp {

	public static void main(String[] args) {
		
		// Initialize variables
		List<String> names = new ArrayList<String>();
		GiftExchFunc giftFunc = new GiftExchFunc();
		
		// Add the values to the variable
		names.add("Phil");
		names.add("Stephen");
		names.add("Ardi");
		names.add("Quan");
		names.add("Joel");
		
		// Call the function 
		giftFunc.ExchLogic(names);
	
	}

}
