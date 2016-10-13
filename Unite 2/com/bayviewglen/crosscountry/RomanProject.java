package com.bayviewglen.crosscountry;

import java.util.Scanner;
import java.text.DecimalFormat;

public class RomanProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		final int SECONDS_PER_MINUTE = 60;
		
		DecimalFormat formatter = new DecimalFormat("00.000");
		
		String divider = ("************************************");
		
		System.out.print("Please enter athlete's name (First, Last): ");
		String Name1 = input.nextLine();
		//Name of 1st athlete 
		
		//The time of the 1st athelete's first split-Start
		System.out.print("Please enter time to the First Mile (mm:ss.sss): ");
		String splitOne1= input.nextLine();
		int runner1Min1 = Integer.parseInt(splitOne1.split(":")[0]);
		double runner1Sec1 = Double.parseDouble(splitOne1.split(":")[1]);
		double runner1TotalSec1 = (runner1Min1 * SECONDS_PER_MINUTE) + runner1Sec1;								//Split 1's time in Seconds 
		String runner1Split1T = Double.toString(runner1Sec1);													//"T" = total
		runner1Split1T = formatter.format(runner1Sec1);
		//The time of the 1st athelete's first split-End
		
		//The time of the 1st athelete's second split- Start
		System.out.print("Please enter time to the end of the Second Mile (mm:ss.sss): ");
		String splitTwo1 = input.nextLine();
		int runner1Min2 = Integer.parseInt(splitTwo1.split(":")[0]);
		double runner1Sec2 = Double.parseDouble(splitTwo1.split(":")[1]);
		double runner1TotalSec2 = (runner1Min2 * SECONDS_PER_MINUTE) + runner1Sec2;								//Split 2's time in seconds
		int runner1Split2Min = (int)(runner1TotalSec2 - runner1TotalSec1) / SECONDS_PER_MINUTE;					//Mile 2's minutes
		double runner1Split2Sec = (runner1TotalSec2 - runner1TotalSec1) % SECONDS_PER_MINUTE;					//Mile 2's seconds
		String runner1Split2T = Double.toString(runner1Split2Sec);
		runner1Split2T = formatter.format(runner1Split2Sec);
		//The time of the 1st athelete's second split- End
		
		//The time of the 1st athelete's 3rd Split- Start
		System.out.print("Please enter time to complete 5km race (mm:ss.sss): ");
		String splitThree1 = input.nextLine();
		int runner1Min3 = Integer.parseInt(splitThree1.split(":")[0]);
	    double runner1Sec3 = Double.parseDouble(splitThree1.split(":")[1]);
	    double runner1TotalSec3 = (runner1Min3 * SECONDS_PER_MINUTE) + runner1Sec3;								//Split 3's time in seconds
		int runner1Split3Min = (int)(runner1TotalSec3 - runner1TotalSec2) / SECONDS_PER_MINUTE;					//Mile 3's minutes
		double runner1Split3Sec = (runner1TotalSec3 - runner1TotalSec2) % SECONDS_PER_MINUTE;					//Mile 3's seconds
		String runner1Split3T = Double.toString(runner1Split3Sec);
		runner1Split3T = formatter.format(runner1Split3Sec);
		//The time of the 1st athelete's 3rd Split- End
		
		System.out.println();
		System.out.println();
		System.out.println("Race Summary: " + Name1);
		System.out.println(divider);
		System.out.println("" + Name1 + "'s Split 1 time: " + runner1Min1 + ":" + runner1Split1T);
		System.out.println("" + Name1 + "'s Split 2 time: " + runner1Split2Min + ":" + runner1Split2T);
		System.out.println("" + Name1 + "'s Split 3 time: " + runner1Split3Min + ":" + runner1Split3T);
		System.out.println();
		System.out.println();
		
		
		//Name of 2nd athlete- Start
		System.out.print("Please enter athlete's name (First, Last): ");
		String Name2 = input.nextLine();
		//Name of 2nd athlete- End
		
		//The time of the 2nd athelete's first split- Start
		System.out.print("Please enter time to the First Mile (mm:ss.sss): ");
		String splitOne2= input.nextLine();
		int runner2Min1 = Integer.parseInt(splitOne2.split(":")[0]);
		double runner2Sec1 = Double.parseDouble(splitOne2.split(":")[1]);
		double runner2TotalSec1 = (runner2Min1 * SECONDS_PER_MINUTE) + runner2Sec1;								//Split 1's time in Seconds 
		String runner2Split1T = Double.toString(runner2Sec1);
		runner2Split1T = formatter.format(runner2Sec1);
		//The time of the 2nd athelete's first split- End
		
		//The time of the 2nd athelete's second split
		System.out.print("Please enter time to the end of the Second Mile (mm:ss.sss): ");
		String splitTwo2 = input.nextLine();
		int runner2Min2 = Integer.parseInt(splitTwo2.split(":")[0]);
		double runner2Sec2 = Double.parseDouble(splitTwo2.split(":")[1]);
		double runner2TotalSec2 = (runner2Min2 * SECONDS_PER_MINUTE) + runner2Sec2;								//Split 2's time in seconds
		int runner2Split2Min = (int)(runner2TotalSec2 - runner2TotalSec1) / SECONDS_PER_MINUTE;					//Mile 2's minutes
		double runner2Split2Sec = (runner2TotalSec2 - runner2TotalSec1) % SECONDS_PER_MINUTE;					//Mile 2's seconds
		String runner2Split2T = Double.toString(runner2Split2Sec);	
		runner2Split2T = formatter.format(runner2Split2Sec);
		//The time of the 2nd athelete's second split
		
		//The time of the 2nd athelete's 3rd Split
		System.out.print("Please enter time to complete 5km race (mm:ss.sss): ");
		String splitThree2 = input.nextLine();
		int runner2Min3 = Integer.parseInt(splitThree2.split(":")[0]);
	    double runner2Sec3 = Double.parseDouble(splitThree2.split(":")[1]);	
	    double runner2TotalSec3 = (runner2Min3 * SECONDS_PER_MINUTE) + runner2Sec3;								//Split 3's time in seconds
		int runner2Split3Min = (int)(runner2TotalSec3 - runner2TotalSec2) / SECONDS_PER_MINUTE;					//Mile 3's minutes
		double runner2Split3Sec = (runner2TotalSec3 - runner2TotalSec2) % SECONDS_PER_MINUTE;					//Mile 3's seconds
		String runner2Split3T = Double.toString(runner2Split3Sec);
		runner2Split3T = formatter.format(runner2Split3Sec);
		//The time of the 2nd athelete's 3rd Split
		
		
		System.out.println();
		System.out.println();
		System.out.println("Race Summary: " + Name2);
		System.out.println(divider);
		System.out.println("" + Name2 + "'s Split 1 time: " + runner2Min1 + ":" + runner2Split1T);
		System.out.println("" + Name2 + "'s Split 2 time: " + runner2Split2Min + ":" + runner2Split2T);
		System.out.println("" + Name2+ "'s Split 3 time: " + runner2Split3Min + ":" + runner2Split3T);
		System.out.println();
		System.out.println();
		
		
		System.out.print("Please enter athlete's name (First, Last): ");
		String Name3 = input.nextLine();
		//Name of 3rd athlete 
		
		//The time of the 3rd athelete's first split- Start
		System.out.print("Please enter time to the First Mile (mm:ss.sss): ");
		String splitOne3= input.nextLine();
		int runner3Min1 = Integer.parseInt(splitOne3.split(":")[0]);
		double runner3Sec1 = Double.parseDouble(splitOne3.split(":")[1]);
		double runner3TotalSec1 = (runner3Min1 * SECONDS_PER_MINUTE) + runner3Sec1;								//Split 1's time in Seconds 
		String runner3Split1T = Double.toString(runner3Sec1);
		runner3Split1T = formatter.format(runner3Sec1);
		//The time of the 3rd athelete's first split- End
		
		//The time of the 3rd athelete's second split - Start
		System.out.print("Please enter time to the end of the Second Mile (mm:ss.sss): ");
		String splitTwo3 = input.nextLine();
		int runner3Min2 = Integer.parseInt(splitTwo3.split(":")[0]);
		double runner3Sec2 = Double.parseDouble(splitTwo3.split(":")[1]);
		double runner3TotalSec2 = (runner3Min2 * SECONDS_PER_MINUTE) + runner3Sec2;								//Split 2's time in seconds
		int runner3Split2Min = (int)(runner3TotalSec2 - runner3TotalSec1) / SECONDS_PER_MINUTE;					//Split 2's minutes
		double runner3Split2Sec = (runner3TotalSec2 - runner3TotalSec1) % SECONDS_PER_MINUTE;					//Split 2's seconds
		String runner3Split2T = Double.toString(runner3Split2Sec);
		runner3Split2T = formatter.format(runner3Split2Sec);
		//The time of the 3rd athelete's second split - End
		
		//The time of the 3rd athelete's 3rd Split- Start
		System.out.print("Please enter time to complete 5km race (mm:ss.sss): ");
		String splitThree3 = input.nextLine();
		int runner3Min3 = Integer.parseInt(splitThree3.split(":")[0]);
	    double runner3Sec3 = Double.parseDouble(splitThree3.split(":")[1]);
	    double runner3TotalSec3 = (runner3Min3 * SECONDS_PER_MINUTE) + runner3Sec3;								//Split 3's time in seconds
		int runner3Split3Min = (int)(runner3TotalSec3 - runner3TotalSec2) / SECONDS_PER_MINUTE;					//Split 3's minutes
		double runner3Split3Sec = (runner3TotalSec3 - runner3TotalSec2) % SECONDS_PER_MINUTE;					//Split 3's seconds
		String runner3Split3T = Double.toString(runner3Split3Sec);
		runner3Split3T = formatter.format(runner3Split3Sec);
		//The time of the 3rd athelete's 3rd Split- End
		
		System.out.println();
		System.out.println();
		System.out.println("Race Summary: " + Name3);
		System.out.println(divider);
		System.out.println("" + Name3 + "'s Split 1 time: " + runner3Min1 + ":" + runner3Split1T);
		System.out.println("" + Name3 + "'s Split 2 time: " + runner3Split2Min + ":" + runner3Split2T);
		System.out.println("" + Name3 + "'s Split 3 time: " + runner3Split3Min + ":" + runner3Split3T);
		System.out.println();
		System.out.println();
		
		
		System.out.print("Please enter athlete's name (First, Last): ");
		String Name4 = input.nextLine();
		//Name of 4th athlete 
		
		//The time of the 4th athelete's first split- Start
		System.out.print("Please enter time to the First Mile (mm:ss.sss): ");
		String splitOne4= input.nextLine();
		int runner4Min1 = Integer.parseInt(splitOne4.split(":")[0]);
		double runner4Sec1 = Double.parseDouble(splitOne4.split(":")[1]);
		double runner4TotalSec1 = (runner4Min1 * SECONDS_PER_MINUTE) + runner4Sec1;								//Split 1's time in Seconds 
		String runner4Split1T = Double.toString(runner4Sec1);
		runner4Split1T = formatter.format(runner4Sec1);
		//The time of the 4th athelete's first split- End
		
		//The time of the 4th athelete's second split- Start
		System.out.print("Please enter time to the end of the Second Mile (mm:ss.sss): ");
		String splitTwo4 = input.nextLine();
		int runner4Min2 = Integer.parseInt(splitTwo4.split(":")[0]);
		double runner4Sec2 = Double.parseDouble(splitTwo4.split(":")[1]);
		double runner4TotalSec2 = (runner4Min2 * SECONDS_PER_MINUTE) + runner4Sec2;								//Split 2's time in seconds
		int runner4Split2Min = (int)(runner4TotalSec2 - runner4TotalSec1) / SECONDS_PER_MINUTE;					//Split 2's minutes
		double runner4Split2Sec = (runner4TotalSec2 - runner4TotalSec1) % SECONDS_PER_MINUTE;					//Split 2's seconds
		String runner4Split2T = Double.toString(runner4Split2Sec);
		runner4Split2T = formatter.format(runner4Split2Sec);
		//The time of the 4th athelete's second split- End
		
		//The time of the 4th athelete's 3rd Split- Start
		System.out.print("Please enter time to complete 5km race (mm:ss.sss): ");
		String splitThree4 = input.nextLine();
		int runner4Min3 = Integer.parseInt(splitThree4.split(":")[0]);
	    double runner4Sec3 = Double.parseDouble(splitThree4.split(":")[1]);
	    double runner4TotalSec3 = (runner4Min3 * SECONDS_PER_MINUTE) + runner4Sec3;								//Split 3's time in seconds
		int runner4Split3Min = (int)(runner4TotalSec3 - runner4TotalSec2) / SECONDS_PER_MINUTE;					//Split 3's minutes
		double runner4Split3Sec = (runner4TotalSec3 - runner4TotalSec2) % SECONDS_PER_MINUTE;					//Split 3's seconds
		String runner4Split3T = Double.toString(runner4Split3Sec);
		runner4Split3T = formatter.format(runner4Split3Sec);
		//The time of the 4th athelete's 3rd Split- End
		
		System.out.println();
		System.out.println();
		System.out.println("Race Summary: " + Name4);
		System.out.println(divider);
		System.out.println("" + Name4 + "'s Split 1 time: " + runner4Min1 + ":" + runner4Split1T);
		System.out.println("" + Name4 + "'s Split 2 time: " + runner4Split2Min + ":" + runner4Split2T);
		System.out.println("" + Name4 + "'s Split 3 time: " + runner4Split3Min + ":" + runner4Split3T);
		System.out.println();
		System.out.println();
		
		
		System.out.print("Please enter athlete's name (First, Last): ");
		String Name5 = input.nextLine();
		//Name of 5th athlete 
		
		//The time of the 5th athelete's first split- Start
		System.out.print("Please enter time to the First Mile (mm:ss.sss): ");
		String splitOne5= input.nextLine();
		int runner5Min1 = Integer.parseInt(splitOne5.split(":")[0]);
		double runner5Sec1 = Double.parseDouble(splitOne5.split(":")[1]);
		double runner5TotalSec1 = (runner5Min1 * SECONDS_PER_MINUTE) + runner5Sec1;									//Split 1's time in Seconds 
		String runner5Split1T = Double.toString(runner5Sec1);
		runner5Split1T = formatter.format(runner5Sec1);
		//The time of the 5th athelete's first split- End
		
		//The time of the 5th athelete's second split- Start
		System.out.print("Please enter time to the end of the Second Mile (mm:ss.sss): ");
		String splitTwo5 = input.nextLine();
		int runner5Min2 = Integer.parseInt(splitTwo5.split(":")[0]);
		double runner5Sec2 = Double.parseDouble(splitTwo5.split(":")[1]);
		double runner5TotalSec2 = (runner5Min2 * SECONDS_PER_MINUTE) + runner5Sec2;									//Split 2's time in seconds
		int runner5Split2Min = (int)(runner5TotalSec2 - runner5TotalSec1) / SECONDS_PER_MINUTE;						//Split 2's minutes
		double runner5Split2Sec = (runner5TotalSec2 - runner5TotalSec1) % SECONDS_PER_MINUTE;						//Split 2's seconds
		String runner5Split2T = Double.toString(runner5Split2Sec);
		runner5Split2T = formatter.format(runner5Split2Sec);
		//The time of the 5th athelete's second split- End
		
		//The time of the 5th athelete's 3rd Split- Start
		System.out.print("Please enter time to complete 5km race (mm:ss.sss): ");
		String splitThree5 = input.nextLine();
		int runner5Min3 = Integer.parseInt(splitThree5.split(":")[0]);
	    double runner5Sec3 = Double.parseDouble(splitThree5.split(":")[1]);
	    double runner5TotalSec3 = (runner5Min3 * SECONDS_PER_MINUTE) + runner5Sec3;									//Split 3's time in seconds
		int runner5Split3Min = (int)(runner5TotalSec3 - runner5TotalSec2) / SECONDS_PER_MINUTE;						//Split 3's minutes
		double runner5Split3Sec = (runner5TotalSec3 - runner5TotalSec2) % SECONDS_PER_MINUTE;						//Split 3's seconds
		String runner5Split3T = Double.toString(runner5Split3Sec);
		runner5Split3T = formatter.format(runner5Split3Sec);
		//The time of the 5th athelete's 3rd Split- End
		
		System.out.println();
		System.out.println();
		System.out.println("Race Summary: " + Name5);
		System.out.println(divider);
		System.out.println("" + Name5 + "'s Split 1 time: " + runner5Min1 + ":" + runner5Split1T);
		System.out.println("" + Name5 + "'s Split 2 time: " + runner5Split2Min + ":" + runner5Split2T);
		System.out.println("" + Name5 + "'s Split 3 time: " + runner5Split3Min + ":" + runner5Split3T);
		System.out.println();
		System.out.println();
		
		//Table- Start
		String runnerName = ("Runner");
		String t1 = ("Split 1 Time");
		String t2 = ("Split 2 Time");
		String t3 = ("Split 3 Time");
		String tTotal = ("Time to Complete Race");
		System.out.println("");
		System.out.printf("%-20s %-21s %-21s %-21s %-30s %n", runnerName, t1, t2, t3, tTotal);
		System.out.println(divider + divider + divider);
		System.out.printf("%-20s %-21s %-21s %-21s %-30s %n", Name1, runner1Min1 + ":" + runner1Split1T, runner1Split2Min + ":" + runner1Split2T, runner1Split3Min + ":" + runner1Split3T, splitThree1);
		System.out.printf("%-20s %-21s %-21s %-21s %-30s %n", Name2, runner2Min1 + ":" + runner2Split1T, runner2Split2Min + ":" + runner2Split2T, runner2Split3Min + ":" + runner2Split3T, splitThree2);
		System.out.printf("%-20s %-21s %-21s %-21s %-30s %n", Name3, runner3Min1 + ":" + runner3Split1T, runner3Split2Min + ":" + runner3Split2T, runner3Split3Min + ":" + runner3Split3T, splitThree3);
		System.out.printf("%-20s %-21s %-21s %-21s %-30s %n", Name4, runner4Min1 + ":" + runner4Split1T, runner4Split2Min + ":" + runner4Split2T, runner4Split3Min + ":" + runner4Split3T, splitThree4);
		System.out.printf("%-20s %-21s %-21s %-21s %-30s %n", Name5, runner5Min1 + ":" + runner5Split1T, runner5Split2Min + ":" + runner5Split2T, runner5Split3Min + ":" + runner5Split3T, splitThree5);
		//Table- End
	}


}