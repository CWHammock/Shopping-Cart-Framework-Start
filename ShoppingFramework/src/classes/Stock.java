/**
 * 
 */
package classes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author charles
 *
 */
public final class Stock {
	private Map<String, Item> items;
	
	public Stock() {
		this.items = new HashMap<>();
	}
	
	public Item getItem(String itemName) {
		if(items.containsKey(itemName)) {
			return items.get(itemName);
		}else {
			return null;
		}
	}
	
	public Map<String, Item> items(){
		return Collections.unmodifiableMap(items);
	}
	
	public boolean addStock(Item itemToBeAdded) {
		if(itemToBeAdded != null) {
			Item newItem = items.getOrDefault(itemToBeAdded.getName(), itemToBeAdded);
			if(newItem != itemToBeAdded) {
				newItem.addItems(itemToBeAdded.getItemsInStock());
				return true;
			}
			items.put(itemToBeAdded.getName(), itemToBeAdded);
		}
		return false;
		
	}
	
	public boolean deleteStock(String itemToBeDeleted, int itemsToRemove) {
		if(items.containsKey(itemToBeDeleted)) {
			Item tempItem = getItem(itemToBeDeleted);
			return tempItem.deleteItems(itemsToRemove);
		}else {
			System.out.println("No such item on list....");
			return false;
		}
	}
	
	public final String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		
		for(String name: items.keySet()) {
			String key = name.toString();
			double price = items.get(name).getPrice();
			stringBuilder.append(key + " " + price + " " + items.get(name).getItemsInStock() 
								+ " \n");
		}
		String toStringStringBuilder = stringBuilder.toString();
		return toStringStringBuilder;	
	}

}
