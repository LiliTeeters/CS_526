import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Hw1_p2 {

	public static void findByMake(Car[] cars, String make) {
		// implement this method
		boolean foundCar = false;
		for (int i = 0; i <cars.length; i++) {
			if (cars[i].getMake().equals(make)) {
				System.out.println(cars[i]);
				foundCar = true;
			}
		}if (!foundCar){
			System.out.println("No car found");
		}
	}
	
	public static void olderThan(Car[] cars, int year) {
		// implement this method
		for (int i= 0; i < cars.length; i++) {
			if (cars[i].getYear() < year)
				System.out.println(cars[i]);

		}
	}
	
	public static void main(String[] args) throws IOException {

		// complete this part
		// create an array of Car objects, cars, of size 10
		// read input file and store 10 car Objects in the array


		try {
			//opening file
			File file = new File("car_input.txt");

			//reading input from file
			Scanner in = new Scanner(file);


			//array of Cars of size 10
			Car[] cars = new Car[10];
			int i = 0;

			//while able to read next line
			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] arraySpot = line.split(", "); //split array at each comma
				if (arraySpot.length != 3) {
					continue;
				}
				String mk = arraySpot[0].trim(); //assigning make to varialbe mk
				int pr = Integer.parseInt(arraySpot[1].trim()); //assigning price to variable pr
				int yr = Integer.parseInt((arraySpot[2].trim())); //assigning year to variable yr
				cars[i++] = new Car(mk, yr, pr);

			}
			in.close();

			System.out.println("\nAll cars:");
			//for loop that will print all cars in cars array to include mk, pr, yr
			for (i = 0; i < cars.length; i++) {
				System.out.println(cars[i]);
			}

			String make = "Honda";
			int year = 2017;

			System.out.println("\nAll cars made by " + make);
			findByMake(cars, make);
			System.out.println("\nAll cars made before " + year);
			olderThan(cars, year);
		}
		catch (FileNotFoundException e) {
			System.out.println("Input file not found");
		}
	}

}
