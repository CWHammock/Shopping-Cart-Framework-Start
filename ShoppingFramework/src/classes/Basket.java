/**
 * 
 */
package classes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author charles
 *
 */
public class Basket {
	private final String name;
	private final Map<Item, Integer> list;
	
	public Basket(String name) {
		this.name = name;
		this.list = new HashMap<>();
	}
	
	public boolean addToBasket(Item item, int quantity) {
		if ((quantity > 0) && (item != null)){
			list.put(item, quantity);
			item.deleteItems(quantity);
			return true;
		}else {
			System.out.println("Error entering in basket....");
			return false;
		}
	}
}
