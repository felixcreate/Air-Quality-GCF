package com.github.felixcreate.utils;

/**
 * @author Felix F-B
 *
 */
public class DewPoint {
	static double a = 6.1121;
	static double b = 18.678;
	static double c = 257;
	static double d = 234.5;
	
	/** Calculate dew point.
	 * @param T
	 * @param RH
	 * @return Dew point in Celcius
	 */
	public static double calculateDP(double T, double RH) {
		return (c * ym(T, RH)) / (b - ym(T, RH));
	}
	
	private static double ym(double T, double RH) {
		return Math.log((RH/100) * Math.exp((b - (T/d)) * (T/(c + T))));
	}
}