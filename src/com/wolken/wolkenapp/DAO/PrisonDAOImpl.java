package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.Connect;
import com.wolken.wolkenapp.DTO.PrisonDTO;

public class PrisonDAOImpl implements PrisonDAO {

	Connection con = Connect.getConnect();

	// Connection con = null;
	// Statement st = null;
	/*
	 * @Override public Connection connect() throws SQLException { // TODO
	 * Auto-generated method stub try (Connection con = DriverManager
	 * .getConnection(
	 * "jdbc:mysql://localhost:3306/wolken?user=root&password=Password@1234567890"))
	 * {
	 * 
	 * System.out.println("connection is established ");
	 * 
	 * return con; }
	 * 
	 * }
	 */

	@Override
	public void add(PrisonDTO prisonDTO) throws SQLException {
		// TODO Auto-generated method stub
		// try (Connection con = Connect.getConnect()) {

		try (PreparedStatement pre = con.prepareStatement("insert into wolken.prison_table values(?,?,?,?)");) {
			pre.setInt(1, prisonDTO.getInmateNo());
			pre.setString(2, prisonDTO.getName());
			pre.setInt(3, prisonDTO.getNoOfYears());
			pre.setString(4, prisonDTO.getInmateCase());
			pre.executeUpdate();
			System.out.println("inmate data is added ");
			pre.close();

		}
		// con.close();
	}

	// }

	@Override
	public void get() throws SQLException {
		// try (Connection con = Connect.getConnect()) {
		try (PreparedStatement pre = con.prepareStatement("select * from wolken.prison_table")) {
			try (ResultSet rs = pre.executeQuery()) {
				while (rs.next()) {
					int festivalId = rs.getInt("inmate_no");
					String name = rs.getString("inmate_name");
					int no = rs.getInt("no_of_years");
					String inmate_case = rs.getString("inmate_case");
					System.out.println(festivalId + " " + name + " " + no + " " + inmate_case);
				}

				// rs.close();
			}
			pre.close();
		}
		// con.close();
	}

	// }

//	@Override
//	public void close() {
//
//		
//		if (con != null) {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

	@Override
	public void update(int id, int years) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("inside update");
		try (PreparedStatement pre = con
				.prepareStatement("update wolken.prison_table set no_of_years=?  where inmate_no= ?")) {
			pre.setInt(1, years);
			pre.setInt(2, id);
			pre.executeUpdate();
			System.out.println("data has been updated ");
			pre.close();
		}
		// con.close();

	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		// try (Connection con = Connect.getConnect()) {

		try (PreparedStatement pre = con.prepareStatement("delete from wolken.prison_table where inmate_no=?")) {

			System.out.println("inside delete");
			pre.setInt(1, id);
			pre.executeUpdate();
			pre.close();
		}
		Connect.closeConnect();
	}
}
//}
