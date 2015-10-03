package servlet.abhi;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class Direct_class
 */
public class Direct_class extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Direct_class() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement ps = null;
		
		JSONObject jsonObject = null;
		JSONArray jsonArray = new JSONArray();
		
		
		
		
		
		try
		{
			PrintWriter out = response.getWriter();
			String sav=request.getParameter("saving");
			int saving=Integer.valueOf(sav);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","radhasham");
			st=con.createStatement();
			
			System.out.println("Saving is.."+saving);
			String query="select *from POLICY_INFOTABLE where POLICY_INFOTABLE_MAX_INCOME >= '" +saving +"' and POLICY_INFOTABLE_MIN_INCOME <='" + saving + "'";
			rs=st.executeQuery(query);
			while (rs.next()) {
				
				System.out.println(rs.getString(1));

				jsonObject = new JSONObject();
				jsonObject.put("POLICY_INFOTABLE_POLICY", rs.getString(1));

				jsonObject.put("POLICY_INFOTABLE_DESC", rs.getString(2));
				jsonObject.put("POLICY_INFOTABLE_PERIOD", rs.getString(3));
				jsonObject.put("POLICY_INFOTABLE_RATE", rs.getString(4));
				jsonObject.put("POLICY_INFOTABLE_INSTALMENTS", rs.getString(5));
				jsonArray.add(jsonObject);

			}
			out.print(jsonArray);

	        
			

		}
		catch(SQLException e2)
		{
			e2.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{

			try
			{
				if((rs!=null))rs.close();
				if((st!=null))st.close();
	            if((ps!=null))ps.close();
				if((con!=null))con.close();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
