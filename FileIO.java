//Name: My Nguyen
//Class: 35A
//Assignment: lab3
//Due date: 02/03/17
//Date submitted: 02/11/17

import java.io.*;
import java.util.*;

public class FileIO {
	private String fname = null;
	private boolean DEBUG = true;

	//constructor
	public FileIO(String fname) {
		this.fname = fname;
	}

	public Franchise readData() {
		//assume that the file can't be found
		Franchise a1 = null;
		int counter = 0;
		//assume that something is wrong, let's try it
		try {
			FileReader file = new FileReader(fname);
			BufferedReader buff = new BufferedReader(file);
			String temp;
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				counter++;
				//check if the file contains data or not
				if (line == null)
					eof = true;
				else {
					//start reading in if the files does contain data
					if (DEBUG)
						System.out.println("Reading" + line);//the first line which is 6-number of stores
					if (counter == 1) {
						temp = line; //converse string to int
						//create a Franchise instance to pass number 6
						//to the constructor to create an array of Store
						a1 = new Franchise(Integer.parseInt(temp));
						if (DEBUG)
							System.out.println("d  " + a1.numberofstores());
					}
					//reading Day1. Day2.....
					if (counter == 2)
						; 
					if (counter > 2) {
						  	int x = buildStore(a1, (counter-3), line);
							if (DEBUG)
								System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
							if (DEBUG)
							{	
								System.out.println("Data read:");
								a1.getStores(counter-3).printdata();
							}
					}
				}
			}
			buff.close(); //stop reading
		//if the file can't be opened, let's catch the problem
	    //simply display that there is an error with the file
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		//the program ends
		return a1;
	}

	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		StringTokenizer st = new StringTokenizer(temp);
		//read the value from the file one by one until the end of the file
	    while (st.hasMoreTokens()) {
	         for(day=0;day<7;day++)
	         {
		    	 s1 = st.nextToken();
		         sale = Float.parseFloat(s1);//converse string s1 to float
	        	 tstore.setsaleforweekdayintersection(week, day, sale);
	         }
	         week++;
	    }
		a1.setStores(tstore, counter);
	    return week; //return the number of week in the file
	}
}