/**
 * 
 */
package classes;

/**
 * @author charles
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stock stock = new Stock();
		Item juice = new Item("juice", 3.44);
		Item juice1 = new Item("juice", 3.44);
		Item rum = new Item("rum", 2.23);
		Item fries = new Item("fries", 1.44);
		Item oranges = new Item("oranges", 0.89);
		stock.addStock(juice);
		stock.addStock(juice);
		stock.addStock(rum);
		stock.addStock(fries);
		stock.addStock(oranges);
		System.out.println(stock.toString());


		


		
		

	}

}
