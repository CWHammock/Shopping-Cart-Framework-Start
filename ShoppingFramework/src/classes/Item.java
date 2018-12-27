/**
 * 
 */
package classes;


/**
 * @author charles
 *
 */
public class Item implements Comparable<Item>{
	private final String name;
	private double price;
	private int itemsInStock;
	
	protected Item(String name, double price) {
		this.name = name;
		this.price = price;
		this.itemsInStock = 1;
	}
	
	protected Item(String name, double price, int stockItems) {
		this.name = name;
		this.price = price;
		this.itemsInStock = stockItems;
	}

	public final double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0.0) {
			this.price = price;
		}else {
			System.out.println(price + " is less than 0.0...");
		}
	}

	public final String getName() {
		return name;
	}
	
	

	public final int getItemsInStock() {
		return itemsInStock;
	}

	public final boolean addItems(int newItems) {
		if (newItems > 0) {
			this.itemsInStock += newItems;
			return true;
		}else {
			System.out.println("no items to add...");
			return false;
		}
	}
	
	public final boolean deleteItems(int newItems) {
		if ((this.itemsInStock -= newItems) < 0) {
			System.out.println("There is not enough to take....");
			return false;
		}else {
			this.itemsInStock -= newItems;
			return true;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Entering equals method....");
		if(this == obj) {
			return true;
		}
		
		if ((obj == null) || (obj.getClass() != this.getClass())){
			return false;
		}
		
		String objName = ((Item)obj).getName();
		return this.name.equals(objName);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + 22;
	}
	
	@Override
	public int compareTo(Item item) {
		System.out.println("Entering compareTo....");
		if(this == item) {
			return 0;
		}
		if(item != null) {
			return this.name.compareTo(item.getName());
		}
		throw new NullPointerException();
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.getPrice() + " \n";
	}
}
