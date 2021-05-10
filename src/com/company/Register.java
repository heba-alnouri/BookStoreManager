package com.company;

import java.sql.SQLException;

public class Register {

    //private static JDBCConnection sqlConnection = new JDBCConnection();


    public void registerButtonOnAction() {

    }

    public void registerGeneralInfo(int userId, String firstName, String lastName, String email, String password, String phoneNumber, String userType, int locationID) {
        JDBCConnection sqlConnection = new JDBCConnection();
        try {

            sqlConnection.setPreparedStatement(sqlConnection.getConnection().prepareStatement("SELECT email FROM user WHERE email = ?"));
            sqlConnection.getPreparedStatement().setString(1, email);

            sqlConnection.setResultSet(sqlConnection.getPreparedStatement().executeQuery());

            if (sqlConnection.getResultSet().next()) {
                //registerMessageLabel.setText("This email address is already being used");
                System.out.print("This email address is already being used");
            } else {
                sqlConnection.getStatement().executeUpdate("insert into user (user_id,first_name,last_name,email,password,phone_number,user_type)" +
                        " values (" + userId + ",'" + firstName + "','" + lastName + "','" + email + "','" + password + "','" + phoneNumber + "','" + userType  + "')");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sqlConnection.closeConnection();
        }
    }

    // get information for a new location and insert them to the database in the location table.
    public void locationInfo(int locationId, String country, String state, String city, String address) {
        JDBCConnection sqlConnection = new JDBCConnection();
        try {
            sqlConnection.getStatement().executeUpdate("insert into location (location_id,country,state,city,address)" +
                    " values (" + locationId + ",'" + country + "','" + state + "','" + city + "','" + address + "')");

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            sqlConnection.closeConnection();
        }
    }
}