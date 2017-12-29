//Name: My Nguyen
//Class: 35A
//Assignment: lab3
//Due date: 02/03/17
//Date submitted: 02/11/17

public class Franchise{
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores() {
		return stores.length;
		}
	public void printdata(){
		System.out.printf("\n");
		System.out.printf("Print out data for each store");
		for(int i = 0; i < stores.length; i++)
		{
			stores[i].analyzeresults(i+1);
		}
	}
}
