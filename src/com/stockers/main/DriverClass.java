package com.stockers.main;

import java.util.Scanner;

import com.stockers.search.BinarySearch;
import com.stockers.sort.MergeSort;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies");
		int companies = sc.nextInt();
		double[] sharePrice=new double[companies];
		int countInc=0;
		int countDec=0;
		for(int i=0;i<companies;i++) {
			System.out.println("Enter current stock price of the company " + (i+1));
			sharePrice[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			boolean b =sc.nextBoolean();
			if(b== true) {
				countInc++;
			}
			else {
				countDec++;
			}
		}
		MergeSort s =new MergeSort();
		BinarySearch b = new BinarySearch();
		int opt;
		do {
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order\n"
					+ "2. Display the companies stock prices in descending order\n"
					+ "3. Display the total no of companies for which stock prices rose today\n"
					+ "4. Display the total no of companies for which stock prices declined today\n"
					+ "5. Search a specific stock price\n"
					+ "6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			System.out.println();
			opt= sc.nextInt();
			switch(opt) {
			case 1: s.sortAsc(sharePrice, 0, companies-1);
					for(int i=0;i<companies;i++) {
						System.out.println(sharePrice[i]);
					}
					break;
			case 2: s.sortDesc(sharePrice, 0, companies-1);
					for(int i=0;i<companies;i++) {
						System.out.println(sharePrice[i]);
					}
					break;
			case 3: System.out.println("Total no of companies whose stock price rose today: " + countInc++);
					break;
			case 4: System.out.println("Total no of companies whose stock price declined today: "+countDec++);
					break;
			case 5: s.sortAsc(sharePrice, 0, companies-1);
					System.out.println("Enter the key value");
					double value = sc.nextDouble();
					int found = b.binarySearch(sharePrice,0,companies-1,value);
					if(found==-1) {
						System.out.println("Value not found");
					}
					else {
						System.out.println("Stock of value "+ value + " is present");
					}
					break;
			case 0: opt=0;
					System.out.println("Exited successfully");
					break;
			default:System.out.println("Please enter correct option !");
				
			}
		}while(opt !=0);
		sc.close();
	}

}
