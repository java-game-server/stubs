package com.apporelbotna.gameserver.stubs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Identifiable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Game implements Identifiable< Integer >
{
    private Integer id;
    private String name;
    private String description;
    private String executableName;
    private String imgUri;
    private float price;
    private List<String> genres;

    public Game()
    {
	super();
    }

    public Game(Integer id)
    {
	this(id, null, null, null, null, 0.0f, new ArrayList<>());
    }

    public Game(int id, String name)
    {
	this(id, name, null, null, null, 0.0f ,  new ArrayList<>());
    }

    public Game(Integer id, String name, String description)
    {
	this(id, name, description, null, null, 0.0f,  new ArrayList<>());
    }

    public Game(Integer id, String name, String description, String executableName, String imgUri)
    {
	this(id, name, description, executableName, imgUri, 0.0f,  new ArrayList<>());
    }

    public Game(Integer id, String name, String description, String executableName, String imgUri, float price)
    {
	this(id, name, description, executableName, imgUri, price,  new ArrayList<>());
    }

    public Game(Integer id, String name, String description, String executableName, String imgUri ,float price, List<String> genres)
    {
	this.id = id;
	this.name = name;
	this.description = description;
	this.executableName = executableName;
	this.imgUri = imgUri;
	this.price = price;
	this.genres = genres;
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

    public List<String> getGenre()
    {
        return genres;
    }

    public void setGenre(List<String> genres)
    {
        this.genres = genres;
    }

    @Override
    public String toString()
    {
	return "id= " + id + ", name= " + name + ", description= " + description + "price" + price;
    }
}
