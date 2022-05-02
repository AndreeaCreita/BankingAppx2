package Client;

import Accounts.Account;

import java.util.ArrayList;

public class Client {
    public static int nrClients = 0;
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private String personalCodeNumber;


    public Client(String firstName, String lastName, String email, String address, String phoneNumber, String personalCodeNumber)
    {
        this.ID = ++nrClients;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.personalCodeNumber = personalCodeNumber;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonalCodeNumber() {
        return personalCodeNumber;
    }

    public void setPersonalCodeNumber(String personalCodeNumber) {
        this.personalCodeNumber = personalCodeNumber;
    }




    }