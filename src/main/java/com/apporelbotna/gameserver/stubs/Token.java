package com.apporelbotna.gameserver.stubs;

import java.util.UUID;

/**
 * The objective of this class it's provide the first security.
 * Preventing the user information traveling by Json WebService.
 */
public class Token
{
	private String tokenName;

	public Token()
	{
		tokenName = generateToken();
	}

	public String getTokenName()
	{
		return tokenName;
	}

	/**
	 * Apply and algorithm to create new token.
	 *
	 * @return the token generate
	 */
	private String generateToken() {
		String randomToken = UUID.randomUUID().toString();
		return randomToken.replace("-", "");
	}

	@Override
	public String toString()
	{
		return tokenName;
	}


}
