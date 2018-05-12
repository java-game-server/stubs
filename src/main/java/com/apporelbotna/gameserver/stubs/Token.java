package com.apporelbotna.gameserver.stubs;

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

    }

    public Token(
		 String tokenName)
    {
	super();
	this.tokenName = tokenName;
    }

    public void setTokenName(String tokenName)
    {
	this.tokenName = tokenName;
    }

    @JsonProperty()
    public String getTokenName()
    {
	return tokenName;
    }

    @Override
    public String toString()
    {
	return tokenName;
    }

}
