/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vnmhg
 */
public class TaiKhoan {
    public String type;
    public String userName;
    private String passWord;

    public TaiKhoan() {
    }

    public TaiKhoan(String type, String userName, String passWord) {
        this.type = type;
        this.userName = userName;
        this.passWord = passWord;
    }
    public TaiKhoan(String type, String userName) {
        this.type = type;
        this.userName = userName;
    }
    public String getType() {
        return type;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
