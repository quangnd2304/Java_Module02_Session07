import ra.entity.Student;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Student[] arrStudent = new Student[3];
        arrStudent[0] = new Student("SV001","Nguyen Van A",20);
        arrStudent[1] = new Student("SV002","Nguyen Van B",18);
        arrStudent[2] = new Student("SV003","Nguyen Van C",22);
        //Sap xep mang sinh vien theo ten tang dan - Su dung Comparable Interface
        Arrays.sort(arrStudent);
        //In thong tin sinh vien sau khi sap xep
        for (int i = 0; i < arrStudent.length; i++) {
            System.out.printf("Ma SV: %s - Ten SV: %s - Tuoi: %d\n",arrStudent[i].getStudentId(),arrStudent[i].getStudentName(),arrStudent[i].getAge());
        }
    }
}