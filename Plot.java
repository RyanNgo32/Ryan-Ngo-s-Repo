/*
 * Class: CMSC203 #32689
 * Instructor: Professor.Grinberg
 * Description: (this is a program for creating plots with specific coordinates such as x,y,width,depth,
 	it has also methods such as overlap method and encompasses method to check whether plots overlap or 
 	are within the current plot, and it has a toString method to return the properties of the plot )
 * Due: 4/1/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ngo
*/
public class Plot 
{
	private int xCord;
	private int yCord;
	private int depth;
	private int width;
	
	//default constructor
	public Plot()
	{
		xCord = 0;
		yCord = 0;
		width = 1;
		depth = 1;
	}
	
	public Plot(int xCord, int yCord, int width, int depth)//plot constructor
	{
		this.xCord = xCord;
		this.yCord = yCord;
		this.depth = depth;
		this.width = width;
	}
	
	public Plot(Plot plot)  // copy plot constructor
	{
		this.xCord = plot.xCord;
		this.yCord = plot.yCord;
		this.depth = plot.depth;
		this.width = plot.width;
	}
	
	//setters
	public void setX(int xCord)
	{
		this.xCord = xCord;
	}
	public void setY(int yCord)
	{
		this.yCord = yCord;
	}
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	
	//getters
	public int getX()
	{
		return xCord;
	}
	public int getY()
	{
		return yCord;
	}
	public int getDepth()
	{
		return depth;
	}
	public int getWidth()
	{
		return width;
	} 
	
	
	
	public boolean overLaps(Plot plot)
	{
		//get x cords 
		int p1Leftx = this.xCord; 
		int p1Rightx = this.xCord + this.width;
		int p2Leftx = plot.xCord;
		int p2Rightx = plot.xCord + plot.width;
		
		
		//get y cords
		int p1Topy = this.yCord;
		int p1Bottomy = this.yCord - this.depth;
		int p2Topy = plot.yCord;
		int p2Bottomy = plot.yCord - plot.depth;
		

		
		//using nested if statements it will check horizontal overlaps then it will check vertical overlaps
		if(p1Leftx < p2Rightx && p1Rightx > p2Leftx)
		{
		
			if(p1Topy > p2Bottomy && p1Bottomy < p2Topy)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean encompasses(Plot plot)
	{
		int p1Leftx = this.xCord;  //top left x 
		int p1Rightx = this.xCord + this.width; //top right x 
		int p2Leftx = plot.xCord; // top left x of p2 
		int p2Rightx = plot.xCord + plot.width;// top right  x of p2 
		
		
		//get y cords
		int p1Topy = this.yCord; //top left y 
		int p1Bottomy = this.yCord + this.depth;  //bottom y 
		int p2Topy = plot.yCord; //top left y p2 
		int p2Bottomy = plot.yCord + plot.depth;  // p2 bottom y
		

		
		//using nested if statements it will check if plot completely encompasses another plot, by checking to see if its inside of the boundaries
		
			if((p2Leftx >= p1Leftx) && (p2Topy >= p1Topy) && (p2Rightx <= p1Rightx) && (p2Bottomy <= p1Bottomy))
			{
						return true;

			}
		
		return false;
	}
	
	public String toString()
	{
		return xCord + "," + yCord + "," + width + "," + depth;
	}
	
}
