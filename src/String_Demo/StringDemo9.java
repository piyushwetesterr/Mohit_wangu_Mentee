package String_Demo;

import java.util.Scanner;

public class StringDemo9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter City Name : ");

		String city = sc.nextLine().toLowerCase().trim();

		if (city.equals("delhi")) {
			System.out.println("Welcome to Delhi");

		}

		else

		if (city.equals("chennai")) {
			System.out.println("Welcome to Chennai");

		}

		else

		if (city.equals("bangalore")) {
			System.out.println("Welcome to Bangalore");

		}

		else
			System.out.println("Please enter correct city");
	}

}
