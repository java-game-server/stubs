package com.apporelbotna.gameserver.stubs;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RegisterUser
{
    private User user;
    private String password;

    public RegisterUser()
    {
	super();
    }

    public RegisterUser(User user, String password)
    {
	super();
	this.user = user;
	this.password = password;
    }

    public User getUser()
    {
	return user;
    }

    public String getPassword()
    {
	return password;
    }

    public void setUser(User user)
    {
	this.user = user;
    }

    public void setPassword(String password)
    {
	this.password = password;
    }

}
