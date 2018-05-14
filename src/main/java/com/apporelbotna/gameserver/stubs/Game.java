package com.apporelbotna.gameserver.stubs;

import org.springframework.hateoas.Identifiable;

public class Game implements Identifiable< Integer >
{
    private Integer id;
    private String name;
    private String description;
    private String executableName;
    private String imgUri;
    private float price;

    public Game()
    {
	super();
    }

    public Game(Integer id)
    {
	this(id, null, null, null, null, 0.0f);
    }

    public Game(int id, String name)
    {
	this(id, name, null, null, null, 0.0f);
    }

    public Game(Integer id, String name, String description)
    {
	this(id, name, description, null, null, 0.0f);
    }

    public Game(Integer id, String name, String description, String executableName, String imgUri)
    {
	this(id, name, description, executableName, imgUri, 0.0f);
    }

    public Game(Integer id, String name, String description, String executableName, String imgUri ,float price)
    {
	this.id = id;
	this.name = name;
	this.description = description;
	this.executableName = executableName;
	this.imgUri = imgUri;
	this.price = price;
    }

    @Override
    public Integer getId()
    {
	return id;
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

    public String getExecutableName()
    {
	return executableName;
    }

    public String getImgUri()
    {
	return imgUri;
    }

    public void setImgUri(String imgUri)
    {
	this.imgUri = imgUri;
    }

    public float getPrice()
    {
	return price;
    }

    public void setPrice(float price)
    {
	this.price = price;
    }

    public void setExecutableName(String executableName)
    {
	this.executableName = executableName;
    }

    @Override
    public String toString()
    {
	return "id= " + id + ", name= " + name + ", description= " + description + "price" + price;
    }
}
