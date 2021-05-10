package com.company;

import com.mysql.cj.log.Log;

import java.sql.SQLException;

public class UserServices {

    public void searchBook(String searchWord,boolean byTitle, boolean byAuthor,boolean byGenre){
        String searchBy;
        if(byTitle){
            searchBy = "title";
        }else if (byAuthor){
            searchBy = "author";
        }else if(byGenre){
            searchBy = "genre";
        }else {
            searchBy = "title";
        }

        JDBCConnection sqlConnection = new JDBCConnection();
        try{
            sqlConnection.setPreparedStatement(sqlConnection.getConnection().prepareStatement("SELECT title FROM book WHERE "+searchBy+" = ?"));
            sqlConnection.getPreparedStatement().setString(1, searchWord);

            sqlConnection.setResultSet(sqlConnection.getPreparedStatement().executeQuery());

            if (sqlConnection.getResultSet().next()) {
                //registerMessageLabel.setText("This email address is already being used");
                System.out.print(sqlConnection.getResultSet().getString("title"));
            } else {
                System.out.print("Cant find the book. please try again or add the book");
            }

        }catch (SQLException e){
            e.printStackTrace();

        }finally {
            sqlConnection.closeConnection();
        }
    }
}
