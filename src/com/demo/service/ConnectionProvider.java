package com.demo.service;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;



public class ConnectionProvider{
	private static Connection con = null;
	private static String Connection_URL = null;
	private static String Username = null;
	private static String Password = null;
	private static InputStream input = null;
	
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
			String filename="config.properties";
			input = ConnectionProvider.class.getClassLoader().getResourceAsStream(filename);
    		if(input==null){
    	            System.out.println("Sorry, unable to find " + filename);
    		    return;
    		}
    		//load a properties file from class path, inside static method
    		
    		prop.load(input);
			//prop.load(new FileInputStream( "/src/" ));
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
		homepath = System.getProperty("user.home");
		fileName = "credentials.txt";
		if (System.getProperty("os.name").contains("Windows")){
			projectPath = File.separator+ "Documents"+File.separator + "Github"+ File.separator + "javarepo" +
						   File.separator + "Helloweb" ;
		}else if (System.getProperty("os.name").contains("Linux")){
			projectPath = File.separator ;
		}
		else{
			projectPath = File.separator+ "Documents" + File.separator + "github" + File.separator + "javarepo" +
					   File.separator + "Helloweb" ;
		}
		result = homepath + File.separator +projectPath+ File.separator + fileName;
		return result;
	}
}
