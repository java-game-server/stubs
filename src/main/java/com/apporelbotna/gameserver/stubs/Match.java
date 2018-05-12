package com.apporelbotna.gameserver.stubs;

import org.springframework.hateoas.Identifiable;

public class Match implements Identifiable< Integer >
{
    private Integer id;
    private String emailUser;
    private int idGame;
    private float gameTimeInSeconds;
    private int score;

    public Match()
    {
	super();
    }

    public Match(
		 String emailUser,
		 int idGame,
		 float gameTimeInSeconds,
		 int score)
    {
	super();
	this.emailUser = emailUser;
	this.idGame = idGame;
	this.gameTimeInSeconds = gameTimeInSeconds;
	this.score = score;
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

    public float getGameTimeInSeconds()
    {
	return gameTimeInSeconds;
    }

    public void setGameTimeInSeconds(long gameTimeInSeconds)
    {
	this.gameTimeInSeconds = gameTimeInSeconds;
    }

    public int getScore()
    {
	return score;
    }

    public void setScore(int score)
    {
	this.score = score;
    }
}
