package spring.mvc.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.model.RentCarInfo;

public class NmrmRentCarDao {
	private static final String CON_URL = ""
			+ "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=java_learning;"
			+ "user=java_learning;"
			+ "password=java_learning;";

	public static RentCarInfo getRentCarInfo(String carManagementNo) throws SQLException {
		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		sb.append("  m1.car_management_no, ");
		sb.append("  m2.car_model_name, ");
		sb.append("  m3.shop_name, ");
		sb.append("  m1.etc, ");
		sb.append("  m1.car_navigation, ");
		sb.append("  m1.smoking_kbn ");
		sb.append("from nmrm_rent_car m1 ");
		sb.append("inner join nmrm_car_model m2 ");
		sb.append("  on (m1.car_model_id = m2.car_model_id) ");
		sb.append("inner join nmrm_shop m3 ");
		sb.append("  on (m1.shop_id = m3.shop_id) ");
		sb.append("where 0=0 ");
		sb.append("  and m1.car_management_no = '" + carManagementNo + "' ");
		sb.append(";");

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sb.toString());

		RentCarInfo rentCarInfo = new RentCarInfo();
		rentCarInfo.setCarManagementNo(carManagementNo);
		if (rs.next()) {
			rentCarInfo.setCarModelName(rs.getString("car_model_name"));
			rentCarInfo.setShopName(rs.getString("shop_name"));
			rentCarInfo.setEtc(rs.getString("etc"));
			rentCarInfo.setCarNavigation(rs.getString("car_navigation"));
			rentCarInfo.setSmokingKbn(rs.getString("smoking_kbn"));
		}

		rs.close();
		stmt.close();

		return rentCarInfo;
	}

	public static List<RentCarInfo> getRentCarInfoList(RentCarInfo rentCarInfoCondition) throws SQLException {
		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		sb.append("  m1.car_management_no, ");
		sb.append("  m2.car_model_name, ");
		sb.append("  m3.shop_name, ");
		sb.append("  m1.etc, ");
		sb.append("  m1.car_navigation, ");
		sb.append("  m1.smoking_kbn ");
		sb.append("from nmrm_rent_car m1 ");
		sb.append("inner join nmrm_car_model m2 ");
		sb.append("  on (m1.car_model_id = m2.car_model_id) ");
		sb.append("inner join nmrm_shop m3 ");
		sb.append("  on (m1.shop_id = m3.shop_id) ");
		sb.append("where 0=0 ");
		if (!isEmpty(rentCarInfoCondition.getCarManagementNo())) {
			sb.append("and m1.car_management_no = '" + rentCarInfoCondition.getCarManagementNo() + "' ");
		}
		if (!isEmpty(rentCarInfoCondition.getCarModelName())) {
			sb.append("and m2.car_model_name like '%" + rentCarInfoCondition.getCarModelName() + "%' ");
		}
		if (!isEmpty(rentCarInfoCondition.getShopName())) {
			sb.append("and m3.shop_name like '%" + rentCarInfoCondition.getShopName() + "%' ");
		}
		if (!isEmpty(rentCarInfoCondition.getEtcValue())) {
			sb.append("and m1.etc = '" + rentCarInfoCondition.getEtcValue() + "' ");
		}
		if (!isEmpty(rentCarInfoCondition.getCarNavigationValue())) {
			sb.append("and m1.car_navigation = '" + rentCarInfoCondition.getCarNavigationValue() + "' ");
		}
		if (!isEmpty(rentCarInfoCondition.getSmokingKbnValue())) {
			sb.append("and m1.smoking_kbn = '" + rentCarInfoCondition.getSmokingKbnValue() + "' ");
		}
		sb.append(";");

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sb.toString());

		List<RentCarInfo> rentCarInfoList = new ArrayList<RentCarInfo>();
		while (rs.next()) {
			RentCarInfo rentCarInfo = new RentCarInfo();
			rentCarInfo.setCarManagementNo(rs.getString("car_management_no"));
			rentCarInfo.setCarModelName(rs.getString("car_model_name"));
			rentCarInfo.setShopName(rs.getString("shop_name"));
			rentCarInfo.setEtc(rs.getString("etc"));
			rentCarInfo.setCarNavigation(rs.getString("car_navigation"));
			rentCarInfo.setSmokingKbn(rs.getString("smoking_kbn"));
			rentCarInfoList.add(rentCarInfo);
		}

		rs.close();
		stmt.close();

		return rentCarInfoList;
	}

	private static boolean isEmpty(String checkStr) {
		if (checkStr == null) {
			return true;
		}
		return checkStr.isEmpty();
	}
}
