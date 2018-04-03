package com.apporelbotna.gameserver.stubs.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class ApplicationProperties
{
	private static String version;
	private static String name;

	private static final Logger logger = LoggerFactory.getLogger(ApplicationProperties.class);

	public static String getVersion()
	{
		return version;
	}

	public static String getName()
	{
		return name;
	}

	public static Logger getLogger()
	{
		return logger;
	}

	public static void setVersion(String version)
	{
		ApplicationProperties.version = version;
	}

	public static void setName(String name)
	{
		ApplicationProperties.name = name;
	}

	private ApplicationProperties()
	{
		throw new UnsupportedOperationException("ApplicationProperties must not be instantiated!");
	}

	static
	{
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String applicationPropertiesPath = rootPath + "com\\apporelbotna\\gameserver\\stubs\\properties\\application.properties";

		Properties applicationProperties = new Properties();
		try
		{
			applicationProperties.load(new FileInputStream(applicationPropertiesPath));
			version = applicationProperties.getProperty("version");
			name = applicationProperties.getProperty("name");
		}
		catch (IOException e)
		{
			logger.error(e.getMessage());
		}
	}
}
