package com.apporelbotna.gameserver.stubs;

//TODO cambiar nombre por uno que refleje mejor que es un objeto que solo sirve para cuando haces log in
public class UserWrapper
{
	private User user;
	private Token token;

	public UserWrapper()
	{
		super();
	}

	public UserWrapper(User user,	Token token)
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

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		UserWrapper other = (UserWrapper)obj;
		if (user == null)
		{
			if (other.user != null)
			{
				return false;
			}
		}
		else if (!user.equals(other.user))
		{
			return false;
		}
		return true;
	}
}
