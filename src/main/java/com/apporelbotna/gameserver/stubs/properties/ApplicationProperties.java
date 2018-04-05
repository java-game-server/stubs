package com.apporelbotna.gameserver.stubs.properties;

import java.util.ResourceBundle;

public final class ApplicationProperties
{
	private static String version;
	private static String name;

	public static String getVersion()
	{
		return version;
	}

	public static String getName()
	{
		return name;
	}

	private ApplicationProperties()
	{
		throw new UnsupportedOperationException("ApplicationProperties must not be instantiated!");
	}

	static
	{
		ResourceBundle bundle = ResourceBundle
				.getBundle("com.apporelbotna.gameserver.stubs.properties.application");

		version = bundle.getString("version");
		name = bundle.getString("name");
	}
}
