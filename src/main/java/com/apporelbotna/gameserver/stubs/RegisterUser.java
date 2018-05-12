package com.apporelbotna.gameserver.stubs;

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
