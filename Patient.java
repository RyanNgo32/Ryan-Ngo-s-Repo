/*
 * Class: CMSC203 
 * Instructor:Professor Grinberg
 * Assignment 1
 * Description: (Patient class allows for patient information to be displayed.)
 * Due: 2/26/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ngo
*/
public class Patient 
{
	private String Fname, Mname, Lname, StreetAdress, City, State, Zip, phoneNum, emergencyName, emergencyNum;
	
	//no argument constructor
	public Patient()
	{
		
	}
	
	public Patient(String Fname, String Mname, String Lname)
	{
		this.Fname = Fname;
		this.Mname= Mname;
		this.Lname = Lname;
	}
	
	

	public Patient(String Fname, String Mname, String Lname, String StreetAdress, String City, String State, String Zip, String phoneNum, String emergencyName, String emergencyNum)
	{
		this.Fname = Fname;
		this.Mname = Mname;
		this.Lname = Lname;
		this.StreetAdress = StreetAdress;
		this.City = City;
		this.State = State;
		this.Zip = Zip;
		this.phoneNum = phoneNum;
		this.emergencyName = emergencyName;
		this.emergencyNum = emergencyNum;
	}
	
	
	//Accessor
	
	public String getFname()
	{
		return Fname;
	}
	
	public String getMname()
	{
		return Mname;
	}
	
	public String getLname()
	{
		return Lname;
	}
	
	public String getStreetAdress()
	{
		return StreetAdress;
	}
	
	public String getCity()
	{
		return City;
	}
	
	public String getState()
	{
		return State;
	}
	
	public String getZip()
	{
		return Zip;
	}
	
	public String getphoneNum()
	{
		return phoneNum;
	}
	
	public String getemergencyName()
	{
		return emergencyName;
	}
	
	public String getemergencyNum()
	{
		return emergencyNum;
	}
	
	//mutators setting
	
	public void setFname(String Fname)
	{
		this.Fname = Fname;
	}
	public void setMname(String Mname)
	{
		this.Mname = Mname;
	}
	public void setLname(String Lname)
	{
		this.Lname = Lname;
	}
	public void setStreetAdress(String StreetAdress)
	{
		this.StreetAdress = StreetAdress;
	}
	public void setCity(String City)
	{
		this.City = City;
	}
	public void setState(String State)
	{
		this.State = State;
	}
	public void setZip(String Zip)
	{
		this.Zip = Zip;
	}
	public void setphoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public void setemergencyName(String emergencyName)
	{
		this.emergencyName = emergencyName;
	}
	public void setemergencyNum(String emergencyNum)
	{
		this.emergencyNum = emergencyNum; //creates instance of same variable name 
	}
	
	//building full name method returns full name
	public String buildFullName(String Fname, String Mname, String Lname)
	{
		return Fname + " " + Mname + " " + Lname;
	}
	//build adress method returns concatenated adress 
	public String buildAdress(String StreetAdress, String City, String State, String Zip)
	{
		return StreetAdress + " " + City + " " + State + " " + Zip;
	}
	
	public String buildEmergencyContact(String emergencyName, String emergencyNum)
	{
		return emergencyName + " " + emergencyNum;
	}
	public String toString()
	{
		return "	Patient Info:\n" + 
				"	Name: " + buildFullName(Fname, Mname, Lname) + "\n" + "	Adress:" + buildAdress(StreetAdress, City, State, Zip) + "\n" + "	Phone Number:" +
				phoneNum + "\n" + "	Emergency Contact: " + buildEmergencyContact(emergencyName, emergencyNum) + " \n ";
	}
}