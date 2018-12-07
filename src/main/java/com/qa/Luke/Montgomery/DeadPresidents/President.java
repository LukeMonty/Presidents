package com.qa.Luke.Montgomery.DeadPresidents;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class President {
	Calendar dateOfBirth;
	Calendar dateOfDeath;
	String name;
	String placeOfBirth;
	String locationOfDeath;
	String[] split;

	/*
	 * public President(String name, String dateOfBirth, String placeOfBirth, String
	 * dateOfDeath, String location) { this.name = name; this.dateOfBirth =
	 * dateOfBirth; this.placeOfBirth = placeOfBirth; this.dateOfDeath =
	 * dateOfDeath; this.locationOfDeath = location; }
	 * 
	 * public President(String name, String dateOfBirth, String placeOfBirth) {
	 * this.name = name; this.dateOfBirth = dateOfBirth; this.placeOfBirth =
	 * placeOfBirth;
	 * 
	 * }
	 * 
	 * public void mPresident(String[] split) {
	 * 
	 * this.split[0] = name; this.split[1] = dateOfBirth; this.split[2] =
	 * placeOfBirth; }
	 */

	public President(String[] split) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");

		this.name = split[0];

		try {

			
				this.dateOfBirth.setTime(sdf.parse(split[1]));
		

		} catch (ParseException e) {

			e.printStackTrace();
		}

		this.placeOfBirth = split[2];
		try {
			this.dateOfDeath.setTime(sdf.parse(split[3]));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		this.locationOfDeath = split[4];

	}

	public String toString() {

		return this.locationOfDeath;

	}

}
