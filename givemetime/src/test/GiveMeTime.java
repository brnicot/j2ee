package test;

import java.util.Date;


public class GiveMeTime {

	public static String getCurrentTime() {
		return new Date(System.currentTimeMillis()).toString();
	}
}
