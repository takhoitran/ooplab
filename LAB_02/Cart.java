import java.util.ArrayList;
public class Cart {
	
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	private ArrayList<DigitalVideoDisc> items;
    private int qtyOrdered;

    public Cart() {
        items = new ArrayList<>();
        qtyOrdered = 0;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    	if(qtyOrdered < MAX_NUMBER_ORDERED) {
    		items.add(disc);
        	qtyOrdered++;
        	System.out.println("The disc has been added.");
    	
    
    		if(MAX_NUMBER_ORDERED-qtyOrdered<2) {
        	qtyOrdered++;
        	System.out.println("The disc has been added. The cart is almost full");
    	}
    	}
    	else {
        System.out.println("The cart is full. You cannot add more discs.");
    }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    	if (items.remove(disc)) {
    		qtyOrdered--;
    		System.out.println("The disc has been removed.");
    	}
    	else {
    		System.out.println("The disc was not found in the cart.");
    	}
    	}
    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : items) {
            total += disc.getCost();
        }
        return total;
    }
}

