package spring.mvc.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.model.Rank;

public class RankDao {
	private static final String CON_URL = ""
			+ "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=attendance_management_system;"
			+ "user=java_learning;"
			+ "password=java_learning;";

	public static List<Rank> getRankList() throws SQLException {
		String sql = "select rank_id, rank_name from m_rank where invalid_flg = 0;";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		List<Rank> rankList = new ArrayList<Rank>();
		while (rs.next()) {
			Rank rank = new Rank(
					rs.getString("rank_id"),
					rs.getString("rank_name"));
			rankList.add(rank);
		}

		rs.close();
		stmt.close();
		con.close();

		return rankList;
	}

	public static Rank getRank(String rankId) throws SQLException {
		String sql = "select rank_id, rank_name from m_rank where invalid_flg = 0 and rank_id = '" + rankId + "';";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		rs.next();
		Rank rank = new Rank(
				rs.getString("rank_id"),
				rs.getString("rank_name"));

		rs.close();
		stmt.close();
		con.close();

		return rank;
	}

}
