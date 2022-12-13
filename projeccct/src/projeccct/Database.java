/*
 * To change this license header, choose License HeaderesultSet in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeccct;

import Model.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Flight;

/**
 *
 * @author sameh
 */
public class Database {
    private Connection con  ;
    public Database(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservation?serverTimezone=UTC" , "root" , "");
            System.out.println("connected");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
        this.con = con;
    }
    
    public ResultSet retrieveTable(String tableName) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM "+tableName);
        return resultSet ;
    }
    
    public Customer retrieveCustomer(String tableName , String Username) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName +
                " WHERE Username = '" + Username+"'" );
        
        Customer customer = new Customer();
        
        while (resultSet.next()){
            customer.setUserID(resultSet.getInt("UserID"));
            customer.setFlightID(resultSet.getInt("FlightID"));
            customer.setFname(resultSet.getString("Fname"));
            customer.setLname(resultSet.getString("Lname"));
            customer.setUsername(resultSet.getString("Username"));
            customer.setPassword(resultSet.getString("Password"));
            customer.setGender(resultSet.getInt("Gender"));
        }
        
        return customer ;
    }
    
    
    public ArrayList <Flight> retrieveFlight() throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM flight" );
        ArrayList <Flight> allFlight = new ArrayList<>() ;
        
        while (resultSet.next()){
            Flight flight = new Flight();
            flight.setFlightID(resultSet.getInt("FlightID"));
            flight.setPlaneID(resultSet.getInt("PlaneID"));
            flight.setS_From(resultSet.getString("S_From"));
            flight.setD_To(resultSet.getString("D_To"));
            flight.setTime(resultSet.getString("Time"));
            flight.setDay(resultSet.getString("Day"));
            flight.setPrice(resultSet.getString("Price"));
            allFlight.add(flight);
        }
        
        return allFlight ;
    }
    
    
    public int getRowsCount(String tableName) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select count(*) from "+tableName);
        resultSet.next();
        return resultSet.getInt(1) ;
    }
    
    public int addRow(String tableName , List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "";
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) instanceof String){
                sql = sql + "'" + list.get(i) + "'";
            }
            else{
                sql = sql + list.get(i) ;
            }
            if(i != list.size()-1){
                sql = sql + "," ;
            }
        }
        
        return statement.executeUpdate("INSERT INTO " + tableName + " VALUES (" + sql + ");" ) ;
    }
    
    public int updateValue(String tableName , List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "UPDATE " + tableName   + " SET " + list.get(0) + " = " + list.get(1) 
                   + " WHERE " + list.get(2) + "  =  " + list.get(3) ;
        
        return statement.executeUpdate("INSERT INTO " + tableName + " VALUES (" + sql + ");" ) ;
    }
    
    public int deleteValue(String tableName , List list ) throws SQLException{
        Statement statement = con.createStatement();
        
        String sql = "DELETE FROM " + tableName + " WHERE " + list.get(0) + " = " + list.get(1) + ";" ;
        
        return statement.executeUpdate(sql) ;
    }
    
    
    /*while (resultSet.next()) {
        code = resultSet.getInt("code");
        title = resultSet.getString("title").trim();
        System.out.println("Code : " + code
                           + " Title : " + title);
    }
    resultSet.close();
    statement.close();
    connection.close();*/
    
}


