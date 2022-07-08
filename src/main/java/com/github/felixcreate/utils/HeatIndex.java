package com.github.felixcreate.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Felix F-B
 *
 */
public class HeatIndex {
	public static Map<Integer, Map<Integer, Integer>> table = new HashMap<Integer, Map<Integer,Integer>>();
	
	/*
	 * Formula constants
	 */
	static double c1 = -8.78469475556;
	static double c2 = 1.61139411;
	static double c3 = 2.33854883889;
	static double c4 = -0.14611605;
	static double c5 = -0.012308094;
	static double c6 = -0.0164248277778;
	static double c7 = 0.002211732;
	static double c8 = 0.00072546;
	static double c9 = -0.000003582;
	
	static {
		/*
		 * Chart data from https://en.wikipedia.org/wiki/Heat_index#Table_of_values
		 */		
		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		temp.put(40, 27);
		temp.put(45, 27);
		temp.put(50, 27);
		temp.put(55, 27);
		temp.put(60, 28);
		temp.put(65, 28);
		temp.put(70, 28);
		temp.put(75, 29);
		temp.put(80, 29);
		temp.put(85, 29);
		temp.put(90, 30);
		temp.put(95, 30);
		temp.put(100, 31);
		table.put(80, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 27);
		temp.put(45, 28);
		temp.put(50, 28);
		temp.put(55, 29);
		temp.put(60, 29);
		temp.put(65, 29);
		temp.put(70, 30);
		temp.put(75, 31);
		temp.put(80, 32);
		temp.put(85, 32);
		temp.put(90, 33);
		temp.put(95, 34);
		temp.put(100, 35);
		table.put(82, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 28);
		temp.put(45, 29);
		temp.put(50, 29);
		temp.put(55, 30);
		temp.put(60, 31);
		temp.put(65, 32);
		temp.put(70, 32);
		temp.put(75, 33);
		temp.put(80, 34);
		temp.put(85, 36);
		temp.put(90, 37);
		temp.put(95, 38);
		temp.put(100, 39);
		table.put(84, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 29);
		temp.put(45, 31);
		temp.put(50, 31);
		temp.put(55, 32);
		temp.put(60, 33);
		temp.put(65, 34);
		temp.put(70, 35);
		temp.put(75, 36);
		temp.put(80, 38);
		temp.put(85, 39);
		temp.put(90, 41);
		temp.put(95, 42);
		temp.put(100, 44);
		table.put(86, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 31);
		temp.put(45, 32);
		temp.put(50, 33);
		temp.put(55, 34);
		temp.put(60, 35);
		temp.put(65, 37);
		temp.put(70, 38);
		temp.put(75, 39);
		temp.put(80, 41);
		temp.put(85, 43);
		temp.put(90, 45);
		temp.put(95, 47);
		temp.put(100, 49);
		table.put(88, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 33);
		temp.put(45, 34);
		temp.put(50, 35);
		temp.put(55, 36);
		temp.put(60, 38);
		temp.put(65, 39);
		temp.put(70, 41);
		temp.put(75, 43);
		temp.put(80, 45);
		temp.put(85, 47);
		temp.put(90, 50);
		temp.put(95, 53);
		temp.put(100, 56);
		table.put(90, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 34);
		temp.put(45, 36);
		temp.put(50, 37);
		temp.put(55, 38);
		temp.put(60, 41);
		temp.put(65, 42);
		temp.put(70, 44);
		temp.put(75, 47);
		temp.put(80, 49);
		temp.put(85, 52);
		temp.put(90, 55);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(92, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 36);
		temp.put(45, 38);
		temp.put(50, 39);
		temp.put(55, 41);
		temp.put(60, 43);
		temp.put(65, 46);
		temp.put(70, 48);
		temp.put(75, 51);
		temp.put(80, 54);
		temp.put(85, 57);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(94, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 38);
		temp.put(45, 40);
		temp.put(50, 42);
		temp.put(55, 44);
		temp.put(60, 47);
		temp.put(65, 49);
		temp.put(70, 52);
		temp.put(75, 56);
		temp.put(80, -1);
		temp.put(85, -1);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(96, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 41);
		temp.put(45, 43);
		temp.put(50, 45);
		temp.put(55, 47);
		temp.put(60, 51);
		temp.put(65, 53);
		temp.put(70, 57);
		temp.put(75, -1);
		temp.put(80, -1);
		temp.put(85, -1);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(98, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 43);
		temp.put(45, 46);
		temp.put(50, 48);
		temp.put(55, 51);
		temp.put(60, 54);
		temp.put(65, 58);
		temp.put(70, -1);
		temp.put(75, -1);
		temp.put(80, -1);
		temp.put(85, -1);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(100, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 46);
		temp.put(45, 48);
		temp.put(50, 51);
		temp.put(55, 54);
		temp.put(60, 58);
		temp.put(65, -1);
		temp.put(70, -1);
		temp.put(75, -1);
		temp.put(80, -1);
		temp.put(85, -1);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(102, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 48);
		temp.put(45, 51);
		temp.put(50, 55);
		temp.put(55, 58);
		temp.put(60, -1);
		temp.put(65, -1);
		temp.put(70, -1);
		temp.put(75, -1);
		temp.put(80, -1);
		temp.put(85, -1);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(104, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 51);
		temp.put(45, 54);
		temp.put(50, 58);
		temp.put(55, -1);
		temp.put(60, -1);
		temp.put(65, -1);
		temp.put(70, -1);
		temp.put(75, -1);
		temp.put(80, -1);
		temp.put(85, -1);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(106, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 54);
		temp.put(45, 58);
		temp.put(50, -1);
		temp.put(55, -1);
		temp.put(60, -1);
		temp.put(65, -1);
		temp.put(70, -1);
		temp.put(75, -1);
		temp.put(80, -1);
		temp.put(85, -1);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(108, temp);
		
		temp = new HashMap<Integer, Integer>();
		temp.put(40, 58);
		temp.put(45, -1);
		temp.put(50, -1);
		temp.put(55, -1);
		temp.put(60, -1);
		temp.put(65, -1);
		temp.put(70, -1);
		temp.put(75, -1);
		temp.put(80, -1);
		temp.put(85, -1);
		temp.put(90, -1);
		temp.put(95, -1);
		temp.put(100, -1);
		table.put(110, temp);
	}
	
