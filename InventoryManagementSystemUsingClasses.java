package pkg_09_02_23;
import java.util.*;
class InventoryManagement{
	Scanner sc = new Scanner(System.in);
	ArrayList<String> items = new ArrayList<>();
	ArrayList<Integer> quantities = new ArrayList<>();
	ArrayList<Double> price = new ArrayList<>();
	ArrayList<String> specifications = new ArrayList<>();
	
	void viewProducts() {
		if(items.size() == 0) {
			System.out.println("The inventory is Empty !");
		}else {
			for(String str: items) {
				System.out.println(str);
			}
		}
		
	}
	
	void countQuantitiesOfproduct() {
		System.out.print("Enter which product quantities you want ");
		String productName = sc.next();
		int index = items.indexOf(productName);
		if(index < 0) {
			System.out.println("No Product details available for " + productName);
		}else {
			System.out.println(quantities.get(index)+ " pieces are available for "+productName);
		}
	}
	
	void viewProductDetails() {
		if(items.size() == 0) {
			System.out.println("The Inventory is empty !");
		}else {
			System.out.println("Product\t|\tQuantity\t|\tPrice\t\t|\tSpecifications");
			for(int i = 0; i < items.size(); i++) {
				System.out.println(items.get(i) + "\t|\t" + quantities.get(i) + "\t\t|\t" + price.get(i) + "\t|\t" + specifications.get(i));
			}
		}
	}
	
	void editProductDetails() {
		System.out.print("Enter which product details you want to edit ? ");
		String productName = sc.next();
		int index = items.indexOf(productName);
		if(index < 1) {
			System.out.println("No product available with name " +productName);
		}else {
			System.out.println("Enter new quantity for the product: ");
			int quantity = sc.nextInt();
			System.out.println("Enter new price for the product: ");
			double newPrice = sc.nextDouble();
			quantities.remove(index);
			price.remove(index);
			quantities.add(index, quantity);
			price.add(index, newPrice);
			System.out.println("Item Edited!");
		}
	}
	
	void updateProductDetails() {
		while(true) {
			System.out.println();
			System.out.println("Enter 1 to create a record: ");
			System.out.println("Enter 2 to remove a record: ");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			if(choice == 1) {
				addProductToInventory();
				break;
			}else if(choice == 2) {
				removeProductFromInventory();
				break;
			}else {
				break;
			}
			
		}
	}
	
	void addProductToInventory() {
		System.out.println("Enter the product name: ");
		String productName = sc.next();
		sc.nextLine();
		System.out.println("Enter quantity available for the product: ");
		int quantity = sc.nextInt();
		System.out.println("Enter the price for the product");
		double newprice = sc.nextDouble();
		System.out.println("Enter specifications of product: ");
		sc.nextLine();
		String spec = sc.nextLine();
		
		items.add(productName);
		quantities.add(quantity);
		price.add(newprice);
		specifications.add(spec);
		System.out.println("Item added to inventory");
	}
	
	void removeProductFromInventory() {
		System.out.println("Enter the product name to remove: ");
		String productName = sc.next();
		int index = items.indexOf(productName);
		if(index < 1) {
			System.out.println("No product available with given name "+productName);
		}else {
			items.remove(index);
			quantities.remove(index);
			price.remove(index);
			System.out.println("Item removed from inventory !");
		}
	}
	
}

public class InventoryManagementSystemUsingClasses {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InventoryManagement IM = new InventoryManagement();
		while(true) {
			System.out.println();
			System.out.println("1. View products in inventory  ");
			System.out.println("2. Count of quantities for a product: ");
			System.out.println("3. View product details: ");
			System.out.println("4. Edit product detail: ");
			System.out.println("5. Update inventory: ");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					IM.viewProducts();
					break;
				case 2:
					IM.countQuantitiesOfproduct();
					break;
				case 3:
					IM.viewProductDetails();
					break;
				case 4:
					IM.editProductDetails();
					break;
				case 5:
					IM.updateProductDetails();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Select only specified choices !");
					break;
			}
			
		}
	}
}
