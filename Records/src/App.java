/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   12/12/2024          *                                                                                          *
 *******************************/

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Elvira", 12345);
        System.out.println(s1);

        Student s2 = new Student("Elvira", 12345);
        System.out.println(s2);

        System.out.println(s1.equals(s2));

        System.out.println("____________________________-");

        StudentenRecord s3 = new StudentenRecord("Kirsten", 56789);
        System.out.println(s3);

        StudentenRecord s4 = new StudentenRecord("Kirsten", 56789);
        System.out.println(s4);

        System.out.println(s3.equals(s4));

        System.out.println(StudentenRecord.aantalStudenten);
    }
}