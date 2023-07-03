package com.usertest;

import com.userregistation.UserRegistration;
import junit.framework.Assert;
import org.junit.Test;

public class UserRegistrationTest {


    @Test
    public void testValidFirstName() {
        String firstName = "Atharva";
        boolean isFirstNameValid = firstName.matches("[a-zA-Z]{1,8}");
        Assert.assertTrue(isFirstNameValid);
    }


    @Test
    public void testValidLastName() {
        String lastName = "Alone";
        boolean isLastNameValid = lastName.matches("[a-zA-Z]{1,8}");
        Assert.assertTrue(isLastNameValid);
    }


    @Test
    public void testValidEmail() {
        String email = "test@example.com";
        boolean isEmailValid = email.matches("[a-z0-1.]{1,}[@]{1}[a-z]{1,}[.]{1}[c]{1}[o]{1}[m]{1}");
        Assert.assertTrue(isEmailValid);
    }


    @Test
    public void testValidMobileNo() {
        String mobileNo = "91-9876543210";
        boolean isMobileNoValid = mobileNo.matches("[9]{1}[1]{1}[-]{1}[9]{1}[0-9]{9}");
        Assert.assertTrue(isMobileNoValid);
    }


    @Test
    public void testValidPassword() {
        String password = "P*ssw0rd";
        boolean isPasswordValid = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Assert.assertTrue(isPasswordValid);
    }

}


