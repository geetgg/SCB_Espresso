package com.sourcey.materiallogindemo.TestingData;

import java.util.Random;

/**
 * Created by geetikag on 29/3/2018 AD.
 */

public enum TestData {

    testUser1("geetikag@gmail.com", "test1234", "1234abcd", "test9876", "1234", "Geetika", "G", "Bangkok", "0998877665", "9988");

    private String correct_username;
    private String correct_password;
    private String wrong_username;
    private String wrong_password;
    private String invalid_password;
    private String valid_name;
    private String invalid_name;
    private String valid_address;
    private String validMobile;
    private String invalidMobile;


    TestData(final String correct_user, final String correct_pass, final String incorrectUser, final String incorrectPass,
             final String invalidPass, final String valid_name, final String invalidName, final String validAdrress,
             final String validMobile, final String invalidMobile) {

        this.correct_username = correct_user;
        this.correct_password = correct_pass;
        this.wrong_password = incorrectPass;
        this.wrong_username = incorrectUser;
        this.invalid_password = invalidPass;
        this.valid_name = valid_name;
        this.invalid_name = invalidName;
        this.valid_address = validAdrress;
        this.validMobile = validMobile;
        this.invalidMobile = invalidMobile;
    }

    public String getEmail() {
        return this.correct_username;
    }

    public String getPassword() {
        return this.correct_password;
    }

    public String getIncorrectEmail() {
        return this.wrong_username;
    }

    public String getIncorrectPass() {
        return this.wrong_password;
    }

    public String getInvalidPass() {
        return this.invalid_password;
    }

    public String getValid_name() {
        return this.valid_name;
    }

    public String getInvalid_name() {
        return this.invalid_name;
    }

    public String getValid_address() {
        return this.valid_address;
    }

    public String getValidMobile() {
        return this.validMobile;
    }

    public String getInvalidMobile() {
        return this.invalidMobile;
    }
}