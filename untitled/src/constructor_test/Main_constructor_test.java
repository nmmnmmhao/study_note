package constructor_test;

/**
 *
 * @author tangcz
 *
 */
public class Main_constructor_test {
    public static void main(String[] args) {
//        StudentBuilder stu = new StudentBuilder() {
//            @Override
//            public Student build(String name, int age) {
//                return new Student(name, age);
//            }
//        };
//        StudentBuilder stu = (name,age) -> new Student(name, age);
        StudentBuilder stu = Student::new;
        stu.build("xiaoming", 18);
    }
}
