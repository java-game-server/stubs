package com.apporelbotna.gameserver.stubs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A singleton class used to manage user authentication inside an application.
 *
 * @author Jendoliver
 *
 */
public class AuthenticatedUser
{
	private static final String NO_INSTANCE =
			"No AuthenticatedUser was created. HINT: Use create(user, token) before calling getInstance";
	private static final String MULTIPLE_INSTANCES =
			"An AuthenticatedUser was already created. HINT: Did you mean to use getInstance()?";

	private static final Logger logger = LoggerFactory.getLogger(AuthenticatedUser.class);

	private User user;
	private Token token;
	private static AuthenticatedUser instance;

	private AuthenticatedUser(User user, Token token)
	{
		this.user = user;
		this.token = token;
	}

	public static AuthenticatedUser create(User user, Token token)
	{
		if(instance == null)
		{
			instance = new AuthenticatedUser(user, token);
			return instance;
		}
		logger.error(MULTIPLE_INSTANCES);
		throw new UnsupportedOperationException(MULTIPLE_INSTANCES);
	}

	public static AuthenticatedUser getInstance()
	{
		if(instance == null)
		{
			logger.error(NO_INSTANCE);
			throw new UnsupportedOperationException(NO_INSTANCE);
		}
		return instance;
	}

	public User getUser()
	{
		return user;
	}

	public Token getToken()
	{
		return token;
	}

	public String getEmail()
	{
		return user.getEmail();
	}
}
