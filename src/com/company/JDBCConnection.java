package com.company;

import java.sql.*;

public class JDBCConnection {

    private  Connection connection;
    private  Statement statement;
    private  ResultSet resultSet;
    private  PreparedStatement preparedStatement;

    public JDBCConnection() {
        try{
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore", "root", "Nero8board1029");
            this.statement = connection.createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public static void main(String[] args) throws SQLException {

    }

    // get information for a new book and insert them to the database in the book table.
    public void addBook(int bookId, int publisherId, int authorId, int genre_id, String title, int price, int stocks, int sellings){
        try{
            //statement.executeUpdate("insert into genre (genre_id,type) values (14,'Manga')");

            statement.executeUpdate("insert into book (book_id,publisher_id,author_id,genre_id,title,price,stocks,sellings)"+
                    " values ("+bookId+",'"+publisherId+"','"+authorId+"','"+genre_id+"','"+title+"','"+price+"','"+stocks+"','"+sellings+"')");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // function to remove any column from any table. ex(remove book, remove author, remove user, etc).
    public void removeColumnInAnyTable(String table, String infoType,String info){
        try{
            statement.executeUpdate("DELETE FROM `onlinebookstore`.`"+table+"` WHERE (`" + infoType +"` = '"+ info +"')");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // get one attribute from any table with different conditions.
    public void getAnyAttributeFromAnyTable(String table, String findBy, String infoType,String info){
        try {
            resultSet = statement.executeQuery("select "+infoType+" from "+table+" WHERE "+findBy+" = "+info);
            //resultSet = statement.executeQuery("SELECT * FROM genre WHERE genre_id = 1");
            resultSet.next();
            System.out.println(resultSet.getString(infoType));

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public  void closeConnection(){
        try{
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
