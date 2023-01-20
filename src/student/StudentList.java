/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

public class StudentList {
    public static void main(String[] args){
        //Student s1 = new Student("s1", "Mike");
        Student[] studentList = new Student[3];
        studentList[0] = new Student("s1", "Mike");
        studentList[1] = new Student("s2", "Jake");
        studentList[2] = new Student("s3", "Daniel");
        
        for(int i = 0; i<studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
    }
}
