/*
 * Fei Wei
 * Student# 991625792
 * 
 */
package week1.sheridancollege.ca;

/**
 *
 * @author Fei Wei Feb. 22, 2021 A demo class to create and use an array of
 * objects
 */
public class StudentArray {

    public static void main(String[] args) {
        Student [] studentList = new Student[5];

        Student s1 = new Student("abc", "123");
        studentList[0] = s1;

        studentList[1] = new Student("efg", "125");
        studentList[2] = new Student("ger", "123");
        studentList[3] = new Student("dsd", "1343");
        studentList[4] = new Student("dfa", "2323");
        studentList[5] = new Student("qwte", "2342");

        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getName());

        }
    }//End of main method

}//End of Class