	public static class RHOutOfRange extends Exception {
		private static final long serialVersionUID = 7977627651339835398L;
	}
	public static class HIAboveRange extends Exception {
		private static final long serialVersionUID = -7708306332596687673L;
	}
	public static class HIBelowRange extends Exception {
		private static final long serialVersionUID = -6156333083713744647L;
	}
	public static class HIOutOfRange extends Exception {
		private static final long serialVersionUID = 2311546524401471045L;
	}
	
	public static enum DangerLevel {
		Caution,
		Extreme_Caution,
		Danger,
		Extreme_Danger
	}
	
	/**
	 * Calculate Heat Index from temperature and relative humidity.
	 * 
	 * Throws RHOutOfRange if the relative humidity is under 37.5%.
	 * Throws HIAboveRange if the temperature is above 43.5, or calculated Heat Index is above 58.
	 * Throws HIBelowRange if the temperature is below 26.5.
	 * 
	 * @param T Temperature in Celsius
	 * @param RH Relative Humidity
	 * @return Heat Index in Celsius
	 * @throws RHOutOfRange
	 * @throws HIAboveRange
	 * @throws HIBelowRange
	 */
	public static int calculate_from_chart(double T, double RH) throws RHOutOfRange, HIAboveRange, HIBelowRange {
		double F = ((T * 9) / 5) + 32;
		if(F < 79.5) {
			throw new HIBelowRange();
		}
		if(F > 110.5) {
			throw new HIAboveRange();
		}
		if((RH < 40) || (RH > 100)) {
			throw new RHOutOfRange();
		}
		
		int RRH = (int) Math.round(RH/5)*5;
		int RF = (int) Math.round(F/2)*2;
		
		int HI = table.get(RF).get(RRH);
		
		if(HI == -1) {
			throw new HIAboveRange();
		}
		
		return HI;
	}
	
	public static double calculate_from_regression(double T, double RH) throws RHOutOfRange, HIBelowRange, HIAboveRange {
		if(T < 26) {
			throw new HIBelowRange();
		}
		if(T > 43) {
			throw new HIAboveRange();
		}
		if((RH < 40) || (RH > 100)) {
			throw new RHOutOfRange();
		}
		double HI = c1 + (c2 * T) + (c3 * RH) + (c4 * T * RH) + (c5 * T * T) + (c6 * RH * RH) + (c7 * T * T * RH) + (c8 * T * RH * RH) + (c9 * T * T * RH * RH);
		return HI;
	}
	
	/**
	 * Gets the danger level of a given Heat Index.
	 * Throws HIOutOfRange if the Heat Index is less than 27.
	 * @param HI Heat Index
	 * @return Danger Level
	 * @throws HIOutOfRange
	 */
	public static DangerLevel getDangerLevel(int HI) throws HIOutOfRange{
		if(HI < 27) {
			throw new HIOutOfRange();
		}
		else if(HI < 32) {
			return DangerLevel.Caution;
		}
		else if(HI < 41) {
			return DangerLevel.Extreme_Caution;
		}
		else if(HI < 54) {
			return DangerLevel.Danger;
		}
		else {
			return DangerLevel.Extreme_Danger;
		}
	}
	
	public static String getDangerLevelString(DangerLevel level) {
		if(level.equals(DangerLevel.Caution)) {
			return "Caution";
		}
		else if(level.equals(DangerLevel.Extreme_Caution)) {
			return "Extreme caution";
		}
		else if(level.equals(DangerLevel.Danger)) {
			return "Danger";
		}
		else {
			return "Extreme danger";
		}
	}
}