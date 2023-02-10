import java.util.Scanner;
public class InventoryManagementSystemUsingArrays {
	static Scanner sc = new Scanner(System.in);
	static String[] items = new String[50];
	static int[] quantities = new int[50];
	static double[] price = new double[50];
	static String[] specifications = new String[50];
	static int size = 0;
	
	static void manageInventory() {
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
					viewProducts();
					break;
				case 2:
					countQuantitiesOfProduct();
					break;
				case 3:
					viewProductDetails();
					break;
				case 4:
					editProductDetails();
					break;
				case 5:
					updateInventory();
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
	
	static void viewProducts() {
		if(size == 0) {
			System.out.println("No products available in invetory!");
		}else {
			System.out.println("The following products are available in inventory: ");
			for(int i = 0; i < size; i++) {
				System.out.println((i+1)+"."+items[i]);
			}
		}
	}
	
	static void countQuantitiesOfProduct() {
		System.out.print("Enter which product quantity you want to view ? ");
		String productName = sc.next();
		int index = findIndexOfItem(productName);
		if(index == -1) {
			System.out.println("No product available with given name !");
		}else {
			System.out.println(quantities[index]+ " pieces are available for "+productName);
		}
	}
	
	static int findIndexOfItem(String productName) {
		int index = -1;
		for(int i = 0; i < size; i++) {
			if(items[i].equals(productName)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	static void viewProductDetails() {
		if(size == 0) {
			System.out.println("No items in inventory !");
		}else {
			System.out.println("Product\t|\tPrice\t\t|\tQuantity\t|\tSpecifications");
			for(int i = 0; i < size; i++) {
				System.out.println(items[i] + "\t|\t" + price[i] + "\t|\t" + quantities[i] + "\t\t|\t"+specifications[i]);
			}
		}
	}
	
	static void editProductDetails() {
		System.out.println("Enter product name to edit the details: ");
		sc.nextLine();
		String prodName = sc.nextLine();
		int index = findIndexOfItem(prodName);
		if(index == -1) {
			System.out.println("No product avilable with" + prodName +" in inventory");
		}else {
			System.out.println("Enter new qauantity for "+ prodName);
			int quantity = sc.nextInt();
			quantities[index] = quantity;
			System.out.println("Enter new price for the product: ");
			double newPrice = sc.nextDouble();
			price[index] = newPrice;
			System.out.println("Enter new Specifications for the product: ");
			sc.nextLine();
			String newSpec = sc.nextLine();
			specifications[index] = newSpec;
			System.out.println("Product updated");
		}
	}
	
	static void updateInventory() {
		while(true) {
			System.out.println();
			System.out.println("Enter 1 to add items to inventory: ");
			System.out.println("Enter 2 to remove items from inventory: ");
			System.out.println("Enter Your choice: ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					addItems();
					manageInventory();
					break;
				case 2:
					removeItems();
					manageInventory();
					break;
				default:
					System.out.println("Enter either 1 or 2 to update the inventory !");
					break;
			}
			
		}
	}
	
	static void addItems() {
		System.out.println("Enter product name: ");
		String productName = sc.next();
		sc.nextLine();
		System.out.println("Enter number of quantities for the product: ");
		int quantity = sc.nextInt();
		System.out.println("Enter the price for the product: ");
		double productPrice = sc.nextDouble();
		System.out.println("Enter specifications of the product: ");
		sc.nextLine();
		String specs = sc.nextLine();

		
		items[size] = productName;
		quantities[size] = quantity;
		price[size] = productPrice;
		specifications[size] = specs;
		size++;
		System.out.println("Item is added to the inventory");
	}
	
	static void removeItems() {
		System.out.println("Enter the product you want to delete: ");
		String productName = sc.nextLine();
		int index = findIndexOfItem(productName);
		if(index == -1) {
			System.out.println("No item available with " + productName + " in inventory ");
		}else {
			for(int i = index; index < size - 1; i++) {
				items[i] = items[i+1];
				quantities[i] = quantities[i+1];
				price[i] = price[i+1];
				specifications[i] = specifications[i+1];
			}
			size--;
			System.out.println("Item removed: ");
		}
	}
	
	public static void main(String[] args) {
		manageInventory();
	}
}
