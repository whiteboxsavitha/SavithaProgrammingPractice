package com.collection;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Stack;

import java.util.Locale;
import java.util.ResourceBundle;
public class UtilEx {

	// Bundle contains the text for the current locale
	private ResourceBundle defaultMsg;
	private ResourceBundle msg;

	private final Locale currentLocale;
	private final Locale defaultLocale;

	/**
	 * This constructor is setting the locale. The locale must be set if the
	 * default locale is not being used before the ResourceBundle is loaded.
	 */
	public UtilEx() {

		// Default locale
		defaultLocale = Locale.getDefault();

		// Change the locale to use the appropriate bundle
		// currentLocale = new Locale("en","CA");
		currentLocale = new Locale("fr", "CA");

		// Alternative naming for locale
		// currentLocale = Locale.CANADA;
		// currentLocale = Locale.CANADA_FRENCH;
	}

	/**
	 * Load up the ResourceBundle for each locale and display the values
	 */
	public void perform() {

		// If we wanted the locale to be set based on the installed Java's
		// locale then you instantiate the bundle without the Locale parameter
		// defaultMessages = ResourceBundle.getBundle("MessagesBundle");

		// Two bundles with different Locales. You cannot change the Locale
		// after the bundle is loaded
		defaultMsg = ResourceBundle.getBundle("MessagesBundle", defaultLocale);
		msg = ResourceBundle.getBundle("MessagesBundle", currentLocale);

		System.out.println("\nLocale set in code: " + currentLocale);
		System.out.println("-----------------");
		System.out.println(msg.getString("Title"));
		System.out.println(msg.getString("Fishies"));
		System.out.println(msg.getString("File"));
		System.out.println(msg.getString("Help"));
		System.out.println(msg.getString("Save"));
		System.out.println(msg.getString("About"));
		System.out.println(msg.getString("Close"));
		System.out.println(msg.getString("HTML=Demo"));
		System.out.println(msg.getString("Demo"));
		System.out.println(msg.getString("Line1"));
		System.out.println(msg.getString("Line2"));
		System.out.println(msg.getString("ID"));
		System.out.println(msg.getString("Common Name"));
		System.out.println(msg.getString("Latin"));
		System.out.println(msg.getString("PH"));
		System.out.println(msg.getString("KH"));
		System.out.println(msg.getString("Temperature"));
		System.out.println(msg.getString("FishSize"));
		System.out.println(msg.getString("SpeciesOrigin"));
		System.out.println(msg.getString("TankSize"));
		System.out.println(msg.getString("Stocking"));
		System.out.println(msg.getString("Diet"));

		System.out.println("\nDefault locale as set by OS: " + defaultLocale);
		System.out.println("-----------------");
		System.out.println(defaultMsg.getString("Title"));
		System.out.println(defaultMsg.getString("Fishies"));
		System.out.println(defaultMsg.getString("File"));
		System.out.println(defaultMsg.getString("Help"));
		System.out.println(defaultMsg.getString("Save"));
		System.out.println(defaultMsg.getString("About"));
		System.out.println(defaultMsg.getString("Close"));
		System.out.println(defaultMsg.getString("HTML=Demo"));
		System.out.println(defaultMsg.getString("Demo"));
		System.out.println(defaultMsg.getString("Line1"));
		System.out.println(defaultMsg.getString("Line2"));
		System.out.println(defaultMsg.getString("ID"));
		System.out.println(defaultMsg.getString("Common Name"));
		System.out.println(defaultMsg.getString("Latin"));
		System.out.println(defaultMsg.getString("PH"));
		System.out.println(defaultMsg.getString("KH"));
		System.out.println(defaultMsg.getString("Temperature"));
		System.out.println(defaultMsg.getString("FishSize"));
		System.out.println(defaultMsg.getString("SpeciesOrigin"));
		System.out.println(defaultMsg.getString("TankSize"));
		System.out.println(defaultMsg.getString("Stocking"));
		System.out.println(defaultMsg.getString("Diet"));
	}

	/**
	 * Where it all begins
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		UtilEx mainApp = new UtilEx();
		mainApp.perform();
		System.exit(0);
	}
}