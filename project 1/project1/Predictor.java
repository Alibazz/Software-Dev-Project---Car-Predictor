package project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Predictor implements PredictorADT<String> {

	ArrayList<Car> car = new ArrayList<Car>();
	
	public Predictor() {
		
		read("./project1/carTrain.DATA");
	}
	
	public void read(String file) {

		FileReader fileReader;
		BufferedReader bReader;
		String line;

		try {
			fileReader = new FileReader(file);
			bReader = new BufferedReader(fileReader);

			while ((line = bReader.readLine()) != null) {
				String[] part = line.split(",");
				car.add(new Car(part[0], part[1], part[2], part[3], part[4], part[5], part[6]));				
			}

			} catch (IOException e) {
				
			System.out.println(file + " not found");
		}
	}

	@Override
	public double getTrainingAccuracy() {
		
		int count = 0;
		int i = 0;
		
		for(Car test: car) {
			if (getPrediction(test).equals(car.get(i).getRating())) 
				count++;
			i++;
		}
		
		double accuracy = (count*100)/car.size();
		return accuracy;
	}

	@Override
	public String getPrediction(CarADT instance) {
		
		return "unacc";
	}

}