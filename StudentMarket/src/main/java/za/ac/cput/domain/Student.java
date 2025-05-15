/*  Student.java
    Student POJO class
    Author: Asanda_Ndhlela (230614345)
    Date: 11 May 2025
*/

package za.ac.cput.domain;

import java.time.LocalDate;

public class Student {
    protected int studentNumber;
    protected String firstName;
    protected String lastName;
    protected LocalDate dateOfBirth;
    protected String identityNumber;

    private Student(){}

    private Student(Builder build){
        this.studentNumber = build.studentNumber;
        this.firstName = build.firstName;
        this.lastName = build.lastName;
        this.dateOfBirth = build.dateOfBirth;
        this.identityNumber = build.identityNumber;

    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getIdentityNumber() {
        return identityNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", identityNumber='" + identityNumber + '\'' +
                '}';
    }
    public static class Builder{
        private int studentNumber;
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String identityNumber;


        public Builder setStudentNumber(int studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public Builder setIdentityNumber(String identityNumber) {
            this.identityNumber = identityNumber;
            return this;
        }

        public Builder copy(Student student){
            this.studentNumber = student.studentNumber;
            this.firstName = student.firstName;
            this.lastName = student.lastName;
            this.dateOfBirth = student.dateOfBirth;
            this.identityNumber = student.identityNumber;
            return this;
    }

        public Student build(){
            return new Student(this);
        }
    }
}
