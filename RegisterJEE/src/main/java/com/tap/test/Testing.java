package com.tap.test;

import java.sql.Connection;

import com.tap.util.DBConnection;

public class Testing {
	public static void main(String[] args) {
		
		
		Connection connection = DBConnection.getConnection();
		System.out.println("Connection is created");
	}

}
