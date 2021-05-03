package com.company;

public class Publisher {
    int publisherId;
    String publisherName;
    String phoneNumber;
    String email;

    public Publisher(int publisherId, String publisherName, String phoneNumber, String email) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
