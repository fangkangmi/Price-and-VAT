package com.lbg.coh2;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private static  double [] prices;
    public static void main( String[] args )
    {
		Scanner console = new Scanner(System.in);
		//prices = new double[3];

		ArrayList<Double> prices = new ArrayList<Double>();

		System.out.println( "Enter the cost of 5 Items: " );
		for(int i =0; i<5;i++){
			double input = console.nextDouble();
			try{
				prices.add(input);
				System.out.println(prices);
			}catch (Exception e){
//				double temp[]= prices;
//				prices = new double[temp.length*2];
//				System.arraycopy(temp,0,prices,0,temp.length);
//				prices[i] = input;
//				System.out.println(Arrays.toString(prices));
			}
		}
		Collections.sort(prices);
		System.out.println(prices);

    }
    
    void bin(){
		System.out.println( "Enter the cost of the Item: " );
		Scanner console = new Scanner(System.in);
		double cost = console.nextDouble();
		System.out.println("Enter the VAT percentage : %" );
		float vat  =  console.nextFloat();
		App app = new App();

		System.out.println();

		while(true)
		{
			System.out.println("Type QUIT to quit or CONTINUE to see more");
			String userChoice = console.next();
			if(console.equals("QUIT"))
				break;
			else if (userChoice.equals("CONTINUE")) {
				System.out.println("Price: ");
				double price = console.nextDouble();

				System.out.println("VAT: ");
				double VAT = console.nextDouble();

				double calculateVAT = price *VAT/100;
				double totalPrice = price + calculateVAT;

				System.out.println("Total =  " + totalPrice);
			}
			else
				System.out.println("Nahh");
		}
		console.close();
	}
    
    
}
