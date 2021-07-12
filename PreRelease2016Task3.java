/* 
 * @author amandayongvanich
 * Amanda Yongvanich Sep 26 2019
 */

import  java.util.Scanner; // Allows the program to use the scanner

public class PreRelease2016Task3 {
	final static double SandOrGravelMaxWeight = 50.1, SandOrGravelMinWeight = 49.9, CementMaxWeight = 25.1, CementMinWeight = 24.9; //constant
	final static int cementPrice = 3, gravelPrice = 2, sandPrice = 2;
	public static void main (String[]args) {
		
		Scanner userInput = new Scanner (System.in); // Create and open a new scanner for input
		
		String sackType; // Declares variables and assigns a value
		double howMuchCementOverweight = 0, howMuchSandOverweight = 0, howMuchGravelOverweight = 0;
		double howMuchCementUnderweight = 0, howMuchSandUnderweight = 0, howMuchGravelUnderweight = 0;
		int numCement = 0, numSand = 0, numGravel = 0;
		int customerOrder = 1;
		double totalWeight = 0;
		int sackRejected = 0;
		int totalPrice = 0;
		int finalPrice = 0;
		int amountSaved;
		int specialPacks = 0;
		int discountAmount = 0;
		
		while (customerOrder == 1) {
		
			System.out.println ("Enter type of sack(C for Cement, G for gravel, S for sand):");
			sackType = userInput.next(); 
			System.out.println(sackType);
			
			while (!sackType.equals("C") && !sackType.equals("G") && !sackType.equals("S")) {
				System.out.println ("Type of sack not recognised, please enter C, G or S: ");
				sackType = userInput.next(); 
			} // end of while (!sackType.equals("C") && !sackType.equals("G") && !sackType.equals("S"))
			
			if (sackType.equals("C")) {
				sackType = "Cement";
			} else if (sackType.equals("G")) {
				sackType = "Gravel";
			} else if (sackType.equals("S")) {
				sackType = "Sand";	
			} // end of if (sackType.equals("C"))	
			
			System.out.println ("Enter sack weight: ");
			
			if (sackType.equals("Cement")) {
				double cementWeight = 0;
				cementWeight = userInput.nextDouble(); 	
				
				if (cementWeight < CementMaxWeight && cementWeight > CementMinWeight) {
					System.out.println ("Weight accepted. Sack type is " + sackType + ", Weight is " + cementWeight + "kg.");
					numCement +=1;
					totalWeight += cementWeight;
					totalPrice += cementPrice;
				} else if (cementWeight > CementMaxWeight || cementWeight < CementMinWeight) {
					sackRejected +=1;
					System.out.print ("Weight rejected. Sack type is " + sackType + ", ");
					if (cementWeight > CementMaxWeight) {
						howMuchCementOverweight = cementWeight - CementMaxWeight;
						System.out.println (sackType + " sack is overweight by " + howMuchCementOverweight + "kg.");
					} else {
						howMuchCementUnderweight = CementMinWeight - cementWeight;
						System.out.println (sackType + " sack is underweight by " + howMuchCementUnderweight + "kg.");
					} // end of if (cementWeight > CementMaxWeight)
				} else if (cementWeight==CementMaxWeight || cementWeight==CementMinWeight) {
					sackRejected +=1;
					System.out.print("Weight rejected. " + sackType + " is ");
					if (cementWeight==CementMaxWeight) {
						System.out.println ("on overweight boundary, must weigh under " + CementMaxWeight + "kg.");
					} else {
						System.out.println ("on underweight boundary, must weigh over " + CementMinWeight + "kg.");
					} // end of if (cementWeight==CementMaxWeight)
				} // end of if (cementWeight < CementMaxWeight && cementWeight > CementMinWeight)
				
			} else if (sackType.equals("Gravel")) {
				double gravelWeight = 0;
				gravelWeight = userInput.nextDouble(); 	
				
				if (gravelWeight < SandOrGravelMaxWeight && gravelWeight > SandOrGravelMinWeight) {
					System.out.println ("Weight accepted. Sack type is " + sackType + ", Weight is " + gravelWeight + "kg.");
					numGravel +=1;
					totalWeight += gravelWeight;
					totalPrice += gravelPrice;
				} else if (gravelWeight > SandOrGravelMaxWeight || gravelWeight < SandOrGravelMinWeight) {
					sackRejected +=1;
					System.out.print ("Weight rejected. Sack type is " + sackType + ", ");
					if (gravelWeight > SandOrGravelMaxWeight) {
						howMuchGravelOverweight = gravelWeight - SandOrGravelMaxWeight;
						System.out.println (sackType + " sack is overweight by " + howMuchGravelOverweight + "kg.");
					} else {
						howMuchGravelUnderweight = SandOrGravelMinWeight - gravelWeight;
						System.out.println (sackType + " sack is underweight by " + howMuchGravelUnderweight + "kg.");
					} // end of if (gravelWeight > SandOrGravelMaxWeight)
				} else if (gravelWeight==SandOrGravelMaxWeight || gravelWeight==SandOrGravelMinWeight) {
					sackRejected +=1;
					System.out.print("Weight rejected. " + sackType + " is ");
					if (gravelWeight==SandOrGravelMaxWeight) {
						System.out.println ("on overweight boundary, must weigh under " + SandOrGravelMaxWeight + "kg.");
					} else {
						System.out.println ("on underweight boundary, must weigh over " + SandOrGravelMinWeight + "kg.");
					} // end of if (gravelWeight==SandOrGravelMaxWeight)
				} // end of if (gravelWeight < SandOrGravelMaxWeight && gravelWeight > SandOrGravelMinWeight)
	
			} else if (sackType.equals("Sand")) {
				double sandWeight = 0;
				sandWeight = userInput.nextDouble(); 
				
				if (sandWeight < SandOrGravelMaxWeight && sandWeight > SandOrGravelMinWeight) {
					System.out.println ("Weight accepted. Sack type is " + sackType + ", Weight is " + sandWeight + "kg.");
					numSand +=1;
					totalWeight += sandWeight;
					totalPrice += sandPrice;
				} else if (sandWeight > SandOrGravelMaxWeight || sandWeight < SandOrGravelMinWeight) {
					sackRejected +=1;
					System.out.print ("Weight rejected. Sack type is " + sackType + ", ");
					if (sandWeight > SandOrGravelMaxWeight) {
						howMuchSandOverweight = sandWeight - SandOrGravelMaxWeight;
						System.out.println (sackType + " sack is overweight by " + howMuchSandOverweight + "kg.");
					} else {
						howMuchSandUnderweight = SandOrGravelMinWeight - sandWeight;
						System.out.println (sackType + " sack is underweight by " + howMuchSandUnderweight + "kg.");
					} // end of if (sandWeight > SandOrGravelMaxWeight)
				} else if (sandWeight==SandOrGravelMaxWeight || sandWeight==SandOrGravelMinWeight) {
					sackRejected +=1;
					System.out.print("Weight rejected. " + sackType + " is ");
					if (sandWeight==SandOrGravelMaxWeight) {
						System.out.println ("on overweight boundary, must weigh under " + SandOrGravelMaxWeight + "kg.");
					} else {
						System.out.println ("on underweight boundary, must weigh over " + SandOrGravelMinWeight + "kg.");
					} // end of if (sandWeight==SandOrGravelMaxWeight)
				} // end of if (sandWeight < SandOrGravelMaxWeight && sandWeight > SandOrGravelMinWeight)
	
			} // end of if (sackType.equals("Cement"))	
			
			System.out.println ("Anymore sacks? (1 for yes, 0 for no)");
			customerOrder = userInput.nextInt(); 
		} // end of while (customerOrder == 1)
		
		System.out.println ("Number of accepted cement sacks: " + numCement);
		System.out.println ("Number of accepted sand sacks: " + numSand);
		System.out.println ("Number of accepted gravel sacks: " + numGravel);
		System.out.println ("Total weight: " + totalWeight + "kg.");
		System.out.println ("Sacks Rejected: " + sackRejected);
		
		while (numCement >= 1 && numSand >= 2 && numGravel >= 2) {
			specialPacks += 1;
			numCement -= 1;
			numSand -= 2;
			numGravel -= 2;
		} // end of while (numCement >= 1 && numSand >= 2 && numGravel >= 2)
		
		System.out.println ("Special packs: " + specialPacks);
		System.out.println ("Initial price: $" + totalPrice);
		discountAmount = 1 * specialPacks;
		finalPrice = totalPrice - discountAmount;
		System.out.println ("Discount price: $" + finalPrice);
		amountSaved = totalPrice - finalPrice;
		System.out.println ("Amount saved: $" + amountSaved);
		
		userInput.close(); // Close the scanner
		
		System.out.println ("Created by Amanda Yongvanich on 26 Sep 2019.");
		
	} //end.main
} //end.class