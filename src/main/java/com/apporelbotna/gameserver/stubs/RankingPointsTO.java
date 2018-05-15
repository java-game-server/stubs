package com.apporelbotna.gameserver.stubs;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RankingPointsTO
{
    private String email;
    private int pos;
    private int points;

    public RankingPointsTO()
    {
	super();
    }

    public RankingPointsTO(String email, int pos, int points)
    {
	super();
	this.email = email;
	this.pos = pos;
	this.points = points;
    }

    public String getEmail()
    {
	return email;
    }

    public void setEmail(String email)
    {
	this.email = email;
    }

    public int getPos()
    {
	return pos;
    }

    public void setPos(int pos)
    {
	this.pos = pos;
    }

    public int getPoints()
    {
	return points;
    }

    public void setPoints(int points)
    {
	this.points = points;
    }

    @Override
    public String toString()
    {
	return "pos -> " + pos + " email = " + email + " points = " + points;
    }

}
