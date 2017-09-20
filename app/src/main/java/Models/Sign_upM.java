package Models;

import android.renderscript.Int4;

/**
 * Created by Lord Junmar Mabini on 20/09/2017.
 */

public class Sign_upM {
    private String lastName;
    private String firstName;
    private String gender;
    private String middleName;
    private String address;
    private String username;
    private String password;
    private String rewritePassword;

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRewritePassword() {
        return rewritePassword;
    }

    public void setRewritePassword(String rewritePassword) {
        this.rewritePassword = rewritePassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    private Integer contactNumber;
}
