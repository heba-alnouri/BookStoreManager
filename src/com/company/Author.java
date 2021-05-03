package com.company;

import java.util.Date;

public class Author extends PersonalInfo{
    String generalInfo;

    public Author(int userId, String userFirstName, String userLastName, String userEmail, Date userDateOfBirth, String generalInfo) {
        super(userId, userFirstName, userLastName, userEmail, userDateOfBirth);
        this.generalInfo = generalInfo;
    }

    public String getGeneralInfo() {
        return generalInfo;
    }

    public void showAllBook(Author author){

    }
    public void showBestSellingBooks(){

    }
    public void addBook(Book book){

    }
    public void removeBook(Book book){

    }

    public void addAuthor(Author author){

    }
    public void removeAuthor(Author author){

    }

}
