package ra.entity;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        Student[] arrStudent = new Student[3];
        arrStudent[0] = new Student("SV001","Nguyen Van A",20);
        arrStudent[1] = new Student("SV002","Nguyen Van B",18);
        arrStudent[2] = new Student("SV003","Nguyen Van C",22);
        //Sap xep sinh vien theo tuoi tang dan su dung Comparator Interface
        Arrays.sort(arrStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        //In thong tin sinh vien sau khi sap xep
        for (int i = 0; i < arrStudent.length; i++) {
            System.out.printf("Ma SV: %s - Ten SV: %s - Tuoi: %d\n",arrStudent[i].getStudentId(),arrStudent[i].getStudentName(),arrStudent[i].getAge());
        }
        //Sap xep sinh vien theo ten giam dan
        Arrays.sort(arrStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (0-o1.getStudentName().compareTo(o2.getStudentName()));
            }
        });
        //In thong tin sinh vien sau khi sap xep
        for (int i = 0; i < arrStudent.length; i++) {
            System.out.printf("Ma SV: %s - Ten SV: %s - Tuoi: %d\n",arrStudent[i].getStudentId(),arrStudent[i].getStudentName(),arrStudent[i].getAge());
        }
    }
}
