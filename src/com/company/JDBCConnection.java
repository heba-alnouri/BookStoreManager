package com.company;

import java.sql.*;

public class JDBCConnection {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    public static void main(String[] args) throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore", "root", "Nero8board1029");
        statement = connection.createStatement();
    }

    // check the validation of the login information.
    public static boolean validInfoForLogin(String infoType,String info){
        try {
            resultSet = statement.executeQuery("select * from user");

            while (resultSet.next()) {
                if(info.equals(resultSet.getString(infoType))){
                    return true;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    // add new user.
    public static void registerInfo(int userId ,String firstName,String lastName,String email,String password,String phoneNumber,String userType,int locationID){
        try{
            //statement.executeUpdate("insert into genre (genre_id,type) values (14,'Manga')");

            statement.executeUpdate("insert into user (user_id,first_name,last_name,email,password,phone_number,user_type,location_id)"+
                    " values ("+userId+",'"+firstName+"','"+lastName+"','"+email+"','"+password+"','"+phoneNumber+"','"+userType+"','"+locationID+"')");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // get information for a new location and insert them to the database in the location table.
    public static void locationInfo(int locationId, String country, String state, String city, String address){
        try{
            statement.executeUpdate("insert into location (location_id,country,state,city,address)"+
                    " values ("+locationId+",'"+country+"','"+state+"','"+city+"','"+address+"')");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // get information for a new book and insert them to the database in the book table.
    public static void addBook(int bookId, int publisherId, int authorId, int genre_id, String title, int price, int stocks, int sellings){
        try{
            //statement.executeUpdate("insert into genre (genre_id,type) values (14,'Manga')");

            statement.executeUpdate("insert into book (book_id,publisher_id,author_id,genre_id,title,price,stocks,sellings)"+
                    " values ("+bookId+",'"+publisherId+"','"+authorId+"','"+genre_id+"','"+title+"','"+price+"','"+stocks+"','"+sellings+"')");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // function to remove any column from any table. ex(remove book, remove author, remove user, etc).
    public static void removeColumnInAnyTable(String table, String infoType,String info){
        try{
            statement.executeUpdate("DELETE FROM `onlinebookstore`.`"+table+"` WHERE (`" + infoType +"` = '"+ info +"')");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    //get one attribute from any table with different conditions.
    public static void getAnyAttributeFromAnyTable(String table, String findBy, String infoType,String info){
        try {
            resultSet = statement.executeQuery("select "+infoType+" from "+table+" WHERE "+findBy+" = "+info);
            //resultSet = statement.executeQuery("SELECT * FROM genre WHERE genre_id = 1");
            resultSet.next();
            System.out.println(resultSet.getString(infoType));

        }catch (SQLException e){
            e.printStackTrace();
        }
    }







}
