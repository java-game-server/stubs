package com.apporelbotna.gameserver.stubs;

import java.util.ArrayList;
import java.util.List;

public class User
{
	private String email;
	private String name;
	private List<Token> tokens;
	private List<Game> games;

	public User()
	{

	}

	public User(String email, String name)
	{
		super();
		this.email = email;
		this.name = name;
		this.tokens = new ArrayList<>();
		this.games = new ArrayList<>();
	}

	public User(String email, String name, List<Game> games)
	{
		super();
		this.email = email;
		this.name = name;
		this.tokens = new ArrayList<>();
		this.games = games;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setGames(List<Game> games)
	{
		this.games = games;
	}

	public List<Token> getToken()
	{
		return tokens;
	}

	/**
	 * Add a token to the List of tokens
	 *
	 * @param tokenToAdd
	 */
	public void addToken(Token tokenToAdd)
	{
		tokens.add(tokenToAdd);
	}

	public List<Game> getGames()
	{
		return games;
	}

	/**
	 * Add a game to the List of games
	 *
	 * @param gameToAdd
	 */
	public void addGame(Game gameToAdd)
	{
		games.add(gameToAdd);
	}

	@Override
	public String toString()
	{
		return "email= " + email + ", name= " + name + ", tokens=" + tokens + "\r\n games=" + games + "]";
	}



}
