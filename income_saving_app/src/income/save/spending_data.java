package income.save;

public class spending_data {
	int _id;
	int _expenditure;
	String _name;
	int _day;
	int _month;
	int _year;
	int _food;
	int _shopping;
	int _travel;
	int _rent;
	int _unknown;
	int _others;
	

	

	
	public spending_data(String name,int Expenditure,int Day,int Month,int Year,int Food,int Shopping,int Travel,int Rent,int Unknown,int Others)
	{
		
		this._name=name;
		this._expenditure=Expenditure;
		this._day=Day;
		this._month=Month;
		this._year=Year;
		this._food=Food;
		this._shopping=Shopping;
		this._travel=Travel;
		this._rent=Rent;
		this._unknown=Unknown;
		this._others=Others;
		
		
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
	
	public int getExpenditure()
	{
		return this._expenditure;
	}
	public int getDay()
	{
		return this._day;
	}
	public int getMonth()
	{
		return this._month;
	}
	public int getYear()
	{
		return this._year;
	}
	public int getFood()
	{
		return this._food;
	}
	public int getShopping()
	{
		return this._shopping;
	}
	public int getTravel()
	{
		return this._travel;
	}
	public int getRent()
	{
		return this._rent;
	}
	public int getUnknown()
	{
		return this._unknown;
	}
	public int getOthers()
	{
		return this._others;
	}
	
	
	public void setName(String Name)
	{
		this._name=Name;
	}
	public void setExpenditure(int Expenditure)
	{
		this._expenditure=Expenditure;
	}
	public void setDay(int Day )
	{
		this._day=Day;
	}
	public void setMonth(int Month )
	{
		this._month=Month;
	}
	public void setYear(int Year )
	{
		this._year=Year;
	}
	public void setFood(int Food)
	{
		this._food=Food;
	}
	public void setShopping(int Shopping)
	{
		this._shopping=Shopping;
	}
	public void setTravel(int Travel)
	{
		this._travel=Travel;
	}
	public void setRent(int Rent)
	{
		this._rent=Rent;
	}
	public void setUnknown(int Unknown)
	{
		this._unknown=Unknown;
	}
	public void setOthers(int Others)
	{
		this._others=Others;
	}
	
	
	
	
	
}
