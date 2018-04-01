package com.apporelbotna.gameserver.stubs;

//TODO cambiar nombre por uno que refleje mejor que es un objeto que solo sirve para cuando haces log in
public class UserWrapper
{
	User user;
	String password;

	public UserWrapper()
	{

	}

	public UserWrapper(
						User user,
						String password)
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
