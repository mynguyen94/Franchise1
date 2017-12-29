//Name: My Nguyen
//Class: 35A
//Assignment: lab3
//Due date: 02/03/17
//Date submitted: 02/11/17

public class Store {
	private float salesbyweek[][];
	private float totalsaleofeachweek[];
	private float totalsaleofallweeks;

	//constructor
	Store() {
		salesbyweek = new float[5][7];
		totalsaleofeachweek = new float[5];
		totalsaleofallweeks = 0;
	}
	
	//setter and getters
	// setsaleforweekdayintersection(int week, int day, float sale)
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}

	public void printdata() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	// float getsaleforweekdayintersection(int week, int day)
	public float getsaleforweekdayintersection(int week, int day) {
		return salesbyweek[week][day];
	}
	
	// businessmethod
	// a. totalsalesforweek
	public void totalsalesforweek()
	{		
		System.out.printf("\n1. Total sale of each week");
		for(int r = 0; r < salesbyweek.length; r++)
		{
			totalsaleofeachweek[r] = 0;
			for(int c = 0; c < salesbyweek[r].length; c++)
			{
				totalsaleofeachweek[r] += getsaleforweekdayintersection(r, c);
			}
			System.out.printf("\nWeek #" + (r+1) + ": $" + "%.2f",totalsaleofeachweek[r]);
		}
	}
	// b. avgsalesforweek
	public void averagesalesforweek(){
		System.out.printf("\n2. Average sale of each week");
		float averagesale =  0;
		for(int r = 0; r < salesbyweek.length; r++)
		{
			averagesale = totalsaleofeachweek[r] / 7;
			System.out.printf("\nWeek " + (r+1) + ": $" + "%.2f", averagesale);
		}
	}
	
	// c. totalsalesforallweeks
	public void totalsalesforallweek()
	{
		for(int r = 0; r < salesbyweek.length; r++)
		{
				totalsaleofallweeks += totalsaleofeachweek[r];		
		}
		System.out.printf("\n3. Total sale of all weeks: $" + "%.2f", totalsaleofallweeks);
	}
	// d. averageweeklysales
	public void averageweeklysales()
	{
		float averageofallweeks = totalsaleofallweeks / 5;
		System.out.printf("\n4. Average sale of all weeks: $" + "%.2f", averageofallweeks);
	
	}
	// e. weekwithhighestsaleamt
	public void weekwithhighestsaleamt() {
		float saleofeachweek = 0;
		int highestsaleweek = 0;
		for(int i = 0; i < salesbyweek.length; i++) 
		{
			if (saleofeachweek < totalsaleofeachweek[i])
			{
				saleofeachweek = totalsaleofeachweek[i];
				highestsaleweek = (i+1);
			}
		}
		System.out.printf("\n5. Week with highest sale is week #" + highestsaleweek);
	}
	// f. weekwithlowestsaleamt
	public void weekwithlowestsaleamt() {
		float saleofeachweek = totalsaleofeachweek[0];
		int lowestsaleweek = 1;
		for(int i = 0; i < salesbyweek.length; i++)
		{
			if (saleofeachweek > totalsaleofeachweek[i]) {
				saleofeachweek = totalsaleofeachweek[i];
				lowestsaleweek = (i+1);
			}
		}
		System.out.printf("\n6. Week has lowest sale is week #" + lowestsaleweek);
	}		
		
	// analyzeresults //call a through f
	public void analyzeresults(int storenumber)
	{
		System.out.printf("\n");
		System.out.printf("\nData of store #" + storenumber);
		totalsalesforweek();
		averagesalesforweek();
		totalsalesforallweek();
		averageweeklysales();
		weekwithhighestsaleamt();
		weekwithlowestsaleamt();				
	}
	// print()
	public void print(){
		for(int r = 0; r < salesbyweek.length; r++)
		{
			for(int c = 0; c < salesbyweek[r].length; c++)
			{
				System.out.printf("%.2f",salesbyweek[r][c]);
			}
		}
	}
	
}//end Store class

