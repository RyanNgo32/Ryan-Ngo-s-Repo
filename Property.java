/*
 * Class: CMSC203 #32689
 * Instructor: Professor.Grinberg
 * Description: (this is a program storing information regarding the properties like the name, owner, rentalAmount, City, it has constructors,
 	setters ,and getters as well as a toString to give a string of the details)
 * Due: 4/1/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ngo
*/
public class Property
{
	private String propertyName;
	private String City;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	//constructor creates property with default plot
	public Property(String propertyName, String City, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.City = City;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot();
	}
	//constructor creates a property with a unique
	public Property(String propertyName, String City, double rentAmount, String owner, int xCord, int yCord, int width, int depth)
	{
		this.propertyName = propertyName;
		this.City = City;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(xCord,yCord,width,depth);
	}
	//setters
	public void setName(String propertyName)
	{
		this.propertyName = propertyName;
	}
	
	public void setCity(String City)
	{
		this.City = City;
	}
	
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
	
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public void setPlot(Plot plot)
	{
		this.plot = plot;
	}
	
	//getters 
	
	public String getPropertyName()
	{
		return propertyName;
	}
	
	public String getCity()
	{
		return City;
	}
	
	public double getRentAmount()
	{
		return rentAmount;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	
	public String toString()
	{
		return propertyName + "," + City + "," + owner + "," + rentAmount;
	}

	
	
	
	
}
