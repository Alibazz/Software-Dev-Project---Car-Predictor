package project1;

public interface PredictorADT<String> {
	
	public double getTrainingAccuracy ();
	public String getPrediction (CarADT instance); 
	
	}