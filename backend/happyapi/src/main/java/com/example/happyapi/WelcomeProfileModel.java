package com.example.happyapi;

public class WelcomeProfileModel {
    private int sno;
    private String firstname;
    private String lastname;
    private int contactnumber;
    private float myfloatnum;

    public WelcomeProfileModel() {} // default constructor

    public int getSno() { return sno; }
    public void setSno(int sno) { this.sno = sno; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public int getContactnumber() { return contactnumber; }
    public void setContactnumber(int contactnumber) { this.contactnumber = contactnumber; }

    public float getMyfloatnum() { return myfloatnum; }
    public void setMyfloatnum(float myfloatnum) { this.myfloatnum = myfloatnum; }
}
