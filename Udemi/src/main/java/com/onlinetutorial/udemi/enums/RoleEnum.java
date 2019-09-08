package com.onlinetutorial.udemi.enums;

public enum RoleEnum {

	AD("AD", "Admin"), ST("ST", "User");

	private final String statusCode;
	private final String displayName;

	RoleEnum(String statusCode, String displayName) {
		this.statusCode = statusCode;
		this.displayName = displayName;
	}

	public static String getDisplayName(String statusCode) {

		if ("AD".equals(statusCode)) {
			return RoleEnum.AD.displayName;
		}
		return null;
	}

	public static RoleEnum getEnumByStatusCode(String statusCode) {

		if ("AD".equals(statusCode)) {
			return RoleEnum.AD;
		}
		return null;
	}
}
