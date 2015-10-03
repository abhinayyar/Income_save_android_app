package income.save;



public class Employee {
	
	int _id;
	String _name;
	int _sal;
	
	int _time;
	String _password;
	
	public Employee(String Name,int Sal,int time,String Password)
	{
		
		this._name=Name;
		this._sal=Sal;
		this._time=time;
		this._password=Password;
		
	}
	
	
	
	public int getID()
	{
		return this._id;
	}
	public void SetID(int ID)
	{
		this._id=ID;
	}
	
	public String getName()
	{
		return this._name;
	}
	public String getPassword()
	{
		return this._password;
	}
	
	public int getSal()
	{
		return this._sal;
	}
	public int getTime()
	{
		return this._time;
	}
	
	public void setName(String Name)
	{
		this._name=Name;
	}
	public void setPassword(String Password)
	{
		this._name=Password;
	}
	public void setSal(int Sal)
	{
		this._sal=Sal;
	}
	public void setTime(int time)
	{
		this._time=time;
	}
	
	
	
}

