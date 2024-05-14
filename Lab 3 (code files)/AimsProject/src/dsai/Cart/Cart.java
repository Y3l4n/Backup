package dsai.Cart;


import java.util.Scanner;

import dsai.DigitalVideoDisc.DigitalVideoDisc;
public class Cart {

    public static final int MAX_NUMBER_ORDERED = 20;
    //Create a new array with a max_length = 20
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered;


    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("Full cart");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {
            if (qtyOrdered < MAX_NUMBER_ORDERED) {
                itemsOrdered[qtyOrdered] = digitalVideoDisc;
                qtyOrdered++;
                System.out.println("Disc " + digitalVideoDisc.getTitle() + " has been added");
            } else {
                System.out.println("Cart is full. Remaining " 
                + (dvdList.length - indexDigitalVideoDisc(digitalVideoDisc)) 
                + " last disc(s) are not added.");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2); //Utilizing the addDigitalVideoDisc written before
    }

    public int indexDigitalVideoDisc(DigitalVideoDisc disc){
        int index = -1; //Initialize loop value
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                index = i;
                return index;
            }
        } return -1; //Dieu kien ben ngoai vong for
    }

    //This method return an array of ordered dvds
    public DigitalVideoDisc[] removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int indexDisc = indexDigitalVideoDisc(disc);
        if (indexDisc == -1) {
            System.out.println("The disc is not in cart");
            return itemsOrdered;
        } else {
            // Shift the elements to the left to remove the disc
            for (int i = indexDisc; i < itemsOrdered.length - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            itemsOrdered[itemsOrdered.length - 1] = null; // Set the last element to null
    
            System.out.println("The disc has been removed");
            return itemsOrdered;
        }
    }

    public float totalCost() {
        float totalCost = 0.0f;
        int numberOfItems = 0; //Initialize value for checking
        
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null) {
                totalCost += disc.getCost();
                numberOfItems++; //Check for null values when performing for loop
            }
        }
        return totalCost;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        for (DigitalVideoDisc digitalVideoDisc : itemsOrdered) {
            if (digitalVideoDisc != null) { //Check for null value when performing for loop
                System.out.println((indexDigitalVideoDisc(digitalVideoDisc) + 1) + "." + digitalVideoDisc.toString());
            }
        }
        System.out.printf("Total cost: $%.2f%n", totalCost());
        System.out.println("***************************************************");
    }

    public void searchByID(int id) {
		String str = "No disk found.";
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				str = itemsOrdered[i].toString();
			}
		}
		System.out.println(str);
	}

    public void isMatchName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String inputToCompare = input.nextLine();
        int tempNum = 0;
        for (DigitalVideoDisc digitalVideoDisc : itemsOrdered) {
            if (digitalVideoDisc != null && inputToCompare.equals(digitalVideoDisc.getTitle())) {
                System.out.println("Disc no." + (indexDigitalVideoDisc(digitalVideoDisc) + 1) + " is in cart.");
                tempNum++;
            }
        }
        if (tempNum == 0) {
            System.out.println("There are no discs like that in the cart");
        }
        input.close();
    }
}

