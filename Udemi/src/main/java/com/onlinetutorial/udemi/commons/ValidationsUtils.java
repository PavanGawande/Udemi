package com.onlinetutorial.udemi.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationsUtils {

	public static boolean checkStringIsNullorEmpty(String str) {

		if (str != null) {
			str = str.trim();
		}

		if ("".equals(str) || str == null) {

			return true;
		}
		return false;
	}

	public static boolean onlyAlphabetsAllow(String str) {

		String regex = Constants.ONLY_APLHA_REGAX;

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(str);

		if (matcher.matches()) {
			return false;

		}
		return true;
	}

	public static boolean emailvalidation(String str) {
		String regex = Constants.EMAIL_REGAX;

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(str);

		if (matcher.matches()) {
			return false;

		}
		return true;
	}

}
