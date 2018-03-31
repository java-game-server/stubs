package com.apporelbotna.gameserver.stubs;

import org.springframework.hateoas.Identifiable;

public class Match implements Identifiable<Integer>
{
	private Integer id;
	private String emailUser;
	private int idGame;
	private float gameLenght;
	private int puntuation;

	public Match(
						String emailUser,
						int idGame,
						float gameLenght,
						int puntuation)
	{
		super();
		this.emailUser = emailUser;
		this.idGame = idGame;
		this.gameLenght = gameLenght;
		this.puntuation = puntuation;
	}

	@Override
	public Integer getId()
	{
		return id;
	}

	public String getEmailUser()
	{
		return emailUser;
	}

	public void setEmailUser(String emailUser)
	{
		this.emailUser = emailUser;
	}

	public int getIdGame()
	{
		return idGame;
	}

	public void setIdGame(int idGame)
	{
		this.idGame = idGame;
	}

	public float getGameLenght()
	{
		return gameLenght;
	}

	public void setGameLenght(float gameLenght)
	{
		this.gameLenght = gameLenght;
	}

	public int getPuntuation()
	{
		return puntuation;
	}

	public void setPuntuation(int puntuation)
	{
		this.puntuation = puntuation;
	}
}
