package com.apporelbotna.gameserver.stubs;

public enum UserType
{
	USER("user"),
	ADMIN("admin");

	private String msg;

	private UserType(String msg)
	{
	    this.msg = msg;
	}

	public String getMsg()
	{
	    return msg;
	}
}
