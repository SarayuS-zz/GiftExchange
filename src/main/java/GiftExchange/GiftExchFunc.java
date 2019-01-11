/* 
 * This class works on finding the flow of gift giving.
 * A random number is used to generate a new sequence for every run.
 */

package GiftExchange;

import java.util.List;

public class GiftExchFunc {
	
	public void ExchLogic(List<String> names) {
		
		// Initialize variables
		int start = (int) (Math.random() * names.size());
		int next = 0;
		
		// The first person will be removed after the first loop.
		// Hence the value is saved to use it later to complete the circle.
		String firstPerson = names.get(start);
		
		for(int i = 0; i< names.size(); i++) {	
			// Get the starting person detail
			System.out.print(names.get(start) + " gives ");
			
			// After the person gives the gift, he cannot give the gift again. 
			names.remove(start);
			
			// The person receiving the gift is also randomly generated.
			next = (int) (Math.random() * names.size());
			System.out.println(names.get(next) + " a gift.");	
			
			// The person who received the gift should be the one giving the gift
			start = next;
		}
		
		// Since the first person will be removed from the list, the value is stored 
		// before removing which is used here.
		System.out.println(names.get(next) + " gives " + firstPerson + " a gift.");
	}
}
