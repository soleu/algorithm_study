package Samsung.SWAcademy.manageDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }

    public int add(int mId, int mGrade, char mGender[], int mScore) {
        Student newStudent = new Student(mId, mGrade, mGender, mScore);
        StudentList.add(newStudent);
        Student student = getHighestStudent(mGrade, mGender, newStudent);

        return student.mId;
    }

    public int remove(int mId) {
        Student student = StudentList.stream()
                .filter(student1 -> student1.mId == mId)
                .findFirst()
                .orElse(null);

        if (null == student) return 0;

        StudentList.remove(student);

        Student findStudent = getLowestStudent(student);

        return null != findStudent ? findStudent.mId : 0;
    }

    public int query(int mGradeCnt, int mGrade[], int mGenderCnt, char mGender[][], int mScore) {
        Student findStudent = getSetStudent(mGrade, mGender, mScore);
        return null != findStudent ? findStudent.mId : 0;
    }

    private Student getLowestStudent(Student newStudent) {
        Student topStudent = null;
        for (int i = 0; i < StudentList.size(); i++) {
            Student student = StudentList.get(i);
            if (Arrays.equals(student.mGender, newStudent.mGender) && student.mGrade == newStudent.mGrade) {
                if (topStudent == null) topStudent = student;
                if (student.mScore < topStudent.mScore) topStudent = student;
                else if (student.mScore == topStudent.mScore) {
                    if (student.mId < topStudent.mId) topStudent = student;
                }
            }
        }
        return topStudent;
//        Student findStudent = StudentList.stream()
//                .filter(student1 -> Arrays.equals(student1.mGender, student.mGender) && student1.mGrade == student.mGrade)
//                .reduce((student1, student2) -> {
//                            if (student1.mScore < student2.mScore) return student1;
//                            else if (student1.mScore == student2.mScore) {
//                                if (student1.mId < student2.mId) return student1;
//                                return student2;
//                            }
//                            return student2;
//                        }
//                ).orElse(null);
//        return findStudent;
    }

    private Student getHighestStudent(int mGrade, char[] mGender, Student newStudent) {
        Student topStudent = newStudent;
        for (Student student : StudentList) {
            if (Arrays.equals(student.mGender, mGender) && student.mGrade == mGrade) {
                if (student.mScore > topStudent.mScore) topStudent = student;
                else if (student.mScore == topStudent.mScore) {
                    if (student.mId > topStudent.mId) topStudent = student;
                }
            }
        }
        return topStudent;
//        Student student = StudentList.stream()
//                .filter(student1 -> Arrays.equals(student1.mGender, mGender) && student1.mGrade == mGrade)
//                .reduce(newStudent, (student1, student2) -> {
//                    if (student1.mScore > student2.mScore) return student1;
//                    else if (student1.mScore == student2.mScore) {
//                        if (student1.mId > student2.mId) return student1;
//                        return student2;
//                    }
//                    return student2;
//                });
    }

    private Student getSetStudent(int[] mGrade, char[][] mGender, int mScore) {
        Student topStudent = null;
        for (int i = 0; i < StudentList.size(); i++) {
            Student student = StudentList.get(i);
            if (student.mScore >= mScore)
                for (char[] gender : mGender) {
                    for (int grade : mGrade) {
                        if (Arrays.equals(student.mGender, gender) && student.mGrade == grade) {
                            if (topStudent == null) topStudent = student;
                            else if (student.mScore < topStudent.mScore) topStudent = student;
                            else if (student.mScore == topStudent.mScore) {
                                if (student.mId < topStudent.mId) topStudent = student;
                            }
                        }
                    }
                }
        }
        return topStudent;

//        Student findStudent = StudentList.stream()
//                .filter(student1 ->
//                        {
//                            for (char[] gender : mGender) {
//                                if (Arrays.equals(gender, student1.mGender)) {
//                                    for (int grade : mGrade) {
//                                        if (grade == student1.mGrade && student1.mScore >= mScore) return true;
//                                    }
//                                }
//                            }
//                            return false;
//                        }
//                )
//                .reduce((student1, student2) -> {
//                    if (student1.mScore < student2.mScore) return student1;
//                    else if (student1.mScore == student2.mScore) {
//                        if (student1.mId < student2.mId) return student1;
//                        return student2;
//                    }
//                    return student2;
//                }).orElse(null);
//                    return findStudent;
    }
}