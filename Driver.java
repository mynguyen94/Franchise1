//Name: My Nguyen
//Class: 35A
//Assignment: lab3
//Due date: 02/03/17
//Date submitted: 02/11/17

public class Driver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO a1 = new FileIO("C:\\Users\\My Nguyen\\Downloads\\assignment336b\\assignment336b\\src\\Salesdat.txt");
		Franchise f = a1.readData();
		
		f.printdata();
	}
		
}

