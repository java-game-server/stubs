package com.apporelbotna.gameserver.stubs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Identifiable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class User implements Identifiable<String>
{
    @JsonProperty("email")
	private String email;

	private String name;
	private List<Token> tokens;
	private List<Game> games;

	public User()
	{

	}

	public User(String email, String name)
	{
		this.email = email;
		this.name = name;
		this.tokens = new ArrayList<>();
		this.games = new ArrayList<>();
	}

	public User(String email, String name, List<Game> games)
	{
		this.email = email;
		this.name = name;
		this.tokens = new ArrayList<>();
		this.games = games;
	}

	@JsonProperty("email")
	@JsonGetter
	@Override
	public String getId()
	{
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
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

	public List<Game> getGames()
	{
		return games;
	}

	public List<Token> getTokens()
	{
		return tokens;
	}

	public void setTokens(List<Token> tokens)
	{
		this.tokens = tokens;
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
