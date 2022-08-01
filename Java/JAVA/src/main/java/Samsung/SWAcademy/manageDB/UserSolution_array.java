//package Samsung.SWAcademy.manageDB;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class UserSolution_array {
//    class UserSolution {
//        List<Student>[] StudentList;
//
//        public void init() {
//            StudentList = new ArrayList[6]; // 성별, 학년 여1 0 여2 1
//        }
//
//        public int add(int mId, int mGrade, char mGender[], int mScore) {
//            Student newStudent = new Student(mId, mGrade, mGender, mScore);
//            StudentList[].add(newStudent);
//            Student student = getHighestStudent(mGrade, mGender, newStudent);
//
//            return student.mId;
//        }
//
//        public int remove(int mId) {
//            Student student = StudentList.stream()
//                    .filter(student1 -> student1.mId == mId)
//                    .findFirst()
//                    .orElse(null);
//
//            if (null == student) return 0;
//
//            StudentList.remove(student);
//
//            Student findStudent = getLowestStudent(student);
//
//            return null != findStudent ? findStudent.mId : 0;
//        }
//
//        public int query(int mGradeCnt, int mGrade[], int mGenderCnt, char mGender[][], int mScore) {
//            Student findStudent = getSetStudent(mGrade, mGender, mScore);
//            return null != findStudent ? findStudent.mId : 0;
//        }
//
//    }
//}
