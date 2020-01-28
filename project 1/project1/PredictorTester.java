package project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PredictorTester {
	
	 

		public static void main(String[] args) {
			
			Predictor predictor = new Predictor();
			System.out.println("Persentage accuracy: " + predictor.getTrainingAccuracy() + "%");
			

		}
}
	
