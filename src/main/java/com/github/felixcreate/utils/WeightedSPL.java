package com.github.felixcreate.utils;

public class WeightedSPL {
	public static double aWeight(double frequency) {
		double numer = (12194*12194) * Math.pow(frequency, 4);
		double fs = Math.pow(frequency, 2);
		double denom = (fs + (20.6*20.6)) * Math.sqrt((fs + (107.7*107.7))*(fs + (737.9*737.9))) * (fs + (12194*12194));
		return numer/denom;
	}
	public static double calculateAWeightingGain(double frequency) {
		return (20 * Math.log10(aWeight(frequency))) + 1.9998584723051207;
	}
}
