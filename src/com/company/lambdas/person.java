package com.company.lambdas;

class Person {

    String fName;
    String lName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
}
