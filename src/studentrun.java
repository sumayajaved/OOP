class student {
    String name;
    String coursename;
    String department;
    String semester;
    double cgpa;
    String feestatus;

    public void displayinfo() {
        System.out.println("Name:" + " " + name + "Course name:" + " " + coursename + " " + "Department:" + " " + department + " " + "Semester:" + " " + semester + " " + "CGPA:" + " " + cgpa + " " + "fees status" + " " + feestatus);
    }
}
public class studentrun{
    public static void main(String[]args){
            student s1 = new student();
            s1.name = "Sumaya";
            s1.coursename = "Multivariable calculus";
            s1.department = "Maths";
            s1.semester = "3rd semester";
            s1.cgpa = 3.00;
            s1.feestatus= "Paid";
            s1.displayinfo();
        }
    }

