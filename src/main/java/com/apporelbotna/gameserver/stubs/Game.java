package com.apporelbotna.gameserver.stubs;

public class Game
{
	private Integer id;
	private String name;
	private String description;

	public Game(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}

	public Game(Integer id, String name, String description)
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}


	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		return "id= " + id + ", name= " + name + ", description= " + description;
	}
}
