package com.apporelbotna.gameserver.stubs.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;

import lombok.Getter;
import lombok.extern.java.Log;

@Log
public final class ApplicationProperties
{
	@Getter private static String version;
	@Getter private static String name;

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
			log.log(Level.FINER, Arrays.toString(e.getStackTrace()), e);
		}
	}
}
