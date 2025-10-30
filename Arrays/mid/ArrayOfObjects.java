package Arrays.mid;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "srinjoy";
        s1.marks = 100;
        s1.rollNo = 12;

        Student s2 = new Student();
        s2.Name = "shakir";
        s2.marks = 90;
        s2.rollNo = 13;

        Student s3 = new Student();
        s3.Name = "rebecca";
        s3.marks = 80;
        s3.rollNo = 14;

        //Array of objects (array of students)
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //print details of the student taht is the array of objects
        // for(int i = 0 ; i < n ; i++){
        //     System.out.println(students[i].Name + students[i].marks);
        // }
        // System.out.println();

        for(Student stud : students){
            System.out.println(stud.Name + " " + stud.marks);
        }

    }
}

class Student {
    int rollNo;
    String Name;
    int marks;
}
