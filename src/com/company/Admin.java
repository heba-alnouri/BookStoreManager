package com.company;

import java.util.Date;

public class Admin extends com.company.PersonalInfo {

    boolean isActive;

    public Admin(int userId, String userFirstName, String userLastName, String userEmail, Date userDateOfBirth, boolean isActive) {
        super(userId, userFirstName, userLastName, userEmail, userDateOfBirth);
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
