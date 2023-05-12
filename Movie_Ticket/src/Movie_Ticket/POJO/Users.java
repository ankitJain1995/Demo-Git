/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie_Ticket.POJO;

/**
 *
 * @author ankitjain
 */
public class Users {
    private String mobileNo;
    private String userName;
    private String password;
    private String userType;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(String mobileNo, String userName, String password, String userType) {
        this.mobileNo = mobileNo;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Users{" + "mobileNo=" + mobileNo + ", userName=" + userName + ", password=" + password + ", userType=" + userType + '}';
    }

   
    public Users() {
    }

}
