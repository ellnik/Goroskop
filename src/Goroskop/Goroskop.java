package Goroskop;

import java.util.Scanner;

import AltersRecner.AltersRecner;
import WesternZodiac.WesternZodiac;
import ChineseZodiac.ChineseZodiac;

public class Goroskop {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Tag: ");
	        int tag = sc.nextInt();

	        System.out.print("Monat: ");
	        int monat = sc.nextInt();

	        System.out.print("Jahr: ");
	        int jahr = sc.nextInt();

	        System.out.println("Sternzeichen: " + WesternZodiac.getZodiac(tag, monat));
	        System.out.println("Chinesisches Tier: " + ChineseZodiac.getTiere(jahr));
	        System.out.println("Alter in Tagen: " + AltersRecner.rechnenTage(tag, monat, jahr));
	    }
	}
