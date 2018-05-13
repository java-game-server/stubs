package com.apporelbotna.gameserver.stubs;

public enum UserType
{
	USER("user"),
	ADMIN("admin");

	private String type;

	private UserType(String type)
	{
	    this.type = type;
	}

	public String getType()
	{
	    return type;
	}

	/**
	 * convert a string to the Enum Type
	 *
	 * @param userType
	 * @return the enumType. if can't convert return null
	 */
	public static UserType convertStringToUserType(String userType) {
		for (UserType actualUserType : UserType.values()) {
			if(actualUserType.getType().equals(userType)) {
				return actualUserType;
			}
		}
		return null;
	}
}
