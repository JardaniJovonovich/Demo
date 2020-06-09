package com.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdBc {
	
	static Connection con=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/leaf_shinobi", "root", "password");
        String sql = "select * from team_7";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet res = ps.executeQuery();
	    while (res.next()) {
			int ii = res.getInt(1);
			System.out.println(ii);
			String ss = res.getString(2);
			System.out.println(ss);
			String sss = res.getString(3);
			System.out.println(sss);
		}
	con.close();
	}
	

}
