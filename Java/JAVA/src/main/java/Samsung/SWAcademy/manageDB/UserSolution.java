package Samsung.SWAcademy.manageDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int mId; //id
    int mGrade; //학년
    char[] mGender; //성별
    int mScore;//성적

    public Student(final int mId, final int mGrade, final char[] mGender, final int mScore) {
        this.mId = mId;
        this.mGrade = mGrade;
        this.mGender = mGender;
        this.mScore = mScore;
    }
}

class UserSolution {
    List<Student> StudentList;

    public void init() {
        StudentList = new ArrayList<>();
        return;
    }

    public int add(int mId, int mGrade, char mGender[], int mScore) {
        Student newStudent = new Student(mId, mGrade, mGender, mScore);
        StudentList.add(newStudent);
        Student student = StudentList.stream()
                .filter(student1 -> Arrays.equals(student1.mGender, mGender) && student1.mGrade == mGrade)
                .reduce(newStudent, (student1, student2) -> student1.mScore > student2.mScore ? student1 : student2);

        return student.mId;
    }

    public int remove(int mId) {
        return 0;
    }

    public int query(int mGradeCnt, int mGrade[], int mGenderCnt, char mGender[][], int mScore) {
        return 0;
    }
}