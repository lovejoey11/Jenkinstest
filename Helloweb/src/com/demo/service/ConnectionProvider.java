package com.demo.service;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;



public class ConnectionProvider{
	private static Connection con = null;
	private static String Connection_URL = null;
	private static String Username = null;
	private static String Password = null;
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			getCredentials();
			con = DriverManager.getConnection(Connection_URL,Username,Password);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){
		return con;
	}
	
	private static void getCredentials() {
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(getPath()));
			Connection_URL = prop.getProperty("DB_URL");
			Username = prop.getProperty("Username");
			Password = prop.getProperty("Passwd");
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	private static String getPath(){
		String result=null;
		
		String homepath = null;
		String projectPath =null;
		String fileName = null;
		homepath = System.getProperty("user.home") + File.separator+ "Documents";
		fileName = "credentials.txt";
		if (System.getProperty("os.name").contains("Windows")){
			projectPath = "Github"+ File.separator + "javarepo" +
						   File.separator + "Helloweb" ;
		}else{
			projectPath = "github"+ File.separator + "javarepo" +
					   File.separator + "Helloweb" ;
		}
		result = homepath + File.separator +projectPath+ File.separator + fileName;
		return result;
	}
}
