/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package les3;

public class StudentenDieDeSjaakZijn {
    public Student[] studenten;

    public  StudentenDieDeSjaakZijn(Student s1, Student s2, Student s3){
        this.studenten = new Student[3];
        this.studenten[0] = s1;
        this.studenten[1] = s2;
        this.studenten[2] = s3;
    }

    public StudentenDieDeSjaakZijn(Student[]studenten){
        this.studenten = new Student[studenten.length];
    }


}