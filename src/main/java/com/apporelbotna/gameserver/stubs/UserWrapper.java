package com.apporelbotna.gameserver.stubs;

//TODO cambiar nombre por uno que refleje mejor que es un objeto que solo sirve para cuando haces log in
public class UserWrapper
{
	User user;
	Token token;

	public UserWrapper(
						User user,
						Token token)
	{
		super();
		this.user = user;
		this.token = token;
	}

	public User getUser()
	{
		return user;
	}

	public Token getToken()
	{
		return token;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public void setToken(Token token)
	{
		this.token = token;
	}
}
