package org.example

class Student {

    private int studentID;
    private String studentName;

    void setStudentID(int pID) {
        studentID = pID
    }

    void setStudentName(String pName) {
        studentName = pName
    }

    int getStudentID() {
        return this.studentID
    }

    String getStudentName() {
        return this.studentName
    }

    static void main(String[] args) {
        Student st = new Student()
        st.setStudentID(1)
        st.setStudentName('Joe')

        println(st.getStudentID())
        println(st.getStudentName())
    }

}
