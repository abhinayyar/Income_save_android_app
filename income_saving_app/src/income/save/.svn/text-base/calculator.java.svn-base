package income.save;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class calculator extends SQLiteOpenHelper {
	static final String dbName = "spdDB";

	static final String USER_INFOTABLE = "USER_INFOTABLE";
	static final String USER_INFOTABLE_ID = "USER_INFOTABLE_ID";
	static final String USER_INFOTABLE_NAME = "USER_INFOTABLE_NAME";
	static final String USER_INFOTABLE_PASSWORD = "USER_INFOTABLE_PASSWORD";
	static final String USER_INFOTABLE_SALARY = "USER_INFOTABLE_SALARY";
	static final String USER_INFOTABLE_TIME = "USER_INFOTABLE_TIME";

	static final String ALERT_INFOTABLE = "ALERT_INFOTABLE";
	static final String ALERT_INFOTABLE_ID = "ALERT_INFOTABLE_ID";
	static final String ALERT_INFOTABLE_NAME = "ALERT_INFOTABLE_NAME";
	static final String ALERT_INFOTABLE_DESC = "ALERT_INFOTABLE_DESC";
	static final String ALERT_INFOTABLE_TIME = "ALERT_INFOTABLE_TIME";

	static final String SPENDING_INFOTABLE = "SPENDING_INFOTABLE";
	static final String SPENDING_INFOTABLE_ID = "SPENDING_INFOTABLE_ID";
	static final String SPENDING_INFOTABLE_NAME = "SPENDING_INFOTABLE_NAME";
	static final String SPENDING_INFOTABLE_EXPENDITURE = "SPENDING_INFOTABLE_EXPENDITURE";
	static final String SPENDING_INFOTABLE_DATE = "SPENDING_INFOTABLE_DATE";
	static final String SPENDING_INFOTABLE_DAY = "SPENDING_INFOTABLE_DAY";
	static final String SPENDING_INFOTABLE_MONTH = "SPENDING_INFOTABLE_MONTH";
	static final String SPENDING_INFOTABLE_YEAR = "SPENDING_INFOTABLE_YEAR";
	static final String SPENDING_INFOTABLE_FOOD = "SPENDING_INFOTABLE_FOOD";
	static final String SPENDING_INFOTABLE_SHOPPING = "SPENDING_INFOTABLE_SHOPPING";
	static final String SPENDING_INFOTABLE_TRAVEL = "SPENDING_INFOTABLE_TRAVEL";
	static final String SPENDING_INFOTABLE_RENT = "SPENDING_INFOTABLE_RENT";
	static final String SPENDING_INFOTABLE_UNKNOWN = "SPENDING_INFOTABLE_UNKNOWN";
	static final String SPENDING_INFOTABLE_OTHERS = "SPENDING_INFOTABLE_OTHERS";

	static final String ID_INFOTABLE = "ID_INFOTABLE";
	static final String ID_INFOTABLE_ID = "ID_INFOTABLE_ID";
	static final String ID_INFOTABLE_EXTRA = "ID_INFOTABLE_EXTRA";

	static final String FREESID_INFOTABLE = "FREESID_INFOTABLE";
	static final String FREESID_INFOTABLE_ID = "FREESID_INFOTABLE_ID";
	static final String FREESID_INFOTABLE_EXTRA = "FREESID_INFOTABLE_EXTRA";

	static final String MONTHLY_SAVING_INFOTABLE = "MONTHLY_SAVING_INFOTABLE";
	static final String MONTHLY_SAVING_INFOTABLE_ID = "MONTHLY_SAVING_INFOTABLE_ID";
	static final String MONTHLY_SAVING_INFOTABLE_NAME = "MONTHLY_SAVING_INFOTABLE_NAME";
	static final String MONTHLY_SAVING_INFOTABLE_MONTH = "MONTHLY_SAVING_INFOTABLE_MONTH";
	static final String MONTHLY_SAVING_INFOTABLE_YEAR = "MONTHLY_SAVING_INFOTABLE_YEAR";
	static final String MONTHLY_SAVING_INFOTABLE_AMOUNT = "MONTHLY_SAVING_INFOTABLE_AMOUNT";

	static final String VERY_MAIN_INFOTABLE = "VERY_MAIN_INFOTABLE";
	static final String VERY_MAIN_INFOTABLE_NAME = "VERY_MAIN_INFOTABLE_NAME";
	static final String VERY_MAIN_INFOTABLE_COUNT = "VERY_MAIN_INFOTABLE_COUNT";
	static final String VERY_MAIN_INFOTABLE_DATE = "VERY_MAIN_INFOTABLE_DATE";
	static final String VERY_MAIN_INFOTABLE_MONTH = "VERY_MAIN_INFOTABLE_MONTH";

	static final String YEARLY_SAVING_INFOTABLE = "YEARLY_SAVING_INFOTABLE";
	static final String YEARLY_SAVING_INFOTABLE_ID = "YEARLY_SAVING_INFOTABLE_ID";
	static final String YEARLY_SAVING_INFOTABLE_NAME = "YEARLY_SAVING_INFOTABLE_NAME";
	static final String YEARLY_SAVING_INFOTABLE_YEAR = "YEARLY_SAVING_INFOTABLE_YEAR";
	static final String YEARLY_SAVING_INFOTABLE_SAVING = "YEARLY_SAVING_INFOTABLE_SAVING";

	static final String TIME_INFOTABLE = "TIME_INFOTABLE";
	static final String TIME_INFOTABLE_NAME = "TIME_INFOTABLE_NAME";
	static final String TIME_INFOTABLE_DAY = "TIME_INFOTABLE_DAY";
	static final String TIME_INFOTABLE_MONTH = "TIME_INFOTABLE_MONTH";
	static final String TIME_INFOTABLE_YEAR = "TIME_INFOTABLE_YEAR";

	static final String DATA_INFOTABLE = "DATA_INFOTABLE";
	static final String DATA_INFOTABLE_ID = "DATA_INFOTABLE_ID";
	static final String DATA_INFOTABLE_NAME = "DATA_INFOTABLE_NAME";
	static final String DATA_INFOTABLE_DATE = "DATA_INFOTABLE_DATE";
	static final String DATA_INFOTABLE_AMOUNT = "DATA_INFOTABLE_AMOUNT";

	public calculator(Context context) {
		super(context, dbName, null, 1);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE " + USER_INFOTABLE + " (" + USER_INFOTABLE_ID
				+ " INTEGER PRIMARY KEY , " + USER_INFOTABLE_NAME + " TEXT,"
				+ USER_INFOTABLE_PASSWORD + " TEXT," + USER_INFOTABLE_SALARY
				+ " Integer," + USER_INFOTABLE_TIME + " Integer)");

		db.execSQL("CREATE TABLE " + ALERT_INFOTABLE + " ("
				+ ALERT_INFOTABLE_ID + " INTEGER PRIMARY KEY , "
				+ ALERT_INFOTABLE_NAME + " TEXT," + ALERT_INFOTABLE_DESC
				+ " TEXT," + ALERT_INFOTABLE_TIME + ", Integer )");

		db.execSQL("CREATE TABLE " + SPENDING_INFOTABLE + " ("
				+ SPENDING_INFOTABLE_ID + " Integer , "
				+ SPENDING_INFOTABLE_NAME + " TEXT,"
				+ SPENDING_INFOTABLE_EXPENDITURE + " Integer,"
				+ SPENDING_INFOTABLE_DATE + " Integer,"
				+ SPENDING_INFOTABLE_DAY + " Integer,"
				+ SPENDING_INFOTABLE_MONTH + " Integer,"
				+ SPENDING_INFOTABLE_YEAR + " Integer,"
				+ SPENDING_INFOTABLE_FOOD + " Integer,"
				+ SPENDING_INFOTABLE_SHOPPING + " Integer,"
				+ SPENDING_INFOTABLE_TRAVEL + " Integer,"
				+ SPENDING_INFOTABLE_RENT + " Integer,"
				+ SPENDING_INFOTABLE_UNKNOWN + " Integer,"
				+ SPENDING_INFOTABLE_OTHERS + " Integer)");

		db.execSQL("CREATE TABLE " + ID_INFOTABLE + " (" + ID_INFOTABLE_ID
				+ " Integer," + ID_INFOTABLE_EXTRA + " Integer )");

		db.execSQL("CREATE TABLE " + FREESID_INFOTABLE + " ("
				+ FREESID_INFOTABLE_ID + " Integer," + FREESID_INFOTABLE_EXTRA
				+ " Integer )");

		db.execSQL("CREATE TABLE " + MONTHLY_SAVING_INFOTABLE + " ("
				+ MONTHLY_SAVING_INFOTABLE_ID + " Integer , "
				+ MONTHLY_SAVING_INFOTABLE_NAME + " TEXT,"
				+ MONTHLY_SAVING_INFOTABLE_MONTH + " Integer,"
				+ MONTHLY_SAVING_INFOTABLE_YEAR + " Integer,"
				+ MONTHLY_SAVING_INFOTABLE_AMOUNT + " Integer)");

		db.execSQL("CREATE TABLE " + VERY_MAIN_INFOTABLE + " ("
				+ VERY_MAIN_INFOTABLE_NAME + " TEXT,"
				+ VERY_MAIN_INFOTABLE_COUNT + " Integer,"
				+ VERY_MAIN_INFOTABLE_DATE + " TEXT,"
				+ VERY_MAIN_INFOTABLE_MONTH + " Integer )");

		db.execSQL("CREATE TABLE " + YEARLY_SAVING_INFOTABLE + " ("
				+ YEARLY_SAVING_INFOTABLE_ID + " Integer,"
				+ YEARLY_SAVING_INFOTABLE_NAME + " Integer,"
				+ YEARLY_SAVING_INFOTABLE_YEAR + " Integer,"
				+ YEARLY_SAVING_INFOTABLE_SAVING + " Integer )");

		db.execSQL("CREATE TABLE " + TIME_INFOTABLE + " ("
				+ TIME_INFOTABLE_NAME + " TEXT," + TIME_INFOTABLE_DAY
				+ " Integer," + TIME_INFOTABLE_MONTH + " Integer,"
				+ TIME_INFOTABLE_YEAR + " Integer )");

		db.execSQL("CREATE TABLE " + DATA_INFOTABLE + " (" + DATA_INFOTABLE_ID
				+ " Integer , " + DATA_INFOTABLE_NAME + " TEXT , "
				+ DATA_INFOTABLE_DATE + " Integer," + DATA_INFOTABLE_AMOUNT
				+ " Integer)");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + USER_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + ALERT_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + SPENDING_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + ID_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + MONTHLY_SAVING_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + VERY_MAIN_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + YEARLY_SAVING_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + TIME_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + DATA_INFOTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + FREESID_INFOTABLE);

		onCreate(db);

	}

	public void AddID() {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(ID_INFOTABLE_ID, 1);
			cv.put(ID_INFOTABLE_EXTRA, 2);
			db.insert(ID_INFOTABLE, null, cv);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

	}

	public void UpdateID() {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		Cursor cur = null;
		int h = 0;
		int j = 0;

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();
			String quert = "select * from " + ID_INFOTABLE;
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				String ab = cur.getString(0);
				h = Integer.valueOf(ab);
				j = h + 1;
			}
			cv.put(ID_INFOTABLE_ID, j);
			Log.d("Message", "u suceefully cleared the addid block" + j);

			db.update(ID_INFOTABLE, cv, null, null);

		} catch (Exception e) {

		} finally {
			cv.clear();
			cur.close();
			db.close();
		}
	}

	public void UserInfo(Employee emp) {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		AddID();
		Addfreesid();

		int PK = Sequencer();
		int ID = PK + 1;

		Log.d("Message", "ID value is" + ID);

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(USER_INFOTABLE_ID, ID);
			cv.put(USER_INFOTABLE_NAME, emp.getName());
			cv.put(USER_INFOTABLE_PASSWORD, emp.getPassword());
			cv.put(USER_INFOTABLE_SALARY, emp.getSal());
			cv.put(USER_INFOTABLE_TIME, emp.getTime());
			db.insert(USER_INFOTABLE, null, cv);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

	}

	private int Sequencer() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int h = 0;
		// int a = 0;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + ID_INFOTABLE;
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				// a = cur.getCount();
				String ab = cur.getString(0);
				h = Integer.valueOf(ab);
				Log.d("Message", "val of sequencer" + h);
			}
			UpdateID();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return h;

	}

	public int count() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int cc = 0;

		try {
			db = this.getReadableDatabase();
			String quert = "select * from " + ID_INFOTABLE;
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				cc = cur.getCount();

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return cc;

	}

	public int AddSpending(spending_data spd) {

		SQLiteDatabase db = null;
		ContentValues cv = null;

		int PKS = Sequencer();
		int ID = PKS + 1;

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(SPENDING_INFOTABLE_ID, ID);
			cv.put(SPENDING_INFOTABLE_NAME, spd.getName());
			cv.put(SPENDING_INFOTABLE_EXPENDITURE, spd.getExpenditure());
			cv.put(SPENDING_INFOTABLE_DATE, ConstanVarables.datadate);
			cv.put(SPENDING_INFOTABLE_DAY, spd.getDay());
			cv.put(SPENDING_INFOTABLE_MONTH, spd.getMonth());
			cv.put(SPENDING_INFOTABLE_YEAR, spd.getYear());
			cv.put(SPENDING_INFOTABLE_FOOD, spd.getFood());
			cv.put(SPENDING_INFOTABLE_SHOPPING, spd.getShopping());
			cv.put(SPENDING_INFOTABLE_TRAVEL, spd.getTravel());
			cv.put(SPENDING_INFOTABLE_RENT, spd.getRent());
			cv.put(SPENDING_INFOTABLE_UNKNOWN, spd.getUnknown());
			cv.put(SPENDING_INFOTABLE_OTHERS, spd.getOthers());
			db.insert(SPENDING_INFOTABLE, null, cv);

			ConstanVarables.initialexp = spd.getExpenditure();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}
		return 0;

	}

	public int UpdateUSer(Employee emp) {
		SQLiteDatabase db = null;
		ContentValues cv = null;

		int fg = 0;
		Log.d("Message", "Updateuser" + emp.getName());
		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();
			cv.put(USER_INFOTABLE_NAME, emp.getName());
			cv.put(USER_INFOTABLE_PASSWORD, emp.getPassword());
			cv.put(USER_INFOTABLE_SALARY, emp.getSal());
			cv.put(USER_INFOTABLE_TIME, emp.getTime());
			Log.d("Message", "Updateuser" + emp.getName());
			String[] whereClauseArgument = new String[1];
			whereClauseArgument[0] = ConstanVarables.Username;
			fg = db.update(USER_INFOTABLE, cv, USER_INFOTABLE_NAME + "=?",
					whereClauseArgument);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

		return fg;

	}

	public int DeleteEmp(Employee emp) {
		SQLiteDatabase db = null;
		int du = 0;
		try {
			db = this.getWritableDatabase();
			String[] whereClauseArgument = new String[1];
			whereClauseArgument[0] = ConstanVarables.Username;
			du = db.delete(USER_INFOTABLE, USER_INFOTABLE_NAME + "=?",
					whereClauseArgument);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			db.close();

		}
		return du;

	}

	public void AddAlarmType(Alarm_data dt) {

		SQLiteDatabase db = null;
		ContentValues cv = null;

		int PKSE = Sequencer();
		int ID = PKSE + 1;

		String des = Description().toString();
		Log.d("Message", "value of description" + des);
		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(ALERT_INFOTABLE_ID, ID);
			cv.put(ALERT_INFOTABLE_NAME, ConstanVarables.Username);
			cv.put(ALERT_INFOTABLE_DESC, dt.getAlertName());
			cv.put(ALERT_INFOTABLE_TIME, dt.getAlertTime());

			db.insert(ALERT_INFOTABLE, null, cv);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

	}

	private String Description() {

		String AlertName = ConstanVarables.Alert_CAT.toString();
		String des = null;
		if (AlertName.equalsIgnoreCase("One")) {
			des = "you selected one";
		} else if (AlertName.equalsIgnoreCase("Two")) {
			des = "you selected two";
		} else {
			des = "you selected three";
		}
		return des;

	}

	public int UpdateAlert(Alarm_data dt) {
		// TODO Auto-generated method stub
		SQLiteDatabase db = null;
		ContentValues cv = null;
		int fp = 0;

		String des = Description().toString();
		Log.d("Message", "value of description " + des);
		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();
			cv.put(ALERT_INFOTABLE_NAME, ConstanVarables.Username);
			cv.put(ALERT_INFOTABLE_DESC, dt.getAlertName());
			cv.put(ALERT_INFOTABLE_TIME, dt.getAlertTime());
			Log.d("Message", "reached update alarm block");

			String[] whereClauseArgument = new String[1];
			whereClauseArgument[0] = ConstanVarables.Alert_CAT;
			fp = db.update(ALERT_INFOTABLE, cv, ALERT_INFOTABLE_NAME + "=?",
					whereClauseArgument);

		} catch (Exception e) {

		} finally {
			cv.clear();
			db.close();
		}
		return fp;
	}

	public JSONObject GetSpendingDetails() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		JSONObject jsonObject = null;
		JSONArray jsonArray = new JSONArray();
		try {
			db = this.getReadableDatabase();
			String Name = ConstanVarables.Username.toString();
			String query = "select * from " + SPENDING_INFOTABLE
					+ " where  SPENDING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(query, null);
			while (cur.moveToNext()) {
				jsonObject = new JSONObject();
				jsonObject.put(SPENDING_INFOTABLE_NAME, cur.getString(1));
				jsonObject
						.put(SPENDING_INFOTABLE_EXPENDITURE, cur.getString(2));
				jsonObject.put(SPENDING_INFOTABLE_DAY, cur.getString(3));
				jsonObject.put(SPENDING_INFOTABLE_FOOD, cur.getString(4));
				jsonObject.put(SPENDING_INFOTABLE_SHOPPING, cur.getString(5));
				jsonObject.put(SPENDING_INFOTABLE_TRAVEL, cur.getString(6));
				jsonObject.put(SPENDING_INFOTABLE_RENT, cur.getString(7));
				jsonObject.put(SPENDING_INFOTABLE_UNKNOWN, cur.getString(8));
				jsonObject.put(SPENDING_INFOTABLE_OTHERS, cur.getString(9));

				// used in the case if we want to show two or more values
				// together
				jsonArray.put(jsonObject);
				Log.d("Message", "----->" + jsonArray.toString());
				// --ends here-->
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}

		return jsonObject;

	}

	public int Logincheck() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int check = 0;
		try {
			String Name = ConstanVarables.Username.toString();
			String Password = ConstanVarables.Password.toString();
			db = this.getReadableDatabase();
			String query = "select * from " + USER_INFOTABLE
					+ " where  USER_INFOTABLE_NAME='" + Name
					+ "' and USER_INFOTABLE_PASSWORD='" + Password + "'";
			Log.d("Message", "" + query);
			String[] whereClauseArgument = new String[1];
			whereClauseArgument[0] = Name;
			cur = db.rawQuery(query, null);
			check = cur.getCount();
			Log.d("Message", "------->" + check);
			if (cur.moveToNext()) {
				check = cur.getCount();
				Log.d("Message", "------->" + check);
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			db.close();
		}

		return check;

	}

	public int Datachecheker() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int data = 0;
		try {
			db = this.getReadableDatabase();
			String Name = ConstanVarables.Username.toString();
			String quert = "select * from " + SPENDING_INFOTABLE
					+ " where  SPENDING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				data = cur.getCount();
				Log.d("Message", "data count----->" + data);
				ConstanVarables.data = data;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return data;
	}

	public int DateChecker() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int datedata = 0;
		String present = ConstanVarables.datadate;

		try {
			db = this.getReadableDatabase();
			String Name = ConstanVarables.Username.toString();
			String quert = "select * from " + SPENDING_INFOTABLE
					+ " where  SPENDING_INFOTABLE_DATE='" + present
					+ "' and SPENDING_INFOTABLE_NAME='" + Name + "'";
			Log.d("Message", "data count----->" + quert);

			cur = db.rawQuery(quert, null);
			cur.getCount();
			if (cur.moveToNext()) {
				Log.d("Message", "data count----->" + datedata);
				datedata = 2;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return datedata;

	}

	public int Updatespending(spending_data spd) {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		int fgp = 0;

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(SPENDING_INFOTABLE_NAME, spd.getName());
			cv.put(SPENDING_INFOTABLE_EXPENDITURE, spd.getExpenditure());
			cv.put(SPENDING_INFOTABLE_DATE, ConstanVarables.datadate);
			cv.put(SPENDING_INFOTABLE_DAY, spd.getDay());
			cv.put(SPENDING_INFOTABLE_MONTH, spd.getMonth());
			cv.put(SPENDING_INFOTABLE_YEAR, spd.getYear());
			cv.put(SPENDING_INFOTABLE_FOOD, spd.getFood());
			cv.put(SPENDING_INFOTABLE_SHOPPING, spd.getShopping());
			cv.put(SPENDING_INFOTABLE_TRAVEL, spd.getTravel());
			cv.put(SPENDING_INFOTABLE_RENT, spd.getRent());
			cv.put(SPENDING_INFOTABLE_UNKNOWN, spd.getUnknown());
			cv.put(SPENDING_INFOTABLE_OTHERS, spd.getOthers());
			db.insert(SPENDING_INFOTABLE, null, cv);
			String[] whereClauseArgument = new String[] {
					ConstanVarables.Username, ConstanVarables.datadate };

			String whereClause = "SPENDING_INFOTABLE_NAME=? and SPENDING_INFOTABLE_DATE=?";
			fgp = db.update(SPENDING_INFOTABLE, cv, whereClause,
					whereClauseArgument);
			insert_datainfo();
			Log.d("Message", "covered the updated block");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

		return fgp;

	}

	public void Deletespd(spending_data spd) {
		SQLiteDatabase db = null;
		try {
			db = this.getWritableDatabase();
			String[] whereClauseArgument = new String[1];
			whereClauseArgument[0] = ConstanVarables.Username;
			db.delete(SPENDING_INFOTABLE, SPENDING_INFOTABLE_NAME + "=?",
					whereClauseArgument);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			db.close();

		}

	}

	public void Deletealert(Alarm_data dt) {
		SQLiteDatabase db = null;
		try {
			db = this.getWritableDatabase();
			String[] whereClauseArgument = new String[1];
			whereClauseArgument[0] = ConstanVarables.Alert_CAT;
			db.delete(ALERT_INFOTABLE, ALERT_INFOTABLE_NAME + "=?",
					whereClauseArgument);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			db.close();

		}

	}

	public void Monthly_saving() {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		int RTY = Sequencer();
		int ID = RTY + 1;
		int j = Month_calculator();
		int po = ConstanVarables.year;
		int count = 1;
		ConstanVarables.veryimp = count;
		Log.d("Message", "reached monthly_saving");
		int g = Initial_saving();

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();
			Log.d("Message", "reached monthly_saving");

			cv.put(MONTHLY_SAVING_INFOTABLE_ID, ID);
			cv.put(MONTHLY_SAVING_INFOTABLE_NAME, ConstanVarables.Username);
			cv.put(MONTHLY_SAVING_INFOTABLE_MONTH, j);
			cv.put(MONTHLY_SAVING_INFOTABLE_YEAR, po);

			cv.put(MONTHLY_SAVING_INFOTABLE_AMOUNT, g);

			db.insert(MONTHLY_SAVING_INFOTABLE, null, cv);

			insert_verymain();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();

		}

	}

	public void Update_saving() {
		Log.d("Message", "reached update savings");
		SQLiteDatabase db = null;
		ContentValues cv = null;
		Cursor cur = null;

		ConstanVarables.veryimp = 0;
		int h = 0;
		int h1 = 0;

		String Name = ConstanVarables.Username;
		int jp = ConstanVarables.month;
		String date = ConstanVarables.datadate;

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where  MONTHLY_SAVING_INFOTABLE_NAME='" + Name
					+ "' and MONTHLY_SAVING_INFOTABLE_MONTH='" + jp + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				String ab = cur.getString(4);
				h = Integer.valueOf(ab);

			}
			String quert1 = "select * from " + SPENDING_INFOTABLE
					+ " where  SPENDING_INFOTABLE_NAME='" + Name
					+ "' and SPENDING_INFOTABLE_DATE='" + date + "'";
			cur = db.rawQuery(quert1, null);
			if (cur.moveToNext()) {
				String ab = cur.getString(2);
				h1 = Integer.valueOf(ab);

			}

			int amt = h + h1;

			cv.put(MONTHLY_SAVING_INFOTABLE_AMOUNT, amt);

			db.insert(MONTHLY_SAVING_INFOTABLE, null, cv);
			Log.d("Message", "u successfully cleared the update saving block");

			String[] whereClauseArgument = new String[] {
					ConstanVarables.Username, ConstanVarables.month1 };

			String whereClause = "MONTHLY_SAVING_INFOTABLE_NAME=? and MONTHLY_SAVING_INFOTABLE_MONTH=?";
			db.update(MONTHLY_SAVING_INFOTABLE, cv, whereClause,
					whereClauseArgument);

			// update_verymain();

		} catch (Exception e) {

		} finally {
			cv.clear();
			cur.close();
			db.close();
		}

	}

	public int Expenditure_cal() {

		int p = exp_count();

		Log.d("Message", "value of p" + p);
		if (p == 0) {

			Monthly_saving();

		} else {

			Update_saving();
		}
		return 0;

	}

	public int exp_count() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int ccp = 0;
		String Name = ConstanVarables.Username;
		int j = Month_calculator();

		try {
			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where  MONTHLY_SAVING_INFOTABLE_NAME='" + Name
					+ "' and MONTHLY_SAVING_INFOTABLE_MONTH='" + j + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				ccp = cur.getCount();
				Log.d("Message", "Sucessfully returned from exp_count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return ccp;

	}

	private int Month_calculator() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		String date = sdf.format(new Date());
		int pt = Integer.valueOf(date);

		return pt;

	}

	public int Initial_saving() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int hp = 0;

		try {
			db = this.getReadableDatabase();
			String Name = ConstanVarables.Username.toString();

			String quert = "select * from " + SPENDING_INFOTABLE
					+ " where  SPENDING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);

			if (cur.moveToNext()) {
				Log.d("Message", "reached before hp");
				String sd = cur.getString(2);
				hp = Integer.valueOf(sd);

			}

			Log.d("Message", "value of main  hp is " + hp);

		} catch (Exception e) {
			e.getStackTrace();

		} finally {
			cur.close();
			db.close();
		}
		return hp;

	}

	public JSONObject GetSavingDetails() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		JSONObject jsonObject = null;
		JSONArray jsonArray = new JSONArray();
		try {
			db = this.getReadableDatabase();
			String Name = ConstanVarables.Username.toString();
			String query = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where   MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(query, null);
			while (cur.moveToNext()) {
				jsonObject = new JSONObject();
				jsonObject.put(MONTHLY_SAVING_INFOTABLE_NAME, cur.getString(1));
				jsonObject
						.put(MONTHLY_SAVING_INFOTABLE_MONTH, cur.getString(2));

				jsonObject.put(MONTHLY_SAVING_INFOTABLE_AMOUNT, cur
						.getString(4));

				// used in the case if we want to show two or more values
				// together
				jsonArray.put(jsonObject);
				Log.d("Message", "----->" + jsonArray.toString());
				// --ends here-->
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}

		return jsonObject;

	}

	public void extra_update() {
		Log.d("Message", "reached update savings");
		SQLiteDatabase db = null;
		ContentValues cv = null;
		Cursor cur = null;

		int h1 = 0;
		int h2 = 0;

		int sum = 0;
		int h3 = 0;
		int h4 = 0;

		String Name = ConstanVarables.Username;

		int id = 0;
		int id1 = 0;
		Log.d("Message", "values of id's" + id);
		Log.d("Message", "values of id's" + id1);

		try {
			db = this.getReadableDatabase();
			cv = new ContentValues();

			String quert3 = "select * from " + DATA_INFOTABLE
					+ " where  DATA_INFOTABLE_NAME='" + Name
					+ "' and DATA_INFOTABLE_DATE='" + ConstanVarables.datadate
					+ "'";
			cur = db.rawQuery(quert3, null);
			if (cur.moveToLast()) {
				String ab = cur.getString(0);
				h4 = Integer.valueOf(ab);
				id = h4;
				id1 = id - 1;

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			db.close();

		}
		Log.d("Message", "abhishek" + h4);

		try {
			db = this.getReadableDatabase();
			String quert1 = "select * from " + DATA_INFOTABLE
					+ " where  DATA_INFOTABLE_NAME='" + Name
					+ "' and DATA_INFOTABLE_ID='" + id + "'";
			cur = db.rawQuery(quert1, null);
			if (cur.moveToNext()) {
				String ab = cur.getString(3);
				h1 = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close();
		}

		Log.d("Message", "---hhg-----" + h1);
		try {
			db = this.getReadableDatabase();

			String quert2 = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where  MONTHLY_SAVING_INFOTABLE_NAME='" + Name
					+ "' and MONTHLY_SAVING_INFOTABLE_MONTH='"
					+ ConstanVarables.month1 + "'";
			cur = db.rawQuery(quert2, null);
			if (cur.moveToNext()) {
				String ab = cur.getString(4);
				h2 = Integer.valueOf(ab);

			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			db.close();
		}

		Log.d("Message", "---hhg23-----" + h2);
		try {
			db = this.getReadableDatabase();

			String quert = "select * from " + DATA_INFOTABLE
					+ " where  DATA_INFOTABLE_NAME='" + Name

					+ "' and DATA_INFOTABLE_ID='" + id1 + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				String ab = cur.getString(3);
				h3 = Integer.valueOf(ab);

			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			db.close();
		}

		Log.d("Message", "---hhg1223-----" + h3);

		try {

			sum = h1 - h3;

			int amt = h2 + sum;

			db = this.getWritableDatabase();

			cv.put(MONTHLY_SAVING_INFOTABLE_AMOUNT, amt);

			db.insert(MONTHLY_SAVING_INFOTABLE, null, cv);
			Log.d("Message", "u successfully cleared the update saving block");

			db.update(MONTHLY_SAVING_INFOTABLE, cv, null, null);

		} catch (Exception e) {

		} finally {
			cv.clear();
			cur.close();
			db.close();
		}

	}

	public int month_count() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int ccp1 = 0;
		String Name = ConstanVarables.Username;
		int j = Month_calculator();

		try {
			db = this.getReadableDatabase();
			String quert = "select * from " + SPENDING_INFOTABLE
					+ " where  SPENDING_INFOTABLE_NAME='" + Name
					+ "' and SPENDING_INFOTABLE_MONTH='" + j + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				ccp1 = cur.getCount();
				Log.d("Message", "cursor count " + ccp1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return ccp1;

	}

	public void insert_verymain() {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		int jp = ConstanVarables.month;
		String fp = ConstanVarables.datadate;
		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(VERY_MAIN_INFOTABLE_NAME, ConstanVarables.Username);
			cv.put(VERY_MAIN_INFOTABLE_COUNT, 1);
			cv.put(VERY_MAIN_INFOTABLE_DATE, fp);
			cv.put(VERY_MAIN_INFOTABLE_MONTH, jp);
			db.insert(VERY_MAIN_INFOTABLE, null, cv);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

	}

	public void update_verymain() {
		SQLiteDatabase db = null;
		ContentValues cv = null;

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(VERY_MAIN_INFOTABLE_COUNT, 0);
			Log.d("Message",
					"u suceefully cleared the update very important block");

			db.update(VERY_MAIN_INFOTABLE, cv, null, null);

		} catch (Exception e) {

		} finally {
			cv.clear();

			db.close();
		}

	}

	public int check_verymain() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int ccp = 0;
		String month = ConstanVarables.month1;
		String Name = ConstanVarables.Username;

		try {
			db = this.getReadableDatabase();
			String quert = "select * from " + VERY_MAIN_INFOTABLE
					+ " where  VERY_MAIN_INFOTABLE_MONTH='" + month

					+ "' and VERY_MAIN_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				String str = cur.getString(1);
				ccp = Integer.valueOf(str);

				Log.d("Message", "Sucessfully returned from exp_count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return ccp;

	}

	public JSONArray Insert_yearly_saving() {
		SQLiteDatabase db = null;
		Cursor cur = null;

		int hp = 0;
		int year = ConstanVarables.year;
		JSONArray jsonArray = new JSONArray();

		try {
			db = this.getReadableDatabase();
			String Name = ConstanVarables.Username.toString();
			JSONObject jsonObject = null;

			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_YEAR='" + year
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);

			if (cur.moveToNext()) {
				hp = cur.getCount();

			}
			if (hp == 12) {
				String quert1 = "select * from " + MONTHLY_SAVING_INFOTABLE
						+ " where MONTHLY_SAVING_INFOTABLE_YEAR='" + year
						+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
				cur = db.rawQuery(quert1, null);
				if (cur.moveToNext()) {
					jsonObject = new JSONObject();
					jsonObject.put(MONTHLY_SAVING_INFOTABLE_AMOUNT, cur
							.getString(4));
					jsonArray.put(jsonObject);

					Log.d("Message", "amout is----->" + jsonArray.toString());
				}

			}

			Log.d("Message", "value of main  hp is " + hp);

		} catch (Exception e) {
			e.getStackTrace();

		} finally {
			cur.close();
			db.close();
		}
		return jsonArray;

	}

	private void YearData() {

		JSONArray jsonArray = Insert_yearly_saving();
		String yERA[] = new String[jsonArray.length()];
		int av = 0;
		int sa = 0;
		Cursor cur1 = null;
		SQLiteDatabase db1 = null;
		int hp = 0;
		int year = ConstanVarables.year;
		String Name = ConstanVarables.Username;
		try {
			db1 = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_YEAR='" + year
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur1 = db1.rawQuery(quert, null);
			if (cur1.moveToNext()) {
				hp = cur1.getCount();

			}

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			cur1.close();
			db1.close();

		}
		if (hp == 12) {
			for (int a = 0; a < jsonArray.length(); a++) {
				try {
					yERA[a] = jsonArray.getJSONObject(a).getString(
							MONTHLY_SAVING_INFOTABLE);
					av = Integer.parseInt(yERA[a]);
					sa = sa + av;

				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			SQLiteDatabase db = null;
			ContentValues cv = null;
			Cursor cur = null;

			String st = null;
			int PKS = Sequencer();
			int ID = PKS + 1;
			int year1 = year - 1;

			try {
				db = this.getWritableDatabase();
				cv = new ContentValues();
				String quert1 = "select * from " + USER_INFOTABLE
						+ " where USER_INFOTABLE_NAME='" + Name + "'";
				cur = db.rawQuery(quert1, null);
				if (cur.moveToNext()) {
					st = cur.getString(1);
				}

				cv.put(YEARLY_SAVING_INFOTABLE_ID, ID);
				cv.put(YEARLY_SAVING_INFOTABLE_NAME, st);
				cv.put(YEARLY_SAVING_INFOTABLE_YEAR, year1);
				cv.put(YEARLY_SAVING_INFOTABLE_SAVING, sa);
				db.insert(YEARLY_SAVING_INFOTABLE, null, cv);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				cv.clear();
				db.close();
			}
		}

	}

	public void insert_time() {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(TIME_INFOTABLE_NAME, ConstanVarables.Username);
			cv.put(TIME_INFOTABLE_DAY, ConstanVarables.day);
			cv.put(TIME_INFOTABLE_MONTH, ConstanVarables.month);
			cv.put(TIME_INFOTABLE_YEAR, ConstanVarables.year);

			db.insert(TIME_INFOTABLE, null, cv);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

	}

	public void check_time() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int day = 0;
		int month = 0;
		int h = ConstanVarables.day;
		int y = ConstanVarables.month;
		String Name = ConstanVarables.Username;
		try {
			db = this.getReadableDatabase();
			String quert1 = "select * from " + TIME_INFOTABLE
					+ " where TIME_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert1, null);
			if (cur.moveToNext()) {
				String st = cur.getString(1);
				day = Integer.valueOf(st);
				String st1 = cur.getString(2);
				month = Integer.valueOf(st1);

			}
			if ((day == h) && (month == y)) {
				YearData();
			}

		} catch (Exception e) {
			e.getStackTrace();

		} finally {
			cur.close();
			db.close();
		}
	}

	public int checkavail() {
		int mark = 0;
		SQLiteDatabase db = null;
		Cursor cur = null;

		String Name = ConstanVarables.temp_user;
		try {
			db = this.getReadableDatabase();
			String quert1 = "select * from " + USER_INFOTABLE
					+ " where USER_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert1, null);
			if (cur.moveToNext()) {
				mark = cur.getCount();

			}

		} catch (Exception e) {
			e.getStackTrace();

		} finally {
			cur.close();
			db.close();
		}

		return mark;

	}

	public int getsalary() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int sal = 0;

		String Name = ConstanVarables.Username;
		try {
			db = this.getReadableDatabase();
			String quert1 = "select * from " + USER_INFOTABLE
					+ " where USER_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert1, null);
			if (cur.moveToNext()) {
				String st = cur.getString(3);
				sal = Integer.valueOf(st);

			}

		} catch (Exception e) {
			e.getStackTrace();

		} finally {
			cur.close();
			db.close();
		}

		return sal;

	}

	public int monthlyexp() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int sav = 0;

		String Name = ConstanVarables.Username;
		String month = ConstanVarables.month1;
		try {
			db = this.getReadableDatabase();
			String quert1 = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + month
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert1, null);
			if (cur.moveToNext()) {
				String st = cur.getString(4);
				sav = Integer.valueOf(st);

			}

		} catch (Exception e) {
			e.getStackTrace();

		} finally {
			cur.close();
			db.close();
		}

		return sav;

	}

	public int yearlyexp() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int sav = 0;

		String Name = ConstanVarables.Username;

		int year = ConstanVarables.year;
		int year1 = year - 1;

		try {
			db = this.getReadableDatabase();
			String quert1 = "select * from " + YEARLY_SAVING_INFOTABLE
					+ " where YEARLY_SAVING_INFOTABLE_YEAR='" + year1
					+ "' and YEARLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert1, null);
			if (cur.moveToNext()) {
				String st = cur.getString(3);
				sav = Integer.valueOf(st);

			}

		} catch (Exception e) {
			e.getStackTrace();

		} finally {
			cur.close();
			db.close();
		}

		return sav;

	}

	public void insert_datainfo() {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		Cursor cur = null;
		int amt = 0;
		int PKS = frees();

		Log.d("Message", "reached data info block");

		String Name = ConstanVarables.Username;
		String date = ConstanVarables.datadate;
		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			String quert1 = "select * from " + SPENDING_INFOTABLE
					+ " where SPENDING_INFOTABLE_DATE='"
					+ ConstanVarables.datadate
					+ "' and SPENDING_INFOTABLE_NAME='"
					+ ConstanVarables.Username + "'";
			cur = db.rawQuery(quert1, null);
			if (cur.moveToNext()) {
				String st = cur.getString(2);
				amt = Integer.valueOf(st);

			}

			cv.put(DATA_INFOTABLE_ID, PKS);
			cv.put(DATA_INFOTABLE_NAME, Name);
			cv.put(DATA_INFOTABLE_DATE, date);
			cv.put(DATA_INFOTABLE_AMOUNT, amt);
			db.insert(DATA_INFOTABLE, null, cv);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

	}

	public void update_datainfo() {
		SQLiteDatabase db = null;
		ContentValues cv = null;

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(DATA_INFOTABLE_AMOUNT, ConstanVarables.updatedexp);

			db.update(DATA_INFOTABLE, cv, null, null);

		} catch (Exception e) {

		} finally {
			cv.clear();

			db.close();
		}

	}

	public int frees() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int h = 0;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + FREESID_INFOTABLE;
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				// a = cur.getCount();
				String ab = cur.getString(0);
				h = Integer.valueOf(ab);
				Log.d("Message", "val of frees id sequencer" + h);
			}
			updatefreesid();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return h;

	}

	public void Addfreesid() {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();

			cv.put(FREESID_INFOTABLE_ID, 1);
			cv.put(FREESID_INFOTABLE_EXTRA, 2);
			db.insert(FREESID_INFOTABLE, null, cv);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cv.clear();
			db.close();
		}

	}

	public void updatefreesid() {
		SQLiteDatabase db = null;
		ContentValues cv = null;
		Cursor cur = null;
		int h = 0;
		int j = 0;

		try {
			db = this.getWritableDatabase();
			cv = new ContentValues();
			String quert = "select * from " + FREESID_INFOTABLE;
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {
				String ab = cur.getString(0);
				h = Integer.valueOf(ab);
				j = h + 1;
			}
			cv.put(FREESID_INFOTABLE_ID, j);
			Log.d("Message", "u suceefully cleared the freesid block" + j);

			db.update(FREESID_INFOTABLE, cv, null, null);

		} catch (Exception e) {

		} finally {
			cv.clear();
			cur.close();
			db.close();
		}

	}

	// <----the method here gives us the values on the the month of the
	// year---->

	public int month_jan() {

		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 1
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_feb() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 2
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_mar() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 3
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_apr() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 4
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_may() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 5
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_jun() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 6
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_jul() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 7
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_aug() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 8
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_sep() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 9
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_oct() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 10
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_nov() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 11
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int month_dec() {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		String Name = ConstanVarables.Username;

		try {

			db = this.getReadableDatabase();
			String quert = "select * from " + MONTHLY_SAVING_INFOTABLE
					+ " where MONTHLY_SAVING_INFOTABLE_MONTH='" + 12
					+ "' and MONTHLY_SAVING_INFOTABLE_YEAR='"
					+ ConstanVarables.enteryear
					+ "' and MONTHLY_SAVING_INFOTABLE_NAME='" + Name + "'";
			cur = db.rawQuery(quert, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				value = Integer.valueOf(ab);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	public int alarm_ret(String curtime) {
		SQLiteDatabase db = null;
		Cursor cur = null;
		int value = 0;
		

		try {

			db = this.getReadableDatabase();
			String query = "select * from " + USER_INFOTABLE
					+ " where   USER_INFOTABLE_TIME='" + curtime + "'";
			cur = db.rawQuery(query, null);
			if (cur.moveToNext()) {

				String ab = cur.getString(4);
				int a = Integer.valueOf(ab);
				value=1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cur.close();
			db.close();
		}
		return value;

	}

	// <---following lists of methods ends here--->
}
