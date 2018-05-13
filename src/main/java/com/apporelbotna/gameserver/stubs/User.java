package com.apporelbotna.gameserver.stubs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Identifiable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class User implements Identifiable< String >
{
    @JsonProperty("email")
    private String email;

    private String name;
    private float gold;
    private UserType rol;
    private List< Game > games;

    public User()
    {
	this( null, null, new ArrayList<>(), 0.0f, UserType.USER );
    }

    public User(String email)
    {
	this( email, null, new ArrayList<>(), 0.0f, UserType.USER );
    }

    public User(String email, String name)
    {
	this( email, name, new ArrayList<>(), 0.0f, UserType.USER );
    }

    public User(String email, String name, float gold, UserType userType )
    {
	this( email, name, new ArrayList<>(), gold, userType );
    }

    public User(String email, String name, List< Game > games)
    {
	this( email, name, games, 0.0f, UserType.USER );
    }

    public User(String email, String name, List< Game > games, float gold, UserType rol)
    {
	this.email = email;
	this.name = name;
	this.games = games;
	this.gold = gold;
	this.rol = rol;
    }

    @JsonIgnore
    @Override
    public String getId()
    {
	return email;
    }

    public String getEmail()
    {
	return getId();
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

    public void setGames(List< Game > games)
    {
	this.games = games;
    }

    public List< Game > getGames()
    {
	return games;
    }

    public float getGold()
    {
	return gold;
    }

    public void setGold(float gold)
    {
	this.gold = gold;
    }

    public UserType getRol()
    {
	return rol;
    }

    public void setRol(UserType rol)
    {
	this.rol = rol;
    }

    /**
     * Add a game to the List of games
     *
     * @param gameToAdd
     */
    public void addGame(Game gameToAdd)
    {
	games.add( gameToAdd );
    }

    @Override
    public int hashCode()
    {
	final int prime = 31;
	int result = 1;
	result = prime * result + ( ( email == null ) ? 0 : email.hashCode() );
	return result;
    }

    @Override
    public boolean equals(Object obj)
    {
	if ( this == obj )
	{
	    return true;
	}
	if ( obj == null )
	{
	    return false;
	}
	if ( getClass() != obj.getClass() )
	{
	    return false;
	}
	User other = ( User ) obj;
	if ( email == null )
	{
	    if ( other.email != null )
	    {
		return false;
	    }
	} else if ( !email.equals( other.email ) )
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "email= " + email + ", name= " + name + "gold" + gold + "rol " + rol + "\r\n games=" + games + "]";
    }
}
