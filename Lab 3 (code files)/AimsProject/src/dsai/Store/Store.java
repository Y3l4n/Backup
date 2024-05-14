package dsai.Store;
import dsai.DigitalVideoDisc.DigitalVideoDisc;

public class Store {

    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;

    public Store(int capacity){
        itemsInStore = new DigitalVideoDisc[capacity];
        itemCount = 0;
    }
    
    public void addDVD(DigitalVideoDisc disc){
        if (itemCount < itemsInStore.length) {
            itemsInStore[itemCount] = disc;
            itemCount++;
            System.out.println("Disc has been added");

        } else {
            System.out.println("Store is full");
            
        }
    }

    public int indexDVD(DigitalVideoDisc disc){
        int index = -1; //Initialize loop value
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i] == disc) {
                index = i;
                return index;
            }
        } return -1; //Dieu kien ben ngoai vong for
    }

    public DigitalVideoDisc[] removeDVD(DigitalVideoDisc disc) {
        int indexDisc = indexDVD(disc);
        if (indexDisc == -1) {
            System.out.println("The disc is not in store");
            return itemsInStore;
        } else {
            // Shift the elements to the left to remove the disc
            for (int i = indexDisc; i < itemsInStore.length - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[itemsInStore.length - 1] = null; // Set the last element to null
    
            System.out.println("The disc has been removed");
            return itemsInStore;
        }
    }
}

