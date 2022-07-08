package com.github.felixcreate.utils;

/**
 * @author Felix F-B
 *
 */
public class Humidex {
	/**
	 * @param T Temperature in Celcius
	 * @param DP Dew point in Celcius
	 * @return Humidex
	 */
	public static double calculate(double T, double DP) {
		double offset = ((5.0/9) * ((6.11 * Math.exp(5417.753 * ((1/273.16) - (1/(273.15 + DP))))) - 10));
		return T + offset;
	}
}