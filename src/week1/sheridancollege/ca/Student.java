/*
 * Fei Wei
 * Student# 991625792

commit branch
 * 
 */
package week1.sheridancollege.ca;

/**
 *
 * @author moi class to create Student Objects
 
 Testing
 
 */
public class Student {

    private String name;
    private String stdID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public Student(String name, String stdID) {
        this.name = name;
        this.stdID = stdID;
    }

}
