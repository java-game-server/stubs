package com.apporelbotna.gameserver.stubs;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The objective of this class it's provide the first security. Preventing the
 * user information traveling by Json WebService.
 */
public class Token
{
	private String tokenName;

	public Token()
	{
		tokenName = generateToken();
	}

	@JsonProperty()
	public String getTokenName()
	{
		return tokenName;
	}

	@JsonIgnore
	public void setTokenName(String tokenName)
	{
		this.tokenName = tokenName;
	}

	/**
	 * Apply an algorithm to create a new token.
	 *
	 * @return The generated token
	 */
	private String generateToken()
	{
		String randomToken = UUID.randomUUID().toString();
		return randomToken.replace("-", "");
	}

	@Override
	public String toString()
	{
		return tokenName;
	}

}
