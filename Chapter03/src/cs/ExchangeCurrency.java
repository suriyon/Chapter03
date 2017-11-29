package cs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeCurrency {

	public static void main(String[] args) {
		double baht, dollar;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("Enter Baht => ");
		try {
			String tmp = br.readLine();
			baht = Double.parseDouble(tmp);
			
			dollar = baht/32.578;
			
			System.out.println(baht + " THB = " + dollar + " USD.");
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
}
